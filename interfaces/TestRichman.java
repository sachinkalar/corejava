package com.rays.interfaces;

public interface TestRichman {
	
	public static void main(String[] args) {
		
		Richman rm = new Businessman();
		
		rm.earnMoney();
		rm.donation();
		rm.party();
		
		SocialWorker s = new NewBusinessman("elon","bhiwandi");
		
		s.helpToOther();
		
		SocialWorker s1 = new Businessman3("sachin","panchor");
		
		s1.helpToOther();
		
		
		
		
		
		
	}

}

