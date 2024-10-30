import java.util.Date;

public abstract class Insurance {

    private String name;
    private double price;
    private Date start;
    private Date end;

    public abstract void calculate();
}
