package hw10;

public class hw1 {
    public static void main(String[] args) {
        Time time = new Time();
        System.out.println(time);
    }

}

class Time {
    private long hour;
    private long minute;
    private long second;

    public Time() {
        long l = System.currentTimeMillis() / 1000;
        this.hour = (l / 60 / 60) % 24;
        this.minute = (l / 60) % 60;
        this.second = l % 60;
    }

    public void setTime(long elapseTime) {
        elapseTime /= 1000;
        this.hour = (elapseTime / 60 / 60) % 24;
        this.minute = (elapseTime / 60) % 60;
        this.second = elapseTime % 60;
    }

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    /**
     * 获取
     *
     * @return hour
     */
    public long getHour() {
        return hour;
    }

    /**
     * 设置
     *
     * @param hour
     */
    public void setHour(long hour) {
        this.hour = hour;
    }

    /**
     * 获取
     *
     * @return minute
     */
    public long getMinute() {
        return minute;
    }

    /**
     * 设置
     *
     * @param minute
     */
    public void setMinute(long minute) {
        this.minute = minute;
    }

    /**
     * 获取
     *
     * @return second
     */
    public long getSecond() {
        return second;
    }

    /**
     * 设置
     *
     * @param second
     */
    public void setSecond(long second) {
        this.second = second;
    }

    public String toString() {
        return "Time{hour = " + hour + ", minute = " + minute + ", second = " + second + "}";
    }
}
