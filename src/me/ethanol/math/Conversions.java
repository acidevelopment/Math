package me.ethanol.math;

/**
 * @author ethanol
 */

public class Conversions {
    public static double metersToKm(double meters) {
        return meters / 1_000.0;
    }

    public static double KmToMeters(double kilometers) {
        return kilometers * 1_000.0;
    }

    public static double gramsToKg(double grams) {
        return grams / 1_000.0;
    }

    public static double kgToGrams(double kilograms) {
        return kilograms * 1_000.0;
    }

    public static double poundsToOz(double pounds) {
        return pounds * 16.0;
    }

    public static double ozToPounds(double ounces) {
        return ounces / 16.0;
    }
}
