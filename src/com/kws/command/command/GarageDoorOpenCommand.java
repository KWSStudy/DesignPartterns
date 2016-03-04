package com.kws.command.command;

import com.kws.command.Command;

public class GarageDoorOpenCommand implements Command {

	GarageDoor garageDoor;

	
	public GarageDoorOpenCommand(GarageDoor garageDoor) {
		this.garageDoor = garageDoor;
	}


	@Override
	public void execute() {
		garageDoor.up();
	}
}
