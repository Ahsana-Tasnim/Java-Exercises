package assignment5;

/**
 * A simple date consisting of year, month, and day.
 */
public class SimpleDate {

    private int year;
    private int month;
    private int day;

    /**
     * Constructs a new Date object if possible.
     *
     * @param year
     * @param month
     * @param day
     * @throws SimpleDateException if the year, month, or day is invalid
     */
    public SimpleDate(int year, int month, int day) throws SimpleDateException {
        if(year < 1){
            throw new SimpleDateException("Invalid Year");
        }
        if(month < 1 || month > 12){
            throw new SimpleDateException("Invalid Month");
        }
        if(day < 1 || day > 31){
            throw new SimpleDateException("Invalid day");
        }
        if(month == 4 || month == 9 || month == 11){
            if(day > 30){
                throw new SimpleDateException("Invalid day");
            }
        }
        if(month == 2){
            if(day > 28 + (isLeapYear() ? 1 : 0)){
                throw new SimpleDateException("Invalid day");
            }
        }
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public String format() {
        return year + "-" + month + "-" + day;
    }
    
    private boolean isLeapYear(){
        boolean res;
        
        if(year % 400 == 0){
            res = true;
        }
        else if(year % 100 == 0){
            res = false;
        }
        else if(year % 4 == 0){
            res = true;
        }
        else{
            res = false;
        }
        return res;
    }

} // end class SimpleDate
