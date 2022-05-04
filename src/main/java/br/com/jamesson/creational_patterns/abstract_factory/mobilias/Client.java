package br.com.jamesson.creational_patterns.abstract_factory.mobilias;

import br.com.jamesson.creational_patterns.abstract_factory.mobilias.factory.ProductFactory;
import br.com.jamesson.creational_patterns.abstract_factory.mobilias.factory.SofaFactory;
import br.com.jamesson.creational_patterns.abstract_factory.mobilias.factory.TableFactory;
import br.com.jamesson.creational_patterns.abstract_factory.mobilias.factory.abstract_factory.FurnitureFactory;
import br.com.jamesson.creational_patterns.abstract_factory.mobilias.factory.abstract_factory.ModernFurnitureFactory;
import br.com.jamesson.creational_patterns.abstract_factory.mobilias.factory.abstract_factory.VictorianFurnitureFactory;

public class Client {
    public static void main(String[] args) {
        
        ProductFactory sofaFactory = new SofaFactory();
        ProductFactory tableFactory = new TableFactory();
        
        FurnitureFactory modernFurnitureFactory = new ModernFurnitureFactory(sofaFactory);
        modernFurnitureFactory.finishProduction();

        VictorianFurnitureFactory victorianFurnitureFactory = new VictorianFurnitureFactory(sofaFactory); 
        victorianFurnitureFactory.finishProduction();

        VictorianFurnitureFactory victorianFurnitureFactory2 = new VictorianFurnitureFactory(tableFactory);
        victorianFurnitureFactory2.finishProduction(); 
        
    }
}
