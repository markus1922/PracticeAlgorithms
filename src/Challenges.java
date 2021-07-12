import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Challenges {
    /** Create a function which returns the number of true values there are in an array.*/
    public static int countTrueFalse(boolean[] arr) {
        //look at each piece of the array
        int count = 0;
        // Is each element true or false
        for(boolean each: arr) {
         //count how many are true
            if (each) count ++;
        }
        // then return that count
        return count;
    }

    /** Create a function that takes an array and returns the absolute difference between the biggest and smallest numbers.*/
    public static int differenceMinMax(int[] nums){
        // find the largest and hold it
        Arrays.sort(nums);
        // finding smallest and hold it
        int small=nums[0];
        int big=nums[nums.length-1];
        //return absolute value

        return Math.abs(big - small);
    }

    /**
     * Stutter
     * Write a function that stutters a word as if someone is struggling to read it.
     * The first two letters are repeated twice with an ellipsis ... and space after each,
     * and then the word is pronounced with a question mark ?
     */
    public static String stutter(String str){
        // write your code here
        // you will need to change the return statement
        char[] ch = new char[str.length()];
        for (int i = 0; i < 2; i++ ) {
            ch[i] = str.charAt(i);
        }
        return ch.toString() + "... " + ch.toString() + "... " + str + "?";
    }

    /** Write a function that takes an array of numbers and returns the second largest number.*/
    public static int secondLargestNumber(int[] nums){
        //sort from lowest to highest
        Integer[] descend = new Integer[nums.length];
        for (int i = 0; i < nums.length; i++) {
        descend[i] = nums[i];
        }
        Arrays.sort(descend,Collections.reverseOrder() );
        //find next to largest an return
        return descend[1]  ;
    }

    /**
     FizzBuzz
     Create a function that takes a number as an argument and returns "Fizz", "Buzz" or "FizzBuzz".
     If the number is a multiple of 3 the output should be "Fizz".
     If the number given is a multiple of 5, the output should be "Buzz".
     If the number given is a multiple of both 3 and 5, the output should be "FizzBuzz".
     If the number is not a multiple of either 3 or 5, the number should be output on its own as shown in the examples below.
     The output should always be a string even if it is not a multiple of 3 or 5.
     **/
    public static String fizzBuzz(int num){
        // both return as fizzB
        if (num % 5 == 0 && num % 3 == 0)
        return "fizzBuzz";
        // multiply 3 then return fizz
        if ( num % 3 == 0)
            return "fizz";
        // multiply 5 then return buzz
        if  (num % 5 == 0)
            return "Buzz";
        return Integer.toString(num);
    }

    /**
     * Skip Counting
     * Write a program that gets three integers from the user.
     * Count from the first number to the second number in increments of the third number.
     */
    public static String skipCount(int countFrom, int countTo, int countBy){
        // write your code here
        // you will need to change the return statement
        return "";
    }

    /** The "Reverser"
     * takes a string as input and returns that string in reverse order, with the opposite case.*/
    public static String reverser(String reverseMe){
        StringBuilder reverse = new StringBuilder();
        for(char ch:reverseMe.toCharArray()) {
            if(character.isUppercase)
        }
        return "";
    }

    /**
     * Reverse An Array
     * Write a function that reverses the order of an array
     */
    public static int[] reverseArray(int[] arr){
        int arrlength = arr.length;
        int[] newarr = new int[arr.length];
        for (int x = 0; x < arrlength; x++) {
            int pos = arrlength - x- 1;
            newarr[x] = arr[pos];
        }
        return newarr;
    }

    /**
     * Write a function that finds the word "bomb" in the given string (not case sensitive).
     * Return "DUCK!" if found, otherwise,"Relax, there's no bomb.".
     */
    public static String duckTheBomb(String checkMe){
        // find the word bomb
        // if bomb is found return "DUCK
        String strOrig = checkMe;
        int intIndex = strOrig.indexOf("bomb");
        if (intIndex == -1)
            return "Relax, there's no bomb.";
        return "DUCK!";
    }

    /** Sort in Ascending Order
     * Create a method that takes an array of integers and returns a new array, sorted in ascending order (smallest to biggest).
     * If the function's argument is null, an empty array or undefined, return an empty array
     */
    public static int[] sortNumsAscending(int[] nums){
        // write your code here
        // you will need to change the return statement
        Arrays.sort(nums);
        return nums;
    }

    /**
     * Remove Duplicates
     * Create a method that takes an array of strings,removes all duplicate items
     * and returns a new array in the same sequential order as the old array (minus duplicates).
     */
    public static String[] removeDups(String[] str){
        // write your code here
        // you will need to change the return statement
        return new String[0];
    }
}