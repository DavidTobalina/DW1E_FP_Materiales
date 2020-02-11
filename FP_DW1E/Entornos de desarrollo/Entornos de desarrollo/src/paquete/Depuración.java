package paquete;

public class Depuración 
{
	
	public static void mayorMenor()
	{
		int a = 13;
		a=18;
		a = 8;
		int b = 10;
		boolean ejemplo =a > b;

		if (ejemplo)
		{
			System.out.println("El primero es mayor "+a);
		}
		else
		{
			System.out.println("El segundo es mayor "+b);
		}
	}
	
public static void main(String[] args)
	{
	System.out.println("Esta clase promete :)");
	mayorMenor();
	}
}