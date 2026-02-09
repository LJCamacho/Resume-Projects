
import javax.imageio.ImageIO;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

//sound libraries
//
//
//
import javax.sound.sampled.*;

public class GamePanelSonic extends JPanel {
	
	//instance variables
	CharacterSonic sonic;
	ArrayList<CharacterSonic> sonicRight = new ArrayList<CharacterSonic>();
	ArrayList<CharacterSonic> sonicLeft = new ArrayList<CharacterSonic>();
	ArrayList<CharacterSonic> rings = new ArrayList<CharacterSonic>();
	
	ArrayList<CharacterSonic> ringSpin = new ArrayList<CharacterSonic>();
	ArrayList<CharacterSonic> background = new ArrayList<CharacterSonic>();
	ArrayList<CharacterSonic> enemy = new ArrayList<CharacterSonic>();
	ArrayList<CharacterSonic> enemyMove = new ArrayList<CharacterSonic>();
	CharacterSonic myBackground, Ring;
	BufferedImage sonicSheet, sonicSheetRight, brick, enemyBruh, metDuneSheet, Background, Rings, introPic, introRing, introBackground;
	Timer gameTimer;
	boolean rightPress = false, leftPress = false, downPress = false, right = true, jump = false, ringCollect = false;
	boolean intro, overGame, levelWinner = false, levelnext = false, timer = true;
	int n = 0, m = 0, ringN = 0; int vjump = 0, timeRemaining = 200, level = 1;
	double tmr = 0;
	int ringCount, ringSpeed = 0;
	Random ringRandom = new Random();
	int ringRandomInt = ringRandom.nextInt(900);
	
	Font bruh = new Font("Comic Sans MS", Font.BOLD+Font.ITALIC, 50);
	Font bruh2 = new Font("Times New Roman", Font.BOLD, 20);
	Font bruh3 = new Font("Comic Sans MS", Font.BOLD, 75);
	//sound variables
	Clip mainTheme, soundEffects;
	
