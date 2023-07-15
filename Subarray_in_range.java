package Subarrays_in_the_range;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Subarray_in_range{
	public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the size of the array !!!");
        int size=scanner.nextInt();

        int array[]=new int[size];
        System.out.println("Enter the Array Elements !!!");
        for(int i=0;i<size;i++){
            array[i]=scanner.nextInt();
        }

        System.out.println("Enter the start index");
        int start=scanner.nextInt();

        System.out.println("Enter the end index");
        int end=scanner.nextInt();
        scanner.close();
        System.out.println("Sub Array in the given range is :\n"+SubArrayRange(array,size,start,end));

    }

    private static List<Integer> SubArrayRange(int[] array, int size, int start, int end) {
        List<Integer> subArray=new ArrayList<Integer>();
        for(int iterator=start;iterator<=end;iterator++){
            subArray.add(array[iterator]);
        }
        return subArray;
    }
}