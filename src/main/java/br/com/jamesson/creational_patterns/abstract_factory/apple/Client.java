package br.com.jamesson.creational_patterns.abstract_factory.apple;

import br.com.jamesson.creational_patterns.abstract_factory.apple.factory.IPhone11Factory;
import br.com.jamesson.creational_patterns.abstract_factory.apple.factory.IPhoneFactory;
import br.com.jamesson.creational_patterns.abstract_factory.apple.factory.IPhoneXFactory;
import br.com.jamesson.creational_patterns.abstract_factory.apple.factory.abstract_factory.BrazilianRulesAbstractFactory;
import br.com.jamesson.creational_patterns.abstract_factory.apple.factory.abstract_factory.CountryRulesAbstractFactory;
import br.com.jamesson.creational_patterns.abstract_factory.apple.model.iphone.IPhone;

public class Client {

    public static void main(String[] args) {
        CountryRulesAbstractFactory rules = new BrazilianRulesAbstractFactory();
        IPhoneFactory genXFactory = new IPhoneXFactory(rules);
        IPhoneFactory gen11Factory = new IPhone11Factory(rules);

        System.out.println("### Ordering an iPhone X");
        IPhone iphone = genXFactory.orderIPhone("standard");
        System.out.println(iphone);

        System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
        IPhone iphone2 = gen11Factory.orderIPhone("highEnd");
        System.out.println(iphone2);
    }
}
