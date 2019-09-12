/*
Helen Li
February 11, 2019
*/

public class Set_Demo
{
    public static void main(String[] args)
    {
        // Create a set using an array
        int [] arr1 ={1,2,3,4,2,4};
        Set firstSet = new Set(arr1);
        firstSet.displaySet();
        System.out.println("setArray length = "+firstSet.getLength());
        
        // Add numbers entered by the user eg: 1 5 3 6 8 2 9 0 -1
        firstSet.populate();
        System.out.println("firstSet size = "+ firstSet.getLength());
        firstSet.displaySet();
        
        // Use the copy constructor
        System.out.println("\nDemonstrating copy constructor");
        Set myCopySet = new Set(firstSet);
        myCopySet.displaySet();

        System.out.println("\nDemonstrating union of two sets");
        int [] arr2 ={5,2,6,4,9,4,33};
        Set secondSet = new Set(arr2);
        firstSet.displaySet();
        secondSet.displaySet();
        Set unionSet = firstSet.union(secondSet);
        unionSet.displaySet();
        
        System.out.println("\nDemonstrating intersection of two sets");
        Set intersectSet = firstSet.intersection(secondSet);
        intersectSet.displaySet();
        
        System.out.println("\nDemonstrating firstSet.difference(secondSet)");
        Set diffSet = firstSet.difference(secondSet);
        diffSet.displaySet();
        System.out.println("\nDemonstrating secondSet.difference(firstSet)");
        diffSet = secondSet.difference(firstSet);
        diffSet.displaySet();

        System.out.println("\nDemonstrating firstSet.equals(secondSet)");
        if(firstSet.equals(secondSet))
            System.out.println("They are equal");
        else
            System.out.println("They are NOT equal");
            
        System.out.println("\nDemonstrating clone of firstSet.equals(firstSet)");
        Set cloneSet = new Set(firstSet);
        if(cloneSet.equals(firstSet))
            System.out.println("They are equal");
        else
            System.out.println("They are NOT equal");
        
        System.out.println("\nChecking if 9 and 3 are elements of firstSet");
        int n=9;
        if (firstSet.isElement(n))
            System.out.println(n+" is an element");
        else
            System.out.println(n+" is NOT an element");
        n=3;
        if (firstSet.isElement(n))
            System.out.println(n+" is an element");
        else
            System.out.println(n+" is NOT an element");
    }
}
