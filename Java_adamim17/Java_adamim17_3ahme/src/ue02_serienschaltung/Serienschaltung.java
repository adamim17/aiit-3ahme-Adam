/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ue02_serienschaltung;

/**
 *
 * @author mike
 */

public class Serienschaltung {
    private double strom;
    private double spannung;
    private double[] widerstandFeld;

    public void updateSpannung() 
    {
        if (widerstandFeld == null)
        {
            spannung = 0;
        } else {
            for (int i = 0; i < widerstandFeld.length; i++)
            {
                spannung += strom*widerstandFeld[i];
            }
        }
    }

    public void addWiderstand(double widerstandInOhm) throws InvalidResistorValueException //throws InvalidResistorValueException
    {
        if(widerstandInOhm < 0 || widerstandInOhm > 10E6)
        {
            throw new InvalidResistorValueException (widerstandInOhm);
        }
        
        if(widerstandFeld == null)
        {
            widerstandFeld = new double[1];
            widerstandFeld[0] = widerstandInOhm;
        } else 
        {
           final double[] tmp;
            tmp = new double[widerstandFeld.length + 1];
            for(int i = 0; i < widerstandFeld.length; i++)
            {
                tmp[i] = widerstandFeld[i];
            }
            tmp[tmp.length - 1] = widerstandInOhm;
            widerstandFeld = tmp;
        }
        updateSpannung();
    }

    public double getStrom() 
    {

       return strom; 
    }

    public void setStrom(double strom) 
    {
        this.strom = strom;
        updateSpannung();
    } 

    public double getSpannung() 
    {

        return spannung;
    }

    @Override
    public String toString() 
    {
        return "Serienschaltung{" + "strom=" + strom + ", spannung=" + spannung + ", widerstand=" + widerstandFeld + '}';
    }
}
