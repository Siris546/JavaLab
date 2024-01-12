
package lab1c;
public class Lab1c {

    public static void main(String[] args) {
        int sum = 0, max, min;
        int arr[]=new int[]{54,32,56,73,31};
        max = arr[0];
        min= arr[0];
        for(int i = 0; i<arr.length; i++){
            sum += arr[i];
            if(arr[i]>max){
                max = arr[i];
            }
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("Sum of the array elements is: "+ sum);
        System.out.println("Maximum of the array elements is: "+ max);
        System.out.println("MMinimum of the array elements is: "+ min);
        
    }
}
