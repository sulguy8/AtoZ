package designPattern.behavioral.commander.hf;

import designPattern.behavioral.commander.hf.command.impl.LightOnCommand;
import designPattern.behavioral.commander.hf.receiver.Light;

public class RemoteControlTest {
	public static void main(String[] args) {
		Light light = new Light();
		LightOnCommand lightOn = new LightOnCommand(light);
		
		SimpleRemoteControl remote = new SimpleRemoteControl();
		remote.setCommand(lightOn);
		remote.buttonWasPressed();
		
	}
}
