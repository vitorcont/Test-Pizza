import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CarTest {

	@Test
	void test() {
		
		pizza p1 = new pizza();
		p1.adicionaIngredientes("Calabresa");
		p1.adicionaIngredientes("Queijo");

		
		pizza p2 = new pizza();
		p2.adicionaIngredientes("Calabresa");
		p2.adicionaIngredientes("Queijo");
		p2.adicionaIngredientes("Calabresa");
		p2.adicionaIngredientes("Calabresa");
		
		CarrinhoDeCompras c1= new CarrinhoDeCompras();
		c1.adicionaPizza(p1);
		c1.adicionaPizza(p2);
		assertEquals(35, c1.getTotal());
		
		pizza.deletaIngredientes();
	}
	
	@Test
	void test2() {
			
			pizza p1 = new pizza();
			
			CarrinhoDeCompras c1= new CarrinhoDeCompras();
			c1.adicionaPizza(p1);
		}

}
