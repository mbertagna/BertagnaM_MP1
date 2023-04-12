// a. Michael Bertagna
// b. 2353491
// c. bertagna@chapman.edu
// d. CPSC 231-01
// e. MP1: Recursion and Intro to Classes

//class declaration
public class Harmonic{

  //iterative harmonic number calculation
  public static double calcIterativeHarmonic(int n){
    //set first harmonic number
    double harmonicNum = 1.0;
    //for loop calculates harmonic number based on n
    for (int i = 2 ; i <= n ; i++){
        harmonicNum=harmonicNum+((double)1/i);
    }
    return harmonicNum;
  }

  //recursive harmonic number calculation
  public static double calcRecursiveHarmonic(int n){
      if (n==1){//base case
        return 1;
      }
      else{//recursive step
        return calcRecursiveHarmonic(n-1)+((double)1/(n-1));
      }
  }

  //main method
  public static void main(String[] args) {
    //print first 20 harmonic numbers using iterative method
    for (int i = 1 ; i <= 20 ; i++){
      System.out.println(calcIterativeHarmonic(i));
    }
    //print first 20 harmonic numbers using harmonic method
    for (int i = 1 ; i <= 20 ; i++){
      System.out.println(calcIterativeHarmonic(i));
    }
  }
}
