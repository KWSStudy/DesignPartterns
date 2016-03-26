package com.kws.proxy.protection;

import java.lang.reflect.Proxy;

public class MatchMakingTestDrive {
	public MatchMakingTestDrive() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		MatchMakingTestDrive drive = new MatchMakingTestDrive();
		drive.drive();
	}
	
	public void drive() {
		PersonBean joe = new PersonBeanImpl();
		joe.setName("Joe");
		joe.setGender("M");
		joe.setInterests("Nothing");
		joe.setHotOrNotRating(1);
		
		PersonBean ownerProxy = getOwnerProxy(joe);
		System.out.println("Name is " + ownerProxy.getName());
		ownerProxy.setInterests("bowling, go");
		System.out.println("Interests set from owner proxy");
		try{
			ownerProxy.setHotOrNotRating(10);
		}catch(Exception e){
			System.out.println("Can't set rating from owner proxy");
		}
		System.out.println("Rating is " + ownerProxy.getHotORNotRating());
		
		PersonBean nonOwnerProxy = getNonOwnerProxy(joe);
		System.out.println("Name is " + nonOwnerProxy.getName());

		try{
			nonOwnerProxy.setInterests("bowling, go");
		}catch(Exception e){
			System.out.println("Can't set Interests set from non owner proxy");
		}
		nonOwnerProxy.setHotOrNotRating(10);
		System.out.println("Rating set interests from non owner proxy ");
		System.out.println("Rating is " + nonOwnerProxy.getHotORNotRating());
		
	}

	private PersonBean getOwnerProxy(PersonBean person) {
		// TODO Auto-generated method stub
		return (PersonBean) Proxy.newProxyInstance(person.getClass().getClassLoader(), person.getClass().getInterfaces(), new OwnerInvocationHandler(person));
	}

	private PersonBean getNonOwnerProxy(PersonBean person) {
		// TODO Auto-generated method stub
		return (PersonBean) Proxy.newProxyInstance(person.getClass().getClassLoader(), person.getClass().getInterfaces(), new NonOwnerInvocationHandler(person));
	}
}
