import processing.core.PApplet;

/**
 * 
 * This program draws a house in a random position during a random time of day.
 * The time then changes to match the current time.
 * @author: T. Guo
 *
 **/


public class Sketch extends PApplet {

  public void settings() {
    // set screen size
    size(800, 600);
  }

  public void setup() {
    // set default background to light blue
    background(102, 217, 255);
  }


  // Get current time
  int intHour = hour();
  int intMinute = minute();

  // Convert current time to an integer between 0 and 360
  int intTime = (intHour * 60 + intMinute) / 4 ;

  // Convert current time to a String
  String StrTime = intHour + ":" + intMinute;


  // Generate a float between 0 and 360 and set isNight to false by default
  float floatPos = random(0, 360);
  boolean isNight = false;

  // Declare an integer for the number of day/night cycles
  int intCycles = 0;

  // Declare a boolean for whether the time should be displayed (set to false by default)
  boolean isDisplayTime = false;

  // Generate an integer between -100 and 100 to shift the whole drawing horizontally;
  int intOffset = (int) (random(-100, 100));



  public void draw() {

    // Check if the sun/moon's current floatPosition (from 0 to 360) is equal to what it should be at the current time and at least one cycle has passed
    if (!( floatPos == intTime || ((floatPos + 180) == intTime && isNight)) || intCycles < 1) {
      // Rotate the sun/moon 1 degree counterclockwise if not
      floatPos++;
      // Check if the sun/moon would go below the horizon, in which case change the day/night and set the sun/moon to the opfloatPosite side (also increase Cycle count)
      if (floatPos < 90 || floatPos > 270) {
        floatPos = 90;
        intCycles++;
        isNight = !isNight;
      }
    }

    // If the sun/moon is at the right place, display the time
    else {
      isDisplayTime = true;
    }
    
    // Change the color of the sky and the sun/moon according to whether it is day or night
    if (!isNight) {
      background(102, 217, 255);
      fill(255, 255, 0);
    }
    else {
      background(50);
      fill(100);
    }
    
    // Draw the sun/moon in the sky using trig
    float angle = floatPos + 90;
    float x = width / 2 - cos(radians(angle)) * width / 2;
    float y = height / 2 + sin(radians(angle)) * height / 2;
    ellipse(x, y, width / 8, height / 6);

    // house base
    fill(255,255,204);
    rect(width / 4 + intOffset, height / 2, width / 2, height / 2);
    triangle(width / 4 + intOffset, height / 2, width / 2 + intOffset, height / 3, (float) (width * 0.75) + intOffset, height / 2);
    
    // grass
    fill(51, 204, 51);
    rect(0, (float) (height * (double) 29 / 30), width, height / 30);
    
    // door
    fill(255, 204, 102);
    rect((float) (width * 0.45) + intOffset, (float) (height * 0.75), width / 10, (float) (height * (double) 13 / 60));

    // windows
    fill (51, 204, 255);
    rect((float) (width * 0.3125) + intOffset, (float) (height * (double) 7 / 12), width / 16, height / 12);
    rect((float) (width * 0.625) + intOffset, (float) (height * (double) 7 / 12), width / 16, height / 12);


    // yellow (sun and doorknob)
    fill(255, 255, 0);
    ellipse((float) (width * 0.525) + intOffset, (float) (height * (double) 13 / 15), width / 80, height / 60);
    
    // window lines
    line((float) (width * 0.34375) + intOffset, (float) (height * (double) 7 / 12), (float) (width * 0.34375) + intOffset, (float) (height * (double) 2 / 3));
    line((float) (width * 0.3125) + intOffset, (float) (height * 0.625), (float) (width * 0.375) + intOffset, (float) (height * 0.625));
    line((float) (width * 0.65625) + intOffset, (float) (height * (double) 7 / 12), (float) (width * 0.65625) + intOffset, (float) (height * (double) 2 / 3));
    line((float) (width * 0.625) + intOffset, (float) (height * 0.625), (float) (width * 0.6875) + intOffset, (float) (height * 0.625));

    // flower stems
    stroke(51, 153, 51);
    strokeWeight(width / 200);
    line((float) (width * 0.3125) + intOffset, (float) (height * (double) 29 / 30), (float) (width * 0.3125) + intOffset, (float) (height * (double) 13 / 15));
    line((float) (width * 0.40625) + intOffset, (float) (height * (double) 29 / 30), (float) (width * 0.40625) + intOffset, (float) (height * (double) 13 / 15));
    line((float) (width * 0.59375) + intOffset, (float) (height * (double) 29 / 30), (float) (width * 0.59375) + intOffset, (float) (height * (double) 13 / 15));
    line((float) (width * 0.6875) + intOffset, (float) (height * (double) 29 / 30), (float) (width * 0.6875) + intOffset, (float) (height * (double) 13 / 15));
    
     // flowers
    stroke(0);
    strokeWeight(0);

    fill(255, 153, 0);
    ellipse((float) (width * 0.3125) + intOffset, (float) (height * (double) 13 / 15), width / 16, height / 30);
    ellipse((float) (width * 0.3125) + intOffset, (float) (height * (double) 13 / 15), width / 40, height / 12);
    
    ellipse((float) (width * 0.6875) + intOffset, (float) (height * (double) 13 / 15), width / 16, height / 30);
    ellipse((float) (width * 0.6875) + intOffset, (float) (height * (double) 13 / 15), width / 40, height / 12);

    fill(255, 102, 255);
    ellipse((float) (width * 0.40625) + intOffset, (float) (height * (double) 13 / 15), width / 16, height / 30);
    ellipse((float) (width * 0.40625) + intOffset, (float) (height * (double) 13 / 15), width / 40, height / 12);

    ellipse((float) (width * 0.59375) + intOffset, (float) (height * (double) 13 / 15), width / 16, height / 30);
    ellipse((float) (width * 0.59375) + intOffset, (float) (height * (double) 13 / 15), width / 40, height / 12);


    // flower centers
    strokeWeight(1);
    fill(255, 255, 0);
    ellipse((float) (width * 0.3125) + intOffset, (float) (height * (double) 13 / 15), width / 40, height / 30);
    ellipse((float) (width * 0.40625) + intOffset, (float) (height * (double) 13 / 15), width / 40, height / 30);
    ellipse((float) (width * 0.59375) + intOffset, (float) (height * (double) 13 / 15), width / 40, height / 30);
    ellipse((float) (width * 0.6875) + intOffset, (float) (height * (double) 13 / 15), width / 40, height / 30);
  
    // Time Display
    if (isDisplayTime) {
      fill(255);
      textSize(20);
      text(StrTime, width / 80, height / 20);
    }
  }
  
}