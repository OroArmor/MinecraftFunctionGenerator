package com.oroarmor.minecraftfunctions.commands.world;

import com.oroarmor.minecraftfunctions.MinecraftFunction;
import com.oroarmor.minecraftfunctions.commands.Command;

public class WeatherCommand implements Command {

	long ticks;
	WeatherType type;

	public enum WeatherType {
		Rain, Thunder, Clear
	}

	public WeatherCommand(WeatherType type) {
		this(type, -1);
	}

	public WeatherCommand(WeatherType _type, long _ticks) {
		type = _type;
		ticks = _ticks;

		if (ticks > 1000000) {
			ticks = 1000000;
		}
	}

	@Override
	public void run() {
		String command = "/weather ";

		switch (type) {
		case Rain:
			command += "rain ";
			break;
		case Thunder:
			command += "thunder ";
			break;
		case Clear:
			command += "clear ";
			break;
		}

		if (ticks >= 0) {
			command += ticks;
		}

		MinecraftFunction.printCommand(command);
	}

	@Override
	public CommandType getType() {
		return CommandType.World;
	}

}
