import java.util.*;

public class Crochet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] startInput = sc.nextLine().split(" ");
        String[] endInput = sc.nextLine().split(" ");
        String[] weekdays = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
        Map<String, Integer> dayMap = new HashMap<>();
        for (int i = 0; i < weekdays.length; i++) {
            dayMap.put(weekdays[i], i);
        }
        String startDay = startInput[0];
        int startHour = Integer.parseInt(startInput[1].substring(0, 2));
        int startMinute = Integer.parseInt(startInput[1].substring(3));
        String endDay = endInput[0];
        int endHour = Integer.parseInt(endInput[1].substring(0, 2));
        int endMinute = Integer.parseInt(endInput[1].substring(3));

        int startTotalMinutes = dayMap.get(startDay) * 24 * 60 + startHour * 60 + startMinute;
        int endTotalMinutes = dayMap.get(endDay) * 24 * 60 + endHour * 60 + endMinute;

        if (startTotalMinutes == endTotalMinutes) {
            endTotalMinutes += 7 * 24 * 60;
        }

        int diffMinutes = endTotalMinutes - startTotalMinutes;

        int days = diffMinutes / (24 * 60);
        diffMinutes %= 24 * 60;
        int hours = diffMinutes / 60;
        int minutes = diffMinutes % 60;

        List<String> parts = new ArrayList<>();
        if (days > 0) {
            parts.add(days + (days == 1 ? " day" : " days"));
        }
        if (hours > 0) {
            parts.add(hours + (hours == 1 ? " hour" : " hours"));
        }
        if (minutes > 0) {
            parts.add(minutes + (minutes == 1 ? " minute" : " minutes"));
        }

        String result;
        if (parts.isEmpty()) {
            result = "0 minutes";
        } else if (parts.size() == 1) {
            result = parts.get(0);
        } else if (parts.size() == 2) {
            result = parts.get(0) + " and " + parts.get(1);
        } else {
            result = parts.get(0) + ", " + parts.get(1) + " and " + parts.get(2);
        }

        System.out.println(result);
    }
}