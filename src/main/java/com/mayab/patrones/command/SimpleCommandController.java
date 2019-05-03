package com.mayab.patrones.command;

public class SimpleCommandController {

	public static void main(String[] args) {
		
		SimpleRemoteControl remote = new SimpleRemoteControl();
		
		Light light = new Light("Living Room");	
		LightOnCommand lightOn = new LightOnCommand(light);
		
		GarageDoor garageDoor = new GarageDoor();
		GarageDoorOpenCommand garageOpen = new GarageDoorOpenCommand(garageDoor);
		
		remote.setCommand(lightOn);
		remote.buttonWasPressed();
		
		
		remote.setCommand(garageOpen);
		remote.buttonWasPressed();

	}

}
