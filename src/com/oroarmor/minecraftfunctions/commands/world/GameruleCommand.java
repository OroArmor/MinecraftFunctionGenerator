package com.oroarmor.minecraftfunctions.commands.world;

import com.oroarmor.minecraftfunctions.MinecraftFunction;
import com.oroarmor.minecraftfunctions.commands.Command;
import com.oroarmor.minecraftfunctions.commands.world.GameruleCommand.GameruleTypes.BooleanTypes;
import com.oroarmor.minecraftfunctions.commands.world.GameruleCommand.GameruleTypes.IntTypes;

public class GameruleCommand implements Command {

	public interface TypeInterface {
	}

	public static class GameruleTypes {
		public enum BooleanTypes implements TypeInterface {
			announceAdvancements, commandBlockOutput, disableElytraMovementCheck, disableRaids, doDaylightCycle,
			doEntityDrops, doFireTick, doLimitedCrafting, doMobLoot, doMobSpawning, doTileDrops, doWeatherCycle,
			keepInventory, logAdminCommands, mobGriefing, naturalRegeneration, reducedDebugInfo, sendCommandFeedback,
			showDeathMessages, spectatorsGenerateChunks;
		}

		public enum IntTypes implements TypeInterface {
			maxCommandChainLength, maxEntityCramming, spawnRadius, randomTickSpeed;
		}
	}

	TypeInterface type;
	boolean boolValue;
	int intValue;

	public GameruleCommand(BooleanTypes _type, boolean value) {
		type = _type;
		boolValue = value;
	}

	public GameruleCommand(IntTypes _type, int value) {
		type = _type;
		intValue = value;
	}

	@Override
	public void run() {

		String command = "/gamerule ";

		command += type.toString() + ' ';

		if (type.getClass().getSimpleName().equals("BooleanTypes")) {
			command += boolValue;
		} else {
			command += intValue;
		}

		MinecraftFunction.printCommand(command);

	}

	@Override
	public CommandType getType() {
		return CommandType.World;
	}

}
