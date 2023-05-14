package Model;

public class Morador {

	public Morador() {
		super();
	}
	
	public int numeroApto;
	public String nome;
	public String modeloCarro;
	public String corCarro;
	public String placaCarro;
	
	@Override
	public int hashCode() {
		String converte = Integer.toString(numeroApto);
	    return Integer.parseInt(converte.substring(0, 1));
	}

	@Override
	public String toString() {
		return "Numero do Apartamento: " + numeroApto + "\nNome do Morador: " + nome + "\nModelo do Carro: " + modeloCarro + ", Cor: " + corCarro + ", Placa: " + placaCarro + "\n";
	}
	
}
