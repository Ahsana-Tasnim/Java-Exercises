package assignment5;

/**
 * A set of temperature readings for one day.
 */
public class DailyTemperature {

    private SimpleDate date;
    private int high;
    private int low;

    /**
     * Constructs a new DailyTemperature object if possible.
     *
     * @param date the date of this object
     * @param high the high temperature for the day
     * @param low the low temperature for the day
     * @throws TemperatureException if the high is less than the low
     */
    public DailyTemperature(SimpleDate date, int high, int low) throws TemperatureException{
        if(high < low){
            throw new TemperatureException("Invalid Temp");
        }
        this.date = date;
        this.high = high;
        this.low = low;
    }

    public SimpleDate getDate() {
        return date;
    }

    public int getHigh() {
        return high;
    }

    public int getLow() {
        return low;
    }

    public String format() {
        return date.format() + ": high = " + high + ", low = " + low;
    }

} // end class DailyTemperature
