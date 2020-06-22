package ue06;
/**
 *
 * @author mike
 */
public class Resistor extends Component
{
    public Resistor (double value)
    {
        super("R:", value);
    }

    public Resistor( String id, double value) 
    {
        super(id, value);
        
        if(id.startsWith("R"))
        {
            throw new IllegalArgumentException("Fehler, ungültige ID");
        }
    }

    public void setVoltage (double voltage) 
    {
        setVoltage(getCurrent() * getValue());
    }

    public void setCurrent (double current) 
    {
        setVoltage(getVoltage() / getValue());
    }
    
    @Override
    public String unit()
    {
        return "U+2126";
    }
    
    @Override
    public double energy ()
    {
        return 0;
    }
}
