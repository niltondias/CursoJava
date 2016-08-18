package curso;

public class Principal {
	public static void main(String[] args) {
		Carro meuCarro = new Carro();
		Carro seuCarro = new Carro();
		Proprietario dono1 = new Proprietario();
		
		meuCarro.ano = 2016;
		meuCarro.marca = "Honda";
		meuCarro.dono = dono1;
		meuCarro.dono.nome = "Jose";
		
		seuCarro.ano = 2011;
		seuCarro.marca = "GM";
		seuCarro.dono = dono1;
		seuCarro.dono.nome = "Maria";
		
		dono1.nome = "Marcela";
		
		System.out.println( meuCarro.dono.nome );
		System.out.println( seuCarro.dono.nome );
		System.out.println( dono1.nome );
	}

}
