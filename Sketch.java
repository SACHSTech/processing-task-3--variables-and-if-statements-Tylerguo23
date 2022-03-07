import processing.core.PApplet;

/**
 * 
 * This program draws a simple house
 * @author: T. Guo
 *
 **/


public class Sketch extends PApplet {

  public void settings() {
    // set screen size
    size(800, 600);
  }

  public void setup() {
    // set background to light blue
    background(102, 217, 255);
  }

  public void draw() {
    // house base
    fill(255,255,204);
    rect(width / 4, height / 2, width / 2, height / 2);
    triangle(width / 4, height / 2, width / 2, height / 3, (float) (width * 0.75), height / 2);
    
    // grass
    fill(51, 204, 51);
    rect(0, (float) (height * (double) 29 / 30), width, height / 30);
    
    // door
    fill(255, 204, 102);
    rect((float) (width * 0.45), (float) (height * 0.75), width / 10, (float) (height * (double) 13 / 60));

    // windows
    fill (51, 204, 255);
    rect((float) (width * 0.3125), (float) (height * (double) 7 / 12), width / 16, height / 12);
    rect((float) (width * 0.625), (float) (height * (double) 7 / 12), width / 16, height / 12);
    
    // yellow (sun and doorknob)
    fill(255, 255, 0);
    ellipse(width / 8, height / 6, width / 8, height / 6);
    ellipse((float) (width * 0.525), (float) (height * (double) 13 / 15), width / 80, height / 60);
    
    // window lines
    line((float) (width * 0.34375), (float) (height * (double) 7 / 12), (float) (width * 0.34375), (float) (height * (double) 2 / 3));
    line((float) (width * 0.3125), (float) (height * 0.625), (float) (width * 0.375), (float) (height * 0.625));
    line((float) (width * 0.65625), (float) (height * (double) 7 / 12), (float) (width * 0.65625), (float) (height * (double) 2 / 3));
    line((float) (width * 0.625), (float) (height * 0.625), (float) (width * 0.6875), (float) (height * 0.625));

    // flower stems
    stroke(51, 153, 51);
    strokeWeight(width / 200);
    line((float) (width * 0.3125), (float) (height * (double) 29 / 30), (float) (width * 0.3125), (float) (height * (double) 13 / 15));
    line((float) (width * 0.40625), (float) (height * (double) 29 / 30), (float) (width * 0.40625), (float) (height * (double) 13 / 15));
    line((float) (width * 0.59375), (float) (height * (double) 29 / 30), (float) (width * 0.59375), (float) (height * (double) 13 / 15));
    line((float) (width * 0.6875), (float) (height * (double) 29 / 30), (float) (width * 0.6875), (float) (height * (double) 13 / 15));
    
     // flowers
    stroke(0);
    strokeWeight(0);

    fill(255, 153, 0);
    ellipse((float) (width * 0.3125), (float) (height * (double) 13 / 15), width / 16, height / 30);
    ellipse((float) (width * 0.3125), (float) (height * (double) 13 / 15), width / 40, height / 12);
    
    ellipse((float) (width * 0.6875), (float) (height * (double) 13 / 15), width / 16, height / 30);
    ellipse((float) (width * 0.6875), (float) (height * (double) 13 / 15), width / 40, height / 12);

    fill(255, 102, 255);
    ellipse((float) (width * 0.40625), (float) (height * (double) 13 / 15), width / 16, height / 30);
    ellipse((float) (width * 0.40625), (float) (height * (double) 13 / 15), width / 40, height / 12);

    ellipse((float) (width * 0.59375), (float) (height * (double) 13 / 15), width / 16, height / 30);
    ellipse((float) (width * 0.59375), (float) (height * (double) 13 / 15), width / 40, height / 12);


    // flower centers
    strokeWeight(1);
    fill(255, 255, 0);
    ellipse((float) (width * 0.3125), (float) (height * (double) 13 / 15), width / 40, height / 30);
    ellipse((float) (width * 0.40625), (float) (height * (double) 13 / 15), width / 40, height / 30);
    ellipse((float) (width * 0.59375), (float) (height * (double) 13 / 15), width / 40, height / 30);
    ellipse((float) (width * 0.6875), (float) (height * (double) 13 / 15), width / 40, height / 30);
  
  }
  
}