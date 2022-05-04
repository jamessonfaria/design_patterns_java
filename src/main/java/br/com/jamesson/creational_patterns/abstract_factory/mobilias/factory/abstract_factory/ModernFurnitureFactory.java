package br.com.jamesson.creational_patterns.abstract_factory.mobilias.factory.abstract_factory;

import br.com.jamesson.creational_patterns.abstract_factory.mobilias.factory.ProductFactory;
import br.com.jamesson.creational_patterns.abstract_factory.mobilias.model.ProductAbstract;

public class ModernFurnitureFactory extends FurnitureFactory {

    public ModernFurnitureFactory(ProductFactory product) {
        super(product);
    }

    @Override
    public ProductAbstract finishProduction() {
        ProductAbstract createProduct = product.createProduct();
        System.out.println(createProduct.getDescription());
        System.out.println("Finish Modern...");
        return createProduct;
    }

    
    
}
