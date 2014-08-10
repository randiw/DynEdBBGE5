package com.randi.dyned5.view;

import com.randi.dyned5.view.manager.RegisterManager;

public class RegisterScreen extends BasicScreen {

	public RegisterScreen() {
		super("Register");
		add(new RegisterManager());
	}
}