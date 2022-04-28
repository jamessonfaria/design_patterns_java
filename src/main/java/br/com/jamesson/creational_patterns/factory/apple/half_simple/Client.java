package br.com.jamesson.creational_patterns.factory.apple.half_simple;

import br.com.jamesson.creational_patterns.factory.apple.half_simple.factory.IPhone11Factory;
import br.com.jamesson.creational_patterns.factory.apple.half_simple.factory.IPhoneFactory;
import br.com.jamesson.creational_patterns.factory.apple.half_simple.factory.IPhoneXFactory;
import br.com.jamesson.creational_patterns.factory.apple.half_simple.model.IPhone;

public class Client {
    
	public static void main(String[] args) {
		IPhoneFactory iphoneXFactory = new IPhoneXFactory();
		IPhoneFactory iphone11ProFactory = new IPhone11Factory();
		
		System.out.println("### Ordering an iPhone X");
		IPhone iphone =  iphoneXFactory.orderIPhone("standard"); 
		System.out.println(iphone);
		
		System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
		IPhone iphone2 =  iphone11ProFactory.orderIPhone("highEnd");
		System.out.println(iphone2);
	}

}
