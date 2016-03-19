package com.kws.iterate;

import java.util.ArrayList;
import java.util.Iterator;

public class Waitress {
	
//	Menu pancakeHouseMenu;
//	Menu dinerMenu;
//	Menu cafeMenu;
//	
//	public Waitress(Menu pancakeHouseMenu, Menu dinerMenu, Menu cafeMenu) {
//		this.pancakeHouseMenu = pancakeHouseMenu;
//		this.dinerMenu = dinerMenu;
//		this.cafeMenu = cafeMenu;
//	}
	
	ArrayList<Menu> menus;
	
	public Waitress(ArrayList<Menu> menus) {
		this.menus = menus;
	}
	
	
	public void printMenu() {
		
//		Iterator<MenuItem> pancakeIterator = pancakeHouseMenu.createIterator();
//		Iterator<MenuItem> dinerIterator = dinerMenu.createIterator();
//		Iterator<MenuItem> cafeIterator = cafeMenu.createIterator();
//		System.out.println("아침메뉴 \n====");
//		printMenu(pancakeIterator);
//		
//		System.out.println("\n점심메뉴 \n====");
//		printMenu(dinerIterator);
//		
//		System.out.println("\n저녁메뉴 \n====");
//		printMenu(cafeIterator);
		
		Iterator<Menu> menuIterator = menus.iterator();
		while (menuIterator.hasNext()) {
			Menu menu = menuIterator.next();
			printMenu(menu.createIterator());
			
		}
	}
	
	private void printMenu(Iterator<MenuItem> iterator) {
		while(iterator.hasNext()) {
			MenuItem menuItem = (MenuItem) iterator.next();
			System.out.print(menuItem.getName() + ", ");
			System.out.print(menuItem.getPrice() + "-- ");
			System.out.println(menuItem.getDescription());
		}
	}
}
