package ue06;

/**
 *
 * @author mike
 */
public abstract class Component 
{
    private final String id;
    private final double value;
    private double voltage;
    private double current;

    public Component (String id, double value) 
    {
        this.id = id;
        this.value = value;
       
        if(value < 0)
        {
            throw new IllegalArgumentException("der Wert ist kleiner 0");
        }
    }
  
    public String getId () 
    {
        return id;
    }

    public double getValue () 
    {
        return value;
    }

    public double getVoltage () 
    {
        return voltage;
    }

    public void setVoltage (double voltage) 
    {
        this.voltage = voltage;
    }

    public double getCurrent () 
    {
        return current;
    }

    public void setCurrent (double current) 
    {
        this.current = current;
    }

    public double power ()
    {
        return this.current * this.voltage;
    }
    
    public String formattedValue ()
    {
        return toString();
    }

    @Override
    public String toString () {
        return "Component{" + "id=" + id + ", value=" + value + ", voltage=" + voltage + ", current=" + current + '}';
    }  
    
    public abstract String unit();
    
    public abstract double energy();
} 

