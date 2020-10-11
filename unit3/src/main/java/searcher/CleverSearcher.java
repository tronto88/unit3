package searcher;

import java.util.Arrays;
/**
 * A stub class.  CleverSearcher should be implemented here.
 */
public class CleveSearcher extends Searcher {
    public CleverSearcher(int[] array, int k) throws IndexingError {
        super(array, k);
    }

    /**
     * Find the kth largest element in an array of ints using the "clever"
     * solution from the lecture.
     *
     * <ul>
     *     <li> Create a "helper" array of size k</li>
     *     <li> Sort the helper array</li>
     *     <li> for all the remaining elements of the original array
     *          <ul>
     *              <li> if it's smaller than the smallest element of the helper array, ignore it</li>
     *              <li> otherwise
     *                  <ul>
     *                      <li>throw away the smallest entry in the helper array</li>
     *                      <li>slot the new value into the helper array, maintaining that array's ordering</li>
     *                  </ul>
     *          </ul></li>
     *     <li> Return the smallest entry in the helper array</li>
     * </ul>
     *
     * @return kth largest element of array
     */
    public int findElement() throws IndexingError { // starts subroutine to find largest element in an array, if a problem is round it will identify an exception for an error
        int[] array = getArray(); // uses the getArray function to set an array made up of integers
        int k = getIndex(); // sets a variable for the largest integer in a set location in an array
        int[] aux_Array = array[1]; // set an auxiliary array which takes the first indexed integer from array
        Arrays.sort(array); // sorts the original array variable

        for (int i =0; i< array.length; i++){ // starts a loop, setting the i variable to zero while that variable is less than the array length, adding 1 on each time it loops through
            array[1] = array[i]; // sets the first element of the original array to match whichever iteration it is through the loop so the second time through the first position will be whatever integer was in the second position of the original array
            if(array[1] < aux_Array[1]){ // if the current first element of the first element is less than the first element of the auxiliary array

            }else{ // otherwise
                aux_Array[1] = array[1]; // replace the first element in the auxiliary array with the first element of the original array
            }
        }
        System.out.println("the largest number is "+aux_Array[1]); // once the variable i has cycled through all of the elements and therefore the array length is less than i, it will show the number remaining in the auxiliary array which is the largest number from the original array
        return 0; // ends the program
    } // end of clever solution method
}
