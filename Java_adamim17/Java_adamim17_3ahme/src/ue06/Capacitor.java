package ue06;

/**
 *
 * @author mike
 */
public class Capacitor extends Component
{
    public double value;

    public Capacitor (String id, double value, double voltage, double current) 
    {
        super(id, value, voltage, current);
        this.value = value;
    }
    
}
