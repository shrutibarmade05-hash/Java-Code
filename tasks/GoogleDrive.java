package com.tasks;

public class GoogleDrive implements CloudStorage {

	@Override
	public void uploadFile() {
		 System.out.println("File uploaded to Google Drive!");
	}

	@Override
	public void downloadFile() {
		   System.out.println("File downloaded from Google Drive!");
	}

}
