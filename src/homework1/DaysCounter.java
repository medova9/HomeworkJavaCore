package homework1;

class DaysCounter {
    private static final int DEFAULT_HOURS_VALUE = 24;
    private static final int DEFAULT_MINUTES_VALUE = 60;
    private static final int DEFAULT_SECONDS_VALUE = 60;
    private int days;
    private int hours;
    private int minutes;
    private int seconds;

    DaysCounter(int days) {
        this.days = days;
        count();
    }

    int getDays() {
        return days;
    }

    int getHours() {
        return hours;
    }

    private void setHours(int hours) {
        this.hours = hours;
    }

    int getMinutes() {
        return minutes;
    }

    private void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    int getSeconds() {
        return seconds;
    }

    private void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    private void count() {
        setHours(days * DEFAULT_HOURS_VALUE);
        setMinutes(hours * DEFAULT_MINUTES_VALUE);
        setSeconds(minutes * DEFAULT_SECONDS_VALUE);
    }


}
