import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        NumberTester t = new NumberTester("File.txt");
        t.setOddEvenTester((x) -> x % 2 == 0);
        t.setPrimeTester(Main::isPrime);
        t.setPalindromeTester((x) -> isPalindrome(String.valueOf(x)));
        t.testFile();

        AbstractCalculator rel = new RationalCalculator((x, y) -> {
            x.setA(x.getA() * y.getB() + y.getA() * x.getB());
            x.setB(x.getB() * y.getB());
            return x;
        }, (x, y) -> {
            x.setA(x.getA() * y.getB() - y.getA() * x.getB());
            x.setB(x.getB() * y.getB());
            return x;
        }, (x, y) -> {
            x.setA(x.getA() * y.getA());
            x.setB(x.getB() * y.getB());
            return x;
        }, (x, y) -> {
            x.setA(x.getA() * x.getB());
            x.setB(y.getA() * y.getB());
            return x;
        });

        AbstractCalculator vec = new VectorCalculator((x, y) -> {
            x.setA(x.getA() + y.getA());
            x.setB(x.getA() + y.getB());
            return x;
        }, (x, y) -> {
            x.setA(x.getA() - y.getA());
            x.setB(x.getA() - y.getB());
            return x;
        }, (x, y) -> {
            x.setA(x.getA() * y.getB());
            x.setB(x.getA() * y.getA());
            return x;
        }, (x, y) -> {
            x.setA(x.getA() / y.getA());
            x.setB(x.getA() / y.getB());
            return x;
        });

        AbstractCalculator com = new ComplexCalculator((x, y) -> {
            x.setA(x.getA() + y.getA());
            x.setB(x.getA() + y.getB());
            return x;
        }, (x, y) -> {
            x.setA(x.getA() - y.getA());
            x.setB(x.getA() - y.getB());
            return x;
        }, (x, y) -> {
            x.setA(x.getA() * y.getA());
            x.setB(x.getA() * y.getB());
            return x;
        }, (x, y) -> {
            x.setA(x.getA() / y.getA());
            x.setB(x.getA() / y.getB());
            return x;
        });


        while (true){
            Scanner s = new Scanner(System.in);
            System.out.println("\n");
            System.out.println("1 - RationalCalculator\n" +
                    "2 - VectorCalculator\n" +
                    "3 - ComplexCalculator\n" +
                    "4 - Exit");
            int type = Integer.parseInt(s.nextLine());

            Number x = new Number();
            Number y= new Number();
            System.out.println("Enter Number x a >");
            x.setA(Integer.parseInt(s.nextLine()));
            System.out.println("Enter Number x b >");
            x.setB(Integer.parseInt(s.nextLine()));
            System.out.println("Enter Number y a >");
            y.setA(Integer.parseInt(s.nextLine()));
            System.out.println("Enter Number y b >");
            y.setB(Integer.parseInt(s.nextLine()));
            System.out.println("Choose operation:");
            System.out.println("1 - add\n" +
                    "2 - substract\n" +
                    "3 - multiply\n" +
                    "4 - divide");

            int op = Integer.parseInt(s.nextLine());
            System.out.println("----------------");
            System.out.println("Solution");

            switch (type) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
            }

            System.out.println("----------------");



        }


    }

    static boolean isPrime(int n)
    {
        if (n <= 1)
            return false;

        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;

        return true;
    }

    public static boolean isPalindrome(String str){
        StringBuilder sb=new StringBuilder(str);
        sb.reverse();
        String rev=sb.toString();
        if(str.equals(rev)){
            return true;
        }else{
            return false;
        }
    }
}
