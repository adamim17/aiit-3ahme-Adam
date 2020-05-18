package ue03_objects;

/**
 *
 * @author mike
 */
public class TestPerson 
{

    public TestPerson () 
    {
        Person p1 = new Person("Donald", "Trump");
        //Person p2 = new Person("Boris", "Johnson");
        Person p3 = p1.clone();
        System.out.println("1: " + p1 + " " + p3);
        //System.out.println(p2);
        //p3.setFirstname("Boris");
        System.out.println("2: " + p1 + " " + p3);

        System.out.println("3: " + (p1 == p3));
        System.out.println("4: " + (p1.equals(p3)));
        System.out.println("----------------------");
        System.out.println("5: " + p1.hashCode());
        System.out.println("6: " + p3.hashCode());
    }
    
    public static void main (String[] args) 
    {
        new TestPerson();
    }
}
