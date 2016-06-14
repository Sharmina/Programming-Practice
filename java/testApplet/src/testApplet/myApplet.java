package testApplet;

import processing.core.PApplet;

public class myApplet extends PApplet{
	
	public void setup() {
	    size(200,200);
	    background(0);
	  }

	  public void draw() {
	    stroke(255);
	    if (mousePressed) {
	      line(mouseX,mouseY,pmouseX,pmouseY);
	    }
	  }

}
