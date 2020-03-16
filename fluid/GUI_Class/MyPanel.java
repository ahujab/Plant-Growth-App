package edu.neu.csye6200.ui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class MyPanel extends JPanel 
{
	public MyPanel()
	{
		
	}
	
	public void paint (Graphics g)
	{
		drawCanvas(g);
	}
	
	private void drawCanvas(Graphics g)
	{
		Graphics2D g2d = (Graphics2D) g; //cast to the deluxe version
		
		Dimension size = getSize();
		
		g2d.setColor(Color.BLACK);
		g2d.fillRect(0, 0, size.width, size.height);
		
		g2d.setColor(Color.GREEN);
		g2d.drawString("Hello World 2D", 10, 20);
		
		g2d.setColor(Color.RED);
		g2d.drawLine(0, 0, size.width, size.height);
		
		int cellSize = 18;
		int maxRows = size.height / (cellSize + 2);
		int offset = 0;
		for (int j=0; j< maxRows; j++)
		{
			for (int i=0; i<=20; i++)
			{
				int red = 50 +i*10;
				int green = 255 - j*10;
				if (green < 0) green = 0;
				if(green<0) green = 0;
				if((j%2) > 0) // odd/even test
					offset = 10;
				else
					offset = 0;
//				Color col = new Color(50+i*10,255-j*10,50);
				Color col = new Color(red,green,50);
				paintCell(g2d, i*20+offset, j*20 + 15, cellSize,col);
			}
		}
	}
	
	
	private void paintCell(Graphics2D g2d, int x, int y, int size, Color color)
	{
		g2d.setColor(color);
		g2d.fillRect(x, y, size, size);
		
	}
}

