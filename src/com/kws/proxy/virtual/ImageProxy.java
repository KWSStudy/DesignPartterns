package com.kws.proxy.virtual;

import java.awt.Component;
import java.awt.Graphics;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class ImageProxy implements Icon{
	ImageIcon imageIcon;
	URL imageURL;
	Thread retrievalThread;
	boolean retrieving = false;
	
	public ImageProxy(URL url) {
		// TODO Auto-generated constructor stub
		imageURL = url;
	}
	
	@Override
	public void paintIcon(final Component c, Graphics g, int x, int y) {
		// TODO Auto-generated method stub
		if(imageIcon != null){
			imageIcon.paintIcon(c, g, x, y);
		}else{
			g.drawString("Loading CD Cover, please wait....", x+300, y+190);
			if(!retrieving){
				retrieving = true;
				retrievalThread = new Thread(new Runnable() {
					
					@Override
					public void run() {
						// TODO Auto-generated method stub
						try{
							Thread.sleep(5000);
							imageIcon = new ImageIcon(imageURL, "CD Cover");
							c.repaint();
						}catch(Exception e){
							e.printStackTrace();
						}
					}
				});
				retrievalThread.start();
			}
		}
	}

	@Override
	public int getIconWidth() {
		// TODO Auto-generated method stub
		if(imageIcon != null){
			return imageIcon.getIconWidth();
		}else{
			return 800;
		}
	}

	@Override
	public int getIconHeight() {
		// TODO Auto-generated method stub
		if(imageIcon != null){
			return imageIcon.getIconHeight();
		}else{
			return 600;
		}
	}

}
