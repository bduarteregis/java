
public class TestaCondicional {
	
	public static void main(String[] args) {
		
		System.out.println("Testando condicionais");
		int idade = 24;
		int quantidadePessoas = 3;
		if (idade >= 18) {
			System.out.println("Você tem mais de 18 anos");
			System.out.println("seja bem vindo, cabeção!");
		} else {
			if (quantidadePessoas >= 2) {
				System.out.println("Você não tem 18 anos, mas pode entrar!");
			} else {
			System.out.println("Infelizmente você não pode entrar. =/");
			
		}
		}
	}

}
