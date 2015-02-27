package com.pages;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Testing{

	final int CARDS = 4;
	CardLayout cl = new CardLayout();
	JPanel cardPanel = new JPanel(cl);
	int currentlyShowing = 0;

	public void buildGUI(){

		JMenu menu = new JMenu("Panels");
		for(int x = 0; x < CARDS; x++){
			
			final int SELECTION = x;
			JPanel jp = new JPanel();
			if(x == 0) jp.add(new JLabel("Panel 0"));
			
			else if(x == 1) jp.add(new JTextField("Panel 1",10));
			
			else if(x == 2) jp.add(new JButton("Panel 2"));
			
			else jp.add(new JComboBox(new String[]{"Panel 3"}));
			
			cardPanel.add(""+SELECTION,jp);
			JMenuItem menuItem = new JMenuItem("Show Panel "+x);
			
			menuItem.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent ae){
					currentlyShowing = SELECTION;
					cl.show(cardPanel,""+SELECTION);
				}
			});
			menu.add(menuItem);
		}
		JMenuBar menuBar = new JMenuBar();
		menuBar.add(menu);

		JButton btnNext = new JButton("Next >>");
		JButton btnPrev = new JButton("<< Previous");
		JPanel p = new JPanel(new GridLayout(1,2));
		p.add(btnPrev); p.add(btnNext);

		JFrame f = new JFrame();
		f.getContentPane().add(cardPanel);
		f.getContentPane().add(p,BorderLayout.SOUTH);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(300,200);
		f.setLocationRelativeTo(null);
		f.setJMenuBar(menuBar);
		f.setVisible(true);
		btnNext.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				if(currentlyShowing < CARDS-1)
				{
					cl.next(cardPanel);
					currentlyShowing++;
				}
			}
		});
		btnPrev.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				if(currentlyShowing > 0)
				{
					cl.previous(cardPanel);
					currentlyShowing--;
				}
			}
		});
	}
	public static void main(String[] args)
	{
		SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				new Testing().buildGUI();
			}
		});
	}
}
