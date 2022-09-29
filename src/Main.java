public class Main {
    public static void main(String[] args) {
        NumberTester t = new NumberTester("File.txt");
        t.setOddEvenTester((x) -> x % 2 == 0);
        t.setPrimeTester(Main::isPrime);
        t.setPalindromeTester((x) -> isPalindrome(String.valueOf(x)));
        t.testFile();
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
