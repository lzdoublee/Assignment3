package DataStructureProject.Services.Implementation;

import DataStructureProject.Domain.Quotation;
import DataStructureProject.Services.AmountPayable;

/**
 * Created by L.z Double E on 3/31/2017.
 */
public class AmountPayableImplementation implements AmountPayable{
    public Quotation getAmount()
    {
        Quotation quote = new Quotation("008","brakes",2,3850.69);
        quote.getAmount();
        return quote;
    }
}
