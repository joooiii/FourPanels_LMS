package validation;

import UserPackage.User;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Instant;
import java.time.LocalDateTime;
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

        // minimum 8 characters, 1 uppercase, 1 numeral, 1 special character
        public static boolean isValidPassword(String pwd) {return pwd.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!§@#$%^&-+=()])(?=\\S+$).{8,20}$");}

        public static String ensurePasswordValid(String pwd)
        {
            if (!isValidPassword(pwd))
                throw new IllegalArgumentException(
                        String.format("%s ist kein gültiges Passwort", pwd));

            return pwd;
        }

        public static boolean isValidEmail(String email) {return email.matches("(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])");}

        public static String ensureEmailValid(String email)
        {
            if (!isValidEmail(email))
                throw new IllegalArgumentException(
                        String.format("%s ist keine gültige E-Mail-Adresse", email));

            return email;
        }

        public static boolean isValidEndDateTime(LocalDateTime endDateTime)
        {
            return LocalDateTime.now().isBefore(endDateTime);
        }

        public static LocalDateTime ensureValidEndDateTime(LocalDateTime endDateTime)
        {
            if(!isValidEndDateTime(endDateTime))
                throw new IllegalArgumentException(
                        String.format("%s ist kein gültige End Date/Time", endDateTime));

            return endDateTime;

        }

        public static boolean isDifferentUser(User u, User o)
        {
            return (u != o);
        }

        public static User ensureDifferentUsers(User u, User o)
        {
            if (!isDifferentUser(u, o))
                throw new IllegalArgumentException(
                        String.format("%s und %s dürfen nicht derselbe User sein", u, o)
                );
                return u;
        }

        public static boolean isValidPath(String path)
        {
            return path.matches("(?:[a-zA-Z]\\:)\\\\([\\w-]+\\\\)*\\w([\\w-.])+");
        }

        public static String ensureValidPath(String path)
        {
            if (!isValidPath(path))
                throw new IllegalArgumentException(
                        String.format("%s ist kein gültiger Pfad", path));

            return path;
        }

        public static boolean isValidMimeType(Path path)
        {
            try
            {
                return Files.probeContentType(path) != null;
            } catch (IOException e)
            {
                e.printStackTrace();
                throw new IllegalArgumentException("Help");
            }
        }

        public static String ensureValidMimeType(Path path)
        {
            if (!isValidMimeType(path))
                throw new IllegalArgumentException(
                        String.format("%s ist kein gültiger MimeType oder Pfad", path));

            try
            {
                return Files.probeContentType(path);
            } catch (IOException e)
            {
                e.printStackTrace();
                throw new IllegalArgumentException("Kein gültiger Pfad/MimeType");
            }
        }


    }

