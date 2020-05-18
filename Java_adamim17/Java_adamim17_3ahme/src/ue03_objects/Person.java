package ue03_objects;

import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mike
 */
public class Person extends Object implements Cloneable
{
    private String firstname;
    private final String surname;

    public Person (String firstname, String surname) 
    {
        if(firstname == null || firstname.isEmpty())
        {
            throw new IllegalArgumentException("invalid firstname");
        }
        
        if(surname == null || surname.isEmpty())
        {
            throw new IllegalArgumentException("invalid surname");
        }
        this.firstname = firstname;
        this.surname = surname;
    }

    public String getFirstname () 
    {
        return firstname;
    }

    public void setFirstname (String firstname) {
        this.firstname = firstname;
    }
    
    public String getSurname () 
    {
        return surname;
    }

    @Override
    public String toString () 
    {
        return surname + " " + firstname;
    }

    @Override
    public Person clone () 
    {
        try 
        {
        //return new Person(firstname, surname);
        return (Person)super.clone(); //To change body of generated methods, choose Tools | Templates.
        } catch (Exception ex) 
        {
            throw new RuntimeException(ex);
        }
    } 

    @Override
    public boolean equals (Object obj) 
    {
        if (this == obj)
        {
            return true;
        }
        if (obj == null)
        {
            return false;
        }
        final Person other = (Person)obj;
        if (!Objects.equals(firstname, other.firstname))
        {
            return false;
        }
        if (!Objects.equals(surname, other.surname))
        {
            return false;
        }
        return true;                
    }   

    @Override
    public int hashCode () 
    {
        int hc = firstname.hashCode();
        hc = hc * 59 + surname.hashCode();
        return hc;
    }    
}
