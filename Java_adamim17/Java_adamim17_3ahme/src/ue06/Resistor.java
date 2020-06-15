package ue06;
/**
 *
 * @author mike
 */
public class Resistor extends Component
{
    public double value;
 
    public Resistor (double value)
    {
        super(id, 0.0, voltage, current);
        this.value = value;
    }

    public Resistor( String id, double value, double voltage, double current) 
    {
        super(id, value, voltage, current);
        this.value = value;
    }

    public void setVoltage (double voltage) 
    {
        this.voltage = voltage;
    }

    public void setCurrent (double current) 
    {
        this.current = current;
    }
    
    @Override
    public String unit()
    {
        return "U+2126";
    }
    
    public double energy ()
    {
        return 0;
    }
}
