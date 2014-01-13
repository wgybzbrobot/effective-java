package cc.pp.chap02.item5;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 * 改进后的类，日期实例只需要创建一次即可。
 * @author wgybzb
 *
 */
public class PersonTwo {

	private Date birthDate;

	private static final Date BOOM_START;
	private static final Date BOOM_END;

	static {
		Calendar gmtCal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
		gmtCal.set(1946, Calendar.JANUARY, 1, 0, 0, 0);
		BOOM_START = gmtCal.getTime();
		gmtCal.set(1965, Calendar.JANUARY, 1, 0, 0, 0);
		BOOM_END = gmtCal.getTime();
	}

	public boolean isBabyBoomer() {
		return birthDate.compareTo(BOOM_START) >= 0 && birthDate.compareTo(BOOM_END) < 0;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

}
