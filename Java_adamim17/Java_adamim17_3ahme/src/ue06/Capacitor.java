package ue06;

/**
 *
 * @author mike
 */
public class Capacitor extends Component
{
   public Capacitor (double value)
   {
       super ("C:", value);
   }

    public Capacitor (String id, double value) 
    {
        super(id, value);
        
        if(id.startsWith("C"))
        {
           throw new IllegalArgumentException("Fehler, ungültige ID");
        }
    }

    @Override
    public String unit () 
    {
        return "TODO";
    }

    @Override
    public double energy () 
    {
        return getValue() * getVoltage() * getVoltage() / 2;
    }
    
}
