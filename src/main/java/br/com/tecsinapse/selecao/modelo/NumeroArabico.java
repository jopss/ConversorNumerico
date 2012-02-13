package br.com.tecsinapse.selecao.modelo;


/**
 * Classe responsavel pela regra dos numeros arabicos e conversao para romanos.
 * @author jopss
 */
public class NumeroArabico implements Numero{

	private Integer numero;
	private final static String[] listaRomanos = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
	private final static Integer[] listaArabicos = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
  
	public NumeroArabico(Integer numero) {
		this.numero = numero;
	}
	
	public String retornarNumeroRomano(Integer arabico) {
		if(arabico != null && arabico > 0){
			String romano = "";
			
			//faz o retorno por posicao, por isso, nao utiliza for each.
			for (int x = 0; x < listaArabicos.length; x++) {
				Integer num = listaArabicos[x];
				
	            while (arabico >= num) {
	               romano += listaRomanos[x];
	               arabico -= num;
	            }
	         }
			
			return romano;
		}
         
        return null;
   }
		
	/**
	 * Efetua a conversao de arabicos para romanos.
	 * 
	 * @return String com o romano correspondente.
	 * @throws NumberFormatException caso o numero arabico nao for valido.
	 */
	@SuppressWarnings("unchecked")
	public <E>E converter() {
		return (E) this.retornarNumeroRomano(numero);
	}
}
