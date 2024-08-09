package fr.maxlego08.zvoteparty;

import java.util.List;

public class RandomCommand {

    private final int chance;
    private final List<String> commands;

    public RandomCommand(int chance, List<String> commands) {
        this.chance = chance;
        this.commands = commands;
    }

    public int getChance() {
        return chance;
    }

    public List<String> getCommands() {
        return commands;
    }
}
