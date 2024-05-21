package assignmentArray;


import java.util.Arrays;

public class A5RotatedArray 
{
	
	static int num[] = {10, 20, 30, 40, 50,60};
    
    // Method for rotation
    static void rotate()
    {
       int x = num[num.length-1], i;
       for (i = num.length-1; i > 0; i--)
          num[i] = num[i-1];
       num[0] = x;
    }
    
    /* Driver program */
    public static void main(String[] args) 
    {
        System.out.println("Given Array is");
        System.out.println(Arrays.toString(num));
        
        rotate();
        
        System.out.println("Rotated Array is");
        System.out.println(Arrays.toString(num));
    }
}
