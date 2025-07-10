public class SecondsToHoursChallenge {

    public static String getDurationString(int seconds){
        // Two step approach to get hours
        int minutes = seconds / 60;
        int hours = minutes / 60;
        System.out.println("Hours = " + hours);

//        // One step approach to get hours
//        int hours1 = seconds / 3600;
//        System.out.println("Hours1 = " + hours1);
        int remainingMinutes = minutes % 60;
        System.out.println("Minutes = " + minutes);
        System.out.println("Remaining minutes = " + remainingMinutes);
        return "";
    }

    public static String getDurationString(int minutes, int seconds){
        return "";
    }

    public static void main(String[] args) {

        System.out.println(getDurationString(3945));

    }

}
