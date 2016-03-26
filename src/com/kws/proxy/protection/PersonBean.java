package com.kws.proxy.protection;

public interface PersonBean {
	String getName();
	String getGender();
	String getInterests();
	int getHotORNotRating();

	void setName(String name);
	void setGender(String gender);
	void setInterests(String interests);
	void setHotOrNotRating(int rating);
}
