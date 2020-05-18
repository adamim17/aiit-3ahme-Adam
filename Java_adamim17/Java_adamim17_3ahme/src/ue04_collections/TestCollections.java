
package ue04_collections;

/**
 *
 * @author mike
 */
public class TestCollections 
{
    public TestCollections ()
    {
        Double x1 = 3.14;
        Double x2 = 3.14;
        System.out.println("1: x1 == x2 => " + (x1 == x2));
        System.out.println("1: x1 equals x2 => " + (x1.equals(x2)));
    }
    
    public static void main (String[] args) 
    {
        new TestCollections();
    }
}