	public GamePanelSonic(Color bk) throws IOException {
		setBackground(bk);
		
		
		
		
		//background
		
		Background = ImageIO.read(ClassLoader.getSystemResource("Background.png"));
		Rings = ImageIO.read(ClassLoader.getSystemResource("RingSheet.png"));
		myBackground = new CharacterSonic(Background.getSubimage(0, 0, 805, 1322), 0, 0, 0, 805, 1322, 0);
		
		introRing = ImageIO.read(ClassLoader.getSystemResource("SpecialRing.png"));
		introPic = ImageIO.read(ClassLoader.getSystemResource("sonicIntro.png"));
		introBackground = ImageIO.read(ClassLoader.getSystemResource("GameBackground.jpg"));
		intro = true; overGame = false;
		
		//enemy
		 
		
		/*
		enemyBruh = ImageIO.read(ClassLoader.getSystemResource("enemy_sheet.PNG"));
		enemy.add(new CharacterSonic(enemyBruh.getSubimage(0, 0, 20, 20), 300, 200, -1, 20, 20, 1));
		enemy.add(new CharacterSonic(enemyBruh.getSubimage(0, 0, 20, 20), 600, 255, -1, 20, 20, 1));
		enemy.add(new CharacterSonic(enemyBruh.getSubimage(0, 0, 20, 20), 700, 300, -1, 20, 20, 1));
		
		
		
		enemyMove.add(new CharacterSonic(enemyBruh.getSubimage(0, 0, 20, 20), 300, 200, 0, 20, 20, 1));
		enemyMove.add(new CharacterSonic(enemyBruh.getSubimage(40, 0, 20, 20), 300, 200, 0, 20, 20, 1));
		enemyMove.add(new CharacterSonic(enemyBruh.getSubimage(80, 4, 20, 15), 300, 200, 0, 20, 15, 1));
		enemyMove.add(new CharacterSonic(enemyBruh.getSubimage(120, 4, 20, 13), 300, 200, 0, 20, 13, 1));
		*/
		//background
		brick = ImageIO.read(ClassLoader.getSystemResource("singlebrick.png")).getSubimage(341, 672, 160, 58);
		//ring rotation(might not work)
		int [] ringX = {370, 372, 376, 16};
		int [] ringY = {16, 39, 59,  39};
		int [] ringWidth = {16, 12, 4, 12};
		int [] ringHeight = {16, 16, 16, 12};
		
		rings.add(new CharacterSonic(Rings.getSubimage(370, 16, 16, 16), 300, 200, 0, 16, 16, 1));
		rings.add(new CharacterSonic(Rings.getSubimage(372, 39, 12, 16), 400, 200, 0, 12, 16, 1));
		rings.add(new CharacterSonic(Rings.getSubimage(376, 59, 4, 16), 500, 200, 0, 4, 16, 1));
		rings.add(new CharacterSonic(Rings.getSubimage(16, 39, 12, 16), 600, 200, 0, 12, 16, 1));
		rings.add(new CharacterSonic(Rings.getSubimage(370, 16, 16, 16), 700, 200, 0, 16, 16, 1));
		
		if(level == 1) {
		for(int i = 0; i <= 100; i++)
			ringSpin.add(new CharacterSonic(rings.get(0).getImage(), 370+(20*i), 285, 0, 50, 100, 1));
		for (int i = -25; i < 15; i++)
			background.add(new CharacterSonic(brick, i*brick.getWidth(), 400, 0, brick.getWidth(), brick.getHeight(), 0));
		for (int i = 0; i < 3; i++)
			background.add(new CharacterSonic(brick, 1000+(i*brick.getWidth()), 500, 0, brick.getWidth(), brick.getHeight(), 0));
		
        for(int i = -20; i <= 80; i++)
			ringSpin.add(new CharacterSonic(rings.get(0).getImage(), 100+(20*i), 485, 0, 50, 100, 1));
		for (int i = -5; i < 22; i++)
			background.add(new CharacterSonic(brick, i*brick.getWidth(), 600, 0, brick.getWidth(), brick.getHeight(), 0));
		for(int i = 36; i <= 75; i++)
			ringSpin.add(new CharacterSonic(rings.get(0).getImage(), 890+(20*i), 185, 0, 50, 100, 1));
		for (int i = 10; i < 15; i++)
			background.add(new CharacterSonic(brick, i*brick.getWidth(), 300, 0, brick.getWidth(), brick.getHeight(), 0));
		}
        
		if(level == 2) {
            for(int i = 0; i <= 100; i++)
                ringSpin.remove(i);
            
            for(int i = 0; i <= 50; i++)
			ringSpin.add(new CharacterSonic(rings.get(0).getImage(), 370+(20*i), 285, 0, 50, 100, 1));
			for (int i = -25; i < 20; i++)
				background.add(new CharacterSonic(brick, i*brick.getWidth(), 400, 0, brick.getWidth(), brick.getHeight(), 0));
			for (int i = 5; i < 10; i++)
				background.add(new CharacterSonic(brick, i*brick.getWidth(), 200, 0, brick.getWidth(), brick.getHeight(), 0));
			
			for (int i = 7; i < 20; i++)
				background.add(new CharacterSonic(brick, i*brick.getWidth(), 300, 0, brick.getWidth(), brick.getHeight(), 0));
			
		}
			
		
		
		
		sonicSheet = ImageIO.read(ClassLoader.getSystemResource("SonicSpriteSheet.png"));
        sonicSheetRight = ImageIO.read(ClassLoader.getSystemResource("SonicSpriteSheetRight.png"));
		sonic = new CharacterSonic(sonicSheetRight.getSubimage(998,11,23,33), 200, 10, 0, 22,31, 0);
		
		
		
		
		//right sonic
		// index 0 is standing sonic
		//index 1-12 are for running
		//index 13 is in air
        int [] rightXPosition = {731, 1000, 962, 917, 880, 848, 808, 759, 718, 680, 639, 583, 542, 166,  892, 857, 820, 783 };
        int [] rightYPosition = {100, 144, 144, 146, 146, 146, 146, 148, 148, 146, 146, 148, 148, 280, 240, 241, 240, 239};
        int [] rightWidth  = {21, 25, 28, 34, 29, 27, 31, 38, 33, 27, 32, 38, 33, 29,  24, 22, 24, 26 };
		int [] rightHeight = {36, 35, 35, 34, 34, 34, 32, 31, 31, 33, 34, 32, 32, 40,  24, 22, 24, 26 };
       
		
		for(int i = 0; i < rightXPosition.length; i++)
			sonicRight.add(new CharacterSonic(sonicSheetRight.getSubimage(rightXPosition[i], rightYPosition[i], rightWidth[i], rightHeight[i]), 0, 0, 0, rightWidth[i], rightHeight[i], 0));
		
		
			
		
		//left Sonic
		// index 0 is standing sonic
		//index 1-12 are for running
		//index 13 is in air
		int [] leftXPosition = {280, 7, 42, 81, 123, 157, 193, 235, 281, 325, 361, 411, 457, 837,};
		int [] leftYPosition = {100, 144, 144, 146, 146, 146, 146, 148 , 148, 146, 146, 148, 148, 280,};
		int [] leftWidth=     {21, 25, 28 ,34 ,29 ,17 ,31 ,38 ,33 ,33 ,32, 38, 33, 29};
		int [] leftHeight =    {36, 35, 35, 34, 34, 34, 32, 31, 31, 33, 34, 32, 32, 40};
		
		
		for(int i = 0; i < leftXPosition.length; i++)
			sonicLeft.add(new CharacterSonic(sonicSheet.getSubimage(leftXPosition[i], leftYPosition[i], leftWidth[i], leftHeight[i]), 0, 0, 0, leftWidth[i], leftHeight[i], 0));
		
		System.out.println(leftXPosition.length);
		System.out.println(rightXPosition.length);
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
		else if(!overGame) {
			
			//background
			
			for(int county = -5; county < 5; county++)
				g.drawImage(myBackground.getImage(), myBackground.getxLoc()+myBackground.getWidth()*county, myBackground.getyLoc(), null);
			for(CharacterSonic bk: background)
				g.drawImage(bk.getImage(), bk.getxLoc(), bk.getyLoc(), null);
				
			
			
			//enemy
			for(CharacterSonic en: enemy)
				g.drawImage(en.getImage(), en.getxLoc(), en.getyLoc(), null);
			g.drawImage(sonic.getImage(), sonic.getxLoc(), sonic.getyLoc(), null);
			
			g.setColor(Color.WHITE);
			g.drawString("Rings: " + ringCount, 50, 50);
			g.drawString("Sonic Location: " + sonic.getxLoc(), 50, 100);
			g.drawString("Time remaining: " + timeRemaining, 50, 150);
			g.drawString("Rings remaining " + (ringSpin.size()-ringCount), 50, 200);
			for(CharacterSonic r: ringSpin)
				g.drawImage(r.getImage(), r.getxLoc(), r.getyLoc()+100, null);
			if(level == 2)repaint();
		}//end if
		if(overGame){
			timer = false;
			gameOver(g);
		}
		else if(levelWinner && level == 1) {
			levelWin(g);
		}
		else if(levelWinner && level == 2) {
			levelWin(g);
		}
		
	}//end paintComponent
	
