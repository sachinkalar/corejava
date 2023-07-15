package com.rays.interfaces;

public class NewBusinessman implements Richman,SocialWorker {

	private String name = null;
	private String addr = null;
	
	public NewBusinessman(String name, String addr) {
		System.out.println(this.name = name);
		System.out.println(this.addr = addr);

	}
	public void earnMoney() {
		// TODO Auto-generated method stub

	}

	@Override
	public void donation() {
		// TODO Auto-generated method stub

	}

	@Override
	public void party() {
		// TODO Auto-generated method stub

	}

	@Override
	public void helpToOther() {
		System.out.println("help");

	}

}
