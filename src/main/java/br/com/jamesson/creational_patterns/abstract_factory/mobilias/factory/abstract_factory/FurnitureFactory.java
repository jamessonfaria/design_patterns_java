package br.com.jamesson.creational_patterns.abstract_factory.mobilias.factory.abstract_factory;

import br.com.jamesson.creational_patterns.abstract_factory.mobilias.factory.ProductFactory;
import br.com.jamesson.creational_patterns.abstract_factory.mobilias.model.ProductAbstract;

public abstract class FurnitureFactory {
    protected ProductFactory product;

    public FurnitureFactory(ProductFactory product){
        this.product = product;
    }

    public abstract ProductAbstract finishProduction();
}
