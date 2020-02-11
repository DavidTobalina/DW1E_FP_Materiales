package paquete;

public class TablaMultiplicar 
{
	
	public static void ejTablaMultiplicar()
	{
		int n = 13;
		int contador = 0;
		int resultado = 0;
		
		while(contador <= 10)
		{
			resultado = n*contador;
			System.out.println(resultado);
			contador++;
		}
	}

	public static void main(String[] args) 
	{
		ejTablaMultiplicar();

	}

}
