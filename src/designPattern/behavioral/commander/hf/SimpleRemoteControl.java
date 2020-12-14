package designPattern.behavioral.commander.hf;

import designPattern.behavioral.commander.hf.command.Command;

public class SimpleRemoteControl {
	Command slot;
	
	public SimpleRemoteControl() {};
	
	public void setCommand(Command command) {
		slot = command;
	}
	
	public void buttonWasPressed() {
		slot.execute();
	}
}
