public class Menu {
    private String[] pizzas = {"Olives Pizza", "Mushrooms Pizza", "Peperonis Pizza", "Garlic Bread"};
    private String[] drinks = {"Cola", "Fanta", "Water", "Fuztea", "Arizona"};

    public String[] pizzas(){
        return pizzas;
    }
    public int indexPizzas(){
        return pizzas.length;
    }

    public String[] drinks(){
        return drinks;
    }

    public int indexDrinks(){
        return drinks.length;
    }
}
