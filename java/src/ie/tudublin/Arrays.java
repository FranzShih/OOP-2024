package ie.tudublin;

import processing.core.PApplet;

public class Arrays extends PApplet
{
	String[] months = {"JAN","FEB","MAR","APR","MAY","JUN","JUL","AUG","SEP","OCT","NOV","DEC"};

	float[] rainfall = {200, 260, 300, 250, 100, 50, 10, 40, 67, 160, 400, 420};


	


	public float map1(float a, float b, float c, float d, float e)
	{	
		float range1 = (a - b) / (c - b);

		return range1 * (e - d);
	}
	
	public void settings()
	{
		size(500, 500);
		float wettest = 0;
		int position = 0;


		for(int i = 0; i < rainfall.length; i++)
		{
		
			if(wettest < rainfall[i])
			{
				wettest = rainfall[i];
				position = i;
			}
		}

		float ranged = map1(25,20,30,0,100);

		System.err.println(ranged);

		System.out.println("the Wettest month was " + months[position] + " with rainfall of " + wettest +"mm");
	}

	public void setup() {
		colorMode(HSB);
		background(0);
		
	}

	
	public void draw()
	{	

	}


}
