package validation;

import java.util.Objects;

    public abstract class Ensurer
    {
        public static boolean isNonBlank(String str)
        {
            return !str.isBlank();
        }

        public static String ensureNonBlank(String str, String Name)
        {
            Objects.requireNonNull(str, Name + " ist null");

            if (!isNonBlank(str))
                throw new IllegalArgumentException(Name + " ist blank");

            return str;
        }

        public static boolean isValueInRange(double value, double min, double max)
        {
            return value >= min && value <= max;
        }

        public static double ensureValueInRange(double value, double min, double max, String Name)
        {
            if (!isValueInRange(value, min, max))
                throw new IllegalArgumentException(
                        String.format("%s muss zwischen %.2f  und %.2f  sein.", Name, min, max));

            return value;
        }

        public static boolean isValueInRangeInt(int value, int min, int max)
        {
            return value >= min && value <= max;
        }

        public static int ensureValueInRangeInt(int value, int min, int max, String Name)
        {
            if (!isValueInRangeInt(value, min, max))
                throw new IllegalArgumentException(
                        String.format("%s muss zwischen %d und %d sein.", Name, min, max));

            return value;
        }

        public static void checkState(boolean value, String message)
        {
            if (!value)
                throw new IllegalStateException(message);
        }
    }

