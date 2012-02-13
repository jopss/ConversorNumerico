package br.com.tecsinapse.selecao.modelo;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Classe responsavel pela regra dos numeros romanos e conversao para arabico.
 * @author jopss
 */
public class NumeroRomano implements Numero{

	private Map<String, Integer> mapaRomanosArabicos;
	private String numero;
	
	public NumeroRomano(String numero) {
		this.numero = numero;

		mapaRomanosArabicos = new HashMap<String, Integer>();
		mapaRomanosArabicos.put("I", 1);
		mapaRomanosArabicos.put("II", 2);
		mapaRomanosArabicos.put("III", 3);
		mapaRomanosArabicos.put("IV", 4);
		mapaRomanosArabicos.put("V", 5);
		mapaRomanosArabicos.put("VI", 6);
		mapaRomanosArabicos.put("VII", 7);
		mapaRomanosArabicos.put("VIII", 8);
		mapaRomanosArabicos.put("IX", 9);
		mapaRomanosArabicos.put("X", 10);
		mapaRomanosArabicos.put("L", 50);
		mapaRomanosArabicos.put("C", 100);
		mapaRomanosArabicos.put("D", 500);
		mapaRomanosArabicos.put("M", 1000);
	}
	
	private Integer retornarNumeroArabico(String romano) {
		if(romano != null && !romano.isEmpty()){
			romano = romano.toUpperCase();
			Integer arabico = mapaRomanosArabicos.get(romano);

			//se nao achou direto no mapa, eh porque temos combinacoes.
			if(arabico == null){
				arabico = 0;
				
				validarNumerosRomanos(romano);
				int i = 0;
				
				//quebra cada caractere para retornar o arabico correspondente, efetuando as operacoes de soma e subtracao.
				while (i < romano.length()) {
			          
		             String romanoAtual = new Character(romano.charAt(i)).toString(); 
		             
		             if(mapaRomanosArabicos.containsKey(romanoAtual)){
			             int numeroAtual = mapaRomanosArabicos.get(romanoAtual); 
			             
			             i++;  //mova para a proximo posicao, para efetuar a validacao dos operadores
			             
			             if (i == romano.length()) {
			                 // Na ultima posicao, basta adicionar o numero correspondente a letra romana
			            	 arabico += numeroAtual;
			             }
			             else {
			            	 // Próxima letra na seqüência dos romanos. 
			            	 // Se ele for maior do que o número atual, então as duas letras são contadas em conjunto.
			            	 String romanoProximo = new Character(romano.charAt(i)).toString(); 
			            	 
			                int numeroProximo = mapaRomanosArabicos.get(romanoProximo);
			                if (numeroProximo > numeroAtual) {
			                	arabico += (numeroProximo - numeroAtual);
			                	i++; //passa para a próxima posição na string.
			                }
			                else {
			                	arabico += numeroAtual;
			                }
			             }
		             }else {
						throw new NumberFormatException("Os numeros romanos inseridos nao sao validos.");
		             }
		             
		          }   
			}
			
			return arabico;
		}
		return null;
	}
	
	/**
	 * Tirando V, L e D, os demais somente podem se repetir 3 vezes (I, X, C, M).
	 * 
	 * @param romano String com os numeros romanos.
	 * @return boolean onde true significa que esta valido.
	 */  
	private void validarNumerosRomanos(String romano){
		Pattern pattern = Pattern.compile("^M{0,4}(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})$");
		Matcher matcher = pattern.matcher(romano);
		boolean regexValido = matcher.matches();
		
		if(!regexValido){
			throw new NumberFormatException("Os numeros romanos inseridos nao sao validos.");
		}
	}
	
	/**
	 * Efetua a conversao de romanos para arabicos.
	 * 
	 * @return Integer com o arabico correspondente.
	 * @throws NumberFormatException caso o numero romano nao for valido.
	 */
	@SuppressWarnings("unchecked")
	public <E>E converter() {
		return (E) this.retornarNumeroArabico(numero);
	}
	
}
