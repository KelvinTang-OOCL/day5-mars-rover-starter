package com.afs.tdd;

import java.util.List;

public class MarsRover {

    private final Location location;

    public Location getLocation() {
        return location;
    }

    public MarsRover(Location location) {
        this.location = location;
    }

    public void executeCommands(List<Character> commands) {
        commands.forEach(this::executeCommand);
    }

    public void executeCommand(char command) {
        switch (command) {
            case 'M': location.moveForward(); break;
            case 'B': location.moveBackward(); break;
            case 'L': location.turnLeft(); break;
            case 'R': location.turnRight(); break;
        }
    }

}
