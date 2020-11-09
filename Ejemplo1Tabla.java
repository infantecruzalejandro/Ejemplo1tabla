package es.Studium.Ejemplo1Tabla;

public class Ejemplo1Tabla
{
	public static void main(String[] args)
	{
		final int TAM=10;
		int i;
		int tabla[] = new int[TAM];
		for (i=0;i<TAM;i++)
		{
			tabla[i]=i;
		}
		for (i=0;i<TAM;i++)
		{
			System.out.println(tabla[i]=i);
		}
	}

}
