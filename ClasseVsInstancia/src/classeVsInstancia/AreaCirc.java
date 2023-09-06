package classeVsInstancia;

public class AreaCirc {
	double raio;
	static double pi;
	//se colocar o "final" e o valor de PI sera impossivel alterar mesmo a instanciando
	//exemplo:
	//final static double PI = 3.14
	
	AreaCirc(double raioInicial) {
		pi = 3.14;
		raio = raioInicial;
		
	}
	
	double area() {
		return pi * Math.pow(raio, 2);
	}
	

}
