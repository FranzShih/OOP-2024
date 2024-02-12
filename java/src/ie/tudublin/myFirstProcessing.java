package ie.tudublin;

import processing.core.PApplet;

public class myFirstProcessing extends PApplet
{

	public void settings()
	{
		size(500, 500);
	}

	public void setup() {

	}
    float x1,y1,x2,y2;
    float x1dir,x2dir,y1dir,y2dir;
    float c = 0;

    public void draw()
    {   
        background(255,0,0);
        fill(90);
        circle(250,190,70);
        fill(0);
        ellipse(250,100,90,100);
        

    }
}


