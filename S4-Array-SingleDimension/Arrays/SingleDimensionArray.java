import java.util.Arrays;

/** 
 * 1. insert into an Array
 * 2. Traverse an Array
 * 3. Delete Array
 * 4. Search for an element in an Array
 * 
 */
public class SingleDimensionArray {
    int arr[] = null;

    public SingleDimensionArray(int sizeOfArray) {
        arr = new int[sizeOfArray];
        for (int i = 0; i < arr.length; i++){
            arr[i] = Integer.MIN_VALUE;
        }
    }

    // Insert into the array
    public void insert(int location, int valueToInsert){
        try {
            if (arr[location] == Integer.MIN_VALUE){
                arr[location] = valueToInsert;
                System.out.println("Successfully inserted");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index to access array" + e);
        }

    }

    // Traverse the array
    public void arrayTraversal(){
        try {
            for (int i = 0; i< arr.length; i++){
                System.out.println(arr[i] + " ");
            }
        } catch (Exception e) {
            System.out.println("No element in the array");
        }
    }

    // Search for an element in the array
    public void arraySearch(int element){
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == element){
                System.out.println("Element " + element + " found at index " + i);
                return;
            }
        }
        System.out.println("Element " + element + " not found in the array");

    }

    // Delete an element from the array
    public void deleteItem(int deleteIndex){
        try {
            arr[deleteIndex] = Integer.MIN_VALUE;
            System.out.println("Successfully deleted element at index " + deleteIndex);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Provided index is out of array range");
        }
    }

    @Override
    public String toString(){
        return arr.toString();
    }
    public static void main(String[] args) {
        SingleDimensionArray singleDimensionArray = new SingleDimensionArray(5);
        singleDimensionArray.insert(0, 1);
        singleDimensionArray.insert(1, 2);
        singleDimensionArray.insert(2, 3);
        singleDimensionArray.insert(3, 4);
        singleDimensionArray.insert(4, 5);

        singleDimensionArray.arrayTraversal();

        singleDimensionArray.arraySearch(3);

        singleDimensionArray.deleteItem(3);

        System.out.println(Arrays.toString(singleDimensionArray.arr));
    }
}