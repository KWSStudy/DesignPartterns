package com.kws.composite;

public class MenuTest {
	public static void main(String [] args) {
		MenuComponent pancakeHouseMenu = new Menu("������ũ �Ͽ콺 �޴�", "��ħ �޴�");
		MenuComponent dinerMenu = new Menu("��ü���� �Ĵ� �޴�", "���� �޴�");
		MenuComponent cafeMenu = new Menu("ī��޴�", "����޴�");
		MenuComponent dessertMenu = new Menu("����Ʈ �޴�", "����Ʈ�� ��� ������!");
		
		MenuComponent allMenus = new Menu("��ü�޴�", "��ü�޴�");
		
		allMenus.add(pancakeHouseMenu);
		allMenus.add(dinerMenu);
		allMenus.add(cafeMenu);
		
		
		dinerMenu.add(new MenuItem("�Ľ�Ÿ", "�������� �ҽ� ���İ�Ƽ. ȿ�𻧵� �帳�ϴ�.",
				true, 3.89));
		dinerMenu.add(new MenuItem("�Ľ�Ÿ", "�������� �ҽ� ���İ�Ƽ. ȿ�𻧵� �帳�ϴ�.",
				true, 3.89));
		dinerMenu.add(new MenuItem("�Ľ�Ÿ", "�������� �ҽ� ���İ�Ƽ. ȿ�𻧵� �帳�ϴ�.",
				true, 3.89));
		
		dinerMenu.add(dessertMenu);
		
		dessertMenu.add(new MenuItem("��������", "�ٻ�ٻ��� ũ����Ʈ�� �ٴҶ� ���̽�ũ���� ���� �ִ� ��������", true, 1.59));
		dessertMenu.add(new MenuItem("��������", "�ٻ�ٻ��� ũ����Ʈ�� �ٴҶ� ���̽�ũ���� ���� �ִ� ��������", false, 1.59));
		dessertMenu.add(new MenuItem("��������", "�ٻ�ٻ��� ũ����Ʈ�� �ٴҶ� ���̽�ũ���� ���� �ִ� ��������", true, 1.59));
		dessertMenu.add(new MenuItem("��������", "�ٻ�ٻ��� ũ����Ʈ�� �ٴҶ� ���̽�ũ���� ���� �ִ� ��������", false, 1.59));
		dessertMenu.add(new MenuItem("��������", "�ٻ�ٻ��� ũ����Ʈ�� �ٴҶ� ���̽�ũ���� ���� �ִ� ��������", false, 1.59));
		
		Waitress waitress = new Waitress(allMenus);
		waitress.printMenu();
	}
}
