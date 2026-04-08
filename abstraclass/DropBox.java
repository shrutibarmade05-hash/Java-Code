package com.abstraclass;

public class DropBox implements CloudStorage {

	@Override
	public void uploadFile() {
		  System.out.println("File uploaded to Dropbox!");
		
	}

	@Override
	public void downloadFile() {
		System.out.println("File downloaded from Dropbox!");
	}

}
