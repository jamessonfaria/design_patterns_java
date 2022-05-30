package br.com.jamesson.behavioral_patterns.template_method.persist;

import br.com.jamesson.behavioral_patterns.template_method.persist.models.UserModel;

public class Client {

	public static void main(String[] args) {
		UserModel user = new UserModel("user", "passwd");
		user.save();

		System.out.println("---------");

		UserModel invalidUser = new UserModel(null, null);
		invalidUser.save();
	}
}
