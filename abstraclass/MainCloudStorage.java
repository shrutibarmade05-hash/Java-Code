package com.abstraclass;

public class MainCloudStorage {
public static void main(String args[]) {
	 CloudStorage storage = new GoogleDrive();
     storage.uploadFile();
     storage.downloadFile();

     System.out.println("-------------------");

     storage = new DropBox();
     storage.uploadFile();
     storage.downloadFile();
}
}
