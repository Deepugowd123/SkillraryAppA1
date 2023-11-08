package genericLibraries;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;



/**
 * This class contains reusable methods of java
 * @author deepthi
 *
 */


public class JavaUtility {
	/**
	 * This method generates random number within the specified limit
	 * @param limit
	 * @return
	 */
	public int generateRandomNum(int limit) {
		Random random = new Random();
		return random.nextInt(limit);
	}
	 
	/**
	 * This method generates current time
	 * @return
	 */ 
	public String getCurrentTime()  {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("DD_MM_YY_HH_MM_SS");
		return sdf.format(date);
	}
}

