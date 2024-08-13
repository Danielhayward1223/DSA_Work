import java.util.Scanner;
public class AverageTemperature {
    int arr[] = null;

    public AverageTemperature(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of temps: ");
        int n = input.nextInt();

        arr = new int[n];
        for (int i = 0; i < n; i++){
            System.out.println("Enter the temperature: ");
            arr[i] = input.nextInt();
        }
    }

    // view temperatures in the array
    public void viewTemps(){
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    // calculate the average temperature
    public int getAverage(){
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        return sum / arr.length;
    }

    // Give all the temperatures in the array that are above the average
    public void tempsAboveAverage(int average) {
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > average){
                System.out.println(arr[i] + " is above average.");
            }
        }
    
    }

    public static void main(String[] args) {
        AverageTemperature avgTemp = new AverageTemperature();
        avgTemp.viewTemps();
        System.out.println("Average temperature: " + avgTemp.getAverage());
        avgTemp.tempsAboveAverage(avgTemp.getAverage());
    }
}
