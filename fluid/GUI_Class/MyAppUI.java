package edu.neu.csye6200.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Logger;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyAppUI implements ActionListener
{
	private Logger log = Logger.getLogger(MyAppUI.class.getName());
	private JFrame frame = null;
	private JPanel mainPanel = null; // The north panel that holds controls
	private JPanel myPanel = null;
	private JButton startBtn = new JButton("Start");
	private JButton stopBtn = new JButton("Stop");
	
	
	
	
	public MyAppUI()
	{
	log.info("App Started");
	initGUI();
	}
	private void initGUI()
	{
		frame= new JFrame();
		frame.setSize(400,300);
		frame.setTitle("MyAppUI");
		frame.setResizable(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setLayout(new BorderLayout());
		
		// button panel into the north
		frame.add(getMainPanel(), BorderLayout.NORTH);
		
		// MyPanel into the center
		myPanel= new MyPanel();
		frame.add(myPanel, BorderLayout.CENTER);
		
		
		
		frame.setVisible(true); //don't usually do this if you are not sure, for now, we'll try out!
	}
	
	public JPanel getMainPanel()
	{
		mainPanel = new JPanel();
		mainPanel.setLayout(new FlowLayout());
		
		startBtn = new JButton("Start");
		stopBtn = new JButton("Stop");
		
		mainPanel.add(startBtn);
		mainPanel.add(stopBtn);
		
		startBtn.addActionListener(this);
//		stopBtn.addActionListener(this);
		stopBtn.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				log.info("Stop button was pressed");
			}
			
		});
		mainPanel.setBackground(Color.CYAN);
		return mainPanel;
	}

	public static void main(String[] args) 
	{
	MyAppUI myApp = new MyAppUI();
	System.out.println("MyApp is existing!!");

	}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		System.out.println("ActionEvent: " + e);
		
		if (e.getActionCommand().equalsIgnoreCase("Start"))
			System.out.println("Start button was pressed");
		
		if (e.getSource() == startBtn)
			System.out.println("Start button was pressed");
	}

}
