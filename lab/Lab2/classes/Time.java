public class Time {
    
    public static void main(String[] args) {

        Time time2 = new Time(555550000);
        Time time = new Time();

        System.out.println(time.toString());
        System.out.print("\n");
        
        System.out.printf("%d:%d:%d%n%n",
                time.getHour(),
                time.getMinute(),
                time.getSecond());

        System.out.println(time2.toString());
        System.out.print("\n");

        System.out.printf("%d:%d:%d%n%n",
                time2.getHour(),
                time2.getMinute(),
                time2.getSecond());

        time2.setTime(2432423534L);
        System.out.printf("%d:%d:%d%n%n",
                time2.getHour(),
                time2.getMinute(),
                time2.getSecond());
    }

    private int hour;
    private int minute;
    private int second;
    private long myTime;

    public Time(int _hour, int _minute, int _second) {
        this.hour = _hour;
        this.minute = _minute;
        this.second = _second;
    }

    public Time() {
        myTime = System.currentTimeMillis();
    }

    public Time(long time) {
        myTime = time;
    }

    public void setTime(long elapsedTime) {
        myTime = elapsedTime;
    }

    public int getHour() {
        return (int) (myTime / (1000 * 60 * 60)) % 24;
    }

    public int getMinute() {
        return (int) (myTime / (1000 * 60)) % 60;
    }

    public int getSecond() {
        return (int) (myTime / 1000) % 60;
    }

    
    /** 
     * @param o
     * @return boolean
     */
    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Time)) {
            return false;
        }
        Time time = (Time) o;
        return hour == time.hour && minute == time.minute && second == time.second && myTime == time.myTime;
    }

    
    /** 
     * @return String
     */
    @Override
    public String toString() {
        return "{" +
                " hours='" + getHour() + "'" +
                ", minutes='" + getMinute() + "'" +
                ", seconds='" + getSecond() + "'" +
                "}";
    }

}