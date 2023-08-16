package me.ethanol.math.util;

/**
 * @author ethanol
 */

public interface Exception {
    boolean shouldThrow(double value);
    RuntimeException generateException(double value);
}
