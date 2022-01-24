package edu.kis.vh.nursery;

/**
 * Implementacja klasy
 *
 */
public class DefaultCountingOutRhymer {

    private static final int NUMBERS_SIZE = 12;
    private static final int TOTAL_VAL = -1;
    private static final int CALL_CHECK_RETURN_VAL = -1;

    private int total = TOTAL_VAL;
    private final int[] numbers = new int[NUMBERS_SIZE];
    //tablica numbers została zmieniona na final podczas poprzednich laboratoriów
    /**
     *
     * @return stack total value
     */
    public int getTotal() {
        return total;
    }
    /**
     * adding element to stack
     * @param in value to put on the stack
     */
    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }
    /**
     * check if stack is empty
     * @return true is empty, false not empty
     */
    public boolean callCheck() {
        return total == TOTAL_VAL;
    }
    /**
     * check if stack is full
     * @return true is full, false not full
     */
    public boolean isFull() {
        return total == 11;
    }
    /**
     *getting stack top
     * @return last element of stack
     */
    protected int peekaboo() {
        if (callCheck())
            return CALL_CHECK_RETURN_VAL;
        return numbers[total];
    }
    /**
     * deleting stack top
     * @return last element of stack
     */
    public int countOut() {
        if (callCheck())
            return CALL_CHECK_RETURN_VAL;
        return numbers[total--];
    }

}
