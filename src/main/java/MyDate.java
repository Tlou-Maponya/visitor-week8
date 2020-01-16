/**
 * @author Tlou Maponya
 */
public class MyDate {

    int day,
            month,
            year;

    /**
     * no-args constructor
     */
    public MyDate(){}

    /**
     * constructor that has three integer arguments (parameters)
     * @param d
     * @param m
     * @param y
     */
    public MyDate(int d, int m, int y){
        setDate(d, m, y);
    }

    public void setDate(int d, int m, int y){
        day = d;
        month = m;
        year = y;
    }

    public String toString() {
        return month + "/"+ day + "/" + year;
    }
}
