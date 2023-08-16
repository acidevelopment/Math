package me.ethanol.math;

import me.ethanol.math.util.Result;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

/**
 * @author ethanol
 */

@SuppressWarnings("unused")
public class Operations {

    @SafeVarargs
    public static <T extends Number> Result add(T... numbers) {
        double sum = 0.0;
        for (T number : numbers) {
            sum += number.doubleValue();
        }
        return new Result(sum);
    }

    @SafeVarargs
    public static <T extends Number> Result sub(T parent, T... numbers) {
        double difference = parent.doubleValue();
        for (T number : numbers) {
            difference -= number.doubleValue();
        }
        return new Result(difference);
    }

    @SafeVarargs
    public static <T extends Number> Result div(T parent, T... numbers) {
        double quotient = parent.doubleValue();
        for (T number : numbers) {
            if (number.doubleValue() == 0) {
                return new Result(Double.NaN);
            }
            quotient /= number.doubleValue();
        }
        return new Result(quotient);
    }

    @SafeVarargs
    public static <T extends Number> Result mul(T... numbers) {
        double product = 1.0;
        for (T number : numbers) {
            product *= number.doubleValue();
        }
        return new Result(product);
    }

    public static <T extends Number> Result remainder(T first, T second) {
        return new Result(first.doubleValue() % second.doubleValue());
    }

    public static <T extends Number> Result power(T base, T exponent) {
        return new Result(Math.pow(base.doubleValue(), exponent.doubleValue()));
    }

    public static <T extends Number> Result sin(T angle) {
        return new Result(Math.sin(angle.doubleValue()));
    }

    public static <T extends Number> Result cos(T angle) {
        return new Result(Math.cos(angle.doubleValue()));
    }

    public static <T extends Number> Result tan(T angle) {
        return new Result(Math.tan(angle.doubleValue()));
    }

    public static <T extends Number> Result atan(T value) {
        return new Result(Math.atan(value.doubleValue()));
    }

    public static <T extends Number> Result acos(T value) {
        return new Result(Math.acos(value.doubleValue()));
    }

    public static <T extends Number> Result asin(T value) {
        return new Result(Math.asin(value.doubleValue()));
    }

    public static <T extends Number> Result hsin(T x) {
        return new Result(Math.sinh(x.doubleValue()));
    }

    public static <T extends Number> Result hcos(T x) {
        return new Result(Math.cosh(x.doubleValue()));
    }

    public static <T extends Number> Result htan(T x) {
        return new Result(Math.tanh(x.doubleValue()));
    }

    public static <T extends Number> Result log(T number) {
        return new Result(Math.log(number.doubleValue()));
    }

    public static <T extends Number> Result logTen(T number) {
        return new Result(Math.log10(number.doubleValue()));
    }

    public static <T extends Number> Result sqrt(T number) {
        return new Result(Math.sqrt(number.doubleValue()));
    }

    public static <T extends Number> Result hyp(T a, T b) {
        double sideA = a.doubleValue();
        double sideB = b.doubleValue();
        return new Result(Math.sqrt(sideA * sideA + sideB * sideB));
    }

    public static <T extends Number> Result customBinary(T a, T b, BinaryOperator<Double> operation) {
        return new Result(operation.apply(a.doubleValue(), b.doubleValue()));
    }

    public static <T extends Number> Result customUnary(T a, UnaryOperator<Double> operation) {
        return new Result(operation.apply(a.doubleValue()));
    }

    public static <T extends Number> Result fromDegrees(T degrees) {
        return new Result(Math.toRadians(degrees.doubleValue()));
    }

    public static <T extends Number> Result fromRadians(T radians) {
        return new Result(Math.toDegrees(radians.doubleValue()));
    }
}
