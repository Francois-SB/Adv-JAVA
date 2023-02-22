import java.time.DateTimeException;
import java.util.Date;

public class AdvEx1Excep {

	public static void main(String[] args) {
		Date date = null;
		Date today = new Date();
		
//		try {
//			System.out.println(date.getClass().getName());
//		} catch (DateTimeException e) {
//			throw new DateTimeException("null error date");
//		}

		try {
			System.out.println(today.getClass().getName());
		} catch (DateTimeException e) {
			throw new DateTimeException("You shall not pass");
		}
	}

}
