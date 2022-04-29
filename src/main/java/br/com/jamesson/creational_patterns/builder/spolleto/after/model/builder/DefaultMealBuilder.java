package br.com.jamesson.creational_patterns.builder.spolleto.after.model.builder;

import java.util.List;

import br.com.jamesson.creational_patterns.builder.spolleto.after.model.Meal;
import br.com.jamesson.creational_patterns.builder.spolleto.after.model.Size;

public abstract class DefaultMealBuilder<M extends Meal> implements MealBuilder {

    protected Size size;
    protected List<String> toppings;
    protected List<String> sauces;
    protected boolean cheese;
    protected boolean pepper;

    @Override
    public void setSize(Size size) {
        this.size = size;   
    }

    @Override
    public void setSauce(List<String> sauces) {
        this.sauces = sauces;
    }

    @Override
    public void setToppings(List<String> toppings) {
        this.toppings = toppings;
    }

    @Override
    public void setCheese(boolean cheese) {
        this.cheese = cheese;
    }

    @Override
    public void setPepper(boolean pepper) {
        this.pepper = pepper;
    }
    
    public abstract M getResult();

}
