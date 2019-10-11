package model;

public class Operaciones {

	private double num1 = 0;
	private double num2 = 0;
	
	public Operaciones(double num1, double num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public double multiplicacion(double num1, double num2)
	{
		double resultado;
		 resultado = num1 * num2;
		return resultado;
		
	}

}
