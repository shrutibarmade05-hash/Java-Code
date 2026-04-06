package com.task10;

public class GoogleAuth implements Authentication {

	@Override
	public void login() {
		System.out.println("Logged in with Google");
	}

	@Override
	public void logout() {
		 System.out.println("Logged out from Google");
		
	}

}
