package ue05_koerpergruppen;

import java.util.Locale;
/**
 *
 * @author mike
 */
public class Kugel extends Koerper
{
    private double r;

    public Kugel (double r)
    {
        super(0.0);
        if(r <= 0)
        {
            throw new IllegalArgumentException("invalid parameter r");
        }
        this.r = r;
    }
       
    public Kugel(double r, double dichte) 
    {
        super(dichte);
        this.r = r;
    }

    public double getR() 
    {
        return r;
    }

    public void setR(double r) 
    {
        this.r = r;
    }
   

    @Override
    public double oberfläche () 
    {
       return 4 * Math.PI * r * r; 
    }

    @Override
    public double volumen () 
    {
        return (4/3) * Math.PI * r * r * r;
    }

    @Override
    public String toString () {
        return String.format(Locale.ENGLISH, "{\"r\":%e\"dichte\":%e", r, dichte);
    }  
}

