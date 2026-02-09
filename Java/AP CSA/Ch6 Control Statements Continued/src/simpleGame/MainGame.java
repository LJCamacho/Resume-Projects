package simpleGame;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.util.Random;


public class MainGame extends JPanel {
	//instance variables
	private TheGuy Guy, exampleGuy, backgroundImage, YouDied;
	private Enemies e1, e2, e3, e4, peter, deathWall, h1, h2, h3, h4, hPeter;
	private Timer tm;
	private Font scoreboardFont, introFont, introFontBIG;
	private int score, life, level;
	private boolean updateIntro, hardMode;
	private Clip GuyHit, EnemyEnter, PeterPerhaps, GameOver;
	private double tmr = 0;
	
	public MainGame(Color bk) {
		setBackground(bk);
		setSize(1100,800);
		
	//instantiation of objects
	exampleGuy =new TheGuy(700, 350, new ImageIcon(ClassLoader.getSystemResource("SquidBox.png")));
	YouDied = new TheGuy(-1000,-490, new ImageIcon(ClassLoader.getSystemResource("YouDied2.jpg")));
	Guy = new TheGuy(500, 350, new ImageIcon(ClassLoader.getSystemResource("SquidBox.png")));
	backgroundImage = new TheGuy(0, 75, new ImageIcon(ClassLoader.getSystemResource("Grass.jpg")));
	
	e1 = new Enemies(800, 200, new ImageIcon(ClassLoader.getSystemResource("BakedBeans.png")));
	h1 = new Enemies(-500, 500, new ImageIcon(ClassLoader.getSystemResource("BakedBeans.png")));
	e2 = new Enemies(1100, 200, new ImageIcon(ClassLoader.getSystemResource("AngryReact.png")));
	h2 = new Enemies(-500, 200, new ImageIcon(ClassLoader.getSystemResource("AngryReact.png")));
	e3 = new Enemies(1100, 200, new ImageIcon(ClassLoader.getSystemResource("Anthony.png")));
	h3 = new Enemies(-500, 200, new ImageIcon(ClassLoader.getSystemResource("Anthony.png")));
	e4 = new Enemies(1100, 200, new ImageIcon(ClassLoader.getSystemResource("Paul-blart.png")));
	h4 = new Enemies(-500, 200, new ImageIcon(ClassLoader.getSystemResource("Paul-blart.png")));
	peter = new Enemies(1100, 200, new ImageIcon(ClassLoader.getSystemResource("Peter_Griffin.png")));
	hPeter = new Enemies(-500, 200, new ImageIcon(ClassLoader.getSystemResource("Peter_Griffin.png")));
	deathWall = new Enemies(1100, 0, new ImageIcon(ClassLoader.getSystemResource("YouDied2.jpg")));
	updateIntro = false; score = 0; life = 3; level = 1; hardMode = false;
		
		
		
		//Listener
		
		addKeyListener(new Key());
		setFocusable(true);
				
		tm = new Timer(20, new MoveListener());
		
		scoreboardFont = new Font("Comic Sans MS", Font.BOLD+Font.ITALIC, 20);
		introFont = new Font("Arial", Font.PLAIN, 20);
		introFontBIG = new Font("Arial", Font.PLAIN, 100);

		
		
	}//end constructor
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		//draw background
		introScreen(g);
		exampleGuy.draw(g);
		if(updateIntro) { background(g);
		Guy.draw(g);
		scoreboard(g);
		e1.draw(g);
		if (hardMode == true && level >= 1) h1.draw(g);
		if (level >= 2) {e2.draw(g);}
		if (level >= 2 && hardMode == true) {h2.draw(g);}
		if (level >= 3) {e3.draw(g);}
		if (level >= 3 && hardMode == true) {h3.draw(g);}
		if (level >= 4) {e4.draw(g);}
		if (level >= 4 && hardMode == true) {h4.draw(g);}
		if (level == 5) {peter.draw(g);}
		if (level >= 5 && hardMode == true) {hPeter.draw(g);}
		deathWall.draw(g);
		if (life <= 0) {
			tm.stop();
			playHit2();
			YouDied.draw(g);
			playAgain(g);
		}
		}
	
	}//end paint