	public void introScreen(Graphics g) {
		
		g.drawImage(introBackground, 0, 0, null);
		g.drawImage(introPic, 0, 0, null);
		g.drawImage(introRing, 1100, 90, null);
		
		g.setColor(Color.WHITE);
		g.setFont(bruh);
		g.drawString("Sonic's ring search", 600, 200);
		g.setFont(bruh2);
		g.drawString("Press enter to start: ", 600, 300);
		g.drawString("(go fullscreen for best experience and how to play)", 600, 20);
		g.drawString("1. Find and collect all 200 rings in the time limit", 1000, 400);
		g.drawString("or you will have to start over!", 1000, 450);
        g.drawString("2. arrow keys to move and jump", 1000, 500);
		g.drawString("3. backspace to turn music off", 1000, 550);
        g.drawString("4. Q to quit", 1000, 600);
		
		
	}//end introScreen
	
	public void gameOver(Graphics g) {
		g.setColor(Color.WHITE);
		g.drawRect(0, 0, 2000, 2000);
		g.setColor(Color.BLACK);
		g.setFont(bruh3);
		g.drawString("YOU LOSE! Press space to start over", 50, 200);
		
		
	}//end gameOver
	public void levelWin(Graphics g) {
		g.setColor(Color.WHITE);
		g.setFont(bruh3);
		if(level == 1)g.drawString("YOU WIN! Press H to move on!", 50, 200);
		if(level == 2 && levelWinner == true) {
			g.setFont(bruh2);
			g.drawString("YOU WIN! Thanks for playing!", 50, 200);
		}
		
	}//end introScreen
	private class timeListener implements ActionListener{
		public void actionPerformed (ActionEvent e) {
			
			if(timer && !levelWinner)tmr+= 1;
				if(tmr%3 == 0)
					timeRemaining--;
				for(CharacterSonic r: ringSpin) {
					ringSpeed++;
					if(ringSpeed % 5 == 0) {
						ringN++;
						r.setImage(rings.get(ringN).getImage());
						if(ringN == rings.size()-1)
							ringN = 0;	
					}
				}
			for(int i = 0; i < ringSpin.size(); i++) {	
				int ringHit = sonic.collidesWith(ringSpin.get(i));
				if(ringHit == 0) {
					ringSpin.get(i).setyLoc(-500);
					ringCount++;
					playSoundEffects(2);
					ringHit = 4;
				}
			}
			
			
			//gravity
			if(sonic.gravityFall(background)<0)
				sonic.move(0, sonic.falling());
			
			
			
			//reset
			if (sonic.getyLoc() > 1500) {sonic.setyLoc(5); sonic.landed();}
			
			
			
			//jumping
			if(jump) {
				if(right)
					sonic.setImage(sonicRight.get(13).getImage());
				sonic.move(0, -vjump);
				vjump--;
				if(!right)
					sonic.setImage(sonicLeft.get(13).getImage());
				if (vjump < 0) {
					jump = false;
					if(right)
						sonic.setImage(sonicRight.get(0).getImage());
					else if(!right)
						sonic.setImage(sonicLeft.get(0).getImage());
				}
	
			}
			//ring
			//move right
			if(rightPress) {
				sonic.setImage(sonicRight.get(n).getImage());
				if(jump) sonic.setImage(sonicRight.get(13).getImage());
				else n++;
				if(n == 12)
					n = 3;	
				if(sonic.getVelocity()<15) {
					sonic.accelerateRight();
				}
				for(CharacterSonic bk: background)
					bk.move(-1*sonic.getVelocity(), 0);
				myBackground.move(-1*sonic.getVelocity(), 0);
				
				for(CharacterSonic r: ringSpin)
					r.move((-1*sonic.getVelocity()), 0);
				sonic.move(sonic.getVelocity(), 0);
			}//end
			
			//move left
			if(leftPress) {
				sonic.setImage(sonicLeft.get(n).getImage());
				if(jump) sonic.setImage(sonicLeft.get(13).getImage());
				else n++;
				if(n == 12)
					n = 3;
				if(sonic.getVelocity()>-15) {
					sonic.accelerateLeft();
				}
				
				
				for(CharacterSonic bk: background)
					bk.move(-1*sonic.getVelocity(), 0);
				myBackground.move(-1*sonic.getVelocity(), 0);
				for(CharacterSonic r: ringSpin)
					r.move((-1*sonic.getVelocity()), 0);
				sonic.move(sonic.getVelocity(), 0);
				
				
			}//end
			
			if(downPress) {
					sonic.setImage(sonicRight.get(15).getImage());
					sonic.setyLoc(sonic.getyLoc());
					sonic.move(sonic.getVelocity(), 0);
					if(n == sonicRight.size()-1)
						n = 15;
					if(sonic.getVelocity() <= 0)
						n = 0;
			}
				
			if(timeRemaining == 0 || sonic.getyLoc() == 5) {
				overGame = true;
			}
				
			//win
			if(ringCount == 242) {
				levelWinner = true;
			}
				
			repaint();
		}//end action performed
	}//end timeListener
	
	
	private class KeyInput extends KeyAdapter{
		public void keyPressed(KeyEvent e) {
			
			if(e.getKeyCode() == KeyEvent.VK_H && levelWinner == true) {
				levelWinner = false;
				timer = true;
				timeRemaining = 200;
				level = 2;
			}
			
			if(e.getKeyCode() == KeyEvent.VK_SPACE) {
				overGame = false;
				intro = true;
			}
			
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
			
			if(e.getKeyCode() == KeyEvent.VK_DOWN) {
				downPress = true;
				
			}
			
			if(e.getKeyCode() == KeyEvent.VK_UP && !(jump)) {
				jump = true; 
				if(sonic.getVelocity() == 15) vjump = 20;
				else if(sonic.getVelocity() == -15) vjump = 20;
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
				sonic.setImage(sonicRight.get(0).getImage());
				sonic.setVelocity(0);
			}
			if(e.getKeyCode() == KeyEvent.VK_LEFT) {
				leftPress = false;
				n = 0;
				sonic.setImage(sonicLeft.get(0).getImage());
				sonic.setVelocity(0);
			}
		
			if(e.getKeyCode() == KeyEvent.VK_DOWN) {
				downPress = false;
				n = 0;
				sonic.setImage(sonicRight.get(0).getImage());
				sonic.setVelocity(0);
			}
			
			repaint();
		
		}//end keyReleased
		
	}//end KeyInput
	
	//sound methods
	private void playTheme() {
		
		try {
			AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(ClassLoader.getSystemResource("SonicMusic.wav"));
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
				audioInputStream = AudioSystem.getAudioInputStream(ClassLoader.getSystemResource("SonicJump.wav"));
			if(n == 2) 
				audioInputStream = AudioSystem.getAudioInputStream(ClassLoader.getSystemResource("RingSound.wav"));
			
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
		frame.setTitle("Sonic Game");
		frame.setSize(1450,1000);
		//frame.
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = frame.getContentPane();
		c.add(new GamePanelSonic(Color.WHITE));
		frame.setVisible(true);

	}//end main

}//end GamePanel
