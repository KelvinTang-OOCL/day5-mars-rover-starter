package com.afs.tdd;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class DemoTest {
    @Test
    void should_increase_coordinateY_when_executeCommand_given_M_and_direction_is_N() {
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
    void should_increase_coordinateX_when_executeCommand_given_M_and_direction_is_E() {
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

    @Test
    void should_decrease_coordinateY_when_executeCommand_given_M_and_direction_is_S() {
        //Given
        Direction direction = new Direction('S');
        Location location = new Location(0, 0, direction);
        MarsRover marsRover = new MarsRover(location);

        //When
        marsRover.executeCommand('M');

        //Then
        Location expectedLocation = new Location(0, -1, direction);
        assertEquals(expectedLocation.toString(), marsRover.getLocation().toString());
    }

    @Test
    void should_decrease_coordinateX_when_executeCommand_given_M_and_direction_is_W() {
        //Given
        Direction direction = new Direction('W');
        Location location = new Location(0, 0, direction);
        MarsRover marsRover = new MarsRover(location);

        //When
        marsRover.executeCommand('M');

        //Then
        Location expectedLocation = new Location(-1, 0, direction);
        assertEquals(expectedLocation.toString(), marsRover.getLocation().toString());
    }

    @Test
    void should_update_direction_to_W_when_executeCommand_given_L_and_direction_is_N() {
        //Given
        Direction direction = new Direction('N');
        Location location = new Location(0, 0, direction);
        MarsRover marsRover = new MarsRover(location);

        //When
        marsRover.executeCommand('L');

        //Then
        Location expectedLocation = new Location(0, 0, new Direction('W'));
        assertEquals(expectedLocation.toString(), marsRover.getLocation().toString());
    }

    @Test
    void should_update_direction_to_S_when_executeCommand_given_L_and_direction_is_W() {
        //Given
        Direction direction = new Direction('W');
        Location location = new Location(0, 0, direction);
        MarsRover marsRover = new MarsRover(location);

        //When
        marsRover.executeCommand('L');

        //Then
        Location expectedLocation = new Location(0, 0, new Direction('S'));
        assertEquals(expectedLocation.toString(), marsRover.getLocation().toString());
    }

    @Test
    void should_update_direction_to_E_when_executeCommand_given_L_and_direction_is_S() {
        //Given
        Direction direction = new Direction('S');
        Location location = new Location(0, 0, direction);
        MarsRover marsRover = new MarsRover(location);

        //When
        marsRover.executeCommand('L');

        //Then
        Location expectedLocation = new Location(0, 0, new Direction('E'));
        assertEquals(expectedLocation.toString(), marsRover.getLocation().toString());
    }

    @Test
    void should_update_direction_to_N_when_executeCommand_given_L_and_direction_is_E() {
        //Given
        Direction direction = new Direction('E');
        Location location = new Location(0, 0, direction);
        MarsRover marsRover = new MarsRover(location);

        //When
        marsRover.executeCommand('L');

        //Then
        Location expectedLocation = new Location(0, 0, new Direction('N'));
        assertEquals(expectedLocation.toString(), marsRover.getLocation().toString());
    }

    @Test
    void should_update_direction_to_E_when_executeCommand_given_R_and_direction_is_N() {
        //Given
        Direction direction = new Direction('N');
        Location location = new Location(0, 0, direction);
        MarsRover marsRover = new MarsRover(location);

        //When
        marsRover.executeCommand('R');

        //Then
        Location expectedLocation = new Location(0, 0, new Direction('E'));
        assertEquals(expectedLocation.toString(), marsRover.getLocation().toString());
    }

    @Test
    void should_update_direction_to_S_when_executeCommand_given_R_and_direction_is_E() {
        //Given
        Direction direction = new Direction('E');
        Location location = new Location(0, 0, direction);
        MarsRover marsRover = new MarsRover(location);

        //When
        marsRover.executeCommand('R');

        //Then
        Location expectedLocation = new Location(0, 0, new Direction('S'));
        assertEquals(expectedLocation.toString(), marsRover.getLocation().toString());
    }

    @Test
    void should_update_direction_to_W_when_executeCommand_given_R_and_direction_is_S() {
        //Given
        Direction direction = new Direction('S');
        Location location = new Location(0, 0, direction);
        MarsRover marsRover = new MarsRover(location);

        //When
        marsRover.executeCommand('R');

        //Then
        Location expectedLocation = new Location(0, 0, new Direction('W'));
        assertEquals(expectedLocation.toString(), marsRover.getLocation().toString());
    }

    @Test
    void should_update_direction_to_N_when_executeCommand_given_R_and_direction_is_W() {
        //Given
        Direction direction = new Direction('W');
        Location location = new Location(0, 0, direction);
        MarsRover marsRover = new MarsRover(location);

        //When
        marsRover.executeCommand('R');

        //Then
        Location expectedLocation = new Location(0, 0, new Direction('N'));
        assertEquals(expectedLocation.toString(), marsRover.getLocation().toString());
    }

    @Test
    void should_decrease_coordinateY_when_executeCommand_given_B_and_direction_is_N() {
        //Given
        Direction direction = new Direction('N');
        Location location = new Location(0, 0, direction);
        MarsRover marsRover = new MarsRover(location);

        //When
        marsRover.executeCommand('B');

        //Then
        Location expectedLocation = new Location(0, -1, direction);
        assertEquals(expectedLocation.toString(), marsRover.getLocation().toString());
    }


}
