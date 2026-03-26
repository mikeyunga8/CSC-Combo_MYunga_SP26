public class Time {
	// instance variables
	private int hour;
	private int minute;
	private double second;

	public Time() {
		this.hour = 0;
		this.minute = 0;
		this.second = 0.0;

	}
	// value constructor

	public Time(int hour, int minute, double second) {
		super();
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	public static Time add(Time t1, Time t2) {
		Time sum = new Time();
		sum.hour = t1.hour + t2.hour;
		sum.minute = t1.minute + t2.minute;
		sum.second = t1.second + t2.second;

		if (sum.second > 60.0) {
			sum.minute++;
			sum.second -= 60.0;
		}
		if (sum.minute > 60) {
			sum.hour++;
			sum.minute -= 60;
		}
		if (sum.hour > 24) {
			sum.hour %= 24;
		}
		return sum;
	}

	public boolean equals(Time that) {
		final double DELTA = 0.001;
		if (this.hour != that.hour)
			return false;
		if (this.minute != that.minute)
			return false;
		if (Math.abs(this.second - that.second) > DELTA)
			return false;
		return true;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public double getSecond() {
		return second;
	}

	public void setSecond(double second) {
		this.second = second;
	}

	@Override
	public String toString() {
		return hour + ":" + minute + ":" + second;
	}

}
