public class Recursion {
    public int factorial(int n)
    {
        if(n<0)
            return -1;
        if(n==0 || n==1)
            return 1;
       return n*factorial(n-1);
    }

    public int sumOfDigits(int n)
    {
        if(n<10)
            return n;
        return n%10+sumOfDigits(n/10);
    }
}
