package arrayGenerator;


/**
 * Uses a more efficient algorithm to randomise the array, a variant of the Fisher-Yates shuffle
 *
 * @author Hugh Osborne
 * @version September 2020
 */

public class CleverRandomListingGenerator extends RandomListingGenerator {
    /**
     * Constructor
     * @param size the size of the listing that will be generated.
     */
    public CleverRandomListingGenerator(int size) {
        super(size);
    }

    /**
     * Randomise the array.
     *
     * The algorithm used is a variant of the Fisher-Yates shuffle:
     * <ul>
     *     <li> For each element of the array
     *     <ul>
     *         <li> Pick another, random element of the array (it doesn't matter if it happens to
     *              the same element</li>
     *         <li> Swap the two elements</li>
     *     </ul></li>
     *     <li> Since this all happens in the main array, it is now randomised</li>
     * </ul>
     */
    protected void randomise() {
        int[] array = getArray();
        for (int index = 0; index < array.length; index++) { // for each entry in the array
            int randomIndex = getRandomIndex();  // pick a random index
            // swap the two entries
            int randomEntry = array[randomIndex];  // make a copy of the random entry
            array[randomIndex] = array[index];  // copy the current entry to the random index
            array[index] = randomEntry;  // overwrite the current entry with the (remembered) random entry
        }
    }
}
