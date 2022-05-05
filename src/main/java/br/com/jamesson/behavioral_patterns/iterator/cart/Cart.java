package br.com.jamesson.behavioral_patterns.iterator.cart;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Cart implements Iterable<Product> {
	private List<Product> products = new ArrayList<Product>();
	
	@Override
	public Iterator<Product> iterator() {
		return products.iterator();
	}

	public Cart(Product... products) {
		this.products = Arrays.asList(products);
	}
}
