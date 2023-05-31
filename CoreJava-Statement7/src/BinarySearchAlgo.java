import  java.util.*;

class BinarySearchAlgo{

    public static void main(String args[]){

        int sortedArray[] = {1,7,9,11,16,18,21,27,31,36,88};
        System.out.println("The input array is: " + Arrays.toString(sortedArray));

        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the key to be Searched");
        int key = sc.nextInt();

        int first = 0;
        int last=sortedArray.length-1;
        int mid = (first + last)/2;


        while( first <= last ){
            if ( sortedArray[mid] < key ){
                first = mid + 1;
            }else if ( sortedArray[mid] == key ){
                System.out.println("Element is found at index: " + mid);
                break;
            }else{
                last = mid - 1;
            }
            mid = (first + last)/2;
        }

        if ( first > last ){
            System.out.println("Element is not found!");
        }

    }

}