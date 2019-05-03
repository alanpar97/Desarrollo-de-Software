package com.mayab.patrones.command;

public class GarageDoorCloseCommand implements Command {

	GarageDoor garageDoor;
	
	public GarageDoorCloseCommand(GarageDoor garageDoor) {
		this.garageDoor = garageDoor;
	}
	
	@Override
	public void execute() {
		this.garageDoor.down();
		
	}
	
	@Override
	public void undo() {
		this.garageDoor.up();
	}

}
