package _algorithm._greedy;

import java.util.Arrays;
import java.util.Scanner;

public class MultiOrPlus {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        
        // System.out.println(input.charAt(0));
        int[] arr = new int[input.length()];
        for(int i=0; i<input.length(); i++){
            // arr[i] = input.charAt(i) - '0';
            arr[i] = Character.getNumericValue(input.charAt(i));
        }

        Arrays.sort(arr);
        int result = 1;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > 0){
                result = result * arr[i];
            }else{
                result = result + arr[i];
            }
        }

        System.out.println(result);
    }
}
