package introduction;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Calendar;
import java.util.TreeSet;

public class Exercise1 {

    public String problem1 (double in) {
        String inString = String.format("%.3f", in);

        while (inString.length() < 7) {
            inString = " ".concat(inString);
        }
        return inString;
    }

    public String problem2(int digits) {
        BigDecimal bigDecimal = new BigDecimal(Math.PI);
        bigDecimal = bigDecimal.setScale(digits, RoundingMode.FLOOR);
        return bigDecimal.toString();
    }

    public String problem3(int year, int month, int day) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month, day);
        switch (calendar.get(Calendar.DAY_OF_WEEK)) {
            case Calendar.SUNDAY:
                return "Sunday";
            case Calendar.MONDAY:
                return "Monday";
            case Calendar.TUESDAY:
                return "Tuesday";
            case Calendar.WEDNESDAY:
                return "Wednesday";
            case Calendar.THURSDAY:
                return "Thursday";
            case Calendar.FRIDAY:
                return "Friday";
            case Calendar.SATURDAY:
                return "Saturday";
            default:
                throw new Error();
        }
    }

    public int[] problem4(int[] numbers) {
        TreeSet<Integer> sortedNumbers = new TreeSet<>();

        for (int i : numbers) {
            sortedNumbers.add(i);
        }

        int size = sortedNumbers.size();
        int[] sortedArray = new int[size];
        for (int i = 0; i < size; i++) {
            sortedArray[i] = sortedNumbers.first();
            sortedNumbers.remove(sortedArray[i]);
        }

        return sortedArray;
    }
}
