package Smartphone;

public class aparelhoTelefonico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Smartcell cell = new Smartcell();
		
		System.out.println("Ligando Telefone");
		System.out.println();
		System.out.println("Abrindo o App de Musica");
		cell.selecionarMusica();
		cell.tocar();
		cell.pausar();
		
		

	}

}
