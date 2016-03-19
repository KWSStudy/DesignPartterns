package com.kws.iterate;

import java.util.Iterator;

public class DinerMenu  implements Menu{
	static final int MAX_ITEMS = 6;
	int numberOfItems = 0;
	MenuItem[] menuItems;
	
	public DinerMenu() {
		menuItems = new MenuItem[MAX_ITEMS];
		
		addItem("ä�������ڿ� BLT", "��� ���� (�Ĺ���) ������, ����, �丶�並 ���� �޴�", true, 2.99);
		addItem("BLT", "������� ������, ����, �丶�並 ���� �޴�", false, 2.99);
		addItem("������ ����", "���� �����带 ����� ������ ����", false, 2.99);
		addItem("�ֵ���", "���� �����带 ����� ������ ����", false, 3.29);
		
	}
	
	public void addItem(String name, String description, boolean vegetarian, double price) {
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		if (numberOfItems >= MAX_ITEMS) {
			System.out.println("�˼��մϴ�, �޴��� �� á���ϴ�. �� �̻� �߰��� �� �����ϴ�.");
		}
		else {
			menuItems[numberOfItems] = menuItem;
			numberOfItems++;
		}
	}

	public Iterator<MenuItem> createIterator() {
		return new DinerMenuIterator(menuItems);
	}
	
}
