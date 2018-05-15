package util;

public class OrganizadorSala {

	public String organizarSala(String v1, double v2) {

		char sigl = v1.charAt(0);	//Pegando a primeira letra da palavra e transformando em Char
		String sigla = String.valueOf(sigl);     //Transformando a variavel sigl de Char para String

		if (v2 == 1) {
			return "Sala 22";

		} else if (v2 == 2) {

			return "Sala 21";
		} else if (v2 == 3) {

			if (sigla.equalsIgnoreCase("a") || sigla.equalsIgnoreCase("b") || sigla.equalsIgnoreCase("c")
					|| sigla.equalsIgnoreCase("d") || sigla.equalsIgnoreCase("e") || sigla.equalsIgnoreCase("f")
					|| sigla.equalsIgnoreCase("g") || sigla.equalsIgnoreCase("h") || sigla.equalsIgnoreCase("i")
					|| sigla.equalsIgnoreCase("j") || sigla.equalsIgnoreCase("k")) {

				return "Sala 11";

			} else if (sigla.equalsIgnoreCase("l") || sigla.equalsIgnoreCase("m") || sigla.equalsIgnoreCase("n")) {

				return "Sala 12";

			} else if (sigla.equalsIgnoreCase("o") || sigla.equalsIgnoreCase("p") || sigla.equalsIgnoreCase("q")
					|| sigla.equalsIgnoreCase("r") || sigla.equalsIgnoreCase("s") || sigla.equalsIgnoreCase("t")
					|| sigla.equalsIgnoreCase("u") || sigla.equalsIgnoreCase("v") || sigla.equalsIgnoreCase("w")
					|| sigla.equalsIgnoreCase("x") || sigla.equalsIgnoreCase("y") || sigla.equalsIgnoreCase("z")) {

				return "Sala 13";
			}
			else {
				return "Batata";
		} 
		} else {
			return "Batata";
		}

	}
}
