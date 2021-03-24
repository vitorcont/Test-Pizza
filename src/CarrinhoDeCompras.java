
import java.util.ArrayList;
public class CarrinhoDeCompras {
	ArrayList <pizza> Carrinho = new ArrayList<pizza>();
	int preco=0;
	
	public void adicionaPizza(pizza nova)
	{
		if (pizza.listaIngredientes.isEmpty())
		{
			System.out.println("Sem Ingredientes");
		}
 		else
 			Carrinho.add(nova);
	}
	
	public int getTotal()
	{
		for(int i=0;i<Carrinho.size();i++)
		{
			preco+=Carrinho.get(i).getPreco();
		}
		return preco;
	}
	
	public void getCarrinho()
	{
		System.out.println("Num Total de Pizzas: "+Carrinho.size());
		System.out.println("Valor: "+getTotal());
		pizza.getIngredientes();
	}
}

