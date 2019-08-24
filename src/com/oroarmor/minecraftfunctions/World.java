package com.oroarmor.minecraftfunctions;

import com.oroarmor.minecraftfunctions.commands.Command;
import com.oroarmor.minecraftfunctions.commands.Command.CommandType;

public class World {
	public void runCommand(Command command) throws FunctionError {
		if(command.getType() == CommandType.Enity) {
			throw new FunctionError("Invalid Command Type");
		}
	}
}
