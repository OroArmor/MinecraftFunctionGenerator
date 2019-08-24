package com.oroarmor.minecraftfunctions.commands;

public interface Command {
	void run();
	CommandType getType();
	
	public enum CommandType{
		Enity, World, Both
	}
}
