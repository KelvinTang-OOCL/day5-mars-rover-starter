package com.afs.tdd;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class DemoTest {
    @Test
    void should_move_when_executeCommand_given_M_and_direction_is_N() {
        //Given
        Direction direction = new Direction('N');
        Location location = new Location(0, 0, direction);
        MarsRover marsRover = new MarsRover(location);

        //When
        marsRover.executeCommand('M');

        //Then
        Location expectedLocation = new Location(0, 1, direction);
        assertEquals(expectedLocation.toString(), marsRover.getLocation().toString());
    }

    @Test
    void should_move_when_executeCommand_given_M_and_direction_is_E() {
        //Given
        Direction direction = new Direction('E');
        Location location = new Location(0, 0, direction);
        MarsRover marsRover = new MarsRover(location);

        //When
        marsRover.executeCommand('M');

        //Then
        Location expectedLocation = new Location(1, 0, direction);
        assertEquals(expectedLocation.toString(), marsRover.getLocation().toString());
    }
}
