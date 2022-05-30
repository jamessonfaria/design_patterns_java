package br.com.jamesson.behavioral_patterns.template_method.sales.after.service.template;


import br.com.jamesson.behavioral_patterns.template_method.sales.after.model.Cart;

public class FreeDelivery extends BestOfferTemplate {

	public FreeDelivery(Cart cart) {
		super(cart);
	}

	@Override
	public boolean isAppliable() {
		return regularItemsPrice > 500;
	}

	@Override
	protected void calibrateVariables() {
		deliveryFactor = 0d;
	}

}
