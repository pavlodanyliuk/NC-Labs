package sorters.algorithms;


/**
 * Parent for different methods of sorting
 *
 * @author Pavlo Danyliuk
 *
 * @version 1.0
 */

public abstract class Sorting {

    /**Saved a copy of array*/
    protected int[] array;

    /**Saved a length of array*/
    protected int len;

    /**The sorting name*/
    protected static String name;

    /**
     * Constructor for creating a child object with array
     * @param array array to sort
     *
     */
    public Sorting (int[] array){

        if(array == null){
            len = 0;
            this.array = new int[0];
            return;
        }

        len = array.length;
        this.array = new int[len];
        for(int i = 0; i < array.length; i++){
            this.array[i] = array[i];
        }
        name = "";

    }

    /**
     * Function for swap two elements of the array with  i and j index
     *
     * @param i index of the first element
     * @param j index of the second element
     *
     *@throws ArrayIndexOutOfBoundsException
     *
     *@return
     * */
    protected void swap(int i, int j){
        if(i > len - 1 || i < 0 || j > len - 1 || j < 0){ throw new ArrayIndexOutOfBoundsException(); }
        if(i == j) return;
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }



    @Override
    public String toString() {
        StringBuilder str = new StringBuilder("");
        str.append(name + ":" +'\n');
        str.append("[ ");
        for(int i : array){
            str.append(i + " ");
        }
        str.append("]");
        return str.toString();
    }

    /**
     * Getter for field len
     *
     * @return length of array
     */
    public int getLen() {
        return len;
    }


    /**
     * Getter for field array
     *
     * @return length of array
     */
    public int[] getArray() {
        return array;
    }


    /**
     * Setter for field array
     *
     * @param array will be set like array to sort
     * */
    public void setArray(int[] array) {
        this.array = array;
        len = array.length;
    }

    /**
     * Getter for field name
     *
     * @return name of sorting
     */
    public static String getName() {
        return name;
    }

    /**
     * Setter for field array
     *
     * @param name will be set like name of sorting
     * */
    public static void setName(String name) {
        Sorting.name = name;
    }

    /**
     * The main method
     * <br>To sort the array
     *
     * @return
     * */
    public abstract void sort();

}
