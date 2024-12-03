import javax.swing.plaf.TreeUI;

public class Primes {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        boolean [] arr = new boolean [n+1];
        int p = 2;
        int counter = 0;
        //building an array from 0 to n+1 with T and F
        arr[0] = false;
        arr[1] = false;
        for ( int i = 2; i < arr.length; i++){
            arr[i] = true;
        }
        while (p <= Math.sqrt(n)){
            System.out.println("the p is" + p);
            for ( int i = 2; i < arr.length; i++){
                if ( i != p && i%p==0 ){
                    arr[i] = false;
                }
            }
            p++;
        }
        System.out.println("Prime numbers up to " + n +":");
        for ( int i = 2; i < arr.length; i++){
        if (arr[i] == true){
            counter ++;
            System.out.println(i);
        }
    }
    int precent = (int)((double)counter/n * 100);
    System.out.println("There are " + counter + " primes between 2 and " + n + " (" + precent + "% are primes)");
}}