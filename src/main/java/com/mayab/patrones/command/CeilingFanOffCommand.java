package com.mayab.patrones.command;

public class CeilingFanOffCommand implements Command {

	CeilingFan ceilingFan;
	
	public CeilingFanOffCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}
	
	public void execute() {
		this.ceilingFan.off();
	}
	
	public void undo() {
		this.ceilingFan.on();
	}
}
