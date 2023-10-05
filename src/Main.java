import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your first word:");
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
            word1len ++;
        }
        if (word2len%2 != 0){
            word2len ++;
        }
        System.out.println("Word one:");

    }
}