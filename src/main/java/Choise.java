import java.util.Scanner;

public class Choise {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Calculator Calc = new Calculator();
        MaxWordInArray Max = new MaxWordInArray();
        RandomArray Random = new RandomArray();

        System.out.println(" 1. Max lenght of word in array \n 2. Fill the random array \n 3. Calculator");
        System.out.print("Choose your program: ");
        int ProgrammChoise = sc.nextInt();

        switch (ProgrammChoise) {
            case 1 :
                Max.maxWord();
                break;
            case 2 :
                Random.rArray();
                break;
            case 3 :
                Calc.Calculate();
                break;
        }
    }
}
