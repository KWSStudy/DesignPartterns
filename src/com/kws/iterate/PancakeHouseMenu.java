package com.kws.iterate;

import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseMenu implements Menu{
	ArrayList<MenuItem> menuItems;

	public PancakeHouseMenu() {
		menuItems = new ArrayList<MenuItem>();
		
		addItem("K&B ������ũ ��Ʈ",
				"��ũ����� ���׿� �佺Ʈ�� ��鿩�� ������ũ",
				true,
				2.99);
		
		addItem("���ַ� ������ũ ��Ʈ",
				"�ް� �Ķ��̿� �ҽ����� ��鿩�� ������ũ",
				true,
				2.99);
		
		addItem("��纣�� ������ũ",
				"�ż��� ��纣���� ��纣�� �÷����� ���� ������ũ",
				true,
				3.49);
		
		addItem("��纣�� ������ũ",
				"����, ���⿡ ���� ��纣���� ���⸦ ���� �� �ֽ��ϴ�.",
				true,
				3.59);
	}

	public void addItem(String name, String description, boolean vegetarian, double price) {
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		menuItems.add(menuItem);
	}
	
	public Iterator<MenuItem> createIterator() {
		return menuItems.iterator();
	}
}
