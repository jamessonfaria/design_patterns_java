package br.com.jamesson.behavioral_patterns.template_method.sales.after.service.template;

import br.com.jamesson.behavioral_patterns.template_method.sales.after.model.Cart;

public class RegularPrice extends BestOfferTemplate {

	public RegularPrice(Cart cart) {
		super(cart);
	}

	@Override
	public boolean isAppliable() {
		return true;
	}

	@Override
	protected void calibrateVariables() {
		// Nothing to adjust!
	}

}
