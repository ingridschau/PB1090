import java.util.GregorianCalendar;

public class Calendar {
	/** Main method */
	public static void main(String[] args) {
		// Create a GregorianCalendar object
		GregorianCalendar calendar = new GregorianCalendar();

		// Display the current year, month, and day in format Mth/Day/Year
		System.out.print("\nCurrent year, month, day:  ");
		System.out.println(calendar.get(calendar.MONTH) + "/" +
			calendar.get(calendar.DAY_OF_MONTH) + "/" + calendar.get(calendar.YEAR));

		// Set elapsed time since January 1, 1970 to 1234567898765L
		calendar.setTimeInMillis(1234567898765L);

		// Display the year, month and day
		System.out.print("\nElapsed time since January 1, 1970 set to " +
			"1234567898765L in format Mth/Day/Year: ");
		System.out.println(calendar.get(calendar.MONTH) + "/" +
			calendar.get(calendar.DAY_OF_MONTH) + "/" + calendar.get(calendar.YEAR));
	}
}