public void introScreen(Graphics g) {
		g.setColor(Color.white);
		g.fillRect(0, 0, 1100, 1100);
		g.setFont(introFontBIG);
		g.setColor(Color.black);
		g.drawString("Dodgy Guy", 350, 100);
		g.setColor(Color.blue);
		g.setFont(introFont);
		g.drawString("Rules and Directions:", 100, 200);
		g.drawString("1.Use WASD to move.", 100, 230);
		g.drawString("2.Score goes up as time goes on.", 100, 260);
		g.drawString("3.Level goes up every 20 points until", 100, 290);
		g.drawString("level 5(80 points).", 100, 320);
		g.drawString("4.Don't get hit or you lose a life.", 100, 350);
		g.drawString("6. 3 lives", 100, 380);
		g.drawString("7. An enemy faster than the last will appear after each level change", 100, 410);
		g.drawString("8. By level 5 the boss will appear(he is larger and faster than the enemies)", 100, 440);
		g.drawString("9. Look to the right: you are squidward(the guy). everyone", 100, 470);
		g.drawString("else is an enemy and the boss is a secret", 100, 500);
		g.drawString("10. Enemies come from both sides in hard mode", 100, 530);
		g.drawString("Press x for easy mode; z for hard mode.", 400, 560);
		g.setColor(Color.red);
		g.drawString("By the way, going off screen to the right is", 200, 600);
		g.drawString("an insta kill in both modes so don't do that", 200, 630);
	}

	
	
//Listener
	private class MoveListener implements ActionListener {
		public void actionPerformed (ActionEvent e) {
			e1.move(-5, 0);
			if(level>=1 && hardMode == true) {h1.move(5, 0);}
			if(level >=2) e2.move(-6, 0);
			if(level >=2 && hardMode == true) h2.move(6, 0);
			if(level >= 3) e3.move(-8, 0);
			if(level >=3 && hardMode == true) h3.move(8, 0);
			if(level >= 4) e4.move(-10, 0);
			if(level>=4 && hardMode == true) h4.move(10, 0);
			if(level >= 5) peter.move(-20, 0);
			if(level>=5 && hardMode == true) hPeter.move(20, 0);
			tmr+= 1;
			if(tmr%12 == 0)
				score++;
			
			
			if (e1.getX() + e1.getB() <= 0) {
				e1.resetEnemy();
				Whoosh();
			}
			
			if (h1.getX() - h1.getB() >= 1100 && hardMode == true) {
				h1.resetEnemyHard();
				Whoosh();
			}
			
			if (e2.getX() + e2.getB() <= 0) {
				e2.resetEnemy();
				Whoosh();
			}
			
			if (h2.getX() - h2.getB() >= 1100 && hardMode == true) {
				h2.resetEnemyHard();
				Whoosh();
			}
			
			if (e3.getX() + e3.getB() <= 0) {
				e3.resetEnemy();
				Whoosh();
			}
			
			if (h3.getX() - h3.getB() >= 1100 && hardMode == true) {
				h3.resetEnemyHard();
				Whoosh();
			}
			
			if (e4.getX() + e4.getB() <= 0) {
				e4.resetEnemy();
				Whoosh();
			}
			
			if (h4.getX() - h4.getB() >= 1100 && hardMode == true) {
				h4.resetEnemyHard();
				Whoosh();
			}
			
			if (peter.getX() + peter.getB() <= 0) {
				peter.resetEnemy();
				Whoosh();
			}
			
			if (hPeter.getX() - hPeter.getB() >= 1100 && hardMode == true) {
				hPeter.resetEnemyHard();
				Whoosh();
			}
			
			if(Guy.getHit(e1)) {
				life -=1;
				e1.resetEnemy();
				playHit();
			}
			
			if(Guy.getHit(h1)&& hardMode == true) {
				life -=1;
				h1.resetEnemyHard();
				playHit();
			}
			
			if(Guy.getHit(e2)) {
				life -=1;
				e2.resetEnemy();
				playHit();
			}
			
			if(Guy.getHit(h2)&& hardMode == true) {
				life -=1;
				h2.resetEnemyHard();
				playHit();
			}
			
			if(Guy.getHit(e3)) {
				life -=1;
				e3.resetEnemy();
				playHit();
			}
			
			if(Guy.getHit(h3)&& hardMode == true) {
				life -=1;
				h3.resetEnemyHard();
				playHit();
			}
			
			if(Guy.getHit(e4)) {
				life -=1;
				e4.resetEnemy();
				playHit();
			}
			
			if(Guy.getHit(h4)&& hardMode == true) {
				life -=1;
				h4.resetEnemyHard();
				playHit();
			}
			
			if(Guy.getHit(deathWall)) {
				life -=1;
				playHit();
			}
			
			
			if(Guy.getHit(peter)) {
				life -=1;
				peter.resetEnemy();
				PlayHit3();
			}
			
			if(Guy.getHit(hPeter)&& hardMode == true) {
				life -=1;
				hPeter.resetEnemyHard();
				playHit();
			}
			
			if (score == 20 && level == 1) level++;
			if (score == 40 && level == 2) level++;
			if (score == 60 && level == 3) level++;
			if (score == 80 && level == 4) level++;
			repaint();
			
		}//actionPerformed
			
	}//MoveListener
	
