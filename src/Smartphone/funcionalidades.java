package Smartphone;

public abstract class funcionalidades {
	
	//Reprodutor Musical
	public abstract void tocar();
	
	public abstract void pausar();
	
	public void selecionarMusica() {
		System.out.println("Nothing Else Matters");
	}
	
	//Aparelho Telefonico
	public void ligar() {
		System.out.println("Ligando para: 8661-8953");
	}
	public void atender() {
		System.out.println("Atendendo o numero: 8721-9965");
	}
	public void iniciarCorreioVoz() {
		System.out.println("Iniciando Correio de Voz...");
	}
	
	

}
