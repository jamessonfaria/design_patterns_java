package br.com.jamesson.creational_patterns.abstract_factory.mobilias.factory;

import br.com.jamesson.creational_patterns.abstract_factory.mobilias.model.ProductAbstract;

public interface ProductFactory {
    ProductAbstract createProduct();
}
