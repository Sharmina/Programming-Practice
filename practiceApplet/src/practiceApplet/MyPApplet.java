package practiceApplet;

import processing.core.*;

public class MyPApplet extends PApplet{

	PImage webImg;	
	public void setup() {
	    size(400,400);
	    String url = "https://processing.org/img/processing-web.png";
	    // Load image from a web server
	    webImg = loadImage(url, "png");
	   
	  }

	  public void draw() {
	   
		  webImg.resize(0, height);
		  image(webImg,0,0);
		  fill(255,209,0);
		  ellipse(width/4,height/5,width/5,height/5);
	  }
}
