package com.mayab.patrones.command;

public class NoCommand implements Command {

	public NoCommand() {}
	
	@Override
	public void execute() {
		//Does nothing.
		
	}

	@Override
	public void undo() {
		//Does nothing
	}
}
