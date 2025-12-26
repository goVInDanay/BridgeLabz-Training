package core_java_practice.gcr_codebase.extras;
import java.util.*;
import java.time.ZonedDateTime;
import java.time.ZoneId;
public class DisplayTimeZones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ZonedDateTime current = ZonedDateTime.now();
		System.out.println("Current Time " + current.toLocalTime());
		ZoneId gmt = ZoneId.of("GMT");
		ZonedDateTime currentGmt = ZonedDateTime.now(gmt);
		System.out.println("Current Time in GMT " + currentGmt.toLocalTime());
		ZoneId ist = ZoneId.of("Asia/Kolkata");
		ZonedDateTime currentIst = ZonedDateTime.now(ist);
		System.out.println("Current Time in IST " + currentIst.toLocalTime());
		ZoneId pst = ZoneId.of("America/Los_Angeles");
		ZonedDateTime currentPst = ZonedDateTime.now(pst);
		System.out.println("Current Time in GMT " + currentPst.toLocalTime());
	}

}
