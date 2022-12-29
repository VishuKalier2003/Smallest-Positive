/* Given an unsorted Integer Array nums return the smallest positive integer... You must implement an algorithm that runs in O(n) time and takes extra constant space... 
 * Eg 1:  [1, 2, 0]            Output = 3
 * Eg 2: [3, 4, -1, 1]         Output = 2
 * Eg 3: [7, 8, 9, 11, 12]     Output = 1
*/
import java.util.Scanner;
import java.util.Vector;
public class Smallest 
{
    public int FindSmallest(Vector<Integer> v, int arr[])
    {
        for(int i = 0; i < arr.length; i++)
        {
            if(v.contains(arr[i]))     // If the vector is present in the vector array...
            {
                int index = v.indexOf(arr[i]);    // Getting the index of the element...
                v.remove(index);      // Removing the vector at the given index...
            }
            System.out.println("The Current Vector list : "+v);
        }
        return v.elementAt(0);
    }
    public static void main(String[] args)
    {
        Vector<Integer> vector = new Vector<Integer>();          // Integer vector created...
        int x, a;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array : ");
        x = sc.nextInt();
        int array[] = new int[x];
        for(int i = 0; i < x; i++)
        {
            System.out.print("Enter data : ");
            a = sc.nextInt();
            array[i] = a;
        }
        System.out.println("The Array formed is : ");
        for(int i = 0; i < x; i++)
            System.out.print(array[i]+", ");
        System.out.println();
        for(int i = 0; i < x; i++)    // Vector created as the set of Natural numbers...
            vector.add(i+1);
        System.out.println("The Vector list formed is : "+vector);
        Smallest smallest = new Smallest();
        System.out.println("The smallest positive : "+smallest.FindSmallest(vector, array));
        sc.close();
    }
}