private void playHit() {
		
		try {
			AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(ClassLoader.getSystemResource("no.wav"));
			GuyHit = AudioSystem.getClip();
			GuyHit.open(audioInputStream);
			GuyHit.start();
			
			
			
		}catch (Exception e){
			System.out.println("Error with playing sound. ");
			e.printStackTrace();
		}
}//end playHit
private void playHit2() {
	
	try {
		AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(ClassLoader.getSystemResource("buzzer_x.wav"));
		GameOver = AudioSystem.getClip();
		GameOver.open(audioInputStream);
		GameOver.start();
		
		
		
	}catch (Exception e){
		System.out.println("Error with playing sound. ");
		e.printStackTrace();
	}
}//end playHit

private void PlayHit3() {
	
	try {
		AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(ClassLoader.getSystemResource("perhaps.wav"));
		PeterPerhaps = AudioSystem.getClip();
		PeterPerhaps.open(audioInputStream);
		PeterPerhaps.start();
		
		
		
	}catch (Exception e){
		System.out.println("Error with playing sound. ");
		e.printStackTrace();
	}
}//end playHit
	
private void Whoosh() {
	
	try {
		AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(ClassLoader.getSystemResource("flyby.wav"));
		EnemyEnter = AudioSystem.getClip();
		EnemyEnter.open(audioInputStream);
		EnemyEnter.start();
		
		
		
	}catch (Exception e){
		System.out.println("Error with playing sound. ");
		e.printStackTrace();
	}
}//end playHit
	
	
	
	
public void playAgain(Graphics g) {
		
		g.setFont(introFontBIG);
		g.setColor(Color.white);
		g.drawString("Play again?(Y)", 200, 300);
		g.setFont(introFont);
		if (hardMode == true) {g.setColor(Color.RED);g.drawString("Hard mode was ON", 800, 470);}
		g.drawString("You made it to level:" + level, 800, 500);
		g.drawString("Your final score was:"+ score, 800, 530);
		
	}
	public void scoreboard (Graphics g) {
		g.setColor(Color.blue);
		g.setFont(scoreboardFont);
		g.drawString("Score = " + score, 805, 50);
		g.setColor(Color.red);
		g.drawString("Life = " + life, 605, 50);
		g.setColor(Color.orange);
		g.drawString("Level = "+ level, 405, 50);
	}
	private class Key extends KeyAdapter{
		public void keyPressed(KeyEvent e ) {
			if(e.getKeyCode() == KeyEvent.VK_X) {
				updateIntro = true;
				tm.start();
				PlayHit3();
			}
			if(e.getKeyCode() == KeyEvent.VK_Z) {
				updateIntro = true;
				hardMode = true;
				tm.start();
				PlayHit3();
			}
			if (e.getKeyChar() == 'y' && life == 0) {
				life = 3; score = 0; level = 1;
				updateIntro = true;
				tm.start();
				Guy.resetCharacter();
				e1.resetEnemy(); e2.resetEnemy(); e3.resetEnemy(); e4.resetEnemy(); peter.resetEnemy();
				if (hardMode == true) { h1.setX(-500); h2.resetEnemyHard(); h3.resetEnemyHard(); h4.resetEnemyHard(); hPeter.resetEnemyHard();}
				repaint();
			}
			
			  if(e.getKeyCode() == KeyEvent.VK_D ) {
				  Guy.move(20, 0);
			}
		
			if(e.getKeyCode() == KeyEvent.VK_A && Guy.getX()+Guy.getB() > 100) {
				Guy.move(-20,0);
			}
			if(e.getKeyCode() == KeyEvent.VK_W && Guy.getY()+Guy.getH() > 190) {
				Guy.move(0, -20);
			}
			if (e.getKeyCode() == KeyEvent.VK_S && Guy.getY()-Guy.getH() < 600) {
				Guy.move(0, 20);
			}
			/*
			if(e.getKeyCode() == KeyEvent.VK_Q) {
				PlayHit3();
				life = 0;
			}
			*/
			
			
			repaint();
		}//end keyPressed
	}//end Key
	
	
	
	//background method
		public void background(Graphics g) {
			g.setColor(Color.white);
			g.fillRect(0, 0, 1100, 75);
			g.setColor(Color.BLACK);
			g.fillRect(0, 100, 1100, 700);
			backgroundImage.draw(g);
		}
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("Dodgy Guy");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		MainGame Mg = new MainGame(Color.black);
		Container c = f.getContentPane();
		c.add(Mg);
		f.setSize(Mg.getSize()); 
		f.setVisible(true);
		f.setResizable(false);
		
	}//end main

}
