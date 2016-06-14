package module3;

import processing.core.*;
import de.fhpotsdam.unfolding.geo.Location;
import de.fhpotsdam.unfolding.marker.SimplePointMarker;
 
public class EarthquakeMarker extends SimplePointMarker {
 
  private float radius=(float) 10.0;	
  private int color=0;
  public EarthquakeMarker(Location location,float radius, int color) {
    super(location);
    this.radius=radius;
    this.color=color;
  }
 
  public void draw(PGraphics pg, float x, float y) {
    pg.pushStyle();
    pg.noStroke();
    pg.fill(color);
    pg.ellipse(x, y, radius,radius);
    pg.popStyle();
  }
}