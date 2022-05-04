package br.com.jamesson.creational_patterns.abstract_factory.mobilias.factory;

import br.com.jamesson.creational_patterns.abstract_factory.mobilias.model.ProductAbstract;
import br.com.jamesson.creational_patterns.abstract_factory.mobilias.model.Table;

public class TableFactory implements ProductFactory {

    @Override
    public ProductAbstract createProduct() {
        return new Table();
    }
    
}
