package spaceInvadersStudent;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;


public class spaceInvaderGame extends JPanel{
	//instance variables
	private ship s;
	private meteor m1, m2, m3;
	private Timer tm;
	private Font scoreboardFont, introFont;
	private int score, life, level;
	private boolean updateIntro;
	private Clip hitMeteor, hitGround;


		
		
	public spaceInvaderGame(Color bk) {
		setBackground(bk);
		setSize(1200,800);
		
		//instantiation of objects
		s = new ship(350, 575, new ImageIcon(ClassLoader.getSystemResource("plane.png")));
		m1 = new meteor(300, 50, 20, new ImageIcon(ClassLoader.getSystemResource("Meteor.png")));
		m2 = new meteor(300, 50, 20, new ImageIcon(ClassLoader.getSystemResource("meteor2.png")));
		m3 = new meteor(300, 50, 20, new ImageIcon(ClassLoader.getSystemResource("meteor3.png")));
		score = 0; life = 3; level = 1; updateIntro = true;
		
		
		//Listener
		addKeyListener(new Key());
		setFocusable(true);
		
		tm = new Timer(20, new MoveListener());
		scoreboardFont = new Font("Comic Sans MS", Font.BOLD+Font.ITALIC, 20);
		introFont = new Font("Arial", Font.PLAIN, 40);

	}//end constructor
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		//draw background
		
		background(g);
		s.draw(g);
		m1.draw(g);
		if (level >= 2) m2.draw(g);
		if (level >= 3) m3.draw(g);
		scoreboard(g);

		if(updateIntro) introScreen(g);

		if(s.getLaunch()) s.drawMissile(g);
		
		if (life == 0) {
			tm.stop();
			playAgain(g);
		}
	}//end paint
	
	public void introScreen(Graphics g) {
		
		g.setFont(introFont);
		g.setColor(Color.white);
		g.drawString("Press 'x' to begin!", 300, 300);
		
	}
	
	//Listener
	private class MoveListener implements ActionListener {
		public void actionPerformed (ActionEvent e) {
			m1.move(0, 3);
			if(level>=2) m2.move(0, 4);
			if(level >= 3) m3.move(0, 5);
			if(s.getLaunch()) s.moveMissile();;
			
			
			if(s.getYMissile() < 50) {
				s.resetMissile();
			}
			
			
			if(s.hitMeteor(m1)) {
				score += 10;
				playHit2();
				s.resetMissile();
				m1.resetMeteor();
			}//end hit
			if(s.hitMeteor(m2)) {
				score += 10;
				playHit2();
				s.resetMissile();
				m2.resetMeteor();
			}//end hit
			if(s.hitMeteor(m3)) {
				score += 10;
				playHit2();
				s.resetMissile();
				m3.resetMeteor();
			}//end hit
			
			if (m1.getY() + m1.getR() >= 500) {
				life -=1;
				playHit();
				m1.setY(0);
			}
			if (m2.getY() + m2.getR() >= 500) {
				life -=1;
				playHit();
				m2.setY(0);
			}
			if (m3.getY() + m3.getR() >= 500) {
				life -=1;
				playHit();
				m3.setY(0);
			}
			if (score == 50 && level == 1) level++;
			if (score == 100 && level == 2) level++;
			repaint();
			
		}//actionPerformed
			
	}//MoveListener
private void playHit() {
		
		try {
			AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(ClassLoader.getSystemResource("terminated.wav"));
			hitGround = AudioSystem.getClip();
			hitGround.open(audioInputStream);
			hitGround.start();
			
			
			
		}catch (Exception e){
			System.out.println("Error with playing sound. ");
			e.printStackTrace();
		}
}//end playHit
private void playHit2() {
	
	try {
		AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(ClassLoader.getSystemResource("yummy.wav"));
		hitMeteor = AudioSystem.getClip();
		hitMeteor.open(audioInputStream);
		hitMeteor.start();
		
		
		
	}catch (Exception e){
		System.out.println("Error with playing sound. ");
		e.printStackTrace();
	}
}//end playHit

public void playAgain(Graphics g) {
		
		g.setFont(introFont);
		g.setColor(Color.white);
		g.drawString("Play again? (Y/N)", 300, 300);
		
	}
	public void scoreboard (Graphics g) {
		g.setColor(Color.blue);
		g.setFont(scoreboardFont);
		g.drawString("Score = " + score, 805, 100);
		g.setColor(Color.red);
		g.drawString("Life = " + life, 805, 300);
		g.setColor(Color.orange);
		g.drawString("Level = "+ level, 805, 500);
		
	}
	private class Key extends KeyAdapter{
		public void keyPressed(KeyEvent e	 ) {
			if(e.getKeyCode() == KeyEvent.VK_X) {
				updateIntro = false;
				tm.start();
			}
			if(e.getKeyCode() == KeyEvent.VK_RIGHT && s.getX()+s.getB() > 745) {
				s.setX(40);
			}
			if (e.getKeyCode() == KeyEvent.VK_RIGHT && s.getX()+s.getB() <= 745) {
				s.move(10, 0);
			}
			if(e.getKeyCode() == KeyEvent.VK_LEFT && s.getX()+s.getB() <= 140) {
				s.setX(685);
			}
			if (e.getKeyCode() == KeyEvent.VK_LEFT && s.getX()+s.getB() > 140) {
				s.move(-10, 0);
			}
			if (e.getKeyChar() == 'y') {
				life = 3; score = 0; level = 1;
				updateIntro = true;

				m1.resetMeteor(); m2.resetMeteor(); m3.resetMeteor();
				
				repaint();
			}
			
			/*
			if (e.getKeyCode() == KeyEvent.VK_LEFT ) {
				s.move(-10, 0);
			}//if
			*/
			if(e.getKeyCode()== KeyEvent.VK_SPACE) {
				s.getMissileCoordinates(s.getX()+s.getB()/2, s.getY());
				s.launchMissile(true);
			}
			
			repaint();
		}//end keyPressed
	}//end Key
	
	
	
	
	
	//background method
	public void background(Graphics g) {
		g.setColor(Color.gray);
		g.fillRect(0,0,1200,800 );
		g.setColor(Color.black);
		g.fillRect(50, 50, 700, 600);
		g.fillRect(800, 50, 325, 600);
		
	}//end background
	
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("Space Invaders");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		spaceInvaderGame si = new spaceInvaderGame(Color.black);
		Container c = f.getContentPane();
		c.add(si);
		f.setSize(si.getSize()); 
		f.setVisible(true);

	}//end main

}//end spaceInvaderGame

/*
if (e.getKeyCode() == KeyEvent.VK_UP) {
	s.move(0, -10);
}//if

if (e.getKeyCode() == KeyEvent.VK_DOWN) {
	s.move(0, 10);
}//if
*/