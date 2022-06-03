package com.akilesh;

public class MinutesSecondsToHour {

    public static String getDurationString(int minutes, int seconds) {
        // Declaring needed variables.
        int hours;
        int minutesRemaining;
        String hoursString;
        String minutesRemainingString;
        String secondsString;

        // Validating Parameters
        if((minutes < 0) || (seconds < 0 ) || (seconds > 59)) {
            return "Invalid Value";
        }

        // Calculating hours
        hours = minutes / 60;  // Decimal value will get sliced, but we can add that up using modulus operator next.
        // Calculating minutes
        minutesRemaining = minutes % 60;

        // Formatting.
        secondsString = formatValue(seconds);
        hoursString = formatValue(hours);
        minutesRemainingString = formatValue(minutesRemaining);

        return hoursString + "h " + minutesRemainingString + "m " + secondsString + "s";
    }

    // Overloaded method with seconds parameter alone.
    public static String getDurationString(int seconds) {
        // Declaring needed variables
        int secondsToMinutes;
        int remainingSeconds;

        // Validating the parameter
        if(seconds < 0) {
            return "Invalid Value";
        }
        secondsToMinutes = seconds / 60; // Decimal value will be sliced, we can add it up using modulus operator next.
        remainingSeconds = seconds % 60;

        return getDurationString(secondsToMinutes, remainingSeconds);
    }

    public static String formatValue(int number) {
        if((number >= 0) && (number < 10)) {
            return "0" + number; // Formatting
        } else {
            return "" + number; // Making the number string and then returning.
        }
    }
}
