package com.kws.proxy.protection;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class OwnerInvocationHandler implements InvocationHandler{
	PersonBean person;
	
	public OwnerInvocationHandler(PersonBean person) {
		// TODO Auto-generated constructor stub
		this.person = person;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws IllegalAccessException {
		// TODO Auto-generated method stub
		try{
			if(method.getName().startsWith("get")){
				return method.invoke(person, args);
			}else if(method.getName().equals("setHotOrNotRating")){
				throw new IllegalAccessException();
			}else if(method.getName().startsWith("set")){
				return method.invoke(person, args);
			}
		}catch(InvocationTargetException e){
			e.printStackTrace();
		}
		return null;
	}

}
