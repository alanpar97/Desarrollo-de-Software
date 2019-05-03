package com.mayab.patrones.command;

public class SimpleRemoteControl {
	//Una ranura para mantener nuestro comando, el cual controlará un dispositivo 
	Command slot;
	
	public SimpleRemoteControl() {}
	
	
	public void setCommand(Command command) {
		this.slot = command;
	}
	
	public void buttonWasPressed() {
		slot.execute();
	}
}
