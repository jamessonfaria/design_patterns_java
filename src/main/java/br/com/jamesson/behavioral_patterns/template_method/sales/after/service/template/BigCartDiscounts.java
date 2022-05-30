package br.com.jamesson.behavioral_patterns.template_method.sales.after.service.template;

import br.com.jamesson.behavioral_patterns.template_method.sales.after.model.Cart;

public class BigCartDiscounts extends BestOfferTemplate {

	public BigCartDiscounts(Cart cart) {
		super(cart);
	}

	@Override
	public boolean isAppliable() {
		return regularItemsPrice > 1000;
	}

	@Override
	protected void calibrateVariables() {
		priceFactor = 0.9d;
	}

}
