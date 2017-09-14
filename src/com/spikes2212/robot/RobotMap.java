package com.spikes2212.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    public static interface DIO {
        public static final int ULTRASONIC_INPUT_PORT  = 0;
        public static final int ULTRASONIC_OUTPUT_PORT = 1;
    }
}
