
public class Passeio {
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa ();
		p1.nome = "José";
		
		/* O código a baixo pode ser escrito da seguinte maneira
		 	Cachorro cachorro = new Cachorro();
		 	p1.cachorro = chachorro;
		 */
		p1.cachorro = new Cachorro();
		
		p1.cachorro.nome = "Pandora";
		p1.cachorro.idade = 3;
		p1.cachorro.raca = "Boxer";
		p1.cachorro.sexo = 'M';
		
		Caminhada c = new Caminhada();
		c.andar(p1);
	}

}
