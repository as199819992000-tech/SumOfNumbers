package app;

public class Main {
    public static void main (String [] args){
        int f;
        int sum=0;
        for (f=1; f<=6; f++){
            sum += f;
            System.out.println(f + ") Num is "+f +", "+"Sum is "+ sum);
        }
        System.out.println("------------------------");
        System.out.println("Sum of numbers is " +sum);
    }
}
