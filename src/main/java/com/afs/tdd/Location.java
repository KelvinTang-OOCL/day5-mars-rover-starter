package com.afs.tdd;

import java.util.List;
import java.util.Map;

public class Location {
    private int coordinateX;
    private int coordinateY;
    private Direction direction;
    private final int moveDistance = 1;
    private final Map<Character, List<Integer>> moveDirectionInCoordinate =
            Map.of('N', List.of(0,1),
                    'E', List.of(1,0),
                    'S', List.of(0,-1),
                    'W', List.of(-1,0));

    public Location(int coordinateX, int coordinateY, Direction direction) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
        this.direction = direction;
    }

    public int getCoordinateX() {
        return coordinateX;
    }

    private void setCoordinateX(int coordinateX) {
        this.coordinateX = coordinateX;
    }

    public int getCoordinateY() {
        return coordinateY;
    }

    private void setCoordinateY(int coordinateY) {
        this.coordinateY = coordinateY;
    }

    public Direction getDirection() {
        return direction;
    }

    private void setDirection(Direction direction) {
        this.direction = direction;
    }

    public String toString() {
        return String.format("%d:%d:%s", coordinateX, coordinateY, direction.getDirection());
    }

    public void turnLeft() {
        direction.turnLeft();
    }

    public void turnRight() {
        direction.turnRight();
    }

    public void moveForward() {
        setCoordinateX(coordinateX+moveDirectionInCoordinate.get(direction.getDirection()).get(0));
        setCoordinateY(coordinateY+moveDirectionInCoordinate.get(direction.getDirection()).get(1));
    }

    public void moveBackward() {
        setCoordinateX(coordinateX-moveDirectionInCoordinate.get(direction.getDirection()).get(0));
        setCoordinateY(coordinateY-moveDirectionInCoordinate.get(direction.getDirection()).get(1));
    }
}
