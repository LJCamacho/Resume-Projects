package cannon;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;




public class cannonApp extends JPanel{
	//variables
	Timer tm;
	Entity tank;
	
	public cannonApp() {
		this.setBackground(Color.gray);
		this.setPreferredSize(new Dimension(1000,800));
		
		
		tank = new Entity (200, 200, Color.GREEN);
		
		//listeners
		tm = new Timer(20, new MoveListener());
		tm.start();
		
		addKeyListener(new Key());
		setFocusable(true);
		
	}//end constructor
	
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
				tank.draw(g);
				if(tank.getFiring())
					tank.drawBullet(g);
				
	}//end paintComponent
	
	
	
	
	// Listeners...
	private class Key extends KeyAdapter{
		public void keyPressed(KeyEvent e) {
			if (e.getKeyCode()==KeyEvent.VK_RIGHT) {
				tank.setAngle(tank.getAngle()+Math.PI/8);
			}
			if (e.getKeyCode()==KeyEvent.VK_LEFT) {
				tank.setAngle(tank.getAngle()-Math.PI/8);
			}	
			if(e.getKeyCode()==KeyEvent.VK_A	) {tank.move(-10, 0);}
			if(e.getKeyCode()==KeyEvent.VK_W	) {tank.move(0, -10);}
			if(e.getKeyCode()==KeyEvent.VK_S	) {tank.move(0, 10);}
			if(e.getKeyCode()==KeyEvent.VK_D	) {tank.move(10, 0);}
			
			if(e.getKeyCode()==KeyEvent.VK_SPACE) {
				tank.getFiringCoordinates();
			}
			
			repaint();
		}//end keyPressed
	}//end key
	
	private class MoveListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			
			if(tank.getFiring()) {
				tank.fireBullet();
			}
			repaint();
			
		}//end actionPerformed
	}//end MoveListener
	
	
	
	
	
	
	
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = f.getContentPane();
		cannonApp t = new cannonApp();
		c.add(t);f.pack();
		f.setVisible(true);

	}//end main

}//end cannonApp