package com.oroarmor.test;

import com.oroarmor.minecraftfunctions.MinecraftFunction;
import com.oroarmor.minecraftfunctions.commands.world.GameruleCommand;
import com.oroarmor.minecraftfunctions.commands.world.GameruleCommand.GameruleTypes;

public class Test extends MinecraftFunction {

	public static void main(String[] args) {
		MinecraftFunction.main("com.oroarmor.test.Test");
	}

	public void init() {
		System.out.println("Init");
	}

	public void tick() {
		System.out.println("Tick");

		GameruleCommand test = new GameruleCommand(GameruleTypes.BooleanTypes.doFireTick, false);
		test.run();

	}

}
