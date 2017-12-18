import java.util.Scanner;

public class MaxWordInArray {
    public void maxWord() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the array size: ");
        String maxWordOfArray = null;
        int currentWord = 0;
        int lengthOfWord;
        int arraySize = sc.nextInt();
        String newArray[] = new String[arraySize];

        System.out.println("Fill the array:");
        for (int i = 0; i < arraySize; i++) {
            newArray[i] = sc.next();
            lengthOfWord = newArray[i].length();
            for (int j = 0; j < newArray.length; j++) {
                while (lengthOfWord > currentWord) {
                    currentWord = lengthOfWord;
                    maxWordOfArray = newArray[i];
                }
            }
        }
        System.out.println("Мах word in array is: " + maxWordOfArray);
    }
}

