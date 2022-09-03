package assignment5;

import java.util.List;

/**
 * A weather history is a series of daily temperature readings for a certain location.
 */
public class WeatherHistory {

    private Location location;
    private List<DailyTemperature> records;

    /**
     * Constructs a new WeatherHistory object.
     * 
     * @param location the location of the temperature history
     * @param records a series of temperature readings on different dates
     */
    public WeatherHistory(Location location, List<DailyTemperature> records) {
        this.location = location;
        this.records = records;
    }

    public String format() {
        String res = location.format() + "\n";
        res += "\n";
        for (DailyTemperature dt : records) {
            res += dt.format() + "\n";
        }
        return res;
    }

    public Location getLocation() {
        return location;
    }

    public List<DailyTemperature> getRecords() {
        return records;
    }
} // end class WeatherHistory
