package com.kws.command.command;

import com.kws.command.Command;

public class LightOnCommand implements Command {
	Light light;

	
	public LightOnCommand(Light light) {
		this.light = light;
	}


	@Override
	public void execute() {
		light.on();
	}
}
