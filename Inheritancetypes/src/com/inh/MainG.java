package com.inh;

public class MainG {
public static void main(String args[]) {
	Google g = new Google();
	g.commonFeature();
	
	Gmap g1 = new Gmap();
    g1.show_Location();
    
    Gdrive g2 = new Gdrive();
    g2.storeFile();
    
    Gmail g3 = new Gmail();
    g3.sendEmail();
    
    
	
	
}
}
