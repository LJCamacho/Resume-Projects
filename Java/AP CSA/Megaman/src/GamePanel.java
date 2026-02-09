
import javax.imageio.ImageIO;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;

//sound libraries
//
//
//
import javax.sound.sampled.*;

public class GamePanel extends JPanel {
	
	//instance variables
	Character man;
	ArrayList<Character> manRight = new ArrayList<Character>();
	ArrayList<Character> manLeft = new ArrayList<Character>();
	ArrayList<Character> background = new ArrayList<Character>();
	ArrayList<Character> enemy = new ArrayList<Character>();
	ArrayList<Character> enemyMove = new ArrayList<Character>();
	ArrayList<Character> metDuneMove = new ArrayList<Character>();
	Character myBackground;
	//fireball
	Character fireball;
	int countFB;
	
	BufferedImage megamanSheet, brick, enemyBruh, metDuneSheet, background0, background1, background2, background3, introPic;
	Timer gameTimer;
	boolean rightPress = false, leftPress = false, right = true, jump = false;
	boolean intro;
	int n = 0, m = 0; int vjump = 0;
	
	
	//sound variables
	Clip mainTheme, soundEffects;
	
	public GamePanel(Color bk) throws IOException {
		setBackground(bk);
		
		
		//fireball
		fireball = new Character(ImageIO.read(ClassLoader.getSystemResource("ball.png")), 0, 0, 0, 25, 21, 0);
		
		//background
		background0 = ImageIO.read(ClassLoader.getSystemResource("background0.png"));
		background1 = ImageIO.read(ClassLoader.getSystemResource("background.jpg"));
		background2 = ImageIO.read(ClassLoader.getSystemResource("background2.jpg"));
		background3 = ImageIO.read(ClassLoader.getSystemResource("background3.png"));
		myBackground = new Character(background0, 0, 0, 0, 1200, 800, 0);
		
		introPic = ImageIO.read(ClassLoader.getSystemResource("introScreen.jpg"));
		intro = true;
		
		//enemy
		enemyBruh = ImageIO.read(ClassLoader.getSystemResource("enemy_sheet.PNG"));
		metDuneSheet = ImageIO.read(ClassLoader.getSystemResource("metDuneSheet.png"));
		enemy.add(new Character(enemyBruh.getSubimage(0, 0, 20, 20), 300, 200, -1, 20, 20, 1));
		enemy.add(new Character(enemyBruh.getSubimage(0, 0, 20, 20), 600, 255, -1, 20, 20, 1));
		enemy.add(new Character(enemyBruh.getSubimage(0, 0, 20, 20), 700, 300, -1, 20, 20, 1));
		
		
		enemyMove.add(new Character(enemyBruh.getSubimage(0, 0, 20, 20), 300, 200, 0, 20, 20, 1));
		enemyMove.add(new Character(enemyBruh.getSubimage(40, 0, 20, 20), 300, 200, 0, 20, 20, 1));
		enemyMove.add(new Character(enemyBruh.getSubimage(80, 4, 20, 15), 300, 200, 0, 20, 15, 1));
		enemyMove.add(new Character(enemyBruh.getSubimage(120, 4, 20, 13), 300, 200, 0, 20, 13, 1));
		
		metDuneMove.add(new Character(metDuneSheet.getSubimage(100, 11, 20, 23), 500, 200, 0, 20, 13, 2));
		metDuneMove.add(new Character(metDuneSheet.getSubimage(122, 11, 20, 23), 500, 200, 0, 22, 13, 2));
		
		enemy.add(new Character(metDuneMove.get(0).getImage(), 900, 30, -1, 20, 23, 1));
		
		//background
		brick = ImageIO.read(ClassLoader.getSystemResource("singlebrick.png"));
		for (int i = 0; i < 500; i++)
			background.add(new Character(brick, i*brick.getWidth(), 400, 0, 34, 29, 0));
		
		for (int i = 15; i < 20; i++)
			background.add(new Character(brick, i*brick.getWidth(), 325, 0, 34, 29, 0));
		
		for (int i = 30; i < 40; i++)
			background.add(new Character(brick, i*brick.getWidth(), 300, 0, 34, 29, 0));
		
		for (int i = 30; i < 31; i++)
			background.add(new Character(brick, i*brick.getWidth(), 200, 0, 34, 29, 0));
		
		megamanSheet = ImageIO.read(ClassLoader.getSystemResource("megaman.png"));
		man = new Character(megamanSheet.getSubimage(0,0,32,42), 200, 100, 0, 32,42, 0);
		
		//right megaman
		int [] rightPosition = {0,107, 139, 159, 183, 215, 249, 277, 300, 328, 359, 393}; 
		int [] rightWidth =   {32, 32,  20,  24,  32,  34,  28,  23,  28,  31,  34,  31};
				
		for(int i = 0; i < rightPosition.length; i++)
			manRight.add(new Character(megamanSheet.getSubimage(rightPosition[i], 0, rightWidth[i], 42), 0, 0, 0, rightWidth[i], 42, 0));
		
	
			
		
		//left megaman
		int [] leftPosition = {818,713,693,669,637,603,576,552,524,493,459,428};
		int [] leftWidth=     {32, 32 ,20 ,24 ,32 ,34 ,27 ,24 ,28 ,31 ,34 ,31};
		
		for (int i = 0; i < leftPosition.length; i++) 
			manLeft.add(new Character(megamanSheet.getSubimage(leftPosition[i], 0, leftWidth[i], 42), 0, 0, 0, leftWidth[i], 42, 0));
		
		//listener
		addKeyListener(new KeyInput());
		setFocusable(true);
		gameTimer = new Timer(35, new timeListener());
		gameTimer.start();
		
	}//end constructor
		
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		
		if(intro)
			introScreen(g);
		else {
			
			//background
			for(Character bk: background)
				g.drawImage(bk.getImage(), bk.getxLoc(), bk.getyLoc(), null);
			g.drawImage(myBackground.getImage(), myBackground.getxLoc(), myBackground.getyLoc(), null);
			g.draw3DRect(200, 200, 50, 100, true);
			
			
			//enemy
			for(Character en: enemy)
				g.drawImage(en.getImage(), en.getxLoc(), en.getyLoc(), null);
			g.drawImage(man.getImage(), man.getxLoc(), man.getyLoc(), null);
			
			if(fireball.isHit()) {
				g.drawImage(fireball.getImage(), fireball.getxLoc(), fireball.getyLoc(), null);
			}
		}//end if
		
	}//end paintComponent
	
	public void introScreen(Graphics g) {
		
		g.drawImage(introPic, 25, 25, null);
		
		
		
	}//end introScreen
	
	private class timeListener implements ActionListener{
		public void actionPerformed (ActionEvent e) {
			//fireball
			if(fireball.isHit()) {
				fireball.move(fireball.getVelocity(), 0);
			}
		
			
			
			//enemy move	//collides with enemy
			m++;
			for(Character en: enemy) {
				if(en.getVelocity()!=0) {
					en.move(en.getVelocity(), 0);
					if(en.getC()==1 && !(en.isHit()))
						if( m %5 == 0)
							en.setImage(enemyMove.get(0).getImage());
						else 
							en.setImage(enemyMove.get(1).getImage());
					if(en.getC()==2 && !(en.isHit()))
						if( m %5 == 0)
							en.setImage(metDuneMove.get(0).getImage());
						else 
							en.setImage(metDuneMove.get(1).getImage());
					
				
					int hit = man.collidesWith(en);
					//fireball hits enemies
					int hitFB = fireball.collidesWith(en);
					if(hitFB == 0) {
						playSoundEffects(2);
						en.setVelocity(0);
						en.setHit(true);
						en.setyLoc(en.getyLoc() + en.getHeight());
					}
				
					if(hit == -1) {
						playSoundEffects(2);
						en.setVelocity(0);
						if(en.getC()==1) {
							en.setImage(enemyMove.get(3).getImage());
							en.setHeight(enemyMove.get(3).getHeight()-1);
						}else {
							en.setyLoc(en.getyLoc() + en.getHeight());
						}
						
						en.setHit(true);
						vjump = 15;
						
					}
					else if(hit == 0) {
						man.setyLoc(10);
					}
				}//end if hit
				
				if(en.getVelocity()==0 && man.collidesWith(en)==2) 
					en.setVelocity(15);
				else if(en.getVelocity()==0 && man.collidesWith(en)==3) 
					en.setVelocity(-15);	
				
				if(en.getVelocity()>10 && en.isHit()) {
					for(Character en2: enemy) {
						if(en.collidesWith(en2)==0)
							en2.setyLoc(en.getyLoc() + en2.getHeight());
					}
				}
			}
			//gravity
			if(man.gravityFall(background)<0)
				man.move(0, man.falling());
			
			for(Character en: enemy)
				if(en.gravityFall(background)<0)
					en.move(0, en.falling());
			
			//reset
			if (man.getyLoc() > 500) {man.setyLoc(10); man.landed();}
			
			
			
			//jumping
			if(jump) {
				if(right)
					man.setImage(manRight.get(4).getImage());
				else
					man.setImage(manLeft.get(4).getImage());
				man.move(0, -vjump);
				vjump--;
				
				if (vjump < 0) {
					jump = false;
					if(right)
						man.setImage(manRight.get(0).getImage());
					else
						man.setImage(manLeft.get(0).getImage());
				}
			}
			
			//move right
			if(rightPress) {
				man.setImage(manRight.get(n).getImage());
				if(jump) man.setImage(manRight.get(9).getImage());
				else n++;
				if(n == manRight.size())
					n = 5;
				if(man.getVelocity()<15) man.accelerateRight();
				
				for(Character bk: background)
					bk.move(-1*man.getVelocity(), 0);
				for(Character en: enemy)
					en.move(-1*man.getVelocity(), 0);
				myBackground.move(-1*man.getVelocity(), 0);
				fireball.move(-1*man.getVelocity(), 0);
				man.move(man.getVelocity(), 0);
				
			}//end
			
			//move left
			if(leftPress) {
				man.setImage(manLeft.get(n).getImage());
				if(jump) man.setImage(manLeft.get(9).getImage());
				else n++;
				if(n == manLeft.size())
					n = 3;
				if(man.getVelocity()>-15) man.accelerateLeft();
				
				for(Character bk: background)
					bk.move(-1*man.getVelocity(), 0);
				for(Character en: enemy)
					en.move(-1*man.getVelocity(), 0);
				myBackground.move(-1*man.getVelocity(), 0);
				
				man.move(man.getVelocity(), 0);
				
				
			}//end
			
			repaint();
		}//end action performed
	}//end timeListener
	
	
	private class KeyInput extends KeyAdapter{
		public void keyPressed(KeyEvent e) {
			if(e.getKeyCode() == KeyEvent.VK_SPACE) {
				fireball.setHit(true);
				if(right)fireball.setVelocity(15);
				else fireball.setVelocity(-15);
				
				fireball.setxLoc(man.getxLoc());
				fireball.setyLoc(man.getyLoc()+man.getHeight()/3);
			}
			if(e.getKeyCode() == KeyEvent.VK_0)
				myBackground.setImage(background0);
			if(e.getKeyCode() == KeyEvent.VK_1)
				myBackground.setImage(background1);
			if(e.getKeyCode() == KeyEvent.VK_2)
				myBackground.setImage(background2);
			if(e.getKeyCode() == KeyEvent.VK_3)
				myBackground.setImage(background3);
			
			
			if(e.getKeyCode()==KeyEvent.VK_ENTER) {
				intro = false; gameTimer.start();
				playTheme();
			}
			
			if(e.getKeyCode()==KeyEvent.VK_BACK_SPACE) {
				mainTheme.stop();
			}
			
			if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
				rightPress = true;
				right = true;
			}
			if(e.getKeyCode() == KeyEvent.VK_LEFT) {
				leftPress = true;
				right = false;
			}
			
			if(e.getKeyCode() == KeyEvent.VK_UP && !(jump)) {
				jump = true; 
				if(man.getVelocity() == 15) vjump = 20;
				else if(man.getVelocity() == -15) vjump = 20;
				else vjump = 15;
				playSoundEffects(1);
				
			}
			if(e.getKeyCode() == KeyEvent.VK_Q)
				System.exit(0);
			repaint();
			
		}//end keyPressed
		public void keyReleased(KeyEvent e) {
			
			if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
				rightPress = false;
				n = 0;
				man.setImage(manRight.get(0).getImage());
				man.setVelocity(0);
			}
			if(e.getKeyCode() == KeyEvent.VK_LEFT) {
				leftPress = false;
				n = 0;
				man.setImage(manLeft.get(0).getImage());
				man.setVelocity(0);
			}
			
			repaint();
		
		}//end keyReleased
		
	}//end KeyInput
	
	//sound methods
	private void playTheme() {
		
		try {
			AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(ClassLoader.getSystemResource("mainmusic.wav"));
			mainTheme = AudioSystem.getClip();
			mainTheme.open(audioInputStream);
			mainTheme.start();
			
		}catch (Exception e) {
			System.out.println("Error with playing sound. ");
			e.printStackTrace();
		}
	}
	
private void playSoundEffects(int n) {
		
		try {
			AudioInputStream audioInputStream = null;
			soundEffects = null;
			
			if(n == 1) 
				audioInputStream = AudioSystem.getAudioInputStream(ClassLoader.getSystemResource("smb_jump-super.wav"));
			if(n == 2) 
				audioInputStream = AudioSystem.getAudioInputStream(ClassLoader.getSystemResource("ssbm_shell.wav"));
			
			soundEffects = AudioSystem.getClip();
			soundEffects.open(audioInputStream);
			soundEffects.start();
			
		}catch (Exception e) {
			System.out.println("Error with playing sound. ");
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws IOException {
		JFrame frame = new JFrame();
		frame.setTitle("Megaman");
		frame.setSize(1200,600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = frame.getContentPane();
		c.add(new GamePanel(Color.WHITE));
		frame.setVisible(true);

	}//end main

}//end GamePanel
