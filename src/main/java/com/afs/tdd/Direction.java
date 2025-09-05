package com.afs.tdd;

import java.util.List;

public class Direction {

    private char direction;
    List<Character> directionList = List.of('N', 'E', 'S', 'W');

    public char getDirection() {
        return direction;
    }

    public void setDirection(char direction) {
        this.direction = direction;
    }

    public int getDirectionIndex(char direction) {
        return directionList.indexOf(direction);
    }

    public Direction(char direction) {
        this.direction = direction;
    }

    public void turnLeft() {
        setDirection(directionList.get(Math.abs(getDirectionIndex(direction)+1)%directionList.size()));
    }

    public void turnRight() {
        setDirection(directionList.get(Math.abs(getDirectionIndex(direction)-1)%directionList.size()));
    }
}
