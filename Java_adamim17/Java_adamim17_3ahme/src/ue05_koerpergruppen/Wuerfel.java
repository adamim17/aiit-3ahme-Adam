package ue05_koerpergruppen;

import java.util.Locale;

/**
 *
 * @author mike
 */

    public class Wuerfel extends Koerper
    {
    private double a;
    
    public Wuerfel (double a)
    {
        super(0.0);
        if(a <= 0)
        {
            throw new IllegalArgumentException("invalid parameter a");
        }
        this.a = a;
    }

    public Wuerfel(double a, double dichte) throws IllegalArgumentException
    {
        super(dichte);
        this.a = a;
    }

    public double getA() 
    {
        return a;
    }

    public void setA(double a) 
    {
        this.a = a;
    }

    @Override
    public double oberfläche() 
    {
        return a * a * 6;
    }

    @Override
    public double volumen() 
    {
        return a * a * a;
    } 

    @Override
    public String toString() 
    {
        return String.format(Locale.ENGLISH, "{\"a\":%e,\"dichte\":%e}", a, dichte);
    }
}

