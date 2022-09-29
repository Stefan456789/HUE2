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
            boolean result = false;
            switch (input[0]) {
                case "1":
                    result = oddTester.testNumber(Integer.parseInt(input[1]));
                    if (!result)
                        System.out.println("NOT ");
                    System.out.println("EVEN");
                    break;
                case "2":
                    result = primeTester.testNumber(Integer.parseInt(input[1]));
                    if (!result)
                        System.out.println("NO ");
                    System.out.println("PRIME");
                    break;
                case "3":
                    result = palindromeTester.testNumber(Integer.parseInt(input[1]));
                    if (!result)
                        System.out.println("NO ");
                    System.out.println("PALINDROME");
                    break;
            }
        }
    }

}

