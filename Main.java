import java.awt.Dimension;

import javax.swing.JFrame;
public class Main {
	public static void main(String args[]) {
		JFrame frame =new JFrame("Snake");
		frame.setContentPane(new Gamepanel());
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.pack();
		frame.setPreferredSize(new  Dimension(Gamepanel.WIDTH,Gamepanel.HEIGHT));
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
		
		
	}
	

}
