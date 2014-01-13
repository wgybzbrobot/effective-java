package cc.pp.chap02.item5;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 * isBabyBoomer()每次调用的时候都会创建一个Calendar、一个TimeZone和两个Date实例。
 * @author wgybzb
 *
 */
public class PersonOne {

	private Date birthDate;

	public boolean isBabyBoomer() {

		Calendar gmtCal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
		gmtCal.set(1946, Calendar.JANUARY, 1, 0, 0, 0);
		Date boomStart = gmtCal.getTime();
		gmtCal.set(1965, Calendar.JANUARY, 1, 0, 0, 0);
		Date boomEnd = gmtCal.getTime();

		return birthDate.compareTo(boomStart) >= 0 && birthDate.compareTo(boomEnd) < 0;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

}
