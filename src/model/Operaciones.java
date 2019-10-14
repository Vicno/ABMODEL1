package model;

public class Operaciones {

	private double num1 = 0;
	private double num2 = 0;
	
	public Operaciones() {
		
	}
	
	public double multiplicacion(double num1, double num2)
	{
		double resultado;
		 resultado = num1 * num2;
		return resultado;
		
	}
	
	public double suma(double num1, double num2)
	{
		return num1+num2;
	}
	
	public double resta(double num1, double num2)
	{
		return num1-num2;
	}
	
	public double division(double num1, double num2)
	{
		return num1/num2;
	}

}
