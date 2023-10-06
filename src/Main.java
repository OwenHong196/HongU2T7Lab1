import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        boolean isWordEven = true;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your first word: ");
        String word1 = scan.nextLine();
        System.out.print("Enter your second word: ");
        String word2 = scan.nextLine();
        int word1len = word1.length();
        int word2len = word2.length();
        if (word1len < word2len){
            System.out.println(word2 + " is longer");
        }else if (word1len == word2len){
            System.out.println(word1 + " is longer");
        }else{
            System.out.println("Both strings have te same length");
        }
        if (word1len%2 != 0){
            word1len --;
            isWordEven = false;
        }
        System.out.println("Word one:");
        String firstHalf1 = word1.substring(0,(word1len/2));
        String secondHalf1 = word1.substring(word1len/2);
        System.out.println("First Half: " + firstHalf1);
        System.out.println("Second Half: " + secondHalf1);
        isWordEven = true;
        if (word2len%2 != 0){
            word2len --;
            isWordEven = false;
        }
        System.out.println("Word two:");
        String firstHalf2 = word2.substring(0,word2len/2);
        String secondHalf2 = word2.substring(word2len/2);
        System.out.println("First Half: " + firstHalf2);
        System.out.println("Second Half: " + secondHalf2);
        int index = word1.indexOf(word2);
        if (index != -1){
            System.out.println(word2 + " is found in " + word1 + " at index " + index);
        } else{
            System.out.println(word2 + " is not found in " + word1);
        }
        scan.close();
    }
}