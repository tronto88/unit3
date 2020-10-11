package timer.searcher;

import arrayGenerator.CleverRandomListingGenerator;
import main.java.arrayGenerator.ArrayGenerator;
import searcher.IndexingError;
import searcher.CleverSearcher;
import timer.timer.Timer;

/**
 * A main.java.timer implementation for clever searchers that times the findElement method
 *
 * @author Hugh Osborne
 * @version September 2020
 */

public class CleverSearcherTimer extends CleverSearcher implements Timer {

    // All timings will be done with an index of 5
    private final static int K = 5;

    private CleverSearcherTimer(int[] array) throws IndexingError {
        super(array, K);
    }

    /**
     * We are timing CleverSearchers.
     *
     * @param size the size of the task to be timed.
     * @return a CleverSearcher of the required size.
     */
    @Override
    public Timer getTimer(int size) throws IndexingError {
        ArrayGenerator generator = new CleverRandomListingGenerator(size);
        return new CleverSearcherTimer(generator.getArray());
    }

    /**
     * We are timing the findElement() method.
     */
    @Override
    public void timedMethod() {
        try {
            findElement();
        } catch (IndexingError indexingError) {
            // simply ignore indexing errors here
            // with K at 5, and a minimum task size (array size) of 10, indexing errors should not occur
            // during timing
        }
    }

    /**
     * Cease timing when the runtime exceeds 5 seconds.
     *
     * @return 5 seconds as the maximum runbtime.
     */
    @Override
    public long getMaximumRuntime() {
        return 5;
    }

    /**
     * Minimum task size (array size) is set to ten, to avoid indexing errors (index is always five).
     * @return minimum task size of ten
     */
    @Override
    public int getMinimumTaskSize() {
        return 10;
    }

    /**
     * Cease timing when the array size exceeds 10^9
     *
     * @return 10^9 as the maximum array size.
     */
    @Override
    public int getMaximumTaskSize() {
        return 1000000000;
    }

    /**
     * Run the sequence of timings specified by the methods above.
     *
     * @param args not usually used
     * @throws IndexingError should not happen
     */
    public static void main(String[] args) throws IndexingError {
        CleverSearcherTimer timer = new CleverSearcherTimer(new int[K]);
        timer.timingSequence();
    }
}
