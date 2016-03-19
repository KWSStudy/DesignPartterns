package com.kws.iterate;

import java.util.Hashtable;
import java.util.Iterator;

public class CafeMenu implements Menu {
	Hashtable< String, MenuItem> menuItems = new Hashtable<>();
	
	public CafeMenu() {
		addItem("���� ���ſ� ���� ������", "��л�, ����, �丶��, ����Ƣ���� ÷���� ���� ����"
				, true, 3.99);
		addItem("������ ����", "�����尡 ��鿩�� ������ ����"
				, false, 3.69);
		addItem("������", "�� ������� ���, ����ī���� ��鿩�� Ǫ���� ������"
				, true, 3.99);
	}
	
	public void addItem(String name, String description, boolean vegetarian, double price) {
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		menuItems.put(menuItem.getName(), menuItem);
	}

	@Override
	public Iterator<MenuItem> createIterator() {
		return menuItems.values().iterator();
	}
}
