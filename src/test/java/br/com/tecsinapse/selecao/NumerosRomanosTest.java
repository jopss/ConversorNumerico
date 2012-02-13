package br.com.tecsinapse.selecao;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNull;

import org.junit.Test;

import br.com.tecsinapse.selecao.modelo.NumeroRomano;

public class NumerosRomanosTest {

	@Test
	public void testaValidacaoDeConversaoParaRomanosComNulidade(){
		NumeroRomano num = new NumeroRomano(null);
		assertNull(num.converter());
	}

	@Test
	public void testaConversaoParaRomanosComNumeralUm(){
		NumeroRomano num = new NumeroRomano("I");
		assertEquals(1,((Integer)num.converter()).intValue());
	}
	
	@Test
	public void testaConversaoParaRomanosComNumeralTres(){
		NumeroRomano num = new NumeroRomano("III");
		assertEquals(3,((Integer)num.converter()).intValue());
	}
	
	@Test
	public void testaConversaoParaRomanosComNumeralCinco(){
		NumeroRomano num = new NumeroRomano("V");
		assertEquals(5,((Integer)num.converter()).intValue());
	}
	
	@Test
	public void testaConversaoParaRomanosComNumeralOito(){
		NumeroRomano num = new NumeroRomano("VIII");
		assertEquals(8,((Integer)num.converter()).intValue());
	}
	
	@Test
	public void testaConversaoParaRomanosComNumeralNove(){
		NumeroRomano num = new NumeroRomano("IX");
		assertEquals(9,((Integer)num.converter()).intValue());
	}
	
	@Test
	public void testaConversaoParaRomanosComNumeralDoze(){
		NumeroRomano num = new NumeroRomano("XII");
		assertEquals(12,((Integer)num.converter()).intValue());
	}
	
	@Test
	public void testaConversaoParaRomanosComNumeralDezenove(){
		NumeroRomano num = new NumeroRomano("XIX");
		assertEquals(19,((Integer)num.converter()).intValue());
	}
	
	@Test
	public void testaConversaoParaRomanosComNumeralTrinta(){
		NumeroRomano num = new NumeroRomano("XXX");
		assertEquals(30,((Integer)num.converter()).intValue());
	}
	
	@Test
	public void testaConversaoParaRomanosComNumeralQuarentaECinco(){
		NumeroRomano num = new NumeroRomano("XLV");
		assertEquals(45,((Integer)num.converter()).intValue());
	}
	
	@Test
	public void testaConversaoParaRomanosComNumeralCentoENoventaENove(){
		NumeroRomano num = new NumeroRomano("CXCIX");
		assertEquals(199,((Integer)num.converter()).intValue());
	}
	
	@Test
	public void testaConversaoParaRomanosComNumeralOitocentos(){
		NumeroRomano num = new NumeroRomano("DCCC");
		assertEquals(800,((Integer)num.converter()).intValue());
	}
	
	@Test
	public void testaConversaoParaRomanosComNumeralMilEUm(){
		NumeroRomano num = new NumeroRomano("MI");
		assertEquals(1001,((Integer)num.converter()).intValue());
	}
	
	@Test
	public void testaConversaoParaRomanosComNumeralTrezentosENoventaESete(){
		NumeroRomano num = new NumeroRomano("CCCXCVII");
		assertEquals(397,((Integer)num.converter()).intValue());
	}
	
	@Test
	public void testaConversaoParaRomanosComNumeralNovecentosEOitentaENove(){
		NumeroRomano num = new NumeroRomano("CMLXXXIX");
		assertEquals(989,((Integer)num.converter()).intValue());
	}
			
	@Test
	public void testaConversaoParaRomanosComNumeralMilEQuarentaEQuatro(){
		NumeroRomano num = new NumeroRomano("MXLIV");
		assertEquals(1044,((Integer)num.converter()).intValue());
	}
	
	@Test
	public void testaConversaoParaRomanosComNumeralMilECinquentaETres(){
		NumeroRomano num = new NumeroRomano("MCLIII");
		assertEquals(1153,((Integer)num.converter()).intValue());
	}
	
	@Test(expected=NumberFormatException.class)
	public void testaValidacaoNumerosRomanosErradosComLetras(){
		NumeroRomano num = new NumeroRomano("AVI");
		num.converter();
	}
	
	@Test(expected=NumberFormatException.class)
	public void testaValidacaoNumerosRomanosErradosComDigitos(){
		NumeroRomano num = new NumeroRomano("123");
		num.converter();
	}
	
	@Test(expected=NumberFormatException.class)
	public void testaValidacaoNumerosRomanosRepeticaoI(){
		NumeroRomano num = new NumeroRomano("IIII");
		num.converter();
	}
	
	@Test(expected=NumberFormatException.class)
	public void testaValidacaoNumerosRomanosRepeticaoX(){
		NumeroRomano num = new NumeroRomano("XXXXXXXXXXXXXXXXX");
		num.converter();
	}
	
	@Test(expected=NumberFormatException.class)
	public void testaValidacaoNumerosRomanosRepeticaoC(){
		NumeroRomano num = new NumeroRomano("CCCCCC");
		num.converter();
	}
	
	@Test(expected=NumberFormatException.class)
	public void testaValidacaoNumerosRomanosRepeticaoM(){
		NumeroRomano num = new NumeroRomano("MMMMMMMM");
		num.converter();
	}
}
