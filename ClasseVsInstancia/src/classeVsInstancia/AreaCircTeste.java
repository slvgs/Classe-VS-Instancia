package classeVsInstancia;

public class AreaCircTeste {
	
	public static void main(String[] args) {
		
		
		AreaCirc a = new AreaCirc(10);
		//a.pi = 10;
		System.out.println(a.area());
		
		AreaCirc b = new AreaCirc(5);
		//b.pi = 5;
		//os valores mudaram pois foi aplicado um novo valor ao PI quando o acessei por notação de ponto, pois ele mudou para static se tornando um atributo da classe. 
		System.out.println(b.area());
		
		AreaCirc.pi = 3.1415;
		//Quando mudei o atributo PI para static na class AreaCirc ele pode ser acessado
		// por ., assim se tornando um atributo da classe AreaCirc e podendo ser mudado na instancia
		// **percebe-se que pi esta em italico, assim como o "out" da classe System, isso significa
		// que é um atributo dentro da classe e que pode ser modificado quando chamado na instancia***
	}

}
