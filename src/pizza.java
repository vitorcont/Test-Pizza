import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;

public class pizza {
	int numIngredientes=0;
	static Map <String,Integer> listaIngredientes = new HashMap<String,Integer>();
	static ArrayList <String> Lista = new ArrayList<String>();
	
	public pizza()
	{
		
	}
	
	public void adicionaIngredientes(String novo)
	{
		if (listaIngredientes.containsKey(novo))
		{
			int num = listaIngredientes.get(novo);
			listaIngredientes.put(novo,num+1);
		}
		else
		{
			listaIngredientes.put(novo, 1);
		}
		this.contabilizaIngrediente();
	}
	
	public int getPreco()
	{
		if(numIngredientes<3)
			return 15;
		else if(numIngredientes<6)
			return 20;
		else
			return 23;
	}
	public void contabilizaIngrediente()
	{
		numIngredientes=numIngredientes+1;;
	}
	
	public static void getIngredientes()
	{
		for (Map.Entry<String, Integer> saida : listaIngredientes.entrySet()) 
		{ 
			System.out.printf("\n%dX ",saida.getValue());
			System.out.printf(saida.getKey()); 
		}
	}
	// Métodos para o teste JUnit
	public static ArrayList<String> getIngredientRet()
	{
		for (Map.Entry<String, Integer> saida : listaIngredientes.entrySet()) 
		{ 
			Lista.add(saida.getKey());
		}
		return Lista;
	}
	
	
	public static void deletaIngredientes()
	{
		listaIngredientes.clear();
	}
}

// Pizza
// Ingredientes
// Preço

//adicionaIngredientes(Str)
//getPreço
//getIngredientes
