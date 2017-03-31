package DataStructureProject.Domain;

import java.io.Serializable;

/**
 * Created by L.z Double E on 3/31/2017.
 */
public class Quotation implements Serializable {

    private String partNo;
    private String Descr;
    private int itemQuantity;
    private double itemPrice;

    public Quotation(String partNumber, String description, int quantity, double price)
    {
        this.partNo = partNumber;
        this.Descr = description;
        this.itemQuantity = quantity;
        this.itemPrice = price;
    }

    public void setPartNo(String no)
    {
        this.partNo = no;
    }

    public void setDescr(String partDescription)
    {
        this.Descr = partDescription;
    }

    public void setitemQuantity(int count)
    {
        if (count >= 0)
            itemQuantity = count;
        else
            throw new IllegalArgumentException("Quantity must be > 0");
    }

    public void setItemPrice(double price)
    {
        if (price >= 0.0)
            itemPrice = price;
        else
            throw new IllegalArgumentException("Price must be > 0");
    }

    public String getPartNo()
    {
        return partNo;
    }

    public String getDescr()
    {
        return Descr;
    }

    public int getitemQuantity()
    {
        return itemQuantity;
    }

    public double getItemPrice()
    {
        return itemPrice;
    }

    @Override
    public String toString()
    {
        return "Part number: " + getPartNo() + "\n" + "Description: " + getDescr() + "\n" + "Quantity: " + getitemQuantity() + "\n" + "Price: " + getItemPrice() + "\n";
    }
    public double getAmount()
    {
        return  itemQuantity * itemPrice;
    }

}
