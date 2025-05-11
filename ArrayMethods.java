/********************************************
*	AUTHOR:	<name>
* COLLABORATORS: <names>
*	COURSE:	CS 111 Intro to CS I - Java
*	LAST MODIFIED: <date>
********************************************/

/********************************************
*	ArrayMethods
*********************************************
*	PROGRAM DESCRIPTION:
*	Collection of useful methods for int arrays.
*********************************************
*	ALGORITHM:
*	PSUEDOCODE:
-start
Descriptions
  String:
  -String result = "{ " + a[0];
    for(int i = 1; i < a.length; i++) {
      result += ", " + a[i];
    }
     result += " }";
    return result;
  Swap:
  -int temp = array[a];
    array[a] = array[b];
    array[b] = temp;
  Index of Minimum: 
  -int minValue = array[startIndex];
    int minIndex = startIndex;
    for(int i = startIndex+1; i < array.length; i++) {
      if(minValue > array[i]) {
        minValue = array[i];
        minIndex = i;
      }
    }
    return minIndex;
  Reverse:
  -for(int i = 0; i < array.length/2; i++) {
      ArrayMethods.swap(array, i, array.length-1-i);
    }
  Selection Sort:
  -for(int i = 0; i < array.length-1; i++) {
      int indexMinValue = ArrayMethods.indexOfMin(array, i);
    ArrayMethods.swap(array, i, indexMinValue);
    }

*********************************************

/* UML CLASS DIAGRAM:
-----------------------------------------
ArrayMethods
-----------------------------------------
-----------------------------------------
+ arrayString(array : int[]) : String //static
+ swap(array : int[], a : int, b : int) : void //static
+ indexOfMin(array : int[], startIndex : int) : int //static
+ reverse(array : int[]) : void //static
+ selectionSort(array : int[]) : void //static
-----------------------------------------
*/

public class ArrayMethods 

{
  /**DESCRIPTION: */
  public static String arrayString(int[] a)
  {
    String result = "{ " + a[0];

   

    for(int i = 1; i < a.length; i++) {
      result += ", " + a[i];
    }
     result += " }";

    return result;
  }
  
  /**DESCRIPTION: */
  public static void swap(int[] array, int a, int b)
  {
    int temp = array[a];
    array[a] = array[b];
    array[b] = temp;
  }
	
	/**DESCRIPTION: */
  public static int indexOfMin(int[] array, int startIndex)
   
  {
   

    int minValue = array[startIndex];
    int minIndex = startIndex;

    for(int i = startIndex+1; i < array.length; i++) {
      if(minValue > array[i]) {
        minValue = array[i];
        minIndex = i;
      }
    }
    return minIndex;

  }
  
   

	/**DESCRIPTION: */
  public static void reverse(int[] array)
  {
    for(int i = 0; i < array.length/2; i++) {
      ArrayMethods.swap(array, i, array.length-1-i);
    }

  }

	/**DESCRIPTION: */
  public static void selectionSort(int[] array)
  {

    for(int i = 0; i < array.length-1; i++) {
      int indexMinValue = ArrayMethods.indexOfMin(array, i);
    ArrayMethods.swap(array, i, indexMinValue);
    }
  }

}