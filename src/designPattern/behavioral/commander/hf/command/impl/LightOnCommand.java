package designPattern.behavioral.commander.hf.command.impl;

import designPattern.behavioral.commander.hf.command.Command;
import designPattern.behavioral.commander.hf.receiver.Light;

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
