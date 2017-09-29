package mvc;

public class MaiorMenorModel {

	public static boolean maiorDeIdade(int idade) {
		return idade >= 18;
	}

	public static String descricaoDaMaioridade(boolean maiorDeIdade) {
		if (maiorDeIdade) {
			return "De maior mano!";
		} else {
			return "De menor mano!";
		}
	}

	public static String descricaoDaMaioridade(int idade) {
		return descricaoDaMaioridade(maiorDeIdade(idade));
	}
}
