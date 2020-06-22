package ue06;

/**
 *
 * @author mike
 */
public class Coil extends Component
{
    public Coil (double value)
    {
        super("L:", value);
    }
    
    public Coil (String id, double value)
    {
        super(id, value);
        
        if(id.startsWith("L"))
        {
            throw new IllegalArgumentException("Fehler, ungültige ID");
        }
    }

    @Override
    public String unit () 
    {
        return "TODO1";
    }

    @Override
    public double energy () 
    {
        return getValue() * getCurrent() * getCurrent() / 2;
    }
    
}
