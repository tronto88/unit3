package searcher;

import java.util.Arrays;

/**
 * A stub class.  CleverSearcher should be implemented here.
 */
public class CleverSearcher extends Searcher {
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
    public int findElement() throws IndexingError {
        int[] array = getArray();
        int k = getIndex();
        int[] aux_Array = array[1];

        return 0;
    } // end of clever solution method
}
