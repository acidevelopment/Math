package me.ethanol.math.util;

import java.util.function.UnaryOperator;

/**
 * @author ethanol
 */

@SuppressWarnings("unused")
public class Result {
    private final double value;

    public Result(double value) {
        this.value = value;
    }

    public Result except(Exception customException) {
        if (customException.shouldThrow(this.value)) {
            throw customException.generateException(this.value);
        }
        return this;
    }

    public Result applyOperation(UnaryOperator<Double> operation) {
        return new Result(operation.apply(this.value));
    }

    public int toInteger() {
        return (int) value;
    }

    public double toDouble() {
        return value;
    }

    public float toFloat() {
        return (float) value;
    }

    public long toLong() {
        return (long) value;
    }

    public double ceilInt() {
        return (int) Math.ceil(value);
    }

    public double floorInt() {
        return (int) Math.floor(value);
    }

    public double ceilDouble() {
        return Math.ceil(value);
    }

    public double floorDouble() {
        return Math.floor(value);
    }

    public double absolute() {
        return Math.abs(value);
    }

    public Result toDegrees() {
        return new Result(Math.toDegrees(value));
    }

    public Result toRadians() {
        return new Result(Math.toRadians(value));
    }
}
