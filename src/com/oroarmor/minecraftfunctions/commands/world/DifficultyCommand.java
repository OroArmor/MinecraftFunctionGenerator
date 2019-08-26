package com.oroarmor.minecraftfunctions.commands.world;

import com.oroarmor.minecraftfunctions.MinecraftFunction;
import com.oroarmor.minecraftfunctions.commands.Command;

public class DifficultyCommand implements Command {

	DifficultyType type;
	
	public enum DifficultyType{
		Peaceful, Easy, Normal, Hard
	}
	
	public DifficultyCommand(DifficultyType _type) {
		type = _type;
	}

	@Override
	public void run() {
		String command = "/difficulty ";

		switch (type) {
		case Peaceful:
			command += "peaceful ";
			break;
		case Easy:
			command += "easy ";
			break;
		case Normal:
			command += "normal ";
			break;
		case Hard:
			command += "hard ";
			break;
		}

		MinecraftFunction.printCommand(command);
	}

	@Override
	public CommandType getType() {
		return CommandType.World;
	}

}
