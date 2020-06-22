package ue06;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
 
/**
 *
 * @author mike
 */
public class SerialCircuit extends Component
{
    private final List<Component> components = new ArrayList<>();
    private double current;
    
public SerialCircuit(Collection<Component> components)
    {
        this.components.addAll(components);
        setCurrent(0.0);
    }

    public boolean add(Component c)
    {
        return components.add(c);
    }

    @Override
    public String unit () {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double energy () {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
