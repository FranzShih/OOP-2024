package ie.tudublin;

public class Cat
{
    private int numLives = 9;
    String name;

    public void setName(String name)
	{
		this.name = name;
	}

    public Cat()
    {
        this.name = "Random Cat";
        this.numLives = 9;
    }

    public Cat(String name)
	{
		this.name = name;
        this.numLives = 9;
	}

    public void kill()
    {   
        this.numLives = this.numLives -1;

        if(this.numLives > 0)
        {
            System.out.println("Ouch!");
        }
        else
        {
            System.out.println("Dead");
        }
       
    }
}   