package com.mayab.patrones.command;

public class CeilingFanOnCommand implements Command {
	
	CeilingFan ceilingFan;
	
	public CeilingFanOnCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}
	
	public void execute() {
		this.ceilingFan.on();
	}
	
	public void undo() {
		this.ceilingFan.off();
	}

}
