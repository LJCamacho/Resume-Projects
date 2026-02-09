package animation;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.sound.sampled.*;

public class ColorPanel extends JPanel {

	//instance variables
	private circle c1, c2, c3;
	private rectangle paddle, border;
	private javax.swing.Timer timer;
	private Clip hitPaddle;
	private int score, life, level;
	private boolean updateIntro;
	private Font scoreboardFont, introFont;
	
	//constructor
	public ColorPanel(Color backColor, int width, int height) {
		setBackground(backColor);
		setPreferredSize(new Dimension(width, height));
		c1 = new circle(width/2, height/2, 25, Color.red);
		c2 = new circle(width/2, height/2, 25, Color.green);
		c3 = new circle(width/2, height/2, 25, Color.blue);
		c1.setVelocity(7);
		c2.setVelocity(7);
		c3.setVelocity(7);
		c1.setDirection(45);
		c2.setDirection(45); c2.setRY(-1);
		c3.setDirection(45); c3.setRY(-1); c3.setRX(1);
		
		border = new rectangle(50,50, width - 100, (int)(.75*height), Color.darkGray);
		
		
		paddle = new rectangle((int)(width/2), (int)(.77*height), 150, 25, Color.black);
		
		score = 0; life = 3; updateIntro = true; level = 1;
		
		timer = new javax.swing.Timer(10, new MoveIt());
		//timer.start();
		addKeyListener(new Key());
		setFocusable(true);
		
		scoreboardFont = new Font("Courier", Font.BOLD+Font.ITALIC, 20);
		introFont = new Font("Arial", Font.PLAIN, 36);
		
	}//end constructor
	
	
	
	public void paintComponent (Graphics g) {
		super.paintComponent(g);
		border.fill(g);
		c1.fill(g);
		if (level >= 2) c2.fill(g);
		if (level >= 3) c3.fill(g);
		paddle.fill(g);
		scoreboard(g);
		
		if(updateIntro) introScreen(g);
		
		if (life == 0) {
			timer.stop();
			playAgain(g);
		}
		
	}//end paintComponent
	
	public void introScreen(Graphics g) {
		
		g.setFont(introFont);
		g.setColor(Color.white);
		g.drawString("Press 'Spacebar' to begin!", 300, 300);
		
	}
	
	
	public void playAgain(Graphics g) {
		
		g.setFont(introFont);
		g.setColor(Color.white);
		g.drawString("Play again? (Y/N)", 300, 300);
		
	}
	public void scoreboard (Graphics g) {
		g.setColor(Color.blue);
		g.setFont(scoreboardFont);
		g.drawString("Score = " + score, 200, 700);
		g.setColor(Color.red);
		g.drawString("Life = " + life, 400, 700);
		g.setColor(Color.orange);
		g.drawString("Level = "+ level, 600, 700);
		
	}
	
	private class Key extends KeyAdapter{
		public void keyPressed(KeyEvent e) {
			
			if (e.getKeyChar() == 'y') {
				life = 3; score = 0; level = 1;
				updateIntro = true;

				c1.reset(); c2.reset(); c3.reset();
				
				repaint();
			}
			if(e.getKeyCode() == KeyEvent.VK_SPACE) {
				updateIntro = false;
				timer.start();
			}
			if(e.getKeyCode() == KeyEvent.VK_RIGHT)
				paddle.move(25, 0);
			if(e.getKeyCode()== KeyEvent.VK_LEFT)
				paddle.move(-25, 0);
		}//end keyPressed
		
		
	}//end Key
	
	
	
	
	private class MoveIt implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			int x = c1.getX();
			int y = c1.getY();
			int radius = c1.getRadius();
			int width = getWidth();
			int height = getHeight();
			
			//rebounding
			if (x+radius >= border.getX()+border.getBase()) {c1.setRX(-1);}
			if (x-radius <= border.getX()) {c1.setRX(1);}
			if (y-radius <= border.getY()) {c1.setRY(1);}
		
			if (y+radius >= border.getY()+border.getHeight()) {
				c1.setRY(-1);
				life--;
			}
				
				//ball 2
			if (c2.getX()+radius >= border.getX()+border.getBase()) {c2.setRX(-1);}
			if (c2.getX()-radius <= border.getX()) {c2.setRX(1);}
			if (c2.getY()-c2.getRadius() <= border.getY()) {c2.setRY(1);}
			if (c2.getY()+c2.getRadius() >= border.getY()+border.getHeight()) {
				c2.setRY(-1);
				life--;
			}
				
			//ball 3
			if (c3.getX()+radius >= border.getX()+border.getBase()) {c3.setRX(-1);}
			if (c3.getX()-radius <= border.getX()) {c3.setRX(1);}
			if (c3.getY()-c3.getRadius() <= border.getY()) {c3.setRY(1);}
			if (c3.getY()+c3.getRadius() >= border.getY()+border.getHeight()) {c3.setRY(-1);life--;}
			//hit the paddle
				if (c1.hit(paddle)) {c1.setRY(-1);playHit();score += 10;}
				if (c2.hit(paddle)) {c2.setRY(-1);playHit();score += 10;}
				if (c3.hit(paddle)) {c3.setRY(-1);playHit();score += 10;}

				if (score == 30 && level == 1) level++;
				if (score == 60 && level == 2) level++;
				
			//life = 0
				
				
			c1.move();
			if(level>=2) c2.move();
			if(level >= 3) c3.move();
			repaint();
			
		}
	}//end MoveIt
	
	private void playHit() {
		
		try {
			AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(ClassLoader.getSystemResource("yummy.wav"));
			hitPaddle = AudioSystem.getClip();
			hitPaddle.open(audioInputStream);
			hitPaddle.start();
			
			
			
		}catch (Exception e){
			System.out.println("Error with playing sound. ");
			e.printStackTrace();
		}
}//end playHit
/*	
private void playHit2() {
		
		try {
			AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(ClassLoader.getSystemResource("smb_jump-small.wav"));
			hitPaddle = AudioSystem.getClip();
			hitPaddle.open(audioInputStream);
			hitPaddle.start();
			
			
			
		}catch (Exception e){
			System.out.println("Error with playing sound. ");
			e.printStackTrace();
		}
}//end playHit2
		*/
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("Animation");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ColorPanel p = new ColorPanel(Color.white, 1200, 800);
		Container c = f.getContentPane();
		c.add(p);
		f.pack();
		f.setVisible(true);
		f.setResizable(false);
		
	}//end main
	
}//end ColorPanel
