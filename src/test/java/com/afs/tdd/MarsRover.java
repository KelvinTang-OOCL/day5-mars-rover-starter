package com.afs.tdd;

import java.util.List;

public class MarsRover {

    private Location location;

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
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

    public String reportLocation() {
        return String.format("%d:%d:%s", getLocation().getCoordinateX(), getLocation().getCoordinateY(), getLocation().getDirection());
    }


}
