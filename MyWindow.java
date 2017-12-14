import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
public class MyWindow {
	public static final int SCALE = 30;
	public static final int WHIDTH = 20;
	public static final int HEIGHT = 20;
	public static void main(String[] args) {
		JFrame f = new JFrame();
		JPanel p = new JPanel();		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setResizable(false);
		f.setSize(WHIDTH*SCALE+7,HEIGHT*SCALE+30+SCALE);
		f.setTitle("Ssssnake");
		f.setLocationRelativeTo(null);	
		f.add(new SnakeGame());
		JMenuBar menu = new JMenuBar();
		JMenu menu1 = new JMenu("Menu");
		JMenuItem mi1= new JMenuItem("Instructions");
		JMenuItem mi2= new JMenuItem("Exit");
		menu1.add(mi1);
		menu1.add(mi2);
		mi2.addActionListener(new ActionListener(){  
		      public void actionPerformed(ActionEvent e){
			       System.exit(1);
			      }
			          });
		mi1.addActionListener(new ActionListener(){  
		      public void actionPerformed(ActionEvent e){
		    	  JFrame f1= new JFrame();
		    	  f1.setSize(350,300);
		    	  f1.setTitle("Instructions");
		    	  f1.setVisible(true);	
		    	  
		    	  f1.setResizable(false);
			      }
			          });
		menu.add(menu1);
		f.add(p,BorderLayout.NORTH);
		f.setJMenuBar(menu);
		f.setVisible(true);
	}
}
