/**
 * @author Tlou Maponya
 */
public class MyTime {

    int hour, minute;

    /**
     * no-args constructor
     */
    public MyTime(){}

    /**
     * constructor that has three integer arguments (parameters)
     * @param hh
     * @param mm
     */
    public MyTime(int hh, int mm){
        setTime(hh, mm);
    }

    public void setTime(int hh, int mm){
        hour = hh;
        minute = mm;
    }

    public String toString() {
        return hour + ":"+ minute;
    }


}
