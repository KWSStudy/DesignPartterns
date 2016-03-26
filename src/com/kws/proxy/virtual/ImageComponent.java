package com.kws.proxy.virtual;

import java.awt.Graphics;

import javax.swing.Icon;
import javax.swing.JComponent;

public class ImageComponent extends JComponent{
	private Icon icon;
	
	public ImageComponent(Icon icon) {
		// TODO Auto-generated constructor stub
		this.setIcon(icon);
	}

	public void setIcon(Icon icon) {
		this.icon = icon;
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		int w = icon.getIconWidth();
		int h = icon.getIconHeight();
		int x = (800-w)/2;
		int y = (800-h)/2;
		icon.paintIcon(this, g, x, y);
	}

}
