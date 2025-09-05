package com.afs.tdd;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class DemoTest {
    @Test
    void should_move_when_executeCommand_given_M() {
        //Given
        Direction direction = new Direction('N');
        Location location = new Location(0, 0, direction);
        MarsRover marsRover = new MarsRover(location);

        //When
        marsRover.executeCommand('M');

        //Then
        Location expectedLocation = new Location(0, 0, direction);
        assertEquals(expectedLocation, marsRover.getLocation());
    }
}
