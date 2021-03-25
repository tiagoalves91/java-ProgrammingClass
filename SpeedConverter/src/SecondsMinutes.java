public class SecondsMinutes {

    public static String getDurationString(int minutes, int seconds) {
        if ((minutes >= 0) && (seconds >= 0 && seconds <= 59)) {
            return ("XXh" + minutes + "m" + seconds + "s").toString();
        }
        return "Invalid Value";
    }

    public static String getDurationString(int num) {
        if (num >= 0) {
            return "there are " + num + "minutes";
        }
        return "Invalid Value";
    }
}
