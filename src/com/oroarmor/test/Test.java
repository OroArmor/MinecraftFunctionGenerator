package com.oroarmor.test;

import com.oroarmor.minecraftfunctions.MinecraftFunction;
import com.oroarmor.minecraftfunctions.commands.world.WeatherCommand;
import com.oroarmor.minecraftfunctions.commands.world.WeatherCommand.WeatherType;

public class Test extends MinecraftFunction {

	public static void main(String[] args) {
		MinecraftFunction.main("com.oroarmor.test.Test");
	}
	
	public void tick() {
		
		WeatherCommand test = new WeatherCommand(WeatherType.Rain, 1000000);
		test.run();
		System.out.println("Tick");
	}

	public void init() {
		System.out.println("Init");
	}
}
