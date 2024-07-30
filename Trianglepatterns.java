public class Main {

  public static void main(String[] args) {
    int rows = 5;

    for (int i = 1; i <= rows; ++i) {
      for (int j = 1; j <= i; ++j) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }
}
#OUTPUT
*
* *
* * *
* * * *
* * * * *

  public class Main {

  public static void main(String[] args) {
    int rows = 5;

    for (int i = rows; i >= 1; --i) {
      for (int j = 1; j <= i; ++j) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }
}

#OUTPUT
* * * * *
* * * *
* * * 
* *
*


  public class Main {

  public static void main(String[] args) {
    int rows = 4, number = 1;

    for(int i = 1; i <= rows; i++) {

      for(int j = 1; j <= i; j++) {
        System.out.print(number + " ");
        ++number;
      }

      System.out.println();
    }
  }
}

#OUTPUT
1
2 3
4 5 6
7 8 9 10
  
