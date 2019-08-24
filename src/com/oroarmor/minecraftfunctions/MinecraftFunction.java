package com.oroarmor.minecraftfunctions;

public class MinecraftFunction {

	public MinecraftFunction() {

	}

	public static void main(String mainClassName) {
		
		MinecraftFunction mainClass;
		
		try {
			mainClass = (MinecraftFunction) Class.forName(mainClassName).newInstance();
		} catch (Exception e) {
			e.printStackTrace();
			return;
		}
		
		mainClass.init();
		mainClass.tick();
	}
	
	public void tick() {
		
	}
	
	public void init() {
		
	}

	public static void printCommand(String command) {
		System.out.println(command);
	}
	
}
