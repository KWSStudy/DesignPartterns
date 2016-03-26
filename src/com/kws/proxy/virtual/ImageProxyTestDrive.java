package com.kws.proxy.virtual;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Enumeration;
import java.util.Hashtable;

import javax.swing.Icon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class ImageProxyTestDrive {
	ImageComponent imageComponent;
	JFrame frame = new JFrame("CD Cover Viewer");
	JMenuBar menuBar;
	JMenu menu;
	Hashtable<String, String> cds = new Hashtable<String, String>();
	
	public ImageProxyTestDrive() throws Exception{
		// TODO Auto-generated constructor stub
		cds.put("CD1", "http://img.ezmember.co.kr/cache/board/2012/05/07/f5f07916670d9cef8206a78da835a000.jpg");
		cds.put("CD2", "https://i.ytimg.com/vi/NSXx85xnw0o/maxresdefault.jpg");
		
		URL url = new URL(cds.get("CD1"));
		menuBar = new JMenuBar();
		menu = new JMenu("menu1");
		menuBar.add(menu);
		frame.setJMenuBar(menuBar);
		
		for(Enumeration<String> e = cds.keys() ; e.hasMoreElements();){
			String name = e.nextElement();
			JMenuItem item = new JMenuItem(name);
			menu.add(item);
			item.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					imageComponent.setIcon(new ImageProxy(getCDUrl(e.getActionCommand())));
					frame.repaint();
				}
			});
		}
		
		Icon icon = new ImageProxy(url);
		imageComponent = new ImageComponent(icon);
		frame.getContentPane().add(imageComponent);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800, 600);
		frame.setVisible(true);
	}
	
	URL getCDUrl(String name){
		try {
			return new URL(cds.get(name));
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public static void main(String[] args) throws Exception {
		ImageProxyTestDrive drive = new ImageProxyTestDrive();
	}
}
