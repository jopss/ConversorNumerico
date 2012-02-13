package br.com.tecsinapse.selecao;

import java.util.Scanner;

import br.com.tecsinapse.selecao.modelo.Numero;
import br.com.tecsinapse.selecao.modelo.NumeroArabico;
import br.com.tecsinapse.selecao.modelo.NumeroRomano;

public class Main {

	public static void main(String[] args) {

		System.out.println("----------------------------------------------------------------------");
		System.out.println(" FANTÁSTICO SISTEMA CONVERSOR DE NUMERICO PARA ARABICOS E VICE-VERSA!");
		System.out.println("----------------------------------------------------------------------");
		System.out.println(" ENTRE COM O TIPO:\n1 - ARABICO PARA ROMANOS\n2 - ROMANOS PARA ARABICOS");
		System.out.println(" ESCOLHA: ");
		String tipo = (new Scanner(System.in)).next();
		if(tipo != null && !tipo.isEmpty()){
			
			Integer tipoConversao = 0;
			
			try{
				tipoConversao = new Integer(tipo);
				if(tipoConversao != 1 && tipoConversao != 2){
					encerrar(" >>>> RÁ! TIPO ERRADO! ENCERRANDO...");
				}
			}catch(NumberFormatException ex){
				encerrar(" >>>> RÁ! SOMENTE ACEITAMOS NUMEROS! ENCERRANDO...");
			}
			
			Numero conversor = null;
			System.out.println(" QUAL NUMERO VOCE QUER CONVERTER? HEIN? ");
			
			if(tipoConversao == 1){
				String numeroArabico = (new Scanner(System.in)).next();
				
				try{
					Integer valor = new Integer(numeroArabico);
					conversor = new NumeroArabico(valor);
				}catch(NumberFormatException ex){
					encerrar(" >>>> RÁ! SOMENTE ACEITAMOS NUMEROS! ENCERRANDO...");
				}
				
			}else if(tipoConversao == 2){
				String numeroRomano = (new Scanner(System.in)).next();
				conversor = new NumeroRomano(numeroRomano);
			}
			
			System.out.println("RESULTADO: "+conversor.converter());
			System.out.println(" >>>> FINISH!!");
			
		}else{
			encerrar(" >>>> RÁ! VAZIO! ENCERRANDO...");
		}
		
	}
	
	private static void encerrar(String mensagem){
		System.out.println(" >>>> "+mensagem);
		System.exit(0);
	}

}
