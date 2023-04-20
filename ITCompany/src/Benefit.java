import java.util.Date;

public class Benefit {
    private String name = "";
    private String vendor = "";
    private float monetaryLimit = 0;
    private Date ExpiryDate;
    public String getName()
    {
        return this.name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
    public String getVendor()
    {
        return this.vendor;
    }

    public void setVendor(String vendor)
    {
        this.vendor = vendor;
    }

    public float getMonetaryLimit()
    {
        return this.monetaryLimit;
    }

    public void setMonetaryLimit(float monetaryLimit)
    {
        this.monetaryLimit = monetaryLimit;
    }
    public Date getExpiryDate()
    {
        return this.ExpiryDate;
    }

    public void setExpiryDate(Date ExpiryDate)
    {
        this.ExpiryDate = ExpiryDate;
    }

    public String getDetails(){
       return  this.name + " "+ this.vendor + this.ExpiryDate + " ";
    }
}
