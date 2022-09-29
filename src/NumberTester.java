import java.util.Scanner;

public class NumberTester {

    private NumberTest oddTester;
    private NumberTest primeTester;
    private NumberTest palindromeTester;
    private final Scanner s;

    public NumberTester(String filename){
        s = new Scanner(filename);
    }

    public void setOddEvenTester(NumberTest oddTester){
        this.oddTester = oddTester;
    }

    public void setPrimeTester(NumberTest primeTester){
        this.primeTester = primeTester;
    }

    public void setPalindromeTester(NumberTest palindromeTester){
        this.palindromeTester = palindromeTester;
    }

    public void testFile(){
        int lines = Integer.parseInt(s.nextLine());
        for (int i = 0; i < lines; i++){
            String[] input = s.nextLine().split("  ");
            switch (input[0]) {
                case "1":
                    System.out.println(oddTester.testNumber(Integer.parseInt(input[1])));
                    break;
                case "2":
                    System.out.println(primeTester.testNumber(Integer.parseInt(input[1])));
                    break;
                case "3":
                    System.out.println(palindromeTester.testNumber(Integer.parseInt(input[1])));
                    break;
            }
        }
    }

}

