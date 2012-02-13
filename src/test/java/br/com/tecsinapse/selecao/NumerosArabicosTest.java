package br.com.tecsinapse.selecao;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNull;

import org.junit.Test;

import br.com.tecsinapse.selecao.modelo.NumeroArabico;

public class NumerosArabicosTest {

	@Test
	public void testaValidacaoDeConversaoParaArabicosComNulidade(){
		NumeroArabico num = new NumeroArabico(null);
		assertNull(num.converter());
	}

	@Test
	public void testaConversaoParaRomanosComNumeralUm(){
		NumeroArabico num = new NumeroArabico(1);
		assertEquals("I",num.converter());
	}
	
	@Test
	public void testaConversaoParaRomanosComNumeralTres(){
		NumeroArabico num = new NumeroArabico(3);
		assertEquals("III",num.converter());
	}
	
	@Test
	public void testaConversaoParaRomanosComNumeralCinco(){
		NumeroArabico num = new NumeroArabico(5);
		assertEquals("V",num.converter());
	}
	
	@Test
	public void testaConversaoParaRomanosComNumeralOito(){
		NumeroArabico num = new NumeroArabico(8);
		assertEquals("VIII",num.converter());
	}
	
	@Test
	public void testaConversaoParaRomanosComNumeralNove(){
		NumeroArabico num = new NumeroArabico(9);
		assertEquals("IX",num.converter());
	}
	
	@Test
	public void testaConversaoParaRomanosComNumeralDoze(){
		NumeroArabico num = new NumeroArabico(12);
		assertEquals("XII",num.converter());
	}
	
	@Test
	public void testaConversaoParaRomanosComNumeralDezenove(){
		NumeroArabico num = new NumeroArabico(19);
		assertEquals("XIX",num.converter());
	}
	
	@Test
	public void testaConversaoParaRomanosComNumeralTrinta(){
		NumeroArabico num = new NumeroArabico(30);
		assertEquals("XXX",num.converter());
	}
	
	@Test
	public void testaConversaoParaRomanosComNumeralQuarentaECinco(){
		NumeroArabico num = new NumeroArabico(45);
		assertEquals("XLV",num.converter());
	}
	
	@Test
	public void testaConversaoParaRomanosComNumeralCentoENoventaENove(){
		NumeroArabico num = new NumeroArabico(199);
		assertEquals("CXCIX",num.converter());
	}
	
	@Test
	public void testaConversaoParaRomanosComNumeralOitocentos(){
		NumeroArabico num = new NumeroArabico(800);
		assertEquals("DCCC",num.converter());
	}
	
	@Test
	public void testaConversaoParaRomanosComNumeralMilEUm(){
		NumeroArabico num = new NumeroArabico(1001);
		assertEquals("MI",num.converter());
	}
	
	@Test
	public void testaConversaoParaRomanosComNumeralTrezentosENoventaESete(){
		NumeroArabico num = new NumeroArabico(397);
		assertEquals("CCCXCVII",num.converter());
	}
	
	@Test
	public void testaConversaoParaRomanosComNumeralNovecentosEOitentaENove(){
		NumeroArabico num = new NumeroArabico(989);
		assertEquals("CMLXXXIX",num.converter());
	}
			
	@Test
	public void testaConversaoParaRomanosComNumeralMilEQuarentaEQuatro(){
		NumeroArabico num = new NumeroArabico(1044);
		assertEquals("MXLIV",num.converter());
	}
	
	@Test
	public void testaConversaoParaRomanosComNumeralMilECinquentaETres(){
		NumeroArabico num = new NumeroArabico(1153);
		assertEquals("MCLIII",num.converter());
	}
	
}
