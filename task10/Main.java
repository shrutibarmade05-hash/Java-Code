package com.task10;

public class Main {
	public static void main(String[] args) {
        Authentication google = new GoogleAuth();
        google.login();
        google.logout();

        Authentication facebook = new FacebookAuth();
        facebook.login();
        facebook.logout();
    }
}
