import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import org.junit.After;
class testPizz {
	
	// Check Esvaziar
	@After
	void Vazia()
	{
		pizza.deletaIngredientes();
	}
	
	// Check Reg Ingredientes
	@Test
	void RegIng()
	{
		
		pizza p2 = new pizza();
		p2.adicionaIngredientes("Calabresa");
		p2.adicionaIngredientes("Queijo");
		ArrayList <String> Lista = new ArrayList<String>(pizza.getIngredientRet());
		assertEquals("Queijo", Lista.get(0));
		assertEquals("Calabresa", Lista.get(1));
		
	}
	
	@Test
	void Valor() {
		
		
		pizza p1 = new pizza();
		p1.adicionaIngredientes("Calabresa");
		p1.adicionaIngredientes("Queijo");
		p1.adicionaIngredientes("Calabresa");
		p1.adicionaIngredientes("Queijo");
		CarrinhoDeCompras c1= new CarrinhoDeCompras();
		c1.adicionaPizza(p1);
		assertEquals(20, c1.getTotal());
		
	}



	
	
}

