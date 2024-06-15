                    // BASICS

// import java.util.*;
// public class Main {
//     // @SuppressWarnings("resource")
//     public static void main(String[] args) throws Exception {

//HOW TO PRINT OUTPUT IN JAVA
        // System.out.print("Hello, World!");
        // System.out.print("Hello, World!\n");
        // System.out.println("Hello, World!");  
        // System.out.println("*");
        // System.out.println("**");
        // System.out.println("***");
        // System.out.println("****");
        // System.out.print("*****\n");
        // System.out.println("*\n**\n***\n****\n******");
        // System.out.print("*****\n   *\n  *\n *\n*****\n"); 

//VARIABLES IN JAVA
        // /*  int x = 10;
        // int y = 15;
        // int sum = x + y;
        // System.out.println("sum");    
        // System.out.println(sum);    
        // System.out.println("Sum of " + x + " and " + y + " is " +sum);
        // int prd = x*y;
        // System.out.println("Product of " + x + " and " + y + " is " +prd);
        // int v1 = x/y;         //gives quotient
        // int v2 = y/x;
        // int v3 = x%y;         //gives remainder
        // int v4 = y%x;
        // System.out.println(v1);    
        // System.out.println(v2);
        // System.out.println(v3);
        // System.out.println(v4);
        // int exp = x * y / x + y;   // multipy,divide,modulus > add,sub
        // System.out.println(exp);
        // int Exp = ( x * y ) / ( x + y );   
        // System.out.println(Exp);

//CONDITIONAL STATEMENTS
//         int n1 = 20;
//         int n2 = 30;
//         if (n1 == n2){
//            System.out.println("n1 is equal to n2");
//         }
//         else if(n1 > n2){
//             System.out.println("n1 is greater than n2 ");}
//         else{
//             System.out.println("n1 is lesser than n2 ");
//         }
// try (Scanner scn = new Scanner(System.in)) {
//         int marks = scn.nextInt();
//             if(marks>90){
//                System.out.println("excellent");
//             }else if(marks>80){
//                System.out.println("good");
//             }else if(marks>70){
//                System.out.println("fair");
//             }else if(marks>60){
//                 System.out.println("meets expectations");
//             }else{
//                 System.out.println("below par");
//             }
//     }

//LOOPS
    //   int i = 1;                     //initialisaton
    //     while( i <= 9){                //evaluation
    //         System.out.println(i);     //execution
    //         i++;                       //increment
    //     }
    //     System.out.println("done"); 
        // for(int i = 1; i <= 9; i++){     //initialisation,evaluation,excution,increment
        //     System.out.println(i);    
        // }

//INPUT
    //    try( Scanner scn = new Scanner(System.in)) {
    //         int n = scn.nextInt();
    //         for(int i = 0; i <= n; i++){
    //             System.out.println(i);
    //         }
    //     }
    //         String name = scn.nextLine();
    //         System.out.println("hello" + name);
    //         {
    //         Scanner scn = new Scanner(System.in);
    //         int n = Integer.parseInt( scn.nextLine());
    //         String name = scn.nextLine();
    //         System.out.println("hello" + name + " here is the counting ");
    //             for(int i = 0; i <= n; i++){
    //                 System.out.println(i);
    //             }
    //         }

    //QUESTIONS ON BASICS

        //    try (Scanner scn = new Scanner(System.in)) {
        //     int low = scn.nextInt();
        //        int high = scn.nextInt(); 
        //        for( int n = low; n <= high; n++){
        //         int count = 0;
        //         //try to divide n and increase count
        //         for( int div = 2; div*div <= n; div++){
        //             if (n % div == 0){
        //                 count++;
        //                 break;
        //             }
        //         }
        //         if(count == 0){
        //         System.out.println(n);}
        //        }
        // }

    //print fibonacci numbers
        // Scanner scn = new Scanner(System.in);
        // int n = scn.nextInt();  
        // int a1 = 0;
        // int a2 = 1;
        // for( int i = 1; i < n; i++ ){
        //     System.out.println(a1);
        //     int a3 = a1 + a2 ;
        //     int a1 = a2 ;
        //     int a2 = a3 ;
        // }

    // COUNT DIGITS IN A NUMBER
        // Scanner scn = new Scanner(System.in);
        // int n = scn.nextInt();
        // int dig = 0;
        // while( n != 0){
        //     n = n/10;
        //     dig++;
        // }
        // System.out.println(dig);

    // DIGITS OF  NUMBER
    //    Scanner scn = new Scanner(System.in);
    //    int n = scn.nextInt();
    //    int nod = 0;
    //    int temp = n;
    //    while( temp != 0){
    //     temp = temp/10;
    //     nod++;
    //    }
    //    int div = (int) Math.pow(10, nod - 1);
    //    while(div !=0 ){
    //     int q = n / div;
    //     System.out.println(q);
    //     n = n % 10;
    //     div = div / 10;
    //    }
 
    //REVERSE A DIGITS OF NUMBER
        //   Scanner scn = new Scanner(System.in);
        //   int n = scn.nextInt();
        //   while (n > 0){
        //     int dig = n % 10;
        //     n = n/10;
        //     System.out.println(dig);
        //   }
    
    // INVERSE OF A NMUBER
            //  Scanner scn = new Scanner(System.in);
            //  int n = scn.nextInt();
            //  int inv = 0;
            //  int op = 1;
            //  while(n != 0){
            //     int od = n % 10;
            //     int id = op;
            //     int ip = od;               
            //     //make changes to inv using ip and id
            //     inv = inv + id * (int) Math.pow(10 , ip - 1);
            //     n = n/10;
            //     op++;
            //  }
            //  System.out.println(inv);

    //ROTATE A NUMBER
            // Scanner scn = new Scanner(System.in);
            // int n = scn.nextInt();
            // int k = scn.nextInt();
            // int temp = n;
            // int nod = 0;
            // while(temp > 0 ){
            //     temp = temp/10;
            //     nod++;
            // }
            // k = k % 10;
            // if(k < 0){
            //     k = k + nod;
            // }
            // int div = 1;
            // int mult = 1;
            // for(int i = 1; i <= nod; i++){
            //     if(i <= k){
            //         div = div*10;
            //     }else{
            //         mult = mult*10;
            //     }
            // }
            // int q = n/div;
            // int r = n%div;
            // int rot = r * mult + q;
            // System.out.println(rot);
  
    //GCD AND LCM
            // Scanner scn = new Scanner(System.in);
            // int n1 = scn.nextInt();
            // int n2 = scn.nextInt();
            // int on1 = n1;
            // int on2 = n2;
            // while(n1 % n2 != 0){
            //     int rem = n1 % n2;
            //     n1 = n2;
            //     n2 = rem;
            // }
            // int gcd = n2;
            // int lcm = (on1 * on2)/gcd;
            // System.out.println(gcd);
            // System.out.println(lcm);

    //PRIME FACTORISATION
        //    Scanner scn = new Scanner(System.in);
        //    int n = scn.nextInt();
        //    for(int div = 2; div * div <= n; div++){
        //     while(n % div == 0){
        //         n = n / div;
        //         System.out.print(div + " ");
        //     }
        //    }
        //    if(n != 1){
        //     System.out.print(n);
        //    }

    //PYTHAGOREAN TRIPLETS
        // Scanner scn = new Scanner(System.in);
        // int a = scn.nextInt();
        // int b = scn.nextInt();
        // int c = scn.nextInt();
        // int max = a;
        // if( b >= max){
        //     max = b;
        // }
        // if( c >= max){
        //     max = c;
        // }
        // if(max == a){
        //     boolean flag = ((b * b + c * c) == (a * a));
        //     System.out.println(flag);
        // }else if(max ==b){ 
        //     boolean flag = ((a * a + c * c) == (b * b));
        //     System.out.println(flag);
        // }else{
        //     boolean flag = ((b * b + a * a) == (c * c));
        //     System.out.println(flag);
        // }
            
    // BENJAMIN BULBS
    // Scanner scn = new Scanner(System.in);
    // int n = scn.nextInt();
    // for (int i = 1; i * i <= n; i++ ){
    //     System.out.println( i * i );
    // }

    //PATTERN 1 (TRIANGLE)
        //    Scanner scn = new Scanner(System.in);
        //    int n = scn.nextInt();
        //    for (int i = 1; i <= n; i++){
        //     for (int j = 1; j <= i; j++){      //ABSTRACTION
        //         System.out.print("*\t");
        //     }
        //     System.out.println();
        //    }

    //PATTERN 2(OPP TRIANGLE)
            //   Scanner scn = new Scanner(System.in);
            //   int n = scn.nextInt();
            //   for (int i = n; i >= 1; i--){
            //         for (int j = 1; j <= i; j++){      //ABSTRACTION
            //             System.out.print("*\t");
            //         }
            //         System.out.println();
            //        }

    // PATTERN 3
                //   Scanner scn = new Scanner(System.in);
                //   int n = scn.nextInt();
                //   int sp = n - 1;
                //   int st = 1;
                //   for (int i = 1; i <= n; i++){   
                //         for(int j = 1; j <= sp; j++){
                //             System.out.print("\t");
                //         }
                //         for (int j = 1; j <= st; j++){      //ABSTRACTION
                //             System.out.print("*\t");
                //         }
                //         sp--;
                //         st++;
                //         System.out.println();
                //        }

    //PATTERN 4
                // Scanner scn = new Scanner(System.in);
                // int n = scn.nextInt();
                // int sp = 0;
                // int st = n; 
                // for(int i = n; i >= 1; i--){
                //     for(int j = 1; j <= sp;j++){
                //         System.out.print("\t");
                //     }
                //     for(int j = 1; j <= st; j++){
                //         System.out.print("*\t");
                //     }
                //     sp++;
                //     st--;
                //     System.out.println();
                // }

    // PATTERN 5(DIAMOND)
                // Scanner scn = new Scanner(System.in);
                // int n = scn.nextInt();
                // int sp = n/2;
                // int st = 1;
                // for(int i = 1; i <= n; i++){
                //    for(int j = 1; j <= sp; j++){
                //     System.out.print("\t");
                //    }
                //    for(int j = 1; j <= st; j++){
                //     System.out.print("*\t");
                //    }
                //     if(i <= n/2){
                //         sp--;
                //         st+=2;
                //     }else{
                //         sp++;
                //         st-=2;
                //     }
                //     System.out.println();
                // }

    //PATTERN 6
        //     Scanner scn = new Scanner(System.in);
        //     int n = scn.nextInt();
        //     int st = n / 2 + 1;
        //     int sp = 1;
        //     for(int i = 1; i <= n; i++){
        //         for(int j = 1; j <= st; j++){
        //             System.out.print("*\t");
        //         }
        //         for(int j = 1; j <= sp; j++){
        //             System.out.print("\t");
        //         }
        //         for(int j = 1; j <= st; j++){
        //             System.out.print("*\t");
        //         }
        //         if(i <= n /2){
        //             st--;
        //             sp+=2;
        //         }else{
        //             st++;
        //             sp-=2;
        //         }
        //         System.out.println();
        //     }

    //PATTERN 7(DIAGONAL)
        //     Scanner scn = new Scanner(System.in);
        //     int n = scn.nextInt();           
        //     for(int i = 1; i <= n; i++){
        //         for(int j = 1; j <= n; j++){
        //             if(i == j){
        //                 System.out.print("*\t");
        //             }else{
        //                 System.out.print("\t");
        //             }
        //         }
        //     System.out.println();
        // }

    //PATTERN 8
            // Scanner scn = new Scanner(System.in);
            // int n = scn.nextInt();
            // for(int i = 1; i <= n; i++){
            //     for(int j = 1; j <= n; j++){
            //         if(i + j == n + 1){
            //             System.out.print("*\t");
            //         }else{
            //             System.out.print("\t");
            //         }
            //     }
            //     System.out.println();
            // }

    //PATTERN 9
            // Scanner scn = new Scanner(System.in);
            // int n = scn.nextInt();
            // for(int i = 1; i <= n; i++){
            //     for(int j = 1; j <= n; j++){
            //         if(i == j ||i + j == n + 1){
            //             System.out.print("*\t");
            //         }else{
            //             System.out.print("\t");
            //         }
            //     }
            //     System.out.println();
            // }

    //PATTERN 10
            // Scanner scn = new Scanner(System.in);
            // int n = scn.nextInt();
            // int os = n / 2;
            // int is = -1;
            // for(int i = 1; i <= n; i++){
            //     for(int j = 1; j <= os; j++){
            //         System.out.print("\t");
            //     }
            //     System.out.print("*\t");
            //     for(int j = 1; j <= is; j++){
            //         System.out.print("\t");
            //     }
            //     if(i > 1 && i < n){
            //         System.out.print("*\t");
            //     }
            //     if(i <= n /2){
            //         os--;
            //         is+=2;
            //     }else{
            //         os++;
            //         is-=2;
            //     }
            //     System.out.println();
            // }
  
    //PATTERN 11(NUMBERS)
            // Scanner scn = new Scanner(System.in);
            // int n = scn.nextInt();
            // int val = 1;
            // for(int i = 1; i <= n; i++){
            //     for(int j = 1; j <= i; j++){
            //         System.out.print(val + "\t");
            //         val++;
            //     }
            //     System.out.println();
            // }

    //PATTERN 12(FIBONACCI NUMBERS)
            // Scanner scn = new Scanner(System.in);
            // int n = scn.nextInt();
            // int a = 0;
            // int b = 1;
            // for(int i = 1; i <= n; i++){
            //     for(int j = 1;j <= i; j++){
            //         System.out.print(a + "\t");
            //         int c = a + b;
            //         a = b;
            //         b = c;
            //     }
            //     System.out.println();
            // }

    //PATTERN 13(permutation and combination)
            // Scanner scn = new Scanner(System.in);
            // int n = scn.nextInt();            
            // for(int i = 0; i < n; i++){
            //     int icj = 1;
            //     for(int j = 0; j <= i; j++){
            //         System.out.print(icj + "\t");
            //         int icjp1 = icj * (i - j) / (j + 1);
            //         icj = icjp1;
            //     }
            //     System.out.println();
            // }

    //PATTERN 14(TABLE OF X)
            // Scanner scn = new Scanner(System.in);
            // int x = scn.nextInt();
            // for(int i = 1; i <= 10; i++){
            //     int v = x * i;
            //     System.out.println(x + " * " + i + " = " + v);
            // }

    //PATTERN 15(DIAMOND SHAPE NUMBERS)
            // Scanner scn = new Scanner(System.in);
            // int n = scn.nextInt();
            // int sp = n / 2;
            // int st = 1;
            // int val = 1;
            // for(int i = 1; i <= n; i++){
            //    for(int j = 1; j <= sp; j++){
            //     System.out.print("\t");
            //    }
            //    int cval = val;
            //    for(int j = 1; j <= st; j++){
            //     System.out.print(cval +"\t");  
            //     if(j <= st / 2){
            //         cval++;
            //     }else{
            //         cval--;
            //     }
            //    }           
            //    if(i <= n /2){
            //     sp--;
            //     st+=2;
            //     val++;
            //    }else{
            //     sp++;
            //     st-=2;
            //     val--;
            //    }
            //    System.out.println();
            // }

    //PATTERN 16
            // Scanner scn = new Scanner(System.in);
            // int n = scn.nextInt();           
            // int sp = 2 * n - 3;
            // int st = 1;
            // for(int i = 1; i <= n; i++){
            //     int val = 1;
            //     for(int j = 1; j <= st; j++){
            //         System.out.print(val + "\t");
            //         val++;
            //     }
            //     for(int j = 1; j <= sp; j++){
            //         System.out.print("\t");
            //     }
            //      if(i == n){
            //         st--;
            //         val--;
            //      }
            //     for(int j = 1; j <= st; j++){
            //         val--;
            //         System.out.print(val + "\t");
            //     }
            //     st++;
            //     sp-=2;
            //     System.out.println();
            // }

    //PATTERN 17(ARROW)
            // Scanner scn = new Scanner(System.in);
            // int n = scn.nextInt();
            // int sp = n / 2;
            // int st = 1;
            // for(int i = 1; i <= n; i++){
            //     for(int j = 1; j <= sp; j++){
            //         if(i == n / 2 + 1){
            //             System.out.print("*\t");
            //         }else{
            //             System.out.print("\t");
            //         }                  
            //     }
            //     for(int j = 1; j <= st; j++){
            //         System.out.print("*\t");
            //     }
            //     if(i <= n /2){
            //         st++;
            //     }else{
            //         st--;
            //     }
            //     System.out.println();
            // }

    //PATTERN 18(ANCIENT TIME GLASS)
            // Scanner scn = new Scanner(System.in);
            // int n = scn.nextInt();
            // int sp = 0;
            // int st = n;
            // for(int i = 1; i <= n; i++){
            //     for(int j = 1; j <= sp; j++){
            //         System.out.print("\t");               
            //     }
            //     for(int j = 1; j <= st; j++){
            //         if(i > 1 && i <= n / 2 && j > 1 && j < st){
            //         System.out.print("\t");
            //         }else{
            //         System.out.print("*\t");
            //         }
            //     }
            //     if(i <= n / 2 ){
            //         sp++;
            //         st-=2;
            //     }else{
            //         sp--;
            //         st+=2;
            //     }
            //     System.out.println();
            // }

    // PATTERN 19(SWASTIK)
            // Scanner scn = new Scanner(System.in);
            // int n = scn.nextInt();
            // for(int i = 1; i <= n; i++){
            //     for(int j = 1; j <= n; j++){
            //         if(i == 1){
            //             if(j == n || j <= n / 2 + 1){
            //                 System.out.print("*\t");
            //             }else{
            //                 System.out.print("\t");
            //             }
            //         }else if(i <= n / 2){
            //             if(j == n || j == n / 2 + 1){
            //                 System.out.print("*\t");
            //             }else{
            //                 System.out.print("\t");
            //             }
            //         }else if(i == n / 2 + 1){
            //             System.out.print("*\t");
            //         }else if(i < n){
            //             if(j == 1 || j == n / 2 + 1){
            //                 System.out.print("*\t");
            //             }else{
            //                 System.out.print("\t");
            //             }
            //         }else{
            //             if(j == 1 || j >= n / 2 + 1){
            //                 System.out.print("*\t");
            //             }else{
            //                 System.out.print("\t");
            //             }
            //         }
            //     }
            //     System.out.println();
            // }

    // PATTERN 20( print W)
            // Scanner scn = new Scanner(System.in);
            // int n = scn.nextInt();
            // for(int i = 1; i <= n; i++){
            //     for(int j = 1; j <= n; j++){ 
            //         if(j == 1 || j == n){
            //            System.out.print("*\t");
            //         }else if (i == j ){
            //            System.out.print("*\t");     
            //         }else{
            //            System.out.print("\t");
            //         }
            //     }
            //     System.out.println();
            // }
//     }
// }

                     //FUNCTIONS

// FUNCTIONS GIVES MODULARITY AND MAINTAINABILITY

// import java.util.*;
// public class function{
//         @SuppressWarnings("resource")
//         public static void main(String[] args){
    
        //FUNCTION OF PNC
            // public class function {
            //     public static void display(int n, int r, int npr){
            //         System.out.println(n + "p" + r + " = " + npr);
            //     }
            // public static int fact(int x){
            //     int rv = 1;
            //     for(int i = 1; i <= x; i++){
            //         rv = rv * i;
            //     }
            //     return rv;
            // }
            // Scanner scn = new Scanner (System.in);
            // int n = scn.nextInt();
            // int r = scn.nextInt();
            // int nfact = fact(n);
            // int nmrfact = fact(n - r);
            // int npr = nfact / nmrfact;
            // display(n,r,npr);
      
        //DIGITS FREQUENCY
        //     Scanner scn = new Scanner(System.in);
        //     int n = scn.nextInt();
        //     int d = scn.nextInt();
        //     int f = getDigitFrequency(n,d);
        //     System.out.println(f);
        // }       
        //     public static int getDigitFrequency(int n , int d){
        //         int rv = 0;
        //         while(n > 0){
        //             int dig = n % 10;
        //             n = n / 10;
        //             if(dig == d){
        //                 rv++;
        //             }
        //         }
        //         return rv;
    
        //DECIMAL TO ANY BASE
            //        Scanner scn = new Scanner(System.in);
            //        int n = scn.nextInt();
            //        int b = scn.nextInt();
            //        int dn = getValueInBase(n,b);
            //        System.out.println(dn);
            //        }
            // public static int getValueInBase(int n , int b ){
            //     int rv = 0;
            //     int p = 1;
            //     while(n > 0){
            //         int dig = n % b;
            //         n = n / b;
            //         rv += dig * p;
            //         p = p * 10;
            //     }
            //     return rv;
    
        // ANY BASE TO DECIMAL
            //        Scanner scn = new Scanner(System.in);
            //        int n = scn.nextInt();
            //        int b = scn.nextInt();
            //        int d = getValueInDecimal(n,b);
            //        System.out.println(d);
            // }
            // public static int getValueInDecimal(int n, int b){
            //     int rv = 0;
            //     int p = 1;
            //     while(n > 0){
            //         int dig = n % b;
            //         n = n / 10;
            //         rv += dig * p;
            //         p = p * b;
            //     }
            //     return rv;
    
        // ANY BASE TO BASE
            //        Scanner scn = new Scanner(System.in);
            //        int n = scn.nextInt();
            //        int b1 = scn.nextInt();
            //        int b2 = scn.nextInt();
            //        int d = getValue(n,b1,b2);
            //        System.out.println(d);
            // }
            // public static int getValue(int n , int b1, int b2){
            //   int dec = anybasetodecimal(n,b1);
            //   int dn = decimaltoanybase(dec,b2);
            //   return dn;
            // }
            //  public static int decimaltoanybase(int n , int b ){
            //     int rv = 0;
            //     int p = 1;
            //     while(n > 0){
            //         int dig = n % b;
            //         n = n / b;
            //         rv += dig * p;
            //         p = p * 10;
            //     }
            //     return rv;
            // }
            //  public static int anybasetodecimal(int n, int b){
            //     int rv = 0;
            //     int p = 1;
            //     while(n > 0){
            //         int dig = n % b;
            //         n = n / 10;
            //         rv += dig * p;
            //         p = p * b;
            //     }
            //     return rv;
            // }
    
        //ADDITION OF BASE
            //        Scanner scn = new Scanner(System.in);
            //        int b = scn.nextInt();
            //        int n1 = scn.nextInt();
            //        int n2 = scn.nextInt();
            //        int d = getSum(b, n1, n2);
            //        System.out.println(d);
            //     }
            // public static int getSum(int b,int n1, int n2){
            //     int rv = 0;
            //     int c = 0;
            //     int p = 1;
            //     while(n1 > 0 || n2 > 0 || c > 0){
            //         int d1 = n1 % 10;
            //         int d2 = n2 % 10;
            //         n1 = n1 / 10;
            //         n2 = n2 / 10;
            //         int d = d1 + d2 + c;
            //         c = d / b;
            //         d = d % b;               
            //         rv += d * p;
            //         p = p * 10;
            //     }
            //     return rv;
    
        // SUBTRACTION OF BASE
            //        Scanner scn = new Scanner(System.in);
            //        int b = scn.nextInt();
            //        int n1= scn.nextInt();
            //        int n2 = scn.nextInt();
            //        int d = getDifference(b,n1,n2);
            //        System.out.println(d);
            // }
            // public static int getDifference(int b,int n1,int n2){
            //     int rv = 0;
            //     int c = 0;
            //     int p = 1;
            //     while(n2 > 0){
            //         int d1 = n1 % 10;
            //         int d2 = n2 % 10;
            //         n1 = n1 / 10;
            //         n2 = n2 / 10;
            //         int d = 0;
            //         d2 = d2 + c;
            //         if(d2 >= d1){
            //             c = 0; 
            //             d = d2 - d1;
            //         }else{
            //             c = -1;
            //             d = d2 + b - d1;
            //         }
            //         rv = rv + d * p;
            //         p = p * 10;
            //     }
            //     return rv;
    
        //ANY BASE MULTIPLICATION
            //        Scanner scn = new Scanner(System.in);
            //        int b = scn.nextInt();
            //        int n1= scn.nextInt();
            //        int n2 = scn.nextInt();
            //        int d = getProduct(b,n1,n2);
            //        System.out.println(d);
            // }
            // public static int getProduct(int b, int n1,int n2){
            //     int rv = 0;
            //     int p = 1;
            //     while(n2 > 0){
            //         int d2 = n2 % 10;
            //         n2 = n2 / 10;
            //         int sprd = getProductOfSingleDigit(b,n1,d2);
            //         rv = getSum(b, rv, sprd*p);
            //         p = p * 10;
            //     }
            //     return rv;
            // }
            // public static int getProductOfSingleDigit(int b, int n1, int d2){
            //     int rv = 0;
            //     int c = 0;
            //     int p = 1;
            //     while(n1 > 0 || c > 0){
            //         int d1 = n1 % 10; 
            //         n1 = n1 / 10;
            //         int d = d1 * d2 + c;
            //         c = d / b;
            //         d = d % b;
            //         rv = rv + d * p;
            //         p = p * 10;
            //     }
            //     return rv;
            // }
            // public static int getSum(int b,int n1, int n2){
                    // int rv = 0;
                    // int c = 0;
                    // int p = 1;
                    // while(n1 > 0 || n2 > 0 || c > 0){
                    //     int d1 = n1 % 10;
                    //     int d2 = n2 % 10;
                    //     n1 = n1 / 10;
                    //     n2 = n2 / 10;  
                    //     int d = d1 + d2 + c;
                    //     c = d / b;
                    //     d = d % b;                   
                    //     rv += d * p;
                    //     p = p * 10;
                    // }
                    // return rv;
//           }
//      }
    
                                  //ARRAYS
// import java.io.*;
// import java.util.*;
// public class Main{
        // public static void swap(int[]arr, int i, int j){
        //         int temp = arr[i];
        //         arr[i] = arr[j];
        //         arr[j] = temp;
        // }
//  public static void main(String[]args) throws Exception{
// int[]arr;
// arr = new int[5];
// arr[0] = 23;
// arr[1] = 35;
// arr[2] = 56;
// arr[3] = 89;
// arr[4] = 99;
// System.out.println(arr.length);
// for(int i = 0; i < arr.length; i++){
//         System.out.println(arr[i]);
// }
// int[]two = arr;
// two[2] = 540;
// for(int i = 0; i < two.length; i++){
//         System.out.println(arr[i]);
// }
// swap(arr, 2 , 4);
// for(int i = 0; i < arr.length; i++){
//         System.out.println(arr[i]);
// }

     //QUESTIONS

//SPAN OF ANA ARRAY :
// defined as the difference between maximum value and minimum value
// Scanner scn = new Scanner(System.in);
// int n = scn.nextInt();
// int[]arr = new int[n];
// for(int i = 0; i < arr.length; i++){
//         arr[i] = scn.nextInt();
// }
// int max = arr[0];
// int min = arr[0];
// for(int i = 1; i < arr.length; i++){
//         if(arr[i] > max){
//                 max = arr[i];
//         }
//         if(arr[i] < min){
//                 min = arr[i];
//         }
// }
//         int span = max - min;
//         System.out.println(span);

// FIND ELEMENT IN A ARRAY
// Scanner scn = new Scanner(System.in);
// int n = scn.nextInt();
// int arr[] = new int[n];
// for(int i = 0; i < arr.length; i++){
//         arr[i] = scn.nextInt();
// }
// int data = scn.nextInt();
// int idx = -1;
// for(int i = 0; i < arr.length; i++){
//         if(arr[i] == data){
//                 idx = i;
//                 break;
//         }
// }
//         System.out.println(idx);
 
//BAR CHART
// Scanner scn = new Scanner(System.in);
// int n = scn.nextInt();
// int arr[] = new int [n];
// for(int i = 0; i < arr.length; i++){
//         arr[i] = scn.nextInt();
// }
// int max = arr[0];
// for(int i = 1; i < arr.length; i++){
//         if(arr[i] > max){
//                 max = arr[i];
//         }
// }
// for(int floor = max; floor >= 1; floor--){
//         for(int i = 0;i < arr.length; i++){
//                 if(arr[i] >= floor){
//                         System.out.print("*\t");
//                 }else{
//                         System.out.print("\t");
//                 }
//         }
//         System.out.println();
//    }

//AADDITION OF ARRAYS
// Scanner scn = new Scanner(System.in);
// int n1 = scn.nextInt();
// int[]a1 = new int[n1];
// for(int i = 0; i < a1.length; i++){
//         a1[i] = scn.nextInt();
// }
// int n2 = scn.nextInt();
// int[]a2 = new int[n2];
// for(int i = 0; i < a2.length; i++){
//         a2[i] = scn.nextInt();
// }
// int[] sum = new int[n1 > n2?n1:n2];
// int c = 0;
// int i = a1.length - 1;
// int j = a2.length - 1;
// int k = sum.length - 1;
// while(k >= 0){
//         int d = c;
//         if(i >= 0){
//                 d += a1[i];
//         }
//         if(j >= 0){
//                 d += a2[j];
//         }
//         c = d / 10;
//         d = d % 10;
//         sum[k] = d;
//         i--;
//         j--;
//         k--;
// }
//         if(c != 0){
//                 System.out.println(c);
//         }
//         for(int val: sum){
//                 System.out.println(val);
//         }

//SUBTRACTION OF ARRAYS
// Scanner scn = new Scanner(System.in);
// int n1 = scn.nextInt();
// int[]a1 = new int[n1];
// for(int i = 0;i < a1.length;i++){
//         a1[i] = scn.nextInt();
// }
// int n2 = scn.nextInt();
// int[]a2 = new int[n2];
// for(int i = 0; i < a2.length; i++){
//         a2[i] = scn.nextInt();
// }
// int []diff = new int[n2];
// int c = 0;
// int i = a1.length - 1;
// int j = a2.length - 1;
// int k = diff.length - 1;
// while(k >= 0){
//         int d = 0;
//         int a1v = i >= 0? a1[i]:0;
//         if(a2[j] + c >= a1v){
//                 d = a2[j] + c - a1v;
//                 c = 0;
//         }else{
//                 d = a2[j] + c + 10 - a1v;
//                 c = -1;
//         }
//         diff[k] = d;
//         i--;
//         j--;
//         k--;
// } 
// int idx = 0;
// while(idx < diff.length){
//         if(diff[idx] == 0){
//             idx++;
//         }else{
//             break;
//         }
//     }
//     while(idx < diff.length){
//         System.out.println(diff[idx]);
//         idx++;
//     }
//   }
// }

//REVERSE AN ARRAY
// import java.io.*;
// import java.util.*;
// public class Main{
//         public static void display(int[] a){
//                 StringBuilder sb = new StringBuilder();
//                 for(int val : a){
//                         sb.append(val + " ");
//                 }
//                 System.out.println(sb);
//         }
//         public static void reverse(int[] a){
//                 int i = 0;
//                 int j = a.length - 1;
//                 while(i < j){
//                         int temp = a[i];
//                         a[i] = a[j];
//                         a[j] = temp;
//                         i++;
//                         j--;
//                 }
//         }
//         public static void main(String[] args)throws Exception{
//                 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//                 int n = Integer.parseInt(br.readLine());
//                 int[] a = new int[n];
//                 for(int i = 0; i < n; i++){
//                         a[i] = Integer.parseInt(br.readLine());
//                 }  
//                 reverse(a);
//                 display(a);
//         }
// }

//ROTATE N ARRAY
// import java.io.*;
// import java.util.*;
// public class Main{
//         public static void display(int[] a){
//                 StringBuilder sb = new StringBuilder();
//                 for(int val : a){
//                         sb.append(val + " ");
//                 }
//                 System.out.println(sb);
//         }
//         public static void reverse(int[] a , int i, int j){
//                 int li = i;
//                 int ri = j;
//                 while(li < ri){
//                         int temp = a[li];
//                         a[li] = a[ri];
//                         a[ri] = temp;
//                         li++;
//                         ri--;
//                 }
//         }
//         public static void rotate(int[] a , int k){
//                 k = k % a.length;
//                 if(k < 0){
//                         k = k + a.length;
//                 }
//                 //part 1
//                 reverse(a,0,a.length - k -1);
//                 //part 2
//                 reverse(a,a.length - k,a.length - 1);
//                 //all
//                 reverse(a,0,a.length - 1);
//         }
//         public static void main(String[] args)throws Exception{
//                 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//                 int n = Integer.parseInt(br.readLine());
//                 int[] a = new int[n];
//                 for(int i = 0; i < n; i++){
//                         a[i] = Integer.parseInt(br.readLine());
//                 }
//                 int k = Integer.parseInt(br.readLine());  
//                 rotate(a , k);
//                 display(a);
//         }
// }

//INVERSE OF AN ARRAY
// import java.io.*;
// import java.util.*;
// public class Main{
//         public static void display(int[] a){
//                 StringBuilder sb = new StringBuilder();
//                 for(int val : a){
//                         sb.append(val + "\n");
//                 }
//                 System.out.println(sb);
//         }
//         public static int[]inverse(int[]a){
//                 int[]inv = new int[a.length];
//                 for(int i = 0;i < a.length;i++){
//                         int v = a[i];
//                         inv[v] = i;
//                 }
//                 return inv;
//         }
//         public static void main(String[] args)throws Exception{
//                 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//                 int n = Integer.parseInt(br.readLine());
//                 int[] a = new int[n];
//                 for(int i = 0; i < n; i++){
//                         a[i] = Integer.parseInt(br.readLine());
//                 }
//                 int[] inv = inverse(a);
//                 display(inv);
//         }
// }

//SUBARRAYS OF AN ARRAY
// import java.io.*;
// import java.util.*;
// public class Main{
//         public static void main(String[]args)throws Exception{
//                 Scanner scn = new Scanner(System.in);
//                 int n = scn.nextInt();
//                 int[]arr = new int[n];
//                 for(int i = 0;i < arr.length;i++){
//                         arr[i] = scn.nextInt();
//                 }
//                 for(int i = 0;i < arr.length;i++){
//                         for(int j = i;j < arr.length;j++){
//                                 for(int k = i;k <= j;k++){
//                                         System.out.print(arr[k] + "\t");
//                                 }
//                                 System.out.println();
//                         }
//                 }
//         }
// }

//SUBSETS OF AN ARRAY
// import java.io.*;
// import java.util.*;
// public class Main{
//         public static void main(String[]args)throws Exception{
//                 Scanner scn = new Scanner(System.in);
//                 int n = scn.nextInt();
//                 int[]arr = new int[n];
//                 for(int i = 0;i < arr.length;i++){
//                         arr[i] = scn.nextInt();
//                 }
//                 int limit = (int)Math.pow(2 , arr.length);
//                 for(int i = 0;i < limit;i++){
//                         String set = "";
//                         int temp = i;
//                         for(int j =arr.length - 1;j >= 0;j--){
//                                 int r = temp % 2;
//                                 temp = temp / 2;
//                                 if(r == 0){
//                                         set = "-\t" + set;
//                                 }else{
//                                         set = arr[j] + "\t" + set;
//                                 }
//                         }
//                         System.out.println(set);
//                 }
//         }
// }

//BINARY SEARCH ALGORITHM
// import java.util.*;
// public class Main{
//         public static void main(String[]args){
//                 int[]arr = {10,20,30,40,50,60,70,80,90,100};
//                 int data = 70;
//                 int l = 0;
//                 int h = arr.length - 1;
//                 while(l <= h){
//                         int m = (l + h) / 2;
//                         if(data < arr[m]){
//                                 h = m - 1;
//                         }else if(data > arr[m]){
//                                 l = m + 1;
//                         }else{
//                                 System.out.println(m);
//                                 return;
//                         }
//                 }
//                 System.out.println(-1);
//         }
// }

//CEIL AND FLOOR
// import java.io.*;
// import java.util.*;
// public class Main{
//         public static void main(String[]args)throws Exception{
//                 Scanner scn = new Scanner(System.in);
//                 int n = scn.nextInt();
//                 int[]arr = new int[n];
//                 for(int i = 0;i < arr.length;i++){
//                         arr[i] = scn.nextInt();
//                 } 
//                 int data = scn.nextInt();
//                 int lo = 0;
//                 int hi = arr.length - 1;
//                 int ceil = 0;
//                 int floor = 0;
//                 while(lo <= hi){
//                         int mid = (lo + hi) / 2;
//                         if(data < arr[mid]){
//                                hi = mid - 1;
//                                ceil = arr[mid]; 
//                         }else if(data > arr[mid]){
//                                 lo = mid + 1;
//                                 floor = arr[mid];
//                         }else{
//                                 ceil = arr[mid];
//                                 floor = arr[mid];
//                                 break;
//                         }
//                 } 
//                 System.out.println(ceil);
//                 System.out.println(floor);
//         }
// }

//FIRST AND LAST INDEX
// import java.io.*;
// import java.util.*;
// public class Main{
//         public static void main(String[]args)throws Exception{
//                 Scanner scn = new Scanner(System.in);
//                 int n = scn.nextInt();
//                 int[]arr = new int[n];
//                 for(int i = 0;i < arr.length;i++){
//                         arr[i] = scn.nextInt();
//                 }
//                 int data = scn.nextInt();
//                 int lo = 0;
//                 int hi = arr.length - 1;
//                 int fi = -1;
//                 while(lo <= hi){
//                         int mid = (lo + hi) / 2;
//                         if(data > arr[mid]){
//                                 lo = mid + 1;
//                         }else if(data < arr[mid]){
//                                 hi = mid - 1;
//                         }else{
//                                 fi = mid;
//                                 hi = mid - 1;
//                         }
//                 }
//                 System.out.println(fi);
//                 lo = 0;
//                 hi = arr.length - 1;
//                 int li = -1;
//                 while(lo <= hi){
//                         int mid = (lo + hi) / 2;
//                         if(data > arr[mid]){
//                                 lo = mid + 1;
//                         }else if(data < arr[mid]){
//                                 hi = mid - 1;
//                         }else{
//                                 li = mid;
//                                 lo = mid + 1;
//                         }
//                 }
//                 System.out.println(li);
//         } 
// }

                      //STACKS AND ITS USAGE
//add = push
//remove = pop
//get = peek

// import java.util.*;
// public class Main{
// public static void main(String[]args){
        // Stack<Integer> st = new Stack<>();
        // st.push(10);
        // System.out.println(st + " -> " + st.peek() + "," + st.size());
        // st.push(20);
        // System.out.println(st + " -> " + st.peek() + "," + st.size());
        // st.push(30);
        // System.out.println(st + " -> " + st.peek() + "," + st.size()); 
        // st.push(40);
        // System.out.println(st + " -> " + st.peek() + "," + st.size());
        // st.pop();
        // System.out.println(st + " -> " + st.peek() + "," + st.size());
        // st.pop();
        // System.out.println(st + " -> " + st.peek() + "," + st.size());
        // st.pop();
        // System.out.println(st + " -> " + st.peek() + "," + st.size());
        // st.pop();
        // System.out.println(st + " -> " + " " + st.size());
  
    //QUESTIONS

//DUPLICATE BRACKETS
// Scanner scn = new Scanner(System.in);
// String str = scn.nextLine();
// Stack<Character> st = new Stack<>();
// for(int i = 0; i < str.length(); i++){
//         char ch = str.charAt(i);
//         if(ch == ')'){
//                 if(st.peek() == '('){
//                         System.out.println(true);
//                         return;
//                 }else{
//                         while(st.peek() != '('){
//                         st.pop();
//                         }
//                 st.pop();
//                 }
//         }else{
//             st.push(ch);
//         }
// }
// System.out.println(false);
// }
// }

//BALANCED BRACKETS
// import java.util.*;
// public class Main{
// public static void main(String[]args){
//         Scanner scn = new Scanner(System.in);
//         String str = scn.nextLine();
//         Stack<Character> st = new Stack<>();
//         for(int i = 0; i < str.length(); i++){
//             char ch = str.charAt(i);
//             if(ch == '(' || ch == '{' || ch == '['){
//                 st.push(ch); 
//             }else if(ch == ')'){
//                 boolean val = handleClosing(st,'(');
//                 if(val == false){
//                         System.out.println(val);
//                         return;
//                 }
//             }else if(ch == '}'){
//                 boolean val = handleClosing(st,'{');
//                 if(val == false){
//                         System.out.println(val);
//                         return;
//                 }
//             }else if(ch == ']'){
//                 boolean val = handleClosing(st,'[');
//                 if(val == false){
//                         System.out.println(val);
//                         return;
//                 }else{
//                 }
//             }
//         }
//         if(st.size() == 0){
//                 System.out.println(true);
//         }else{
//                 System.out.println(false);
//         }
// }
//   public static boolean handleClosing(Stack<Character> st , char corresoch){
//     if(st.size() == 0){
//        return false;
//     }else if(st.peek() != '(' ){
//         return false;
//     }else{
//         st.pop();
//         return true;
//    }
//   }
// }

//NEXT GREATER ELEMENT TO THE RIGHT
// import java.io.*;
// import java.util.*;
// public class Main{
//         public static void display(int[] a){
//                 StringBuilder sb = new StringBuilder();
//                 for(int val : a){
//                         sb.append(val+"\n");
//                 }
//                 System.out.println(sb);
//         }
// public static void main(String[]args) throws Exception{
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         int n = Integer.parseInt(br.readLine());
//         int[] a = new int[n]; 
//         for(int i = 0; i < n; i++){
//                 a[i] = Integer.parseInt(br.readLine());
//         }
//         int[]nge = solve(a);
//         display(nge);
// }
// public static int[] solve(int[]arr){
//         int[]nge = new int[arr.length];
//         Stack<Integer> st = new Stack<>();
//first method(from right to left)
        // st.push(arr[arr.length-1]);
        // nge[arr.length - 1] = -1;
        // for(int i = arr.length - 2; i >= 0; i--){
        //     while(st.size() > 0 && arr[i] >= st.peek()){
        //         st.pop();
        //     }
        //     if(st.size() == 0){
        //         nge[i] = -1;
        //     }else{
        //         nge[i] = st.peek();
        //     }
        //     st.push(arr[i]);
        // }
        // return nge;
//second method(from left to the right)
//            st.push(0);
//            for(int i = 1; i < arr.length; i++){
//                 while(st.size() > 0 && arr[i] > arr[st.peek()]){
//                         int pos = st.peek();
//                         nge[pos] = arr[i];
//                         st.pop();
//                 }
//                 st.push(i);
//            }
//            while(st.size() > 0){
//                 int pos = st.peek();
//                 nge[pos] = -1;
//                 st.pop();
//            }
//            return nge;
// }
// }

//STOCK SPAN
// import java.io.*;
// import java.util.*;
// public class Main{
//         public static void display(int[] a){
//                 StringBuilder sb = new StringBuilder();
//                 for(int val : a){
//                         sb.append(val+"\n");
//                 }
//                 System.out.println(sb);
//         }
// public static void main(String[]args) throws Exception{
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         int n = Integer.parseInt(br.readLine());
//         int[] a = new int[n]; 
//         for(int i = 0; i < n; i++){
//                 a[i] = Integer.parseInt(br.readLine());
//         }
//         int[]span = solve(a);
//         display(span);
// }
// public static int[] solve(int[]arr){
// int[]span = new int[arr.length];
// Stack<Integer> st = new Stack<>();
// st.push(0);
// span[0] = 1;
// for(int i = 1; i < arr.length; i++){
//         while(st.pop() > 0 && arr[i] > arr[st.peek()]){
//                 st.pop();
//         }
//         if(st.size() == 0){
//                 span[i] = i + 1;
//         }else{
//                 span[i] = i - st.peek();
//         }
//         st.push(i);
// }
// return span;
// }
// }

//LARGEST AREA HISTOGRAM
// import java.io.*;
// import java.util.*;
// public class Main{
//         public static void main(String[]args) throws Exception{
//                 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//                 int n = Integer.parseInt(br.readLine());
//                 int[] arr = new int[n]; 
//                 for(int i = 0; i < n; i++){
//                         arr[i] = Integer.parseInt(br.readLine());
//                 }
//                 int[] rb = new int[arr.length]; //nse index on the right
//                 Stack<Integer> st = new Stack<>();
//                 st.push(arr.length - 1);
//                 rb[arr.length - 1] = arr.length;
//                 for(int i = arr.length - 2; i >= 0; i--){
//                         while(st.size() > 0 && arr[i] <= arr[st.peek()]){
//                                 st.pop();
//                         }
//                         if(st.size() == 0){
//                                 rb[i] = arr.length;
//                         }else{
//                                 rb[i] = st.peek();
//                         }
//                         st.push(i);
//                 }
//                 int[] lb = new int[arr.length]; //nse index on the left
//                 st = new Stack<>();
//                 st.push(0);
//                 lb[0] = -1;
//                 for(int i = 1; i < arr.length; i++){
//                         while(st.size() > 0 && arr[i] <= arr[st.peek()]){
//                                 st.pop();
//                         }
//                         if(st.size() == 0){
//                                 lb[i] = -1;
//                         }else{
//                                 lb[i] = st.peek();
//                         }
//                         st.push(i);
//                 }
//                 int maxArea = 0;
//                 for(int i = 0; i < arr.length; i++){
//                         int width = rb[i] - lb[i] - 1;
//                         int area = width*arr[i];
//                         if (area>maxArea){
//                                 maxArea = area;
//                         }
//                 }
//                 System.out.println(maxArea);
// }
// }

//SLIDING WINDOW MAXIMUM
// import java.io.*;
// import java.util.*;
// public class Main{
//         public static void main(String[]args) throws Exception{
//                 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//                 int n = Integer.parseInt(br.readLine());
//                 int[]arr = new int[n]; 
//                 for(int i = 0; i < n; i++){
//                         arr[i] = Integer.parseInt(br.readLine());
//                 }
//                 int k = Integer.parseInt(br.readLine());
//                 Stack<Integer> st = new Stack<>();
//                 int[]nge = new int[arr.length];
//                 st.push(arr.length - 1);
//                 nge[arr.length - 1] = arr.length;
//                 for(int i = arr.length - 2; i >= 0; i--){
//                         //-a+
//                         while(st.size() > 0 && arr[i] > arr[st.peek()]){
//                                 st.pop();
//                         }
//                         if(st.size() == 0){
//                                 nge[i] = arr.length;
//                         }else{
//                                 nge[i] = st.peek();
//                         }
//                         st.push(i);
//                 }
//                 int j = 0;
//                 for(int i = 0;i <= arr.length - k;i++){
//                         //enter the loop to find the maximum of window starting at i
//                         if(j < i){
//                                 j = i;
//                         }
//                         while(nge[j] < i + k){
//                                 j = nge[j];
//                         }
//                         System.out.println(arr[j]);
//                 }
//         }
// }

//INFIX EVALUATION
//nd - opnds.push;( - tors.push;) - pop till;tor - =/< pop ; *,/ > +,-
// import java.io.*;
// import java.util.*;
// public class Main{
//         public static void main(String[]args) throws Exception{
//                 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//                         String exp = br.readLine();
//                         Stack<Integer> opnds = new Stack<>();      //opnds = operands(a,b,c,etc)
//                         Stack<Character> optors = new Stack<>();   //optors = operators(+,-,/,*,etc)
//                         for(int i = 0;i < exp.length(); i++){
//                                 char ch = exp.charAt(i);
//                                 if(ch == (i)){
//                                         optors.push(ch);
//                                 }else if(Character.isDigit(ch)){
//                                         opnds.push (ch - '0'); //char to int
//                                 }else if(ch == ')'){
//                                         while(optors.peek() != '('){
//                                                 char optor = optors.peek();
//                                                 int v2 = opnds.pop();
//                                                 int v1 = opnds.pop();
//                                                 int opv = operation(v1,v2,optor);
//                                                 opnds.push(opv);
//                                         }
//                                 optors.pop();
//                                 }else if(ch == '+' || ch == '-' || ch == '*' || ch == '/'){
//                                         //ch is wanting higher priority operators to solve first
//                                         while(optors.size() > 0 && optors.peek() != '(' && precedence(ch) <= precedence(optors.peek())){
//                                                 char optor = optors.peek();
//                                                 int v2 = opnds.pop();
//                                                 int v1 = opnds.pop();
//                                                 int opv = operation(v1,v2,optor);
//                                                 opnds.push(opv);  
//                                         }
//                                 }
//                                 //ch is pushing itself now
//                                 optors.push(ch);                   
//                         while(optors.size() != 0){
//                                 char optor = optors.peek();
//                                 int v2 = opnds.pop();
//                                 int v1 = opnds.pop();
//                                 int opv = operation(v1,v2,optor);
//                                 opnds.push(opv);     
//                         }
//                         System.out.println(opnds.peek());
//                 }
//         }
//         public static int precedence(char optor){
//                 if(optor == '+'){
//                         return 1;
//                 }else if(optor == '-'){
//                         return 1;
//                 }else if(optor == '*'){
//                         return 2;
//                 }else {
//                         return 2;
//                 }
//         }
//         public static int operation(int v1,int v2 ,char optor){
//                 if(optor == '+'){
//                         return v1 + v2;
//                 }else if(optor == '-'){
//                         return v1 - v2;
//                 }else if(optor == '*'){
//                         return v1 * v2;
//                 }else {
//                         return v1/v2;
//                 }       
//         }
// }          

//INFIX CONVERSIONS
    //infix = a + b
    //postfix = ab+ ; operators after operands
    //prefix = +ab ; operands after operators
// import java.io.*;
// import java.util.*;
// public class Main{
//         public static void main(String[]args) throws Exception{
//                 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//                 String exp = br.readLine();
//                 Stack<String> postfix = new Stack<>();
//                 Stack<String> prefix = new Stack<>();
//                 Stack<Character> ops = new Stack<>();
//                 for(int i = 0; i < exp.length(); i++){
//                         char ch = exp.charAt(i);
//                         if(ch == '('){
//                                 ops.push(ch);
//                         }else if((ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9') || (ch >= 'A' && ch <='Z')){
//                                 postfix.push(ch + "");
//                                 prefix.push(ch + "");
//                         }else if(ch == ')'){
//                                 while(ops.peek() != '('){
//                                        process(ops,postfix,prefix);
//                                 }
//                                 ops.pop();
//                         }else if(ch == '+' || ch == '-' || ch == '*' || ch == '/'){
//                                 while(ops.size() > 0 && ops.peek() != '(' && precedence(ch) >= precedence(ops.peek())){
//                                        process(ops,postfix,prefix);
//                                 }
//                                 ops.push(ch);
//                         }
//                 }
//                 while(ops.size() > 0){
//                         process(ops,postfix,prefix);
//                  }
//                 System.out.println(postfix.pop());
//                 System.out.println(prefix.pop());
//         }
//         public static void process(Stack<Character>ops, Stack<String>postfix, Stack<String>prefix ){
//                 char op = ops.pop();
//                 String postv2 = postfix.pop();
//                 String postv1 = postfix.pop();
//                 String postv =  postv1 + postv2 + op;
//                 postfix.push(postv);
//                 String prev2 = prefix.pop();
//                 String prev1 = prefix.pop();
//                 String prev = op + prev1 + prev2;
//                 prefix.push(prev);
//         }
//         public static int precedence(char op){
//                 if(op == '+' || op == '-'){
//                         return 1;
//                 }else if(op == '*' || op == '/'){
//                         return 2;
//                 }else{
//                         return 0;
//                 }
//         }
// }

//POSTFIX EXPRESSIONS
// import java.io.*;
// import java.util.*;
// public class Main{
//         public static void main(String[]args) throws Exception{
//                 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//                 String exp = br.readLine();
//                 Stack<Integer> vs = new Stack<>();
//                 Stack<String> is = new Stack<>();
//                 Stack<String> ps = new Stack<>();
//                 for(int i = 0;i < exp.length(); i++){
//                         char ch = exp.charAt(i);
//                         if(ch == '+' || ch == '-' || ch == '*' || ch =='/'){
//                                 int v2 = vs.pop();
//                                 int v1 = vs.pop();
//                                 int val = operation(v1,v2,ch);
//                                 vs.push(val);
//                                 String inv2 = is.pop();
//                                 String inv1 = is.pop();
//                                 String inval = "(" + inv1 + ch + inv2 + ")";
//                                 is.push(inval);
//                                 String pov2 = ps.pop();
//                                 String pov1 = ps.pop();
//                                 String poval = ch + pov1 + pov2 ;
//                                 ps.push(poval);
//                         }else{
//                                 vs.push(ch - '0');
//                                 is.push(ch + "");
//                                 ps.push(ch + "");
//                         }
//                 }
//                 System.out.println(vs.pop());
//                 System.out.println(is.pop());
//                 System.out.println(ps.pop());
//         }
//         public static int operation(int v1,int v2,char op){
//                 if(op == '+'){
//                         return v1 + v2;
//                 }else if(op == '-'){
//                         return v1 - v2;
//                 }else if(op == '*'){
//                         return v1 * v2;
//                 }else{
//                         return v1/v2;
//                 }
//         }
// }

//PREFIX EVALUATIONS AND CONVERSIONS
// import java.io.*;
// import java.util.*;
// public class Main{
//         public static void main(String[]args) throws Exception{
//                 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//                 String exp = br.readLine();
//                 Stack<Integer> vs = new Stack<>();
//                 Stack<String> is = new Stack<>();
//                 Stack<String> ps = new Stack<>();
//                 for(int i = exp.length() - 1;i >= 0;i--){
//                         char ch = exp.charAt(i);
//                         if(ch == '+' || ch == '-' || ch == '*' || ch == '/'){
//                                 int v1 = vs.pop();
//                                 int v2 = vs.pop();
//                                 int val = operation(v1,v2,ch);
//                                 vs.push(val);
//                                 String inv1 = is.pop();
//                                 String inv2 = is.pop();
//                                 String inval = "(" + inv1 + ch + inv2 + ")";
//                                 is.push(inval);
//                                 String pov1 = ps.pop();
//                                 String pov2 = ps.pop();
//                                 String poval = pov1 + pov2 + ch;
//                                 ps.push(poval);
//                         }else{
//                                 vs.push(ch - '0');
//                                 is.push(ch + "");
//                                 ps.push(ch + "");
//                         }
//                 }
//                 System.out.println(vs.pop());
//                 System.out.println(is.pop());
//                 System.out.println(ps.pop());
//         }
//         public static int operation(int v1, int v2,char op){
//                 if(op == '+'){
//                         return v1 + v2;
//                 }else if(op == '-'){
//                         return v1 - v2;
//                 }else if(op == '*'){
//                         return v1*v2;
//                 }else{
//                         return v1/v2;
//                 }
//         }
// }

//MERGING OVERLAPPING TUTORIAL
// import java.io.*;
// import java.util.*;
// public class Main{
//         public static void main(String[]args) throws Exception{
//                 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//                 int n = Integer.parseInt(br.readLine());
//                 int[][]arr = new int[n][2]; 
//                 for(int j = 0; j < n; j++){
//                         String line = br.readLine();
//                         arr[j][0] = Integer.parseInt(line.split(" ")[0]);
//                         arr[j][1] = Integer.parseInt(line.split(" ")[0]);
//                 }
//                 mergeOverlappingIntervals(arr);
//         }
//         public static void mergeOverlappingIntervals(int[][]arr){
//                 Pair[]pairs = new Pair[arr.length];
//                 for(int i = 0; i < arr.length;i++){
//                         pairs[i] = new Pair(arr[i][0],arr[i][1]);
//                 }
//                 Arrays.sort(pairs);
//                 Stack<Pair>st = new Stack<>();
//                 for(int i = 0;i < pairs.length;i++){
//                         if(i == 0){
//                                 st.push(pairs[i]);
//                         }else{
//                                 Pair top = st.peek();
//                                 if(pairs[i].st > top.et){
//                                         st.push(pairs[i]);
//                                 }else{
//                                         top.et = Math.max(top.et,pairs[i].et);
//                                 }
//                         }
//                 }
//                 Stack<Pair>rs = new Stack<>();
//                 while(st.size() > 0){
//                         rs.push(st.pop());
//                 }
//                 while(rs.size() > 0){
//                         Pair p =rs.pop();
//                         System.out.print(p.st + " " + p.et); 
//                 }
//         }
//         public static class Pair implements Comparable<Pair>{
//                 int st;
//                 int et;
//                 Pair(int st,int et){
//                         this.st = st;
//                         this.et = et;
//                 }
//                 //this > other;return +ve
//                 //this = other;return 0
//                 //this < other;return -ve
//                 public int compareTo(Pair other){
//                         if(this.st != other.st){
//                                 return this.st - other.st;
//                         }else{
//                                 return this.et - other.et;
//                         }
//                 }
//         }
// }

//CELEBRITY PROBLEM
   //celebrity is a person who knows nobody but known by everybody
// import java.io.*;
// import java.util.*;
// public class Main{
//         public static void main(String[]args) throws Exception{
//                 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//                 int n = Integer.parseInt(br.readLine());
//                 int[][]arr = new int[n][n]; 
//                 for(int j = 0; j < n; j++){
//                         String line = br.readLine();
//                         for(int k = 0; k < n; k++){
//                                 arr[j][k] = line.charAt(k) - 0;
//                         }
//                 }
//                 findCelebrity(arr);
//         }
//         public static void findCelebrity(int arr[][]){
//                 Stack<Integer> st = new Stack<>();
//                 for(int i = 0; i < arr.length; i++){
//                         st.push(i);
//                 }
//                 while(st.size() >= 2){
//                         int i = st.pop();
//                         int j = st.pop();
//                    if(arr[i][j] == 1){
//                         //if i knows j -> i is not a celebrity
//                         st.push(j);
//                    }else{
//                         //if i doesnot know j -> j is not a celebrity
//                         st.push(i);
//                    }
//                 }
//                 int pot = st.pop();
//                 for(int i = 0; i < arr.length; i++){
//                         if(i != pot){
//                                 if(arr[i][pot] == 0 || arr[pot][i] == 1){
//                                         System.out.println("none");
//                                         return;
//                                 }
//                         }
//                 }
//                 System.out.println(pot);
//         }
// }

//SMALLEST NUMBER FOLLOWING PATTERN
// import java.io.*;
// import java.util.*;
// public class Main{
//         public static void main(String[]args) throws Exception{
//                 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//                 String str = br.readLine();
//                 Stack<Integer> st = new Stack<>();
//                 int num = 1;
//                 for(int i = 0; i < str.length(); i++){
//                         char ch = str.charAt(i);
//                         if(ch == 'd'){
//                                 st.push(num);
//                                 num++;
//                         }else{
//                                 st.push(num);
//                                 num++;
//                                 while(st.size() > 0){
//                                         System.out.print(st.pop());
//                                 }
//                         }
//                 }
//                 st.push(num);
//                 while(st.size() > 0){
//                         System.out.print(st.pop());
//                 }
//         }
// }


                                     //OOPS

// import java.util.*;
// public class Main{
//         public static class Person{
//                 int age;
//                 String name;
//                 void saysHi(){
//                         System.out.println(name + "[" + age + "] says hi");
//                 }
//         }
        // public static void main(String[]args){
        //         Person p1 = new Person();
        //         p1.age = 10;
        //         p1.name = "A";
        //         p1.saysHi();
        //         Person p2 = new Person();
        //         p2.age = 20;
        //         p2.name = "B";
        //         //p2.saysHi();
        //         p1.saysHi();
        //         p2.saysHi();
        //         swap1(p1,p2);
        //         p1.saysHi();
        //         p2.saysHi();
        // }
        // public static void swap1(Person psn1, Person psn2){
        //swap game 1
                // Person temp = psn1;
                // psn1 = psn2;
                // psn2 = temp;
        //swap game 2
                // int age = psn1.age;
                // psn1.age = psn2.age;
                // psn2.age = age;
                // String name = psn1.name;
                // psn1.name = psn2.name;
                // psn2.name = name;
        //swap game 3
                // psn1 = new Person();
                // int age = psn1.age;
                // psn1.age = psn2.age;
                // psn2.age = age;
                // psn2 = new Person();
                // String name = psn1.name;
                // psn1.name = psn2.name;
                // psn2.name = name;
//         }
// }

//CONSTRUCTORS AND THIS IN OOPS
// import java.util.*;
// public class Main{
//         public static class Person{
//                 int age;
//                 String name;
//                 void saysHi(){
//                         System.out.println(name + "[" + age + "] says hi");
//                 }
//                 //if we forget , java provides our class a default constructor
//                 Person(){
//                         //constructor
//                 }
//                 //parametrized
//                 Person(int age, String name){
//                         this.age = age;
//                         this.name = name;
//                 }
//         }
//         public static void main(String[]args){
//                 Person p1 = new Person();
//                 p1.age = 10;
//                 p1.name = "A";
//                 p1.saysHi();
//                 Person p2 = new Person(20,"B");
//                 p2.saysHi();
//         }
// }

//BUILD NORMAL STACK

//BUILD DYNAMIC STACK

//MINIMUM STACK 1

//MINIMUM STACK 2

//TWO STACKS IN AN ARRAY
// import java.io.*;
// import java.util.*;
// public class Main{
//         public static class TwoStack{
//                 int[] data;
//                 int tos1;
//                 int tos2;
//                 public TwoStack(int cap){
//                         data = new int[cap];
//                         tos1 = -1;
//                         tos2 = data.length;
//                 }
//                 int size1(){
//                         return tos1 + 1;
//                 }
//                 int size2(){
//                         return data.length - tos2;
//                 }
//                 void push1(int val){
//                         if(tos2 == tos1 + 1){
//                                 System.out.println("Stack overflow");
//                         }else{
//                                 tos1++;
//                                 data[tos1] = val;
//                         }
//                 }
//                 void push2(int val){
//                         if(tos2 == tos1 + 1){
//                                 System.out.println("Stack overflow");
//                         }else{
//                                 tos2--;
//                                 data[tos2] = val;
//                         }
//                 }
//                 int pop1(){
//                         if(size1() == 0){
//                                 System.out.println("Stack underflow");
//                                 return -1;
//                         }else{
//                                 int val = data[tos1];
//                                 tos1--;
//                                 return val;
//                         }
//                 }
//                 int pop2(){
//                         if(size2() == 0){
//                                 System.out.println("Stack underflow");
//                                 return -1;
//                         }else{
//                                 int val = data[tos2];
//                                 tos2++;
//                                 return val;
//                         }
//                 }
//                 int top1(){
//                         if(size1() == 0){
//                                 System.out.println("Stack underflow");
//                                 return -1;
//                         }else{
//                                 int val = data[tos1];
//                                 return val;
//                         }       
//                 }
//                 int top2(){
//                         if(size2() == 0){
//                                 System.out.println("Stack underflow");
//                                 return -1;
//                         }else{
//                                 int val = data[tos2];
//                                 return val;
//                         }
//                 }
//         }
// }


                                      //QUEUES
// import java.util.*;
// public class Main{
//         public static void main(String[]args){
//                 Queue<Integer>que = new ArrayDeque<>();
//                 que.add(10);
//                 System.out.println(que);
//                 que.add(20);
//                 System.out.println(que);
//                 que.add(30);
//                 System.out.println(que);
//                 System.out.println(que.remove());
//                 System.out.println(que);
//                 System.out.println(que.peek());
//                 System.out.println(que);          
//         }
// }

       //QUESTIONS

//QUEUE TO STACK ADAPTER - POP EFFICIENT
// import java.io.*;
// import java.util.*;
// public class Main{
//         public static class QueueToStackAdapter{
//                 Queue<Integer> mainQ;
//                 Queue<Integer> helperQ;
//                 public QueueToStackAdapter(){
//                         mainQ = new ArrayDeque<>();
//                         helperQ = new ArrayDeque<>();
//                 }
//                 int size(){
//                         return mainQ.size();
//                 }
//                 void push(int val){
//                         while(mainQ.size() > 0){
//                                 helperQ.add(mainQ.remove());
//                         }
//                         mainQ.add(val);
//                         while(helperQ.size() > 0){
//                                 mainQ.add(helperQ.remove());
//                         }
//                 }
//                 int pop(){
//                         if(size() == 0){
//                                 System.out.println("Stack underflow");
//                                 return -1;
//                         }else{
//                                 return mainQ.remove();
//                         }
//                 }
//                 int top(){
//                         if(size() == 0){
//                                 System.out.println("Stack underflow");
//                                 return -1;
//                         }else{
//                                 return mainQ.peek();
//                         }
//                 }
//         }
// }

//QUEUE TO STACK ADAPTER-PUSH EFFICIENT
// import java.io.*;
// import java.util.*;
// public class Main{
//         public static class QueueToStackAdapter{
//                 Queue<Integer> mainQ;
//                 Queue<Integer> helperQ;
//                 public QueueToStackAdapter(){
//                         mainQ = new ArrayDeque<>();
//                         helperQ = new ArrayDeque<>();
//                 }
//                 int size(){
//                         return mainQ.size();
//                 }
//                 void push(int val){
//                         mainQ.add(val);
//                 }
//                 int pop(){
//                         if(size() == 0){
//                                 System.out.println("Stack underflow");
//                                 return -1;
//                         }else{
//                                 while(mainQ.size() > 1){
//                                         helperQ.add(mainQ.remove());
//                                 }
//                                 int val = mainQ.remove();
//                                 while(helperQ.size() > 0){
//                                         mainQ.add(helperQ.remove());
//                                 }
//                                 return val;
//                         }
//                 }
//                 int top(){
//                         if(size() == 0){
//                                 System.out.println("Stack underflow");
//                                 return -1;
//                         }else{
//                                 while(mainQ.size() > 1){
//                                         helperQ.add(mainQ.remove());
//                                 }
//                                 int val = mainQ.remove();
//                                 helperQ.add(val);
//                                 while(helperQ.size() > 0){
//                                         mainQ.add(helperQ.remove());
//                                 }
//                                 return val;
//                         }
//                 }
//         }
// }

//STACK TO QUEUE ADAPTER-REMOVE EFFICIENT
// import java.io.*;
// import java.util.*;
// public class Main{
//         public static class StackToQueueAdapter{
//                 Stack<Integer> mainS;
//                 Stack<Integer> helperS;
//                 public StackToQueueAdapter(){
//                         mainS = new Stack<>();
//                         helperS = new Stack<>();
//                 }
//                 int size(){
//                         return mainS.size();
//                 }
//                 void add(int val){
//                         while(mainS.size() > 0){
//                                 helperS.push(mainS.pop());
//                         }
//                         mainS.push(val);
//                         while(helperS.size() > 0){
//                                 mainS.push(helperS.pop());
//                         }
//                 }
//                 int remove(){
//                         if(size() == 0){
//                                 System.out.println("Queue underflow");
//                                 return -1;
//                         }else{
//                                 return mainS.pop();
//                         }
//                 }
//                 int peek(){
//                         if(size() == 0){
//                                 System.out.println("Queue underflow");
//                                 return -1;
//                         }else{
//                                 return mainS.peek();
//                         }
//                 }
//         }
// }

//STACK TO QUEUE ADAPTER-ADD EFFICIENT
// import java.io.*;
// import java.util.*;
// public class Main{
//         public static class StackToQueueAdapter{
//                 Stack<Integer> mainS;
//                 Stack<Integer> helperS;
//                 public StackToQueueAdapter(){
//                         mainS = new Stack<>();
//                         helperS = new Stack<>();
//                 }
//                 int size(){
//                         return mainS.size();
//                 }
//                 void add(int val){
//                         mainS.push(val);
//                 }
//                 int remove(){
//                         if(size() == 0){
//                                 System.out.println("Queue underflow");
//                                 return -1;
//                         }else{
//                                 while(mainS.size() > 1){
//                                         helperS.push(mainS.pop());
//                                 }
//                                 int val = mainS.pop();              
//                                 while(helperS.size() > 0){
//                                         mainS.push(helperS.pop());
//                                 }
//                                 return val; 
//                         }
//                 }
//                 int peek(){
//                         if(size() == 0){
//                                 System.out.println("Queue underflow");
//                                 return -1;
//                         }else{
//                                 while(mainS.size() > 1){
//                                         helperS.push(mainS.pop());
//                                 }
//                                 int val = mainS.pop();
//                                 helperS.push(val);
//                                 while(helperS.size() > 0){
//                                         mainS.push(helperS.pop());
//                                 }
//                                 return val; 
//                         }
//                 }
//         }
// }


                                    //LINKED LIST
// import java.io.*;
// import java.util.*;
// public class Main{
//         public static class Node{
//                 int data;
//                 Node next;
//         }
//         public static class LinkedList{
//                 Node head;
//                 Node tail;
//                 int size;
//         }
//         public static void main(String[]args) throws Exception {
//         }
// }

        //QUESTIONS

//ADD LAST IN LINKED LIST;DISPLAY AND SIZE OF LINKED LIST;REMOVE FIRST,GET VALUE,ADD FIRST,ADD AT INDEX,REMOVE LAST,REMOVE AT INDEX IN LINKED LIST;REVERSE A LINKED LIST IN DATA ITERATIVE AND POINTER ITERATIVE
// import java.io.*;
// import java.util.*;
// public class Main{
//         public static class Node{
//                 int data;
//                 Node next;
//         }
//         public static class LinkedList{
//                 Node head;
//                 Node tail;
//                 int size;
//                 void addLast(int val){
//                         Node temp = new Node();
//                         temp.data = val;
//                         temp.next = null;
//                         if(size == 0){
//                                 head = tail = temp;
//                         }else{
//                                 tail.next = temp;
//                                 tail = temp;
//                         }
//                         size++;
//                 }
//                 public int size(){
//                         return size;
//                 }
//                 public void display(){
//                         Node temp = head;
//                         while(temp != null){
//                         System.out.println(temp.data + " ");
//                         temp = temp.next;
//                         }
//                         System.out.println();
//                 }
//                 public void removeFirst(){
//                         if(size == 0){
//                                 System.out.println("List is empty");
//                         }else if(size == 1){
//                                 head = tail = null;
//                                 size = 0;
//                         }else{
//                                 head = head.next;
//                                 size--;
//                         }
//                 }
//                 public int getFirst(){
//                         if(size == 0){
//                                 System.out.println("List is empyt");
//                                 return -1;
//                         }else{
//                                 return head.data;
//                         }
//                 }
//                 public int getLast(){
//                         if(size == 0){
//                                 System.out.println("List is empyt");
//                                 return -1;
//                         }else{
//                                 return tail.data;
//                         }
//                 }
//                 public int getAt(int idx){
//                         if(size == 0){
//                                 System.out.println("List is empyt");
//                                 return -1;
//                         }else if(idx < 0 || idx >= size){
//                                 System.out.println("Invalid arguments");
//                                 return -1;
//                         }else{
//                                 Node temp = head;
//                                 for(int i = 0;i < idx;i++){
//                                         temp = temp.next;
//                                 }
//                                 return temp.data;
//                         }
//                 }
//                 public void addFirst(int val){
//                         Node temp = new Node();
//                         temp.data = val;
//                         temp.next = head;
//                         head = temp;
//                         if(size == 0){
//                                 tail = temp;
//                         }
//                         size++;
//                 }
//                 public void addAt(int idx, int val){
//                         if(idx < 0 || idx > size){
//                                 System.out.println("Invalid arguments");
//                         }else if(idx == 0){
//                                 addFirst(val);
//                         }else if(idx == size){
//                                 addLast(val);
//                         }else{
//                                 Node node = new Node();
//                                 node.data = val;
//                                 Node temp = head;
//                                 for(int i = 0; i < idx - 1; i++){
//                                         temp = temp.next;
//                                 }
//                                 node.next = temp.next;
//                                 temp.next = node;
//                                 size++;
//                         }
//                 }
//                 public void removeLast(){
//                         if(size == 0){
//                                 System.out.println("List is empty");
//                         }else if(size == 1){
//                                 head = tail = null;
//                                 size = 0;
//                         }else{
//                                 Node temp = head;
//                                 for(int i = 0;i < size - 2;i++){
//                                         temp = temp.next;
//                                 }
//                                 tail = temp;
//                                 temp.next = null;
//                                 size--;
//                         }
//                 }
//                 public void removeAt(int idx){
//                         if(idx < 0 || idx >= size){
//                                 System.out.println("Invalid arguments");
//                         }else if(idx == 0){
//                                 removeFirst();
//                         }else if(idx == size - 1){
//                                 removeLast();
//                         }else{
//                                 Node temp = head;
//                                 for(int i = 0 ; i  < idx - 1; i++){
//                                         temp = temp.next;
//                                 }
//                                 temp.next = temp.next.next;
//                                 size--;
//                         }
//                 }
//                 private Node getNodeAt(int idx){
//                         Node temp = head;
//                                 for(int i = 0;i < idx;i++){
//                                         temp = temp.next;
//                                 }
//                                 return temp;
//                 }
//                 public void reverseDI(){
//                         int li = 0;
//                         int ri = size -1;
//                         while(li < ri){
//                                 Node left = getNodeAt(li);
//                                 Node right = getNodeAt(ri);
//                                 int temp = left.data;
//                                 left.data = right.data;
//                                 right.data = temp;
//                                 li++;
//                                 ri--;
//                         }
//                 }
//                 public void reversePI(){
//                         Node prev = null;
//                         Node curr = head;
//                         while(curr != null){
//                                 Node next = curr.next;
//                                 curr.next = prev;
//                                 prev = curr;
//                                 curr = next;
//                         }
//                         Node temp = head;
//                         head = tail;
//                         tail = temp; 
//                 }
//         }
//         public static void testList(LinkedList list){
//                 for(Node temp = list.head; temp != null; temp = temp.next){
//                         System.out.println(temp.data);
//                 }
//                 System.out.println(list.size);
//                 if(list.size > 0){
//                         System.out.println(list.tail.data);
//                 }
//         }
//         public static void main(String[]args) throws Exception {
//                 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//                 LinkedList list = new LinkedList();
//                 String str = br.readLine();
//                 while(str.equals("quit") == false){
//                         if(str.startsWith("addLast")){
//                                 int val = Integer.parseInt(str.split(" ")[1]);
//                                 list.addLast(val);
//                         }
//                         str = br.readLine();
//                 }
//                 testList(list);
//         }
// }

//LINKED LIST TO STACK ADAPTER
// import java.io.*;
// import java.util.*;
// public class Main{
//         public static class LLtoStackAdapter{
//                 LinkedList<Integer>list;
//                 public LLtoStackAdapter(){
//                         list = new LinkedList<>();
//                 }
//                 int size(){
//                 return list.size();
//                 }
//                 void push(int val){
//                         list.addFirst(val);
//                 }
//                 int pop(){
//                         if(size() == 0){
//                                 System.out.println("Stack underflow");
//                                 return -1;
//                         }else{
//                                 return list.removeFirst();
//                         }
//                 }
//                 int top(){
//                         if(size() == 0){
//                                 System.out.println("Stack underflow");
//                                 return -1;
//                         }else{
//                                 return list.getFirst();
//                         }
//                 }
//         }
//         //FOR MORE CODE REFER VIDEO LECTURE OF THIS SOLUTION
// }

//LINKED LIST TO QUEUE ADAPTER
// import java.io.*;
// import java.util.*;
// public class Main{
//         public static class LLtoQueueAdapter{
//                 LinkedList<Integer>list;
//                 public LLtoQueueAdapter(){
//                         list = new LinkedList<>();
//                 }
//                 int size(){
//                 return list.size();
//                 }
//                 void add(int val){
//                         list.addLast(val);
//                 }
//                 int remove(){
//                         if(size() == 0){
//                                 System.out.println("Stack underflow");
//                                 return -1;
//                         }else{
//                                 return list.removeFirst();
//                         }
//                 }
//                 int peek(){
//                         if(size() == 0){
//                                 System.out.println("Stack underflow");
//                                 return -1;
//                         }else{
//                                 return list.getFirst();
//                         }
//                 }
//         }
//         //FOR MORE CODE REFER VIDEO LECTURE OF THIS SOLUTION
// }

//Kth ELEMENT FROM THE END IN THE LINKED LIST
// public int kthFromLast(int k){
//         Node s = head;
//         Node f = head;
//         for(int i = 0; i < k; i++){
//                 f = f.next;
//         }
//         while(f != tail){
//                 s = s.next;
//                 f = f.next;
//         }
//         return s.data;
// }

//MID OF THE LINKED LIST
// public int mid(){
//         Node s = head;
//         Node f = head;
//         while(f.next != null && f.next.next != null){
//                 s = s.next;
//                 f = f.next.next;
//         }
//         return s.data;
// }

//MERGE TWO SOORTED LINKED LIST
// public static LinkedList mergeTwoSortedLinkedLists(LinkedList l1,LinkedList l2){
//         Node one = l1.head;
//         Node two = l2.head;
//         LinkedList res = new LinkedList();
//         while(one != null && two != null){
//                 if(one.data < two.data){
//                         res.addLast(one.data);
//                         one = one.next;
//                 }else{
//                         res.addLast(two.data);
//                         two = two.next;
//                 }
//                 while(one != null){
//                         res.addLast(one.data);
//                         one = one.next;
//                 }
//                 while(two != null){
//                         res.addLast(two.data);
//                         two = two.next;
//                 }
//                 return res;
//         }
// }

//MERGE SORT OF LINKED LIST
// public static Node midNode(Node head,Node tail){
//         Node f = head;
//         Node s = head;
//         while(f != null && f.next != null){
//                 f = f.next.next;
//                 s = s.next;
//         }
//         return s;
// }
// public static LinkedList mergeSort(Node head = Node tail){
//         if(head == tail){
//                 LinkedList br = new LinkedList();
//                 br.addLast(head.data);
//                 return br;
//         }
//         Node mid = misNode(head,tail);
//         LinkedList fsh = mergeSort(head, mid);
//         LinkedList ssh = mergeSort(mid.next , tail);
//         LinkedList cl = LinkedList.mergeTwoSortedLists(fsh,ssh);
//         return cl; 
// }

//REMOVE DUPLICATES IN A SORTED LINKED LIST
// public void removeDuplicates(){
//         LinkedList res = new LinkedList();
//         while(this.size > 0){
//                 int val = this.getFirst();
//                 this.removeFirst();
//                 if(re.size() == 0 || res.tail.data != val){
//                         res.addaLast(val);
//                 }
//         }
//         this.head = res.head;
//         this.tail = res.tail;
//         this.size = res.size;
// }

//ODD EVEN LIST
// public void oddEven(){
//         LinkedList odd = new LinkedList();
//         LinkedList even = new LinkedList();
//         while(this.size > 0){
//                 int val = this.getFirst();
//                 this.removeFirst();
//                 if(val % 2 == 0){
//                         even.addLast(val);
//                 }else(
//                         odd.addLast(val);
//                 )
//         }
//         if(odd.size > 0 && even.size > 0){
//                 odd.tail.next = even.head;
//                 this.head = odd.head;
//                 this.tail = even.tail;
//                 this.size = odd.size + even.size;
//         }else if(odd.size > 0){
//                 this.head = odd.head;
//                 this.tail = odd.tail;
//                 this.size = odd.size;
//         }else if(even.size > 0){
//                 this.head = even.head;
//                 this.tail = even.tail;
//                 this.size = even.size;
//         }
// }

//K REVERSE IN LINKED LIST
// public void kReverse(int k){
//         LinkedList prev = null;
//         while(this.size > 0){
//                 LinkedList curr = new LinkedList();
//                 if(this.size >= k){
//                         for(int i = 0;i < k;i++){
//                                 int val = this.getFirst();
//                                 this.removeFirst();
//                                 curr.addFirst(val);
//                         }
//                 }else{
//                         int os = this.size();
//                         for(int i = 0;i < os;i++){
//                                 int val = this.getFirst();
//                                 this.removeFirst();
//                                 curr.addLast(val);
//                         }
//                 }
//                 if(prev == null){
//                         prev = curr;
//                 }else{
//                         prev.tai.next = curr.head;
//                         prev.tail = curr.tail;
//                         prev.size += curr.size;
//                 }
//         }
//         this.head = prev.head;
//         this.tail = prev.tail;
//         this.size = prev.size;
// }

//DISPLAY REVERSE LINKED LIST;     (RECURSION IS USED)
// private void displayReverseHelper(Node node){
//         if(Node == null){
//                 return;
//         }
//         displayReverseHelper(node.next);
//         System.out.print(node.data + " ");
// }
// public void displayReverse(){
//         displayReverseHelper(head);
//         System.out.println();
// }

//REVERSE A LINKED LIST USING POINTER ; (RECURSION IS USED)
// private void reversePRHelper(Node node){
//         if(node == null){
//                 return;
//         }
//         reversePRHelper(node.next);
//         if(node == tail){
//                 //nothing to do
//         }else{
//                 node.next.next = node;
//         }
// }
// public void reversePR(){
//         reversePRHelper(head);
//         head.next = null;
//         Node temp = head;
//         head = tail;
//         tail = temp;
// }


                                //RECURSION

//PRINT DECREASING
// import java.io.*;
// import java.util.*;
// public class Main{
//         public static void main(String[]args)throws Exception{
//                 Scanner scn = new Scanner(System.in);
//                 int n = scn.nextInt();
//                 printDecreasing(n);
//         }
//         public static void printDecreasing(int n){
//                 if(n == 0){
//                         return;
//                 }
//                 System.out.println(n);
//                 printDecreasing(n - 1);
//         }
// }

//PRINT INCREASING
// import java.io.*;
// import java.util.*;
// public class Main{
//         public static void main(String[]args)throws Exception{
//                 Scanner scn = new Scanner(System.in);
//                 int n = scn.nextInt();
//                 printIncreasing(n);
//         }
//         public static void printIncreasing(int n){
//                 if(n == 0){
//                         return;
//                 }
//                 printIncreasing(n - 1);
//                 System.out.println(n);
//         }
// }

//PRINT DECREASING INCREASING
// import java.io.*;
// import java.util.*;
// public class Main{
//         public static void main(String[]args)throws Exception{
//                 Scanner scn = new Scanner(System.in);
//                 int n = scn.nextInt();
//                 pDI(n);
//         }
//         public static void pDI(int n){
//                 if(n == 0){
//                         return;
//                 }
//                 System.out.println(n);
//                 pDI(n-1);
//                 System.out.println(n);
//         }
// }

//FACTORIAL
// import java.io.*;
// import java.util.*;
// public class Main{
//         public static void main(String[]args)throws Exception{
//                 Scanner scn = new Scanner(System.in);
//                 int n = scn.nextInt();
//                 int f = factorial(n);
//                 System.out.println(f);
//         }
//         public static int factorial (int n){
//                 if(n == 1){
//                         return 1;
//                 }
//                 int fnm1 = factorial(n-1);
//                 int fn = n * fnm1;
//                 return fn;           
//         }
// }

//POWER(x^n)
// import java.io.*;
// import java.util.*;
// public class Main{
//         public static void main(String[]args)throws Exception{
//                 Scanner scn = new Scanner(System.in);
//                 int x = scn.nextInt();
//                 int n = scn.nextInt();
//                 int xn = power(x,n);
//                 System.out.println(xn);
//         }
//         public static int power(int x , int n){
//                 if(n == 0){
//                         return 1;
//                 }      
//                 int xnm1 = power(x,n-1);
//                 int xn = x * xnm1;
//                 return xn;   
//         }
// }

//POWER(LOGARITHMIC)
// import java.io.*;
// import java.util.*;
// public class Main{
//         public static void main(String[]args)throws Exception{
//                 Scanner scn = new Scanner(System.in);
//                 int x = scn.nextInt();
//                 int n = scn.nextInt();
//                 int xn = power(x,n);
//                 System.out.println(xn);
//         }
//         public static int power(int x,int n){
//                 if(n == 0){
//                         return 1;
//                 }  
//                 int xpnb2 = power(x,n / 2);
//                 int xn = xpnb2 * xpnb2;
//                 if(n % 2 == 1){
//                         xn = xn * x;
//                 }
//                 return xn;
//         }
// }

//PRINT ZIG ZAG
// import java.io.*;
// import java.util.*;
// public class Main{
//         public static void main(String[]args)throws Exception{
//                 Scanner scn = new Scanner(System.in);
//                 int n = scn.nextInt();
//                 pzz(n);
//         }
//         public static void pzz(int n){
//                 if(n == 0){
//                         return;
//                 }
//                 System.out.println("Pre" + n);
//                 pzz(n - 1);
//                 System.out.println("In" + n);
//                 pzz(n - 1);
//                 System.out.println("Post" + n);
//         }
// }

//TOWER OF HANOI
// import java.io.*;
// import java.util.*;
// public class Main{
//         public static void main(String[]args)throws Exception{
//                 Scanner scn = new Scanner(System.in);
//                 int n = scn.nextInt();
//                 int t1d = scn.nextInt();
//                 int t2d = scn.nextInt();
//                 int t3d = scn.nextInt();
//                 toh(n,t1d,t2d,t3d);
//         }
//         public static void toh(int n,int t1id,int t2id,int t3id){
//                 if(n == 0){
//                         return;
//                 }
//                 toh(n - 1,t1id,t3id,t2id); //will print the instructions to move n -1 disks from t1 to t3 using t2
//                 System.out.println(n + "[" + t1id + " -> " + t2id + "]");
//                 toh(n - 1,t3id,t2id,t1id); //will print the instructions to move n -1 disks from t3 to t2 using t1
//         }
// }

//DISPLAY AN ARRAY      
// import java.io.*;
// import java.util.*;
// public class Main{
//         public static void main(String[]args)throws Exception{
//                 Scanner scn  = new Scanner(System.in);
//                 int n = scn.nextInt();
//                 int[]arr = new int[n];
//                 for(int i = 0;i < arr.length;i++){
//                         arr[i] = scn.nextInt();
//                 }
//                 displayArr(arr,0);
//         }
//         //Ex -> idx se end tak sb print krde
//         //Faith -> idx + 1 se end tk sb print krna janta h
//         public static void displayArr(int[]arr,int idx){
//                 if(idx == arr.length){
//                         return;
//                 }
//                 System.out.println(arr[idx]);
//                 displayArr(arr,idx + 1);
//         }
// }

//DISPLAY AN ARRAY IN REVERSE ORDER
// import java.io.*;
// import java.util.*;
// public class Main{
//         public static void main(String[]args)throws Exception{
//                 Scanner scn = new Scanner(System.in);
//                 int n = scn.nextInt();
//                 int[]arr = new int[n];
//                 for(int i = 0;i < arr.length;i++){
//                         arr[i] = scn.nextInt();
//                 }
//                 displayArrReverse(arr,0);
//         } 
//         public static void displayArrReverse(int[]arr,int idx){
//                 if(idx == arr.length){
//                         return;
//                 }
//                 displayArrReverse(arr,idx + 1);
//                 System.out.println(arr[idx]);
//         }
// }

//MAXIMUM OF AN ARRRAY
// import java.io.*;
// import java.util.*;
// public class Main{
//         public static void main(String[]args)throws Exception{
//                 Scanner scn = new Scanner(System.in);
//                 int n = scn.nextInt();
//                 int[]arr = new int[n];
//                 for(int i = 0;i < arr.length;i++){
//                         arr[i] = scn.nextInt();
//                 }
//                 int max = maxOfArray(arr,0);
//                 System.out.println(max);
//         } 
//         public static int maxOfArray(int[]arr,int idx){
//                 if(idx == arr.length - 1){
//                         return arr[idx];
//                 }
//                 int misa = maxOfArray(arr,idx + 1);
//                 if(misa > arr[idx]){
//                         return misa;
//                 }else{
//                         return arr[idx];
//                 }
//         }
// }

//FIRST INDEX OF AN ARRAY
// import java.io.*;
// import java.util.*;
// public class Main{
//         public static void main(String[]args)throws Exception{
//                 Scanner scn = new Scanner(System.in);
//                 int n = scn.nextInt();
//                 int[]arr = new int[n];
//                 for(int i = 0;i < arr.length;i++){
//                         arr[i] = scn.nextInt();
//                 }
//                 int d = scn.nextInt();
//                 int fi = firstIndex(arr,0,d);
//                 System.out.println(fi);
//         } 
//         public static int firstIndex(int[]arr,int idx,int x){
//                 if(idx == arr.length){
//                         return -1;
//                 }
//                 if(arr[idx] == x){
//                         return idx;
//                 }else{
//                         int fiisa = firstIndex(arr,idx + 1,x);
//                         return fiisa;
//                 }
//         }
// }

//LAST INDEX OF AN ARRAY
// import java.io.*;
// import java.util.*;
// public class Main{
//         public static void main(String[]args)throws Exception{
//                 Scanner scn = new Scanner(System.in);
//                 int n = scn.nextInt();
//                 int[]arr = new int[n];
//                 for(int i = 0;i < arr.length;i++){
//                         arr[i] = scn.nextInt();
//                 }
//                 int d = scn.nextInt();
//                 int li = lastIndex(arr,0,d);
//                 System.out.println(li);
//         } 
//         public static int lastIndex(int[]arr,int idx,int x){
//                 if(idx == arr.length){
//                         return -1;
//                 }
//                 int liisa = lastIndex(arr,idx + 1,x);
//                 if(liisa == -1){
//                         if(arr[idx] == x){
//                                 return idx;
//                         }else{
//                                 return -1;
//                         }
//                 }else{
//                         return liisa;
//                 }
//         }
// }

//ALL INDICES OF AN ARRAY
// import java.io.*;
// import java.util.*;
// public class Main{
//         public static void main(String[]args)throws Exception{
//                 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//                 int n = Integer.parseInt(br.readLine());
//                 int[]arr = new int[n];
//                 for(int i = 0;i < n;i++){
//                         arr[i] = Integer.parseInt(br.readLine());
//                 }
//                 int x = Integer.parseInt(br.readLine());
//                 int[]iarr = allIndices(arr,x,0,0);
//                 if(iarr.length == 0){
//                         System.out.println();
//                         return;
//                 }
//                 for(int i = 0;i < arr.length;i++){
//                         System.out.println(arr[i]);
//                 }             
//         } 
//         public static int[] allIndices(int[]arr,int x,int idx,int fsf){
//                 if(idx == arr.length){
//                         return new int[fsf];
//                 }
//                 if(arr[idx] == x){
//                         int[]iarr = allIndices(arr,x,idx + 1,fsf + 1);
//                         iarr[fsf] = idx;
//                         return iarr;
//                 }else{
//                         int[]iarr = allIndices(arr,x,idx + 1,fsf);
//                         return iarr;
//                 }
//         }
// }

//GET SUBSEQUENCE-INTRODUCTION TO ARRAYLIST
// import java.util.*;
// public class Main{
//         public static void main(String[]args)throws Exception{
//                 Scanner scn = new Scanner(System.in);
//                 String str = scn.next();
//                 ArrayList<String> res = gss(str);
//                 System.out.println(res);
//         }
//         public static ArrayList<String> gss(String str){
//                 if(str.length() == 0){
//                         ArrayList<String>bres = new ArrayList<>();
//                         bres.add("");
//                         return bres;
//                 }
//                 char ch = str.charAt(0);
//                 String ros = str.substring(1);
//                 ArrayList<String>rres = gss(ros);
//                 ArrayList<String>mres = new ArrayList<>();
//                 for(String rstr : rres){
//                         mres.add("" + rstr);
//                 }
//                 for(String rstr : rres){
//                         mres.add(ch + rstr);
//                 }
//                 return mres;
//         }
// }

//GET KEYPAD COMBINATION
// import java.util.*;
// public class Main{
//         public static void main(String[]args)throws Exception{
//                 Scanner scn = new Scanner(System.in);
//                 String str = scn.next();
//                 ArrayList<String> words = getKPC(str);
//                 System.out.println(words);
//         }
//         static String[]codes = {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
//         public static ArrayList<String> getKPC(String str){
//                 if(str.length() == 0){
//                         ArrayList<String>bres = new ArrayList<>();
//                         bres.add("");
//                         return bres;
//                 }
//                 char ch = str.charAt(0);             
//                 String ros = str.substring(1); 
//                 ArrayList<String>rres = getKPC(ros);
//                 ArrayList<String>mres = new ArrayList<>();
//                 String codeforch = codes[ch - '0'];
//                 for(int i = 0;i < codeforch.length();i++){
//                        char chcode = codeforch.charAt(i);
//                        for(String rstr : rres){
//                         mres.add(chcode + rstr);
//                        }
//                 }
//                 return mres;
//         }
// }

//GET STAIRS PATH
// import java.util.*;
// public class Main{
//         public static void main(String[]args)throws Exception{
//                 Scanner scn = new Scanner(System.in);
//                 int n = scn.nextInt();
//                 ArrayList<String>paths = getStairPaths(n);
//                 System.out.println(paths);
//         }
//         public static ArrayList<String> getStairPaths(int n){
//                 if(n == 0){
//                         ArrayList<String>bres = new ArrayList<>();
//                         bres.add("");
//                         return bres;
//                 }else if(n < 0){
//                         ArrayList<String>bres = new ArrayList<>();
//                         return bres;
//                 }
//                 ArrayList<String>paths1 = getStairPaths(n - 1);
//                 ArrayList<String>paths2 = getStairPaths(n - 2);
//                 ArrayList<String>paths3 = getStairPaths(n - 3);
//                 ArrayList<String>paths = new ArrayList<>();
//                 for(String path:paths1){
//                         paths.add(1 + path);
//                 }
//                 for(String path:paths2){
//                         paths.add(2 + path);
//                 }
//                 for(String path:paths3){
//                         paths.add(3 + path);
//                 }
//                 return paths;
//         }
// }

//GET MAZE PATH
// import java.io.*;
// import java.util.*;
// public class Main{
//         public static void main(String[]args)throws Exception{
//                 Scanner scn = new Scanner (System.in);
//                 int n = scn.nextInt();
//                 int m = scn.nextInt();
//                 ArrayList<String>paths = getMazePaths(1, 1, n, m);
//                 System.out.println(paths);
//         }
//         public static ArrayList<String>getMazePaths(int sr,int sc, int dr,int dc){
//                 if(sr == dr && sc == dc){
//                         ArrayList<String>bres = new ArrayList<>();
//                         bres.add("");
//                         return bres;
//                 }
//                 ArrayList<String>hpaths = new ArrayList<>();
//                 ArrayList<String>vpaths = new ArrayList<>();
//                 if(sc < dc){
//                         hpaths = getMazePaths(sr,sc + 1,dr,dc);
//                 }
//                 if(sr < dr){
//                         vpaths = getMazePaths(sr + 1,sc,dr,dc);
//                 }
//                 ArrayList<String>paths = new ArrayList<>();
//                 for(String hpath : hpaths){
//                         paths.add("h" + hpath);
//                 } 
//                 for(String vpath : vpaths){
//                         paths.add("v" + vpath);
//                 }
//                 return paths;
//         }       
// }

//GET MAZE PATH WITH JUMP
// import java.io.*;
// import java.util.*;
// public class Main{
//         public static void main(String[]args)throws Exception{
//                 Scanner scn = new Scanner (System.in);
//                 int n = scn.nextInt();
//                 int m = scn.nextInt();
//                 ArrayList<String>paths = getMazePaths(1, 1, n, m);
//                 System.out.println(paths);
//         }
//         public static ArrayList<String>getMazePaths(int sr,int sc, int dr,int dc){
//                 if(sr == dr && sc == dc){
//                         ArrayList<String>bres = new ArrayList<>();
//                         bres.add("");
//                         return bres;
//                 }
//                 ArrayList<String> paths = new ArrayList<>();
//                 //horizantal moves
//                 for(int ms = 1;ms <= dc - sc;ms++){
//                         ArrayList<String>hpaths = getMazePaths(sr,sc + ms,dr,dc);
//                         for(String hpath : hpaths){
//                                paths.add("h" + ms + hpath);
//                         }
//                 }
//                 //vertical moves
//                 for(int ms = 1;ms <= dr - sr;ms++){
//                         ArrayList<String>vpaths = getMazePaths(sr + ms,sc,dr,dc);
//                         for(String vpath : vpaths){
//                                paths.add("v" + ms + vpath);
//                         }
//                 }
//                 //diagonal moves
//                 for(int ms = 1;ms <= dc - sc && ms <= dr - sr;ms++){
//                         ArrayList<String>dpaths = getMazePaths(sr,sc + ms,dr,dc);
//                         for(String dpath : dpaths){
//                                paths.add("d" + ms + dpath);
//                         }
//                 }
//                 return paths;
//         }       
// }

//PRINT SUBSEQUENCE
// import java.io.*;
// import java.util.*;
// public class Main{
//         public static void main(String[]args)throws Exception{
//                 Scanner scn = new Scanner(System.in);
//                 String str = scn.nextLine();
//                 printSS(str , " ");
//         }
//         public static void printSS(String ques,String ans){
//                 if(ques.length() == 0){
//                         System.out.println(ans);
//                         return;
//                 }
//                 char ch = ques.charAt(0);
//                 String roq = ques.substring(1);
//                 printSS(roq, ans + ch);
//                 printSS(roq, ans + "");
//         }
// }

//PRINT KEYPAD COMBINATION
// import java.util.*;
// public class Main{
//         public static void main(String[]args)throws Exception{
//                 Scanner scn = new Scanner(System.in);
//                 String str = scn.next();
//                 printKPC(str , "");
//         }
//         static String[]codes = {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
//         public static void printKPC(String ques , String ans){
//                 if(ques.length() == 0){
//                         System.out.println(ans);
//                         return;
//                 }
//                 char ch = ques.charAt(0);
//                 String roq = ques.substring(1);
//                 String codeforch = codes[ch - '0'];
//                 for(int i = 0;i < codeforch.length();i++){
//                         char cho = codeforch.charAt(i);
//                         printKPC(roq , ans + cho);
//                 }
//         }
// }

//PRINT STAIRS PATH
// import java.util.*;
// public class Main{
//         public static void main(String[]args)throws Exception{
//                 Scanner scn = new Scanner(System.in);
//                 int n = scn.nextInt();
//                 printStairPaths(n,"");
//         }
//         public static void printStairPaths(int n,String path){
//                 if(n < 0){
//                         return;
//                 }
//                 if(n == 0){
//                         System.out.println(path);
//                         return;
//                 }
//                 printStairPaths(n - 1, path + "1");
//                 printStairPaths(n - 2, path + "2");
//                 printStairPaths(n - 3, path + "3");
//         }
// }

//PRINT MAZE PATH
// import java.util.*;
// public class Main{
//         public static void main(String[]args)throws Exception{
//                 Scanner scn = new Scanner(System.in);
//                 int n = scn.nextInt();
//                 int m = scn.nextInt();
//                 printMazePaths(1,1,n,m,"");
//         }
//         public static void printMazePaths(int sr,int sc, int dr,int dc,String psf){
//                 if(sr > dr || sc > dc){
//                         return;
//                 }
//                 if(sr == dr && sc == dc){
//                         System.out.println(psf);
//                         return;
//                 }
//                 printMazePaths(sr,sc + 1,dr,dc,psf + "h");
//                 printMazePaths(sr + 1,sc,dr,dc,psf + "v");
//         }
// }

//PRINT MAZE PATH WITH JUMP
// import java.util.*;
// public class Main{
//         public static void main(String[]args)throws Exception{
//                 Scanner scn = new Scanner(System.in);
//                 int n = scn.nextInt();
//                 int m = scn.nextInt();
//                 printMazePaths(1,1,n,m,"");
//         }
//         public static void printMazePaths(int sr,int sc,int dr,int dc,String psf){
//                 if(sr == dr && sc == dc){
//                         System.out.println(psf);
//                         return;
//                 }
//                 for(int ms = 1;ms <= dc - sc;ms++){
//                         printMazePaths(sr,sc + ms,dr,dc,psf + "h" + ms);
//                 }
//                 for(int ms = 1;ms <= dr - sr;ms++){
//                         printMazePaths(sr + ms,sc,dr,dc,psf + "v" + ms);
//                 }
//                 for(int ms = 1;ms <= dc - sc && ms <= dr - sr;ms++){
//                         printMazePaths(sr + ms,sc + ms,dr,dc,psf + "d" + ms);
//                 }
//         }
// }

//PRINT PERMUTATIONS
// import java.util.*;
// public class Main{
//         public static void main(String[]args)throws Exception{
//                 Scanner scn = new Scanner(System.in);
//                 String str = scn.next();
//                 printPermutations(str,"");
//         }
//         public static void printPermutations(String ques , String asf){
//                 if(ques.length() == 0){
//                         System.out.println(asf);
//                         return;
//                 }
//                 for(int i = 0;i < ques.length();i++){
//                         char ch = ques.charAt(i);
//                         String qlpart = ques.substring(0,i);
//                         String qrpart = ques.substring(i + 1);
//                         String roq = qlpart + qrpart;
//                         printPermutations(roq , asf + ch);
//                 }
//         }
// }

//PRINT ENCODINGS
// import java.util.*;
// public class Main{
//         public static void main(String[]args)throws Exception{
//                 Scanner scn = new Scanner(System.in);
//                 String str = scn.next();
//                 printEncodings(str,"");
//         }
//         public static void printEncodings(String ques , String asf){
//                 if(ques.length() == 0){
//                         System.out.println(asf);
//                         return;
//                 }else if(ques.length() == 1){
//                         char ch = ques.charAt(0);
//                         if(ch == '0'){
//                                 return;
//                         }else{
//                                 int chv = ch - '0';
//                                 char code = (char)('a' + chv - 1);
//                                 System.out.println(asf + code);
//                         }
//                 }else{
//                         char ch = ques.charAt(0);
//                         String roq = ques.substring(1); 
//                         if(ch == '0'){
//                                 return;
//                         }else{
//                                 int chv = ch - '0';
//                                 char code = (char)('a' + chv - 1);
//                                 printEncodings(roq,asf + code);
//                         }
//                         String ch12 = ques.substring(0,2);
//                         String roq12 = ques.substring(2);
//                         int ch12v = Integer.parseInt(ch12);
//                         if(ch12v <= 26){
//                                 char code = (char)('a' + ch12v - 1);
//                                 printEncodings(roq12, asf + code);
//                         }
//                 }
//         }
// }

//FLOOD FILL
// import java.io.*;
// import java.util.*;
// public class Main{
//         public static void main(String[]args)throws Exception{
//                 Scanner scn = new Scanner(System.in);
//                 int n = scn.nextInt();
//                 int m = scn.nextInt();
//                 int[][]arr = new int[n][m];
//                 for(int i = 0;i < arr.length;i++){
//                         for(int j = 0;j < arr[0].length;j++){
//                                 arr[i][j] = scn.nextInt();
//                         }
//                 }
//                 boolean[][]visited = new boolean[n][m];
//                 floodfill(arr,0,0,"",visited);
//         }
//         public static void floodfill(int[][]maze,int row,int col,String psf,boolean[][]visited){
//                 if(row < 0 || col < 0 || row == maze.length || col == maze[0].length
//                    || maze[row][col] == 1 || visited[row][col] == true){
//                         return;
//                    }
//                 if(row == maze.length - 1 && col == maze[0].length - 1){
//                         System.out.println(psf);
//                         return;
//                 }
//                 visited[row][col] = true;
//                 floodfill(maze,row - 1,col,psf + "t",visited);
//                 floodfill(maze,row,col - 1,psf + "l",visited);
//                 floodfill(maze,row + 1,col,psf + "d",visited);
//                 floodfill(maze,row,col + 1,psf + "r",visited);
//                 visited[row][col] = false;
//         }
// }

//PRINT TARGET SUM SUBSETS
// import java.io.*;
// import java.util.*;
// public class Main{
//         public static void main(String[]args)throws Exception{
//                 Scanner scn = new Scanner(System.in);
//                 int n = scn.nextInt();
//                 int []arr = new int[n];
//                 for(int i = 0;i < arr.length;i++){
//                         arr[i] = scn.nextInt();
//                 }
//                 int tar = scn.nextInt();
//                 printTargetSumSubsets(arr,0,"",0,tar);
//         }
//         public static void printTargetSumSubsets(int[]arr,int idx,String set,int sos,int tar){
//                 if(idx == arr.length){
//                         if(sos == tar){
//                                 System.out.println(set + ".");
//                         }
//                         return;
//                 }
//                 printTargetSumSubsets(arr, idx + 1, set + arr[idx] + ",", sos + arr[idx], tar);
//                 printTargetSumSubsets(arr, idx + 1, set , sos, tar);
//         }
// }

//N QUEENS
// import java.io.*;
// import java.util.*;
// public class Main{
//         public static void main(String[]args)throws Exception{
//                 Scanner scn = new Scanner(System.in);
//                 int n = scn.nextInt();
//                 int[][]chess = new int[n][n];
//                 printNQueens(chess,"",0);
//         }
//         public static void printNQueens(int[][]chess,String qsf,int row){
//                 if(row == chess.length){
//                         System.out.println(qsf);
//                         return;
//                 }
//                 for(int col = 0;col < chess.length;col++){
//                         if(isItaSafePlaceForTheQueen(chess,row,col) == true){
//                                 chess[row][col] = 1;
//                                 printNQueens(chess, qsf + row + "-"+ col + ",", row + 1);
//                                 chess[row][col] = 0;
//                         }
//                 }
//         }
//         public static boolean isItaSafePlaceForTheQueen(int[][]chess,int row,int col){
//                 for(int i = row - 1,j = col;i >= 0;i--){
//                         if(chess[i][j] == 1){
//                                 return false;
//                         }
//                 }
//                 for(int i = row - 1,j = col - 1 ; i >= 0 && j >= 0;i--,j--){
//                         if(chess[i][j] == 1){
//                                 return false;
//                         }
//                 }
//                 for(int i = row - 1,j = col + 1;i >=0 && j < chess.length;i--,j++){
//                         if(chess[i][j] == 1){
//                                 return false;
//                         }
//                 }
//                 return true;
//         }
// }

//KNIGHTS TOUR
// import java.io.*;
// import java.util.*;
// public class Main{
//         public static void main(String[]args)throws Exception{
//                 Scanner scn = new Scanner(System.in);
//                 int n = scn.nextInt();
//                 int r = scn.nextInt();
//                 int c = scn.nextInt();
//                 int[][]chess = new int[n][n];
//                 printKnightsTour(chess,r,c,1);
//         }
//         public static void printKnightsTour(int[][]chess,int r,int c,int move){
//                 if(r < 0 || c < 0|| r >= chess.length || c >= chess.length || chess[r][c] > 0){
//                         return;
//                 }else if(move == chess.length * chess.length){
//                         chess[r][c] = move;
//                         displayboard(chess);
//                         chess[r][c] = 0;
//                 }
//                 chess[r][c] = move;
//                 printKnightsTour(chess,r - 2, c + 1, move + 1);
//                 printKnightsTour(chess,r - 1, c + 2, move + 1);
//                 printKnightsTour(chess,r + 1, c + 2, move + 1);
//                 printKnightsTour(chess,r + 2, c + 1, move + 1);
//                 printKnightsTour(chess,r + 2, c - 1, move + 1);
//                 printKnightsTour(chess,r + 1, c - 2, move + 1);
//                 printKnightsTour(chess,r - 1, c - 2, move + 1);
//                 printKnightsTour(chess,r - 2, c - 1, move + 1);
//                 chess[r][c] = 0;
//         }
//         public static void displayboard(int[][]chess){
//                 for(int i = 0;i < chess.length;i++){
//                         for(int j = 0;j < chess[0].length;j++){
//                                 System.out.println(chess[i][j] + "");
//                         }
//                         System.out.println();
//                 }
//                 System.out.println();
//         }
// }
                 

                        //INTRODUCTION TO 2-D ARRAYS
// import java.io.*;
// import java.util.*;
// public class Main{
//         public static void main(String[]args)throws Exception{
//                 Scanner scn = new Scanner(System.in);
//                 int n = scn.nextInt();
//                 int m = scn.nextInt();
//                 int[][]arr = new int[n][m];
//                 for(int i = 0;i < n;i++){
//                         for(int j = 0;j < m;j++){
//                                 arr[i][j] = scn.nextInt();
//                         }
//                 }
//                 for(int i = 0;i < arr.length;i++){
//                         for(int j = 0;j < arr[i].length;j++){
//                                 System.out.print(arr[i][j] + " ");
//                         }
//                         System.out.println();
//                 }
//         }
// }

//MATRIX MULTIPLICATION
// import java.io.*;
// import java.util.*;
// public class Main{
//         public static void main(String[]args)throws Exception{
//                 Scanner scn = new Scanner(System.in);
//                 int r1 = scn.nextInt();
//                 int c1 = scn.nextInt();
//                 int[][]one = new int[r1][c1];
//                 for(int i = 0;i < one.length;i++){
//                         for(int j = 0;j < one[0].length;j++){
//                                 one[i][j] = scn.nextInt();
//                         }
//                 }
//                 int r2 = scn.nextInt();
//                 int c2 = scn.nextInt();
//                 int[][]two = new int[r2][c2];
//                 for(int i = 0;i < two.length;i++){
//                         for(int j = 0;j < two[0].length;j++){
//                                 two[i][j] = scn.nextInt();
//                         }
//                 }
//                 if(c1 != r2){
//                         System.out.println("Invalid input");
//                         return;
//                 }
//                 int[][]prd = new int[r1][c2];
//                 for(int i = 0;i < prd.length;i++){
//                         for(int j = 0;j < prd[0].length;j++){
//                                 for(int k = 0;k < c1;k++){
//                                         prd[i][j] += one[i][k] * two[k][j];
//                                 }
//                         }
//                 }
//                 for(int i = 0;i < prd.length;i++){
//                         for(int j = 0;j < prd[0].length;j++){
//                                 System.out.print(prd[i][j] + " ");
//                         }
//                         System.out.println();
//                 }
//         }
// }

//WAVE TRAVERSAL
// import java.io.*;
// import java.util.*;
// public class Main{
//         public static void main(String[]args)throws Exception{
//                 Scanner scn = new Scanner(System.in);
//                 int n = scn.nextInt();
//                 int m = scn.nextInt();
//                 int[][]arr = new int[n][m];
//                 for(int i = 0;i < arr.length;i++){
//                         for(int j = 0;j < arr[0].length;j++){
//                                 arr[i][j] = scn.nextInt();
//                         }
//                 }
//                 for(int j = 0;j < arr[0].length;j++){
//                         if(j % 2 == 0){
//                                 for(int i = 0;i < arr.length;i++){
//                                         System.out.println(arr[i][j]);
//                                 }
//                         }else{
//                                 for(int i = arr.length - 1;i >= 0;i--){
//                                         System.out.println(arr[i][j]);
//                                 }
//                         }
//                 }
//         }
// }

//SPIRAL TRAVERSAL
// import java.io.*;
// import java.util.*;
// public class Main{
//         public static void main(String[]args)throws Exception{
//                 Scanner scn = new Scanner(System.in);
//                 int n = scn.nextInt();
//                 int m = scn.nextInt();
//                 int[][]arr = new int[n][m];
//                 for(int i = 0;i < arr.length;i++){
//                         for(int j = 0;j < arr[0].length;j++){
//                                 arr[i][j] = scn.nextInt();
//                         }
//                 }
//                 int minr = 0;
//                 int minc = 0;
//                 int maxr = arr.length - 1;
//                 int maxc = arr[0].length - 1;
//                 int tne = n * m;
//                 int cnt = 0;
//                 while(cnt < tne){
//                         //left wall
//                         for(int i = minr,j = minc;i <= maxr && cnt < tne;i++){
//                                 System.out.println(arr[i][j]);
//                                 cnt++;
//                         }
//                         minc++;
//                         //bottom wall
//                         for(int i = maxr,j = minc;j <= maxc && cnt < tne;j++){
//                                 System.out.println(arr[i][j]);
//                                 cnt++;
//                         }
//                         maxr--;
//                         //right wall
//                         for(int i = maxr,j = maxc;i >= minr && cnt < tne;i--){
//                                 System.out.println(arr[i][j]);
//                                 cnt++;
//                         }
//                         maxc--;
//                         //top wall
//                         for(int i = minr,j = maxc;j >= minc && cnt < tne;j--){
//                                 System.out.println(arr[i][j]);
//                                 cnt++;
//                         }
//                         minr++;
//                 }
//         }
// }

//EXIT POINT OF MATRIX
// import java.io.*;
// import java.util.*;
// public class Main{
//         public static void main(String[]args)throws Exception{
//                 Scanner scn = new Scanner(System.in);
//                 int n = scn.nextInt();
//                 int m = scn.nextInt();
//                 int[][]arr = new int[n][m];
//                 for(int i = 0;i < arr.length;i++){
//                         for(int j = 0;j < arr[0].length;j++){
//                                 arr[i][j] = scn.nextInt();
//                         }
//                 }
//                 int dir = 0; // 0 - east; 1 - south; 2 - west; 3 - north
//                 int i = 0;
//                 int j = 0; 
//                 while(true){
//                         dir = (dir + arr[i][j]) % 4;
//                         if(dir == 9){        //east
//                                 j++;
//                         }else if(dir == 1){  //south
//                                 i++;
//                         }else if(dir == 2){  //wwst
//                                 j--;
//                         }else if(dir == 3){  //north
//                                 i--;
//                         }
//                         if(i < 0){
//                                 i++;
//                                 break;
//                         }else if(j < 0){
//                                 j++;
//                                 break;
//                         }else if(i == arr.length){
//                                 i--;
//                                 break;  
//                         }else if(j == arr[0].length){
//                                 j--;
//                                 break;
//                         }
//                 }
//                 System.out.println(i);
//                 System.out.println(j);
//         }
// }

//ROTATE AN 90 DEGREE
// import java.io.*;
// import java.util.*;
// public class Main{
//         public static void main(String[]args)throws Exception{
//                 Scanner scn = new Scanner(System.in);
//                 int n = scn.nextInt();
//                 int[][]arr = new int[n][n];
//                 for(int i = 0;i < arr.length;i++){
//                         for(int j = 0;j < arr[0].length;j++){
//                                 arr[i][j] = scn.nextInt();
//                         }
//                 }
//                 //transpose
//                 for(int i = 0; i < arr.length;i++){
//                         for(int j = 1;j < arr[0].length;j++){
//                                 int temp = arr[i][j];
//                                 arr[i][j] = arr[j][i];
//                                 arr[j][i] = temp;
//                         }
//                 }
//                 for(int i = 0;i < arr.length;i++){
//                         int li = 0;
//                         int ri = arr[i].length - 1;
//                         while(li < ri){
//                                 int temp = arr[i][li];
//                                 arr[i][li] = arr[i][ri];
//                                 arr[i][ri] = temp;
//                                 li++;
//                                 ri--;
//                         }
//                         display(arr);
//                 }
//         }
//         public static void display(int[][]arr){
//                 for(int i = 0;i < arr.length;i++){
//                         for(int j = 0;j < arr[0].length;j++){
//                                 System.out.println(arr[i][j] + "");
//                         }
//                         System.out.println();
//                 }
//         }
// }

//SHELL ROTATE
// import java.io.*;
// import java.util.*;
// public class Main{
//         public static void main(String[]args)throws Exception{
//                 Scanner scn = new Scanner(System.in);
//                 int n = scn.nextInt();
//                 int m = scn.nextInt();
//                 int[][]arr = new int[n][m];
//                 for(int i = 0;i < arr.length;i++){
//                         for(int j = 0;j < arr[0].length;j++){
//                                 arr[i][j] = scn.nextInt();
//                         }
//                 }
//                 int s = scn.nextInt();
//                 int r = scn.nextInt();
//                 rotateShell(arr,s,r);
//                 display(arr);
//         }
//         public static void rotateShell(int[][]arr,int s,int r){
//                 int[]oned = fillOnedFromShell(arr,s);
//                 rotate(oned , r);
//                 fillShellFromOned(arr,s,oned);
//         }
//         public static int[]fillOnedFromShell(int[][]arr,int s){
//                 int minr = s - 1;
//                 int minc = s - 1;
//                 int maxr = arr.length - s;
//                 int maxc = arr[0].length - s;
//                 int sz = 2 * (maxr - maxc + maxc - minc);
//                 int[]oned = new int[sz];
//                 //lw
//                 int idx = 0;
//                 for(int i = minr, j = minc;i <= maxr;i++){
//                         oned[idx] = arr[i][j];
//                         idx++;
//                 }
//                 //bw
//                 for(int i = maxr, j = minc + 1;j <= maxc;j++){
//                         oned[idx] = arr[i][j];
//                         idx++;
//                 }
//                 //rw
//                 for(int i = maxr - 1, j = maxc;i >= minr;i--){
//                         oned[idx] = arr[i][j];
//                         idx++;
//                 }
//                 //tw
//                 for(int i = minr, j = maxc - 1;j >= minc + 1;j--){
//                         oned[idx] = arr[i][j];
//                         idx++;
//                 }
//                 return oned;
//         }
//         public static void fillShellFromOned(int[][]arr,int s,int[] oned){
//                 int minr = s - 1;
//                 int minc = s - 1;
//                 int maxr = arr.length - s;
//                 int maxc = arr[0].length - s;
//                 //lw
//                 int idx = 0;
//                 for(int i = minr, j = minc;i <= maxr;i++){
//                         arr[i][j] = oned[idx];
//                         idx++;
//                 }
//                 //bw
//                 for(int i = maxr, j = minc + 1;j <= maxc;j++){
//                         arr[i][j] = oned[idx];
//                         idx++;
//                 }
//                 //rw
//                 for(int i = maxr - 1, j = maxc;i >= minr;i--){
//                         arr[i][j] = oned[idx];
//                         idx++;
//                 }
//                 //tw
//                 for(int i = minr, j = maxc - 1;j >= minc + 1;j--){
//                         arr[i][j] = oned[idx];
//                         idx++;
//                 }
//         }
//         public static void rotate(int[] oned,int r){
//                 r = r % oned.length;
//                 if(r < 0){
//                         r = r + oned.length;
//                 }
//                 reverse(oned,0,oned.length - r - 1);
//                 reverse(oned,oned.length - r,oned.length - 1);
//                 reverse(oned,0,oned.length - 1);
//         }
//         public static void reverse(int[] oned,int li, int ri){
//                 while(li < ri){
//                         int temp = oned[li];
//                         oned[li] = oned[ri];
//                         oned[ri] = temp;
//                         li++;
//                         ri--;
//                 }
//         }
//         public static void display(int[][]arr){
//                 for(int i = 0;i < arr.length;i++){
//                         for(int j = 0;j < arr[0].length;j++){
//                                 System.out.println(arr[i][j] + "");
//                         }
//                         System.out.println();
//                 }
//         }
// }

//DIAGONAL TRAVERSAL
// import java.io.*;
// import java.util.*;
// public class Main{
//         public static void main(String[]args)throws Exception{
//                 Scanner scn = new Scanner(System.in);
//                 int n = scn.nextInt();
//                 int[][]arr = new int[n][n];
//                 for(int i = 0;i < arr.length;i++){
//                         for(int j = 0;j < arr[0].length;j++){
//                                 arr[i][j] = scn.nextInt();
//                         }
//                 }
//                 for(int g = 0;g < arr.length;g++){
//                         for(int i = 0,j = g;j < arr.length;i++,j++){
//                                 System.out.println(arr[i][j]);
//                         }
//                 }
//         }
// }

//SADDLE POINT
// import java.io.*;
// import java.util.*;
// public class Main{
//         public static void main(String[]args)throws Exception{
//                 Scanner scn = new Scanner(System.in);
//                 int n = scn.nextInt();
//                 int[][]arr = new int[n][n];
//                 for(int i = 0;i < arr.length;i++){
//                         for(int j = 0;j < arr[0].length;j++){
//                                 arr[i][j] = scn.nextInt();
//                         }
//                 }
//                 for(int i = 0;i < arr.length;i++){
//                         int svj = 0;
//                         for(int j = 1;j < arr[0].length;j++){
//                                 if(arr[i][j] < arr[i][svj]){
//                                         svj = j;
//                                 }
//                         }
//                         boolean flag = true;
//                         for(int k = 0;k < arr.length;k++){
//                                 if(arr[k][svj] > arr[i][j]){
//                                         flag = false;
//                                         break;
//                                 }
//                         }
//                         if(flag == true){
//                                 System.out.println(arr[i][l]);
//                                 return;
//                         }
//                 }
//                 System.out.println("Invalid input");
//         }
// }

//SEARCH SORTED 2D ARRAY
// import java.io.*;
// import java.util.*;
// public class Main{
//         public static void main(String[]args)throws Exception{
//                 Scanner scn = new Scanner(System.in);
//                 int n = scn.nextInt();
//                 int[][]arr = new int[n][n];
//                 for(int i = 0;i < arr.length;i++){
//                         for(int j = 0;j < arr[0].length;j++){
//                                 arr[i][j] = scn.nextInt();
//                         }
//                 }
//                 int x = scn.nextInt();
//                 int i = 0;
//                 int j = arr[0].length - 1;
//                 while(i < arr.length && j >= 0){
//                         if(x == arr[i][j]){
//                                 System.out.println(i);
//                                 System.out.println(j);
//                                 return;
//                         }else if(x < arr[i][j]){
//                                 j--;
//                         }else{
//                                 i++;
//                         }
//                 }
//                 System.out.println("Not found");
//         }
// }

                                 //STRINGS
// import java.util.*;
// public class Main{
//         public static void main(String[]args)throws Exception{
//                 Scanner scn = new Scanner(System.in);
//                 // String s = scn.nextLine();
//                 // System.out.println(s);
//                 // System.out.println(s.length());
//                 // for(int i = 0;i < s.length();i++){
//                 //         char ch = s.charAt(i);
//                 //         System.out.println(ch);
//                 // }
//                 // String s = "abcd";
//                 // for(int i = 0;i < s.length();i++){
//                 //         for(int j = i + 1;j <= s.length();j++){
//                 //                 System.out.println(s.substring(i,j));
//                 //         }
//                 // }
//                 String s1 = "hello";
//                 s1 += ' ';
//                 s1 += 10;
//                 s1 += 'w';
//                 s1 += 'o';
//                 String s2 = "world";
//                 String s3 = s1 + " " + s2;
//                 System.out.println(10 + 20 + "hello");
//                 System.out.println("hello" + 10 + 20);
//                 String s = "abc,def,ghi,jkl mno";
//                 String[]parts = s.split(",");
//                 for(int i = 0;i < parts.length;i++){
//                         System.out.println(parts[i]);
//                 }
//         } 
// }

//PRINT ALL PALINDROME FUNCTION
// import java.io.*;
// import java.util.*;
// public class Main{
//         public static boolean isPalindrome(String s){
//                 int i = 0;
//                 int j = s.length() - 1;
//                 while(i <= j){
//                         char ch1 = s.charAt(i);
//                         char ch2 = s.charAt(j);
//                         if(ch1 != ch2){
//                                 return false;
//                         }else{
//                                 i++;
//                                 j--;
//                         }
//                 }
//                 return true;
//         } 
//         public static void solution(String s){
//                 for(int i = 0;i < s.length();i++){
//                         for(int j = i + 1;j <= s.length();j++){
//                                 String ss = s.substring(i,j);
//                                 if(isPalindrome(ss) == true){
//                                         System.out.println(ss);
//                                 }
//                         }
//                 }
//         }
//         public static void main(String[]args){
//                 Scanner scn = new Scanner(System.in);
//                 String str = scn.next();
//                 solution(str);
//         }
// }

                                //STRING BUILDER
// import java.util.*;
// public class Main{
//         public static void main(String[]args){
                // StringBuilder sb = new StringBuilder("hello");
                // System.out.println(sb);
                // char ch = sb.charAt(0);  //get
                // System.out.println(ch);
                // sb.setCharAt(0,'d');  //update
                // System.out.println(sb);
                // sb.insert(2,'y');  //insert
                // System.out.println(sb);
                // sb.deleteCharAt(2);  //remove
                // System.out.println(sb);
                // sb.append('g');  //append
                // System.out.println(sb);
                // System.out.println(sb.length());
//                 int n = 10000;
//                 long start = System.currentTimeMillis();
//                 StringBuilder sb = new StringBuilder();
//                 for(int i = 0;i < n;i++){
//                         sb.append(i);
//                 }
//                 long end = System.currentTimeMillis();
//                 long duration = end - start;
//                 System.out.println(duration);
//         }
// }

//STRING COMPRESSION
// import java.io.*;
// import java.util.*;
// public class Main{
//         public static String compression1(String str){
//                 String s = str.charAt(0) + "";
//                 for(int i = 1;i < str.length();i++){
//                         char curr = str.charAt(i);
//                         char prev = str.charAt(i - 1);
//                         if(curr != prev){
//                                 s += curr;
//                         }
//                 }
//                 return s;
//         }
//         public static String compression2(String str){
//                 String s = str.charAt(0) + "";
//                 int count  = 1;
//                 for(int i = 1;i < str.length();i++){
//                         char curr = str.charAt(i);
//                         char prev = str.charAt(i - 1);
//                         if(curr == prev){
//                                 count++;
//                         }else{
//                                 if(count > 1){
//                                         s += count;
//                                         count = 1;
//                                 }
//                                 s += curr;
//                         }
//                 }
//                 if(count > 1){
//                         s += count;
//                         count = 1;
//                 }
//                 return s;
//         } 
//         public  static void main(String[]args){
//                 Scanner scn = new Scanner(System.in);
//                 String str = scn.next();
//                 System.out.println(compression1(str));
//                 System.out.println(compression2(str));
//         }
// }

//TOGGLE CASE
// import java.io.*;
// import java.util.*;
// public class Main{
//         public static String toggleCase(String str){
//                 StringBuilder sb = new StringBuilder(str);
//                 for(int i = 0;i < sb.length();i++){
//                         char ch = sb.charAt(i);
//                         if(ch >= 'a' && ch <= 'z'){
//                                 char uch = (char)('A' + ch - 'a');
//                                 sb.setCharAt(i,uch);
//                         }else if(ch >= 'A' && ch <= 'Z'){
//                                 char lch = (char)('a' + ch - 'A');
//                                 sb.setCharAt(i,lch);
//                         }
//                 }
//                 return sb.toString();
//         } 
//         public static void main(String[]args){
//                 Scanner scn = new Scanner(System.in);
//                 String str = scn.next();
//                 System.out.println(toggleCase(str));
//         }
// }

//ASCII CHARACTERS
// import java.io.*;
// import java.util.*;
// public class Main{
//         public static String solution(String str){
//                 StringBuilder sb = new StringBuilder(str);
//                 sb.append(str.charAt(0));
//                 for(int i = 1;i < str.length();i++){
//                         char curr = str.charAt(i);
//                         char prev = str.charAt(i - 1);
//                         int gap = curr - prev;
//                         sb.append(gap);
//                         sb.append(curr);
//                 }
//                 return sb.toString();
//         } 
//         public static void main(String[]args){
//                 Scanner scn = new Scanner(System.in);
//                 String str = scn.next();
//                 System.out.println(solution(str));
//         }
// }

//PERMUTATIONS
// import java.io.*;
// import java.util.*;
// public class Main{
//         public static void solution(String str){
//                 int n = str.length();
//                 int f = factorial(n);
//                 for(int i = 0;i < f;i++){
//                         StringBuilder sb = new StringBuilder(str);
//                         int temp = i;
//                         for(int div = n;div >= 1;div--){
//                                 int q = temp / div;
//                                 int r = temp % div;
//                                 System.out.print(sb.charAt(r));
//                                 sb.deleteCharAt(r);
//                                 temp = q;
//                         }
//                         System.out.println();
//                 }
//         } 
//         public static int factorial(int n){
//                 int val = 1;
//                 for(int i = 2;i <= n;i++){
//                         val *= i;
//                 }
//                 return val;
//         }
//         public static void main(String[]args){
//                 Scanner scn = new Scanner(System.in);
//                 String str = scn.next();
//                 solution(str);
//         }
// }

                               //ARRAYLIST
// import java.util.*;
// public class Main{
//         public static void main(String[]args){
//                 ArrayList<Integer> list = new ArrayList<>();
//                 System.out.println(list + " -> " + list.size());
//                 list.add(10);
//                 list.add(20);
//                 list.add(30);
//                 System.out.println(list + " -> " + list.size());
//                 list.add(1,1000);
//                 System.out.println(list + " -> " + list.size());
//                 int val = list.get(1);
//                 System.out.println(val);
//                 list.set(1,2000);
//                 System.out.println(list + " -> " + list.size());
//                 list.remove(1);
//                 System.out.println(list + " -> " + list.size());
//                 for(int i = 0;i < list.size();i++){
//                         int val1 = list.get(i);
//                         System.out.println(val1);
//                 }
//                 for(int val1 : list){
//                         System.out.println(val1);
//                 }
//                 System.out.println(list);
//                 ArrayList<String> l2 = new ArrayList<>();
//                 l2.add("hello");
//                 l2.add("bello");
//                 l2.add("cello");
//                 System.out.println(l2 + " -> " + l2.size());
//         }
// }

//Remove prime numbers from arraylist
// import java.io.*;
// import java.util.*;
// public class Main{
//         public static boolean isPrime(int val){
//                 for(int div = 2; div * div <= val;div++){
//                         if(val % div == 0){
//                                 return false;
//                         }
//                 }
//                 return true;
//         }
//         public static void solution(ArrayList<Integer> a1){
//                 for(int i = a1.size();i >= 0;i--){
//                         int val = a1.get(i);
//                         if(isPrime(val) == true){
//                                 a1.remove(i);
//                         }
//                 }
//         }
//         public static void main(String[]args){
//                 Scanner scn = new Scanner(System.in);
//                 int n = scn.nextInt();
//                 ArrayList<Integer> a1 = new ArrayList<>();
//                 for(int i = 0;i < n;i++){
//                         a1.add(scn.nextInt());
//                 }
//                 solution(a1);
//                 System.out.println(a1);
//         }
// }


                          //TIME ADN SPACE COMPLEXITY

//BUBBLE SORT
// import java.io.*;
// import java.util.*;
// public class Main{
//         public static void bubbleSort(int[]arr){
//                 for(int itr = 1;itr < arr.length - 1;itr++){
//                         for(int j = 0;j < arr.length - itr;j++){
//                                 if(isSmaller(arr,j + 1,j)){
//                                         swap(arr,j,j + 1);
//                                 }
//                         }
//                 }
//         }
//         public static void swap(int[]arr,int i,int j){
//                 System.out.println("Swapping" + arr[i] + "and" + arr[j]);
//                 int temp = arr[i];
//                 arr[i] = arr[j];
//                 arr[j] = temp;
//         }
//         public static boolean isSmaller(int[]arr,int i,int j){
//                 System.out.println("Comparing" + arr[i] + "and" + arr[j]);  
//                 if(arr[i] < arr[j]){
//                         return true;
//                 }else{
//                         return false;
//                 }              
//         }
//         public static void print(int[]arr){
//                 for(int i = 0;i < arr.length;i++){
//                         System.out.println(arr[i]);
//                 }
//         }
//         public static void main(String[]args)throws Exception{
//                 Scanner scn = new Scanner(System.in);
//                 int n = scn.nextInt();
//                 int[]arr = new int[n];
//                 for(int i = 0;i < arr.length;i++){
//                         arr[i] = scn.nextInt();
//                 }
//                 bubbleSort(arr);
//                 print(arr);
//         }
// }

//SELECTION SORT
// import java.io.*;
// import java.util.*;
// public class Main{
//         public static void selectionSort(int[]arr){
//                 for(int i = 0;i < arr.length - 1;i++){
//                         int mi = i;
//                         for(int j = i + 1;j < arr.length;j++){
//                                 if(isSmaller(arr,j,mi)){
//                                         mi = j;
//                                 }
//                         }
//                         swap(arr,i,mi);
//                 }
//         }
//         public static void swap(int[]arr,int i,int j){
//                 System.out.println("Swapping" + arr[i] + "and" + arr[j]);
//                 int temp = arr[i];
//                 arr[i] = arr[j];
//                 arr[j] = temp;
//         }
//         public static boolean isSmaller(int[]arr,int i,int j){
//                 System.out.println("Comparing" + arr[i] + "and" + arr[j]);  
//                 if(arr[i] < arr[j]){
//                         return true;
//                 }else{
//                         return false;
//                 }              
//         }
//         public static void print(int[]arr){
//                 for(int i = 0;i < arr.length;i++){
//                         System.out.println(arr[i]);
//                 }
//         }
//         public static void main(String[]args)throws Exception{
//                 Scanner scn = new Scanner(System.in);
//                 int n = scn.nextInt();
//                 int[]arr = new int[n];
//                 for(int i = 0;i < arr.length;i++){
//                         arr[i] = scn.nextInt();
//                 }
//                 selectionSort(arr);
//                 print(arr);
//         }
// }

//INSERTION SORT
// public static void insertionSort(int[]arr){
//         for(int i = 1;i < arr.length;i++){
//                 for(int j = i - 1;j >= 0;j--){
//                         if(isGreater(arr,j,j + 1)){
//                                 swap(arr,j,j + 1);
//                         }else{
//                                 break;
//                         }
//                 }
//         }
// }

//MERGE TWO SORTED ARRAYS
// public static int[] mergeTwoSortedArraya(int[]a,int[]b){
//         int[]res = new int[a.length + b.length];
//         int i = 0;
//         int j = 0;
//         int k = 0;
//         while(i < a.length && j < b.length){
//                 if(a[i] < b[j]){
//                         res[k] = a[i];
//                         i++;
//                         k++;
//                 }else{
//                         res[k] = b[j];
//                         j++;
//                         k++;
//                 }
//         }
//         while(i < a.length){
//                 res[k] = a[i];
//                 i++;
//                 k++;
//         }
//         while(j < b.length){
//                 res[k] = b[j];
//                 j++;
//                 k++;
//         }
//         return res;
// }

//MERGE SORT
// public static int[] mergeSort(int[]arr,int lo,int hi){
//         if(lo == hi){
//                 int[]ba = new int[1];
//                 ba[0] = arr[lo];
//                 return ba;
//         }
//         int mid = (lo + hi) / 2;
//         int[]fsh = mergeSort(arr,lo,mid);
//         int[]ssh = mergeSort(arr,mid + 1;hi);
//         int[]fsa = mergeTwoSortedArraya(fsh,ssh);
//         return fsa;
// }

//PARTIONING AN ARRAY
// public static void partition(int[]arr,int pivot){
//         // 0 to j - 1 -> <= pivot
//         // j to i - 1 -> > pivot
//         // i to end = unknown
//         int i = 0;
//         int j = 0;
//         while(i < arr.length){
//                 if(arr[i] > pivot){
//                         i++;
//                 }else{
//                         swap(arr,i,j);
//                         i++;
//                         j++;
//                 }
//         } 
// }

//QUICK SORT
// public static void qucikSort(int[]arr,int lo,int hi){
//         if(lo >= hi){
//                 return;
//         }
//         int pivot = arr[hi];
//         int pi = partition(arr,pivot,lo,hi);
//         quickSort(arr,lo,pi - 1);
//         quickSort(arr,pi + 1,hi);
// }

//QUICK SELECRT
// public static int quickSelect(int[]arr,int lo,int hi){
//         int pivot = arr[hi];
//         int pi = partition(arr,pivot,lo,hi);
//         if(k > pi){
//                 return quickSelect(arr,pi + 1,hi,k);
//         }else if(k < pi){
//                 return quickSelect(arr,lo,pi - 1,k);
//         }else{
//                 return arr[pi];
//         }
// }

//COUNT SORT
// import java.io.*;
// import java.util.*;
// public class Main{
//         public static void countSort(int[]arr,int min,int max){
//                 int range = max - min + 1;
//                 int[]farr = new int[range];
//                 for(int i = 0;i < arr.length;i++){
//                         int idx = arr[i] - min;
//                         farr[idx]++;
//                 }
//                 for(int i = 1;i < farr.length;i++){
//                         farr[i] = farr[i] + farr[i - 1];
//                 }
//                 int[]ans = new int[arr.length];
//                 for(int i = arr.length - 1;i >= 0;i--){
//                         int val = arr[i];
//                         int pos = farr[val - min];
//                         int idx = pos - 1;
//                         ans[idx] = val;
//                         farr[val - min]--;
//                 }
//                 for(int i = 0;i < ans.length;i++){
//                         arr[i] = ans[i];
//                 }
//         }
//         public static void print(int[]arr){
//                 for(int i = 0;i < arr.length;i++){
//                         System.out.println(arr[i]);
//                 }
//         }
//         public static void main(String[]args)throws Exception{
//                 Scanner scn = new Scanner(System.in);
//                 int n = scn.nextInt();
//                 int[]arr = new int[n];
//                 int max = Integer.MIN_VALUE;
//                 int min = Integer.MAX_VALUE;
//                 for(int i = 0;i < n;i++){
//                         arr[i] = scn.nextInt();
//                         max = Math.max(max,arr[i]);
//                         min = Math.min(min,arr[i]);
//                 }
//                 countSort(arr,min,max);
//                 print(arr);
//         }
// }

//RADIX SORT
// public static void radixSort(int[]arr){
//         int max = Integer.MIN_VALUE;
//         for(int val : arr){
//                 if(val > max){
//                         max = val;
//                 }
//         }
//         int exp = 1;
//         while(exp <= max){
//                 countSort(arr,exp);
//                 exp = exp * 10;
//         }
// }

//SORT DATES
// public static void sortDates(String[]arr){
//         countSort(arr,1000000,100,32); //days
//         countSort(arr,10000,100,12); //months
//         countSort(arr,1,10000,2501); //years
// }

//SORT 01
// public static void sort01(int[]arr){
//         int i = 0;
//         int j = 0;
//         while(i < arr.length){
//                 if(arr[i] == 1){
//                         i++;
//                 }else{
//                         swap(arr,i,j);
//                         i++;
//                         j++;
//                 }
//         }
// }

//SORT 012
// public static void sort012(int[]arr){
//         int j = 0; // 0 to j - 1 -> 0's area
//         int i = 0; // j to i - 1 -> 1's area
//         int k = arr.length - 1; // k + ito end -> 2's area
//         // i to k is unkown
//         while(i <= k){
//                 if(arr[i] == 0){
//                         swap(arr,i,j);
//                         i++;
//                         j++;
//                 }else if(arr[i] == 1){
//                         i++;
//                 }else{
//                         swap(arr,i,,k);
//                         k--;
//                 }
//         }
// }

//TARGET SUM PAIR
// import java.io.*;
// import java.util.*;
// public class Main{
//         public static void targetSumPair(int[]arr,int target){
//                 Arrays.sort(arr);
//                 int li = 0;
//                 int ri = arr.length - 1;
//                 while(li < ri){
//                         if(arr[li] + arr[ri] < target){
//                                 li++;
//                         }else if(arr[li] + arr[ri] > target){
//                                 ri--;
//                         }else{
//                                 System.out.println(arr[li] + " ," + arr[ri]);
//                                 li++;
//                                 ri--;
//                         }
//                 }
//         }
//         public static void main(String[]args)throws Exception{
//                 Scanner scn = new Scanner(System.in);
//                 int n = scn.nextInt();
//                 int[]arr = new int[n];
//                 for(int i = 0;i < arr.length;i++){
//                         arr[i] = scn.nextInt();
//                 }
//                 int target = scn.nextInt();
//                 targetSumPair(arr,target);
//         }
// }

//PIVOT SORTED ARRAY
// import java.io.*;
// import java.util.*;
// public class Main{
//         public static int findPivot(int[]arr){
//                 int lo = 0;
//                 int hi = arr.length - 1;
//                 while(lo < hi){
//                         int mid = (lo + hi) / 2;
//                         if(arr[mid] < arr[hi]){
//                                 hi = mid;
//                         }else{
//                                 lo = mid + 1;
//                         }
//                 }
//                 return arr[hi];
//         }
//         public static void main(String[]args)throws Exception{
//                 Scanner scn = new Scanner(System.in);
//                 int n = scn.nextInt();
//                 int[]arr = new int[n];
//                 for(int i = 0;i < n;i++){
//                         arr[i] = scn.nextInt();
//                 }
//                 int pivot = findPivot(arr);
//                 System.out.println(pivot);
//         }
// }


                                //GENERIC TREE
// import java.util.*;
// public class Main{
//         private class Node{
//                 int data;
//                 ArrayList<Node> children = new ArrayList<>();
//         }
//         public static void main(String[]args){
//                 Node root;
//         }
// }

//GENERIC TREE CONSTRUCTOR
// import java.io.*;
// import java.util.*;
// public class Main{
//         private class Node{
//                 int data;
//                 ArrayList<Node> children = new ArrayList<>();
//         }
//         public static void main(String[]args){
//                 int[] arr = {10,20,50,-1,60,-1,-1,30,70,-1,80,110,-1,120,-1,-1,90,-1,-1,40,100,-1,-1,-1};
//                 Node root;
//                 Stack<Node> st = new Stack<>();
//                 for(int i = 0; i < arr.length ;i++){
//                         if(arr[i] == -1){
//                                 st.pop();
//                         }else{
//                                 Node t = new Node();
//                                 t.data = arr[i];
//                                 if(st.size() > 0){
//                                         st.peek().children.add(t);
//                                 }else{
//                                         root = t;
//                                 }
//                                 st.push(t);
//                         }
//                 }
//         }
// }

//DISPLAY A TREE
// import java.io.*;
// import java.util.*;
// public class Main{
//         private static class Node{
//                 int data ;
//                 ArrayList<Node> children = new ArrayList<>();
//         }
//         //d(10) -> 10 will print itself and is family
//         //d(20),d(30).d(40) will print themselves and thei family
//         //d(10) = s(10) + d(20) + d(30) + d(40) 
//         public static void display(Node node){
//                 String str = node.data + " -> ";
//                 for(Node child : node.children){
//                         str += child.data + " , ";
//                 }
//                 str += ".";
//                 System.out.println(str);
//                 for(Node child : node.children){
//                         display(child);
//                 }
//         }
//         public static void main(String[]args){
//                 int[] arr = {10,20,50,-1,60,-1,-1,30,70,-1,80,110,-1,120,-1,-1,90,-1,-1,40,100,-1,-1,-1};
//                 Node root = null;
//                 Stack<Node> st = new Stack<>();
//                 for(int i = 0; i < arr.length ;i++){
//                         if(arr[i] == -1){
//                                 st.pop();
//                         }else{
//                                 Node t = new Node();
//                                 t.data = arr[i];
//                                 if(st.size() > 0){
//                                         st.peek().children.add(t);
//                                 }else{
//                                         root = t;
//                                 }
//                                 st.push(t);
//                         }
//                 }
//                 display(root);
//         }
// }

//SIZE OF A GENERIC TREE
// import java.io.*;
// import java.util.*;
// public class Main{
//         private static class Node{
//                 int data ;
//                 ArrayList<Node> children = new ArrayList<>();
//         }
//         public static void display(Node node){
//                 String str = node.data + " -> ";
//                 for(Node child : node.children){
//                         str += child.data + " , ";
//                 }
//                 str += ".";
//                 System.out.println(str);
//                 for(Node child : node.children){
//                         display(child);
//                 }
//         }
// public static Node construct(int[]arr){
//         Node root = null;
//         Stack<Node> st = new Stack<>();
//         for(int i = 0; i < arr.length ;i++){
//                 if(arr[i] == -1){
//                         st.pop();
//                 }else{
//                         Node t = new Node();
//                         t.data = arr[i];
//                         if(st.size() > 0){
//                                 st.peek().children.add(t);
//                         }else{
//                                 root = t;
//                         }
//                         st.push(t);
//                 }
//         }
//         return root;
// }
// public static int size(Node node){
//         int s = 0;
//         for(Node child : node.children){
//                 int cs = size(child);
//                 s = s + cs;
//         } 
//         s = s + 1;
//         return s;
// }
// public static void main(String[]args)throws Exception{
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         int n = Integer.parseInt(br.readLine());
//         int[]arr = new int [n];
//         String[]values = br.readLine().split(" ");
//         for(int i = 0;i < n;i++){
//                 arr[i] = Integer.parseInt(values[i]);
//         }
//         Node root = construct(arr);
//         int sz = size(root);
//         System.out.println(sz);
//         //display(root);
// }
// }

//MAXIMUM OF GENERIC TREE
// import java.io.*;
// import java.util.*;
// public class Main{
//         private static class Node{
//                 int data ;
//                 ArrayList<Node> children = new ArrayList<>();
//         }
//         public static void display(Node node){
//                 String str = node.data + " -> ";
//                 for(Node child : node.children){
//                         str += child.data + " , ";
//                 }
//                 str += ".";
//                 System.out.println(str);
//                 for(Node child : node.children){
//                         display(child);
//                 }
//         }
// public static Node construct(int[]arr){
//         Node root = null;
//         Stack<Node> st = new Stack<>();
//         for(int i = 0; i < arr.length ;i++){
//                 if(arr[i] == -1){
//                         st.pop();
//                 }else{
//                         Node t = new Node();
//                         t.data = arr[i];
//                         if(st.size() > 0){
//                                 st.peek().children.add(t);
//                         }else{
//                                 root = t;
//                         }
//                         st.push(t);
//                 }
//         }
//         return root;
// }
// public static int size(Node node){
//         int s = 0;
//         for(Node child : node.children){
//                 int cs = size(child);
//                 s = s + cs;
//         } 
//         s = s + 1;
//         return s;
// }
// public static int max(Node node){
//         int max = Integer.MIN_VALUE;
//         for(Node child : node.children){
//                 int cm = max(child);
//                 max = Math.max(cm,max);
//         }
//         max = Math.max(node.data,max);
//         return max;
// }
// public static void main(String[]args)throws Exception{
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         int n = Integer.parseInt(br.readLine());
//         int[]arr = new int [n];
//         String[]values = br.readLine().split(" ");
//         for(int i = 0;i < n;i++){
//                 arr[i] = Integer.parseInt(values[i]);
//         }
//         Node root = construct(arr);
//         int m = max(root);
//         System.out.println(m);
//         //display(root);
// }
// }

//HEIGHT OF GENERIC TREE
// import java.io.*;
// import java.util.*;
// public class Main{
//         private static class Node{
//                 int data ;
//                 ArrayList<Node> children = new ArrayList<>();
//         }
//         public static void display(Node node){
//                 String str = node.data + " -> ";
//                 for(Node child : node.children){
//                         str += child.data + " , ";
//                 }
//                 str += ".";
//                 System.out.println(str);
//                 for(Node child : node.children){
//                         display(child);
//                 }
//         }
// public static Node construct(int[]arr){
//         Node root = null;
//         Stack<Node> st = new Stack<>();
//         for(int i = 0; i < arr.length ;i++){
//                 if(arr[i] == -1){
//                         st.pop();
//                 }else{
//                         Node t = new Node();
//                         t.data = arr[i];
//                         if(st.size() > 0){
//                                 st.peek().children.add(t);
//                         }else{
//                                 root = t;
//                         }
//                         st.push(t);
//                 }
//         }
//         return root;
// }
// public static int size(Node node){
//         int s = 0;
//         for(Node child : node.children){
//                 int cs = size(child);
//                 s = s + cs;
//         } 
//         s = s + 1;
//         return s;
// }
// public static int max(Node node){
//         int m = Integer.MIN_VALUE;
//         for(Node child : node.children){
//                 int cm = max(child);
//                 m = Math.max(cm,m);
//         }
//         m = Math.max(node.data,m);
//         return m;
// }
// public static int height(Node node){
//         int ht = -1;
//         for(Node child : node.children){
//                 int ch = height(child);
//                 ht = Math.max(ch,ht);
//         }
//         ht += 1;
//         return ht;
// }
// public static void main(String[]args)throws Exception{
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         int n = Integer.parseInt(br.readLine());
//         int[]arr = new int [n];
//         String[]values = br.readLine().split(" ");
//         for(int i = 0;i < n;i++){
//                 arr[i] = Integer.parseInt(values[i]);
//         }
//         Node root = construct(arr);
//         int h = height(root);
//         System.out.println(h);
//         //display(root);
// }
// }

//TRAVERSALS
// public static void traversals(Node node){
//         System.out.println("Node pre" + node.data);
//         for(Node child : node.children){
//                 System.out.println("Edge pre" + node.data + "--" + child.data);
//                 traversals(child);
//                 System.out.println("Edge post" + node.data + "--" + child.data);
//         }
//         System.out.println("Node post" + node.data);
// }

//LEVEL ORDER TRAVERSAL
// public static void levelOrder(Node node){
//         Queue<Node> q = new ArrayDeque<>();
//         q.add(node);
//         while(q.size() > 0){
//                 node = q.remove();
//                 System.out.println(node.data + " ");
//                 for(Node child : node.children){
//                         q.add(child);
//                 }
//         }
//         System.out.println(".");
// }

//LEVEL ORDER LINE-WISE
//approach-1
// public static void levelOrderLinewise(Node node){
//         Queue<Node> mq = new ArrayDeque<>();
//         mq.add(node);
//         Queue<Node> cq = new ArrayDeque<>();
//         while(m1.size() > 0){
//                 node = mq.remove();
//                 System.out.println(node.data + " ");
//                 for(Node child : node.children){
//                      cq.add(child);
//                 }
//                 if(mq.size() == 0){
//                         mq = cq;
//                         cq = new ArrayDeque<>();
//                         System.out.println();
//                 }
//         }
// }
//approach-2
// public static void levelOrderLinewise2(Node node){
//         Queue<Node> mq = new ArrayDeque<>();
//         mq.add(node);
//         while(mq.size() > 0){
//                 int cicl = mq.size();
//                 for(int i = 0;i < cicl;i++){
//                         node = mq.remove();
//                         System.out.println(node.data + " ");
//                         for(Node child : node.children){
//                                 mq.add(child);
//                         }
//                 }
//                 System.out.println();
//         }
// }
//approach-3
// private static class Pair{
//         Node node;
//         int level;
//         Pair(Node node,int level){
//                 this.node = node;
//                 this.level = level;
//         }
// }
// public static void levelOrderLinewise3(Node node){
//         Queue<Pair> mq = new ArrayDeque<>();
//         mq.add(new Pair(node,1));
//         int level = 1;
//         while(mq.size() > 0){
//                 Pair p = mq.remove();
//                 if(p.level > level){
//                         level = p.level;
//                         System.out.println();
//                 }
//                 System.out.println(p.node.data + " ");
//                 for(Node child : node.children){
//                         Pair cp = new Pair(child,p.level + 1){
//                                 mq.add(cp);
//                         }
//                 }
//         }
// }

//LEVEL ORDER LINEWISE - ZIGZAG
// public static void levelOrderLinewiseZZ(Node node){
//         Stack<Node> ms = new Stack<>();
//         ms.push(node);
//         Stack<Node> cs = new Stack<>();
//         int level = 1;
//         while(ms.size() > 0){
//                 node = ms.pop();
//                 System.out.println(node.data + " ");
//                 if(level % 2 == 1){
//                         for(int i = 0;i < node.children.size();i++){
//                                 Node child = node.children.get(i);
//                                 cs.push(child);
//                         }
//                 }else{
//                         for(int i = node.children.size() - 1;i >= 0;i--){
//                                 Node child = node.children.get(i);
//                                 cs.push(child);
//                         }
//                 }
//                 if(ms.size() == 0){
//                         ms = cs;
//                         cs = new Stack<>();
//                         level++;
//                         System.out.println();
//                 }
//         }
// }

//MIRROR
// public static void mirror(Node node){
//         for(Node child : node.children){
//                 mirror(child);
//         }
//         Collections.reverse(node.children);
// }

//REMOVE LEAVES
// public static void removeLeaves(Node node){
//         for(int i = node.children.size();i >= 0;i--){
//                 Node child = node.children.get(i);
//                 if(child.children.size() == 0){
//                         node.chilren.remove(child);
//                 }
//         }
//         for(Node child : node.children){
//                 removeLeaves(child);
//         }
// }

//LINEARIZE A GENERIC TREE
// public static void linearize(Node node){
//         for(Node child : node.children){
//                 linearize(child);
//         }
//         while(node.children.size() > 1){
//                 Node lc = node.children.remove(node.children.size() - 1);
//                 Node sl = node.children.get(node.children.size() - 1);
//                 Node slt = getTail(lc);
//                 slt.children.add(lc);
//         }
// }
// private static Node getTail(Node node){
//         while(node.children.size() == 0){
//                 node = node.children.get(0);
//         }
//         return node;
// }
// //approach-2
// public static Node linearize2(Node node){
//         if(node.children.size() == 0){
//                 return node;
//         }
//         Node lkt = linearize2(node.children.get(node.children.size() - 1));
//         while(node.children.size() > 1){
//                 Node last = node.children.remove(node.children.size() - 1);
//                 Node sl = node.children.get(node.children.size() - 1);
//                 Node slkt = linearize2(sl);
//                 slkt.children.add(last);
//         }
//         return lkt;
// }

//FIND AN ELEMENT IN GENERIC TREE
// public static void find(Node node){
//         if(node.data == data){
//                 return true;
//         }
//         for(Node child : node.children){
//                 boolean fic = find(child,data);
//                 if(fic){
//                         return true;
//                 }
//         }
//         return false;
// }

//NODE TO ROOT PATH
// public static ArrayList<Integer> nodeToRootPath(Node node,int data){
//         if(node.data == data){
//                 ArrayList<Integer> list = new ArrayList<>();
//                 list.add(node.data);
//                 return list;
//         }
//         for(Node child : node.children){
//                 ArrayList<Integer> ptc = nodeToRootPath(child,data);
//                 if(ptc.size() > 0){
//                         ptc.add(node.data);
//                         return ptc;
//                 }
//         }
//         return new ArrayList<>();
// }

//LOWEST COMMON ANCESTOR
// public static int lca(Node node,int d1,int d2){
//         ArrayList<Integer> p1 = nodeToRootPath(node,d1);
//         ArrayList<Integer> p2 = nodeToRootPath(node,d2);
//         int i = p1.size() - 1;
//         int j = p2.size() - 1;
//         while(i >= 0 && j >= 0 && p1.get(i) == p1.get(j)){
//                 i--;
//                 j--;
//         }
//         i++;
//         j++;
//         return p1.get(i + 1);
// }

//DISTANCE BETWEEN NODES
// public static int distanceBetweenNodes(Node node,int d1,int d2){
//         ArrayList<Integer> p1 = nodeToRootPath(node,d1);
//         ArrayList<Integer> p2 = nodeToRootPath(node,d2);
//         int i = p1.size() - 1;
//         int j = p2.size() - 1;
//         while(i >= 0 && j >= 0 && p1.get(i) == p1.get(j)){
//                 i--;
//                 j--;
//         }
//         i++;
//         j++; 
//         return i + j;
// }

//ARE TREES SIMILAR IN SHAPE
// public static boolean areSimilar(Node n1,Node n2){
//         if(n1.children.size() != n2.children.size()){
//                 return false;
//         }
//         for(int i = 0;i < n1.children.size();i++){
//                 Node c1 = n1.children.get(i);
//                 Node c2 = n2.children.get(i);
//                 if(areSimilar(c1,c2) == false){
//                         return false;
//                 }
//         }
//         return true;
// }

//ARE TREES MIRROR IN SHAPE
// public static boolean areMirror(Node n1,Node n2){
//         if(n1.children.size() != n2.children.size()){
//                 return false;
//         }
//         for(int i = 0;i < n1.children.size();i++){
//                 int j = n1.children.size() - 1 - i;
//                      Node c1 = n1.children.get(i);
//                      Node c2 = n2.children.get(j);
//                      if(areSimilr(c1,c2) == false){
//                          return false;
//                 }
//         }
//         return true;
// }

//IS GENERIC TREE SYMETRIC
// public static boolean isSymetric(Node node){
//         return areMirror(node,node);
// }

   //GENERIC TREE-MULTISOLVER(travel and change strategy)
// import java.io.*;
// import java.util.*;
// public class Main{
//         private static class Node{
//                 int data ;
//                 ArrayList<Node> children = new ArrayList<>();
//         }
//         public static void display(Node node){
//                 String str = node.data + " -> ";
//                 for(Node child : node.children){
//                         str += child.data + " , ";
//                 }
//                 str += ".";
//                 System.out.println(str);
//                 for(Node child : node.children){
//                         display(child);
//                 }
//         }
// public static Node construct(int[]arr){
//         Node root = null;
//         Stack<Node> st = new Stack<>();
//         for(int i = 0; i < arr.length ;i++){
//                 if(arr[i] == -1){
//                         st.pop();
//                 }else{
//                         Node t = new Node();
//                         t.data = arr[i];
//                         if(st.size() > 0){
//                                 st.peek().children.add(t);
//                         }else{
//                                 root = t;
//                         }
//                         st.push(t);
//                 }
//         }
//         return root;
// }
// static int size;
// static int min;
// static int max;
// static int height;
// public static void multisolver(Node node,int depth){
//         size++;
//         min = Math.min(min,node.data);
//         max = Math.max(max,node.data);
//         height = Math.max(height,depth);
//         for(Node child : node.children){
//                 multisolver(child,depth + 1);
//         } 
// }
// public static void main(String[]args)throws Exception{
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         int n = Integer.parseInt(br.readLine());
//         int[]arr = new int [n];
//         String[]values = br.readLine().split(" ");
//         for(int i = 0;i < n;i++){
//                 arr[i] = Integer.parseInt(values[i]);
//         }
//         Node root = construct(arr);
//         size = 0;
//         min = Integer.MAX_VALUE;
//         max = Integer.MIN_VALUE;
//         height = 0;
//         multisolver(root,0);
//         System.out.println("Size" + size);
//         System.out.println("Min" + min);
//         System.out.println("Max" + max);
//         System.out.println("Height" + height);
// }
// }

//PREDECESSOR AND SUCCESSOR OF AN ELEMENT
// import java.io.*;
// import java.util.*;
// public class Main{
//         private static class Node{
//                 int data ;
//                 ArrayList<Node> children = new ArrayList<>();
//         }
//         public static void display(Node node){
//                 String str = node.data + " -> ";
//                 for(Node child : node.children){
//                         str += child.data + " , ";
//                 }
//                 str += ".";
//                 System.out.println(str);
//                 for(Node child : node.children){
//                         display(child);
//                 }
//         }
// public static Node construct(int[]arr){
//         Node root = null;
//         Stack<Node> st = new Stack<>();
//         for(int i = 0; i < arr.length ;i++){
//                 if(arr[i] == -1){
//                         st.pop();
//                 }else{
//                         Node t = new Node();
//                         t.data = arr[i];
//                         if(st.size() > 0){
//                                 st.peek().children.add(t);
//                         }else{
//                                 root = t;
//                         }
//                         st.push(t);
//                 }
//         }
//         return root;
// }
// static Node predecessor;
// static Node successor;
// static int state;
// public static void predecessorAndSuccessor(Node node,int data){
//         if(state == 0){
//                 if(node.data == data){
//                         state = 1;
//                 }else{
//                         predecessor = node;
//                 }
//         }else if(state == 1){
//                 successor = node;
//                 state = 2;
//         }
//         for(Node child : node.children){
//                 predecessorAndSuccessor(child, data);
//         }
// }
// public static void main(String[]args)throws Exception{
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         int n = Integer.parseInt(br.readLine());
//         int[]arr = new int [n];
//         String[]values = br.readLine().split(" ");
//         for(int i = 0;i < n;i++){
//                 arr[i] = Integer.parseInt(values[i]);
//         }
//         int data = Integer.parseInt(br.readLine());
//         Node root = construct(arr);
//         predecessor = null;
//         successor = null;
//         state = 0;
//         predecessorAndSuccessor(root,data);
//         if(predecessor == null){
//                 System.out.println("Predecessor = Not found");
//         }else{
//                 System.out.println("Predecessor = " + predecessor.data);
//         }
//         if(successor == null){
//                 System.out.println("Successor = Not found");
//         }else{
//                 System.out.println("Successor = " + successor.data);
//         }
// }
// }

//CEIL AND FLOOR
// import java.io.*;
// import java.util.*;
// public class Main{
//         private static class Node{
//                 int data ;
//                 ArrayList<Node> children = new ArrayList<>();
//         }
//         public static void display(Node node){
//                 String str = node.data + " -> ";
//                 for(Node child : node.children){
//                         str += child.data + " , ";
//                 }
//                 str += ".";
//                 System.out.println(str);
//                 for(Node child : node.children){
//                         display(child);
//                 }
//         }
// public static Node construct(int[]arr){
//         Node root = null;
//         Stack<Node> st = new Stack<>();
//         for(int i = 0; i < arr.length ;i++){
//                 if(arr[i] == -1){
//                         st.pop();
//                 }else{
//                         Node t = new Node();
//                         t.data = arr[i];
//                         if(st.size() > 0){
//                                 st.peek().children.add(t);
//                         }else{
//                                 root = t;
//                         }
//                         st.push(t);
//                 }
//         }
//         return root;
// }
// static int ceil;
// static int floor;
// public static void ceilAndFloor(Node node,int data){
//         if(node.data > data){
//                 if(node.data < ceil){
//                         ceil = node.data;
//                 }
//         }
//         if(node.data < data){
//                 if(node.data > floor){
//                         floor = node.data;
//                 }
//         }
//         for(Node child : node.children){
//                 ceilAndFloor(child,data);
//         }
// }
// public static void main(String[]args)throws Exception{
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         int n = Integer.parseInt(br.readLine());
//         int[]arr = new int [n];
//         String[]values = br.readLine().split(" ");
//         for(int i = 0;i < n;i++){
//                 arr[i] = Integer.parseInt(values[i]);
//         }
//         int data = Integer.parseInt(br.readLine());
//         Node root = construct(arr);
//         ceil = Integer.MAX_VALUE;   //samllest among larger
//         floor = Integer.MIN_VALUE;  //largest among smaller
//         ceilAndFloor(root,data);
//         System.out.println("CEIL =" + ceil);
//         System.out.println("FLOOR =" + floor);
// }
// }

//KTH LARGEST ELEMENT
// import java.io.*;
// import java.util.*;
// public class Main{
//         private static class Node{
//                 int data ;
//                 ArrayList<Node> children = new ArrayList<>();
//         }
//         public static void display(Node node){
//                 String str = node.data + " -> ";
//                 for(Node child : node.children){
//                         str += child.data + " , ";
//                 }
//                 str += ".";
//                 System.out.println(str);
//                 for(Node child : node.children){
//                         display(child);
//                 }
//         }
// public static Node construct(int[]arr){
//         Node root = null;
//         Stack<Node> st = new Stack<>();
//         for(int i = 0; i < arr.length ;i++){
//                 if(arr[i] == -1){
//                         st.pop();
//                 }else{
//                         Node t = new Node();
//                         t.data = arr[i];
//                         if(st.size() > 0){
//                                 st.peek().children.add(t);
//                         }else{
//                                 root = t;
//                         }
//                         st.push(t);
//                 }
//         }
//         return root;
// }
// static int ceil;
// static int floor;
// public static void ceilAndFloor(Node node,int data){
//         if(node.data > data){
//                 if(node.data < ceil){
//                         ceil = node.data;
//                 }
//         }
//         if(node.data < data){
//                 if(node.data > floor){
//                         floor = node.data;
//                 }
//         }
//         for(Node child : node.children){
//                 ceilAndFloor(child,data);
//         }
// }
// public static int kthLargest(Node node,int k){
//         floor = Integer.MIN_VALUE;
//         int factor = Integer.MAX_VALUE;
//         for(int i = 0;i < k;i++){
//                 ceilAndFloor(node,factor); //will set floor
//                 factor = floor;
//                 floor = Integer.MIN_VALUE;
//         }
//         return factor;
// }
// public static void main(String[]args)throws Exception{
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         int n = Integer.parseInt(br.readLine());
//         int[]arr = new int [n];
//         String[]values = br.readLine().split(" ");
//         for(int i = 0;i < n;i++){
//                 arr[i] = Integer.parseInt(values[i]);
//         }
//         int k = Integer.parseInt(br.readLine());
//         Node root = construct(arr);
//         int kthLargest = kthLargest(root,k);
//         System.out.println(kthLargest);
// }
// }

//NODE WITH MAXIMUM SUBTREE SUM
// import java.io.*;
// import java.util.*;
// public class Main{
//         private static class Node{
//                 int data ;
//                 ArrayList<Node> children = new ArrayList<>();
//         }
//         public static void display(Node node){
//                 String str = node.data + " -> ";
//                 for(Node child : node.children){
//                         str += child.data + " , ";
//                 }
//                 str += ".";
//                 System.out.println(str);
//                 for(Node child : node.children){
//                         display(child);
//                 }
//         }
// public static Node construct(int[]arr){
//         Node root = null;
//         Stack<Node> st = new Stack<>();
//         for(int i = 0; i < arr.length ;i++){
//                 if(arr[i] == -1){
//                         st.pop();
//                 }else{
//                         Node t = new Node();
//                         t.data = arr[i];
//                         if(st.size() > 0){
//                                 st.peek().children.add(t);
//                         }else{
//                                 root = t;
//                         }
//                         st.push(t);
//                 }
//         }
//         return root;
// }
// static int msn = 0;
// static int ms = Integer.MIN_VALUE;
// static int retSumAndCalculateMSST(Node node){
//         int sum = 0;
//         for(Node child : node.children){
//                 int csum = retSumAndCalculateMSST(child);
//                 sum += csum;
//         }
//         sum += node.data;
//         if(sum > ms){
//                 msn = node.data;
//                 ms = sum;
//         }
//         return sum;
// }
// public static void main(String[]args)throws Exception{
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         int n = Integer.parseInt(br.readLine());
//         int[]arr = new int [n];
//         String[]values = br.readLine().split(" ");
//         for(int i = 0;i < n;i++){
//                 arr[i] = Integer.parseInt(values[i]);
//         }
//         Node root = construct(arr);
//         retSumAndCalculateMSST(root);
//         System.out.println(msn + "@" + ms);
// }
// }

//DIAMETER OF GENERIC TREE
// import java.io.*;
// import java.util.*;
// public class Main{
//         private static class Node{
//                 int data ;
//                 ArrayList<Node> children = new ArrayList<>();
//         }
//         public static void display(Node node){
//                 String str = node.data + " -> ";
//                 for(Node child : node.children){
//                         str += child.data + " , ";
//                 }
//                 str += ".";
//                 System.out.println(str);
//                 for(Node child : node.children){
//                         display(child);
//                 }
//         }
// public static Node construct(int[]arr){
//         Node root = null;
//         Stack<Node> st = new Stack<>();
//         for(int i = 0; i < arr.length ;i++){
//                 if(arr[i] == -1){
//                         st.pop();
//                 }else{
//                         Node t = new Node();
//                         t.data = arr[i];
//                         if(st.size() > 0){
//                                 st.peek().children.add(t);
//                         }else{
//                                 root = t;
//                         }
//                         st.push(t);
//                 }
//         }
//         return root;
// }
// static int dia = 0;
// static int calculateDiaReturnHeight(Node node){
//         int dch = -1;
//         int sdch = -1;
//         for(Node child : node.children){
//                 int ch = calculateDiaReturnHeight(child);
//                 if(ch > dch){
//                         sdch = dch;
//                         dch = ch;
//                 }else if(ch > sdch){
//                         sdch = ch;
//                 }
//         }
//         int cand = dch + sdch + 2;
//         if(cand > dia){
//                 dia = cand;
//         }
//         dch += 1;
//         return dch;
// }
// public static void main(String[]args)throws Exception{
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         int n = Integer.parseInt(br.readLine());
//         int[]arr = new int [n];
//         String[]values = br.readLine().split(" ");
//         for(int i = 0;i < n;i++){
//                 arr[i] = Integer.parseInt(values[i]);
//         }
//         Node root = construct(arr);
//         calculateDiaReturnHeight(root);
//         System.out.println(dia);
// }
// }

//ITERATIVE PREORDER AND POSTORDER OF GENERIC TREE
// import java.io.*;
// import java.util.*;
// public class Main{
//         private static class Node{
//                 int data ;
//                 ArrayList<Node> children = new ArrayList<>();
//         }
//         public static void display(Node node){
//                 String str = node.data + " -> ";
//                 for(Node child : node.children){
//                         str += child.data + " , ";
//                 }
//                 str += ".";
//                 System.out.println(str);
//                 for(Node child : node.children){
//                         display(child);
//                 }
//         }
// public static Node construct(int[]arr){
//         Node root = null;
//         Stack<Node> st = new Stack<>();
//         for(int i = 0; i < arr.length ;i++){
//                 if(arr[i] == -1){
//                         st.pop();
//                 }else{
//                         Node t = new Node();
//                         t.data = arr[i];
//                         if(st.size() > 0){
//                                 st.peek().children.add(t);
//                         }else{
//                                 root = t;
//                         }
//                         st.push(t);
//                 }
//         }
//         return root;
// }
// static class Pair{
//         Node node;
//         int state;
//         Pair(Node node, int state){
//                 this.node = node;
//                 this.state = state;
//         }
// }
// public static void IterativePreAndPostOrder(Node node){
//         Stack<Pair> st = new Stack<>();
//         st.push(new Pair(node,-1));
//         String pre = "";
//         String post = "";
        // while(st.size() > 0){
        //         Pair top = st.peek();
        //         if(top.state == -1){
        //                 pre += top.node.data + " ";
        //                 top.state++;
        //         }else if(top.state == top.node.children.size()){
        //                 post += top.node.data + " ";
        //                 st.pop();
        //         }else{
        //                 Pair cp = new Pair(top.node.children.get(top.state) , -1);
        //                 st.push(cp);
        //                 top.state++;
        //         }
        // } 
//         System.out.println(pre);
//         System.out.println(post);
// }
// public static void main(String[]args)throws Exception{
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         int n = Integer.parseInt(br.readLine());
//         int[]arr = new int [n];
//         String[]values = br.readLine().split(" ");
//         for(int i = 0;i < n;i++){
//                 arr[i] = Integer.parseInt(values[i]);
//         }
//         Node root = construct(arr);
//         IterativePreAndPostOrder(root);
// }
// }

   //ITERABLE AND ITERATOR
// import java.io.*;
// import java.util.*;
// public class Main{
//         public static class GenericTree implements Iterable<Integer>{
//                 Node root;
//                 GenericTree(Node root){
//                         this.root = root;
//                 }
//                 public Iterator<Integer> iterator(){
//                         Iterator<Integer> obj = new GTPreorderIterator(root);
//                         return obj;
//                 }
//         }
//         public static class GTPreorderIterator implements Iterator<Integer>{
//                 Integer nval;
//                 Stack<Pair> st;
//                 public GTPreorderIterator(Node root){
//                         st = new Stack<>();
//                         st.push(new Pair(root,-1));
//                         next();
//                 }
//                 public boolean hasNext(){
//                         if(nval == null){
//                                 return false;
//                         }else{
//                                 return true;
//                         }
//                 }
//                 public Integer next(){
//                         Integer fr = nval;
//                         nval = null;
//                         while(st.size() > 0){
//                                 Pair top = st.peek();
//                                 if(top.state == -1){
//                                         nval = top.node.data;
//                                         top.state++;
//                                 }else if(top.state == top.node.children.size()){
//                                         st.pop();
//                                 }else{
//                                         Pair cp = new Pair(top.node.children.get(top.state) , -1);
//                                         st.push(cp);
//                                         top.state++;
//                                 }
//                         } 
//                         return fr;
//                 }
//         }
//         private static class Pair{
//                 Node node;
//                 int state;
//                 Pair(Node node,int state){
//                         this.node = node;
//                         this.state = state;
//                 }
//         }
//         private static class Node{
//                 int data ;
//                 ArrayList<Node> children = new ArrayList<>();
//         }
//         public static void display(Node node){
//                 String str = node.data + " -> ";
//                 for(Node child : node.children){
//                         str += child.data + " , ";
//                 }
//                 str += ".";
//                 System.out.println(str);
//                 for(Node child : node.children){
//                         display(child);
//                 }
//         }
// public static Node construct(int[]arr){
//         Node root = null;
//         Stack<Node> st = new Stack<>();
//         for(int i = 0; i < arr.length ;i++){
//                 if(arr[i] == -1){
//                         st.pop();
//                 }else{
//                         Node t = new Node();
//                         t.data = arr[i];
//                         if(st.size() > 0){
//                                 st.peek().children.add(t);
//                         }else{
//                                 root = t;
//                         }
//                         st.push(t);
//                 }
//         }
//         return root;
// }
// public static void main(String[]args)throws Exception{
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         int n = Integer.parseInt(br.readLine());
//         int[]arr = new int [n];
//         String[]values = br.readLine().split(" ");
//         for(int i = 0;i < n;i++){
//                 arr[i] = Integer.parseInt(values[i]);
//         }
//         Node root = construct(arr);
//         GenericTree gt = new GenericTree(root);
//         // for(int val : gt){  //syntacticl sugar depennd on iterable
//         //         System.out.println(val);
//         // }
//         Iterator <Integer> gti = gt.iterator();
//         while(gti.hasNext() == true){
//                 System.out.println(gti.next());
//         }
// }
// }


                            //BINARY TREE

//CONSTRUCT A TREE
// import java.io.*;
// import java.util.*;
// public class Main{
//         public static class Node{
//                 int data;
//                 Node left;
//                 Node right;
//                 Node(int data,Node left,Node right){
//                         this.data = data;
//                         this.left = left;
//                         this.right = right;
//                 }
//         }
//         public static class Pair{
//                 Node node;
//                 int state;
//                 Pair(Node node,int state){
//                         this.node = node;
//                         this.state = state;
//                 }
//         }
// //DISPLAY A SIZE
//         public static void display(Node node){
//                 if(node == null){
//                         return;
//                 }
//                 String str = "";
//                 str += node.left == null? "." : node.left.data + "";
//                 str += "<-" + node.data + "->";
//                 str += node.right == null? "." : node.right.data + "";
//                 System.out.println(str);
//                 display(node.left);
//                 display(node.right);
//         }
//         public static void main(String[]args)throws Exception{
//                 Integer[] arr = {50,25,12,null,null,37,30,null,null,null,75,62,null,70,null,null,87,null,null};
//                 Node root = new Node(arr[0],null,null);
//                 Pair rtp = new Pair(root,1);
//                 Stack <Pair> st = new Stack<>();
//                 st.push(rtp);
//                 int idx = 0;
//                 while(st.size() > 0){
//                         Pair top = st.peek();
//                         if(top.state == 1){
//                                 idx++;
//                                 if(arr[idx] != null){
//                                         top.node.left = new Node(arr[idx],null,null);
//                                         Pair lp = new Pair(top.node.left,1);
//                                         st.push(lp);
//                                 }else{
//                                         top.node.left = null;
//                                 }
//                                 top.state++;
//                         }else if(top.state == 2){
//                                 idx++;
//                                 if(arr[idx] != null){
//                                         top.node.right = new Node(arr[idx],null,null);
//                                         Pair rp = new Pair(top.node.right,1);
//                                         st.push(rp);
//                                 }else{
//                                         top.node.right = null;
//                                 }
//                                 top.state++;
//                         }else{
//                                 st.pop();
//                         }
//                 }
//                 display(root);
//         }
// }

//SIZE,SUM,MAX,HEIGHT
// import java.io.*;
// import java.util.*;
// public class Main{
//         public static class Node{
//                 int data;
//                 Node left;
//                 Node right;
//                 Node(int data,Node left,Node right){
//                         this.data = data;
//                         this.left = left;
//                         this.right = right;
//                 }
//         }
//         public static class Pair{
//                 Node node;
//                 int state;
//                 Pair(Node node,int state){
//                         this.node = node;
//                         this.state = state;
//                 }
//         }
//         public static Node construct(Integer[]arr){
//                 Node root = new Node(arr[0],null,null);
//                 Pair rtp = new Pair(root,1);
//                 Stack <Pair> st = new Stack<>();
//                 st.push(rtp);
//                 int idx = 0;
//                 while(st.size() > 0){
//                         Pair top = st.peek();
//                         if(top.state == 1){
//                                 idx++;
//                                 if(arr[idx] != null){
//                                         top.node.left = new Node(arr[idx],null,null);
//                                         Pair lp = new Pair(top.node.left,1);
//                                         st.push(lp);
//                                 }else{
//                                         top.node.left = null;
//                                 }
//                                 top.state++;
//                         }else if(top.state == 2){
//                                 idx++;
//                                 if(arr[idx] != null){
//                                         top.node.right = new Node(arr[idx],null,null);
//                                         Pair rp = new Pair(top.node.right,1);
//                                         st.push(rp);
//                                 }else{
//                                         top.node.right = null;
//                                 }
//                                 top.state++;
//                         }else{
//                                 st.pop();
//                         }
//                 }
//                 return root;
//         }
// //DISPLAY A SIZE
//         public static void display(Node node){
//                 if(node == null){
//                         return;
//                 }
//                 String str = "";
//                 str += node.left == null? "." : node.left.data + "";
//                 str += "<-" + node.data + "->";
//                 str += node.right == null? "." : node.right.data + "";
//                 System.out.println(str);
//                 display(node.left);
//                 display(node.right);
//         }
// //SIZE,SUM,MAX AND HEIGTH
//         public static int size(Node node){
//                 if(node == null){
//                         return 0;
//                 }
//                 int ls = size(node.left);
//                 int rs = size(node.right);
//                 int ts = ls + rs + 1;
//                 return ts;
//         }
//         public static int sum(Node node){
//                 if(node == null){
//                         return 0;
//                 }
//                 int lsm = sum(node.left);
//                 int rsm = sum(node.right);
//                 int tsm = lsm + rsm + node.data;
//                 return tsm;
//         }
//         public static int max(Node node){
//                 if(node == null){
//                         return Integer.MIN_VALUE;
//                 }
//                 int lm = max(node.left);
//                 int rm = max(node.right);
//                 int tm = Math.max(node.data,Math.max(lm,rm));
//                 return tm;
//         }
//         public static int height(Node node){
//                 if(node == null){
//                         return -1; //-1 for edges and 0 for nodes
//                 }
//                 int lh = height(node.left);
//                 int rh = height(node.right);
//                 int th = Math.max(lh,rh) + 1;
//                 return th;
//         }
//         public static void main(String[]args)throws Exception{
//                 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//                 int n = Integer.parseInt(br.readLine());
//                 Integer[]arr = new Integer [n];
//                 String[]values = br.readLine().split(" ");
//                 for(int i = 0;i < n;i++){
//                         if(values[i].equals("n") == false){
//                                 arr[i] = Integer.parseInt(values[i]);
//                         }else{
//                                 arr[i] = null;
//                         }
//                 }
//                 Node root = construct(arr);
//                 int size = size(root);
//                 int sum = sum(root);
//                 int max = max(root);
//                 int height = height(root);
//                 System.out.println(size);
//                 System.out.println(sum);
//                 System.out.println(max);
//                 System.out.println(height);
//         }
// }

//TRAVERSSALS IN BINARY TREE
// import java.io.*;
// import java.util.*;
// public class Main{
//         public static class Node{
//                 int data;
//                 Node left;
//                 Node right;
//                 Node(int data,Node left,Node right){
//                         this.data = data;
//                         this.left = left;
//                         this.right = right;
//                 }
//         }
//         public static class Pair{
//                 Node node;
//                 int state;
//                 Pair(Node node,int state){
//                         this.node = node;
//                         this.state = state;
//                 }
//         }
//         public static Node construct(Integer[]arr){
//                 Node root = new Node(arr[0],null,null);
//                 Pair rtp = new Pair(root,1);
//                 Stack <Pair> st = new Stack<>();
//                 st.push(rtp);
//                 int idx = 0;
//                 while(st.size() > 0){
//                         Pair top = st.peek();
//                         if(top.state == 1){
//                                 idx++;
//                                 if(arr[idx] != null){
//                                         top.node.left = new Node(arr[idx],null,null);
//                                         Pair lp = new Pair(top.node.left,1);
//                                         st.push(lp);
//                                 }else{
//                                         top.node.left = null;
//                                 }
//                                 top.state++;
//                         }else if(top.state == 2){
//                                 idx++;
//                                 if(arr[idx] != null){
//                                         top.node.right = new Node(arr[idx],null,null);
//                                         Pair rp = new Pair(top.node.right,1);
//                                         st.push(rp);
//                                 }else{
//                                         top.node.right = null;
//                                 }
//                                 top.state++;
//                         }else{
//                                 st.pop();
//                         }
//                 }
//                 return root;
//         }
// //DISPLAY A SIZE
//         public static void display(Node node){
//                 if(node == null){
//                         return;
//                 }
//                 String str = "";
//                 str += node.left == null? "." : node.left.data + "";
//                 str += "<-" + node.data + "->";
//                 str += node.right == null? "." : node.right.data + "";
//                 System.out.println(str);
//                 display(node.left);
//                 display(node.right);
//         }
//         public static void traversal(Node node){
//                 if(node == null){
//                         return;
//                 }
//                 System.out.println(node.data + " in preorder "); // euler left -> pre
//                 traversal(node.left);
//                 System.out.println(node.data + " in inorder "); // euler between -> in
//                 traversal(node.right);
//                 System.out.println(node.data + " in postorder "); // euler right -> postṇr̥
//         } 
//         public static void main(String[]args)throws Exception{
//                 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//                 int n = Integer.parseInt(br.readLine());
//                 Integer[]arr = new Integer [n];
//                 String[]values = br.readLine().split(" ");
//                 for(int i = 0;i < n;i++){
//                         if(values[i].equals("n") == false){
//                                 arr[i] = Integer.parseInt(values[i]);
//                         }else{
//                                 arr[i] = null;
//                         }
//                 }
//                 Node root = construct(arr);
//                 traversal(root);
//         }
// }

   //QUESTIONS

//LEVEL ORDER TRAVERSAL
// import java.io.*;
// import java.util.*;
// public class Main{
//         public static class Node{
//                 int data;
//                 Node left;
//                 Node right;
//                 Node(int data,Node left,Node right){
//                         this.data = data;
//                         this.left = left;
//                         this.right = right;
//                 }
//         }
//         public static class Pair{
//                 Node node;
//                 int state;
//                 Pair(Node node,int state){
//                         this.node = node;
//                         this.state = state;
//                 }
//         }
//         public static Node construct(Integer[]arr){
//                 Node root = new Node(arr[0],null,null);
//                 Pair rtp = new Pair(root,1);
//                 Stack <Pair> st = new Stack<>();
//                 st.push(rtp);
//                 int idx = 0;
//                 while(st.size() > 0){
//                         Pair top = st.peek();
//                         if(top.state == 1){
//                                 idx++;
//                                 if(arr[idx] != null){
//                                         top.node.left = new Node(arr[idx],null,null);
//                                         Pair lp = new Pair(top.node.left,1);
//                                         st.push(lp);
//                                 }else{
//                                         top.node.left = null;
//                                 }
//                                 top.state++;
//                         }else if(top.state == 2){
//                                 idx++;
//                                 if(arr[idx] != null){
//                                         top.node.right = new Node(arr[idx],null,null);
//                                         Pair rp = new Pair(top.node.right,1);
//                                         st.push(rp);
//                                 }else{
//                                         top.node.right = null;
//                                 }
//                                 top.state++;
//                         }else{
//                                 st.pop();
//                         }
//                 }
//                 return root;
//         }
// //DISPLAY A SIZE
//         public static void display(Node node){
//                 if(node == null){
//                         return;
//                 }
//                 String str = "";
//                 str += node.left == null? "." : node.left.data + "";
//                 str += "<-" + node.data + "->";
//                 str += node.right == null? "." : node.right.data + "";
//                 System.out.println(str);
//                 display(node.left);
//                 display(node.right);
//         }
//         public static void levelOrder(Node node){
//                 Queue<Node> mq = new ArrayDeque<>();
//                 mq.add(node);
//                 while(mq.size() > 0){
//                         int count = mq.size();
//                         for(int i = 0;i < count;i++){
//                                 node = mq.remove();
//                                 System.out.print(node.data + " ");
//                         }
//                         if(node != null){
//                                 mq.add(node.left);
//                         }
//                         if(node != null){
//                                 mq.add(node.right);
//                         }
//                 }
//                 System.out.println();
//         }
//         public static void main(String[]args)throws Exception{
//                 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//                 int n = Integer.parseInt(br.readLine());
//                 Integer[]arr = new Integer [n];
//                 String[]values = br.readLine().split(" ");
//                 for(int i = 0;i < n;i++){
//                         if(values[i].equals("n") == false){
//                                 arr[i] = Integer.parseInt(values[i]);
//                         }else{
//                                 arr[i] = null;
//                         }
//                 }
//                 Node root = construct(arr);
//                 levelOrder(root);
//         }
// }

//ITERATIVE PRE IN POST ORDER
// import java.io.*;
// import java.util.*;
// public class Main{
//         public static class Node{
//                 int data;
//                 Node left;
//                 Node right;
//                 Node(int data,Node left,Node right){
//                         this.data = data;
//                         this.left = left;
//                         this.right = right;
//                 }
//         }
//         public static class Pair{
//                 Node node;
//                 int state;
//                 Pair(Node node,int state){
//                         this.node = node;
//                         this.state = state;
//                 }
//         }
//         public static Node construct(Integer[]arr){
//                 Node root = new Node(arr[0],null,null);
//                 Pair rtp = new Pair(root,1);
//                 Stack <Pair> st = new Stack<>();
//                 st.push(rtp);
//                 int idx = 0;
//                 while(st.size() > 0){
//                         Pair top = st.peek();
//                         if(top.state == 1){
//                                 idx++;
//                                 if(arr[idx] != null){
//                                         top.node.left = new Node(arr[idx],null,null);
//                                         Pair lp = new Pair(top.node.left,1);
//                                         st.push(lp);
//                                 }else{
//                                         top.node.left = null;
//                                 }
//                                 top.state++;
//                         }else if(top.state == 2){
//                                 idx++;
//                                 if(arr[idx] != null){
//                                         top.node.right = new Node(arr[idx],null,null);
//                                         Pair rp = new Pair(top.node.right,1);
//                                         st.push(rp);
//                                 }else{
//                                         top.node.right = null;
//                                 }
//                                 top.state++;
//                         }else{
//                                 st.pop();
//                         }
//                 }
//                 return root;
//         }
// //DISPLAY A SIZE
//         public static void display(Node node){
//                 if(node == null){
//                         return;
//                 }
//                 String str = "";
//                 str += node.left == null? "." : node.left.data + "";
//                 str += "<-" + node.data + "->";
//                 str += node.right == null? "." : node.right.data + "";
//                 System.out.println(str);
//                 display(node.left);
//                 display(node.right);
//         }
//         public static void iterativePrePostInTraversal(Node node){
//                 Stack<Pair> st = new Stack<>();
//                 Pair rtp = new Pair(node,1);
//                 st.push(rtp);
//                 String pre = "";
//                 String in = "";
//                 String post = ""; 
//                 while(st.size() > 0){
//                         Pair top = st.peek();
//                         if(top.state == 1){
//                                 pre += top.node.data + " ";
//                                 top.state++;
//                                 if(top.node.left != null){
//                                         Pair lp = new Pair(top.node.left,1);
//                                         st.push(lp);
//                                 }
//                         }else if(top.state == 2){
//                                 in += top.node.data + " ";
//                                 top.state++;
//                                 if(top.node.right != null){
//                                         Pair rp = new Pair(top.node.right,1);
//                                         st.push(rp);
//                                 }
//                         }else{
//                                 post += top.node.data + " ";
//                                 st.pop();
//                         }
//                 }
//                 System.out.println(pre);
//                 System.out.println(in);
//                 System.out.println(post);
//         }
//         public static void main(String[]args)throws Exception{
//                 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//                 int n = Integer.parseInt(br.readLine());
//                 Integer[]arr = new Integer [n];
//                 String[]values = br.readLine().split(" ");
//                 for(int i = 0;i < n;i++){
//                         if(values[i].equals("n") == false){
//                                 arr[i] = Integer.parseInt(values[i]);
//                         }else{
//                                 arr[i] = null;
//                         }
//                 }
//                 Node root = construct(arr);
//                 iterativePrePostInTraversal(root);
//         }
// }

//NODE TO ROOT PATH
// import java.io.*;
// import java.util.*;
// public class Main{
//         public static class Node{
//                 int data;
//                 Node left;
//                 Node right;
//                 Node(int data,Node left,Node right){
//                         this.data = data;
//                         this.left = left;
//                         this.right = right;
//                 }
//         }
//         public static class Pair{
//                 Node node;
//                 int state;
//                 Pair(Node node,int state){
//                         this.node = node;
//                         this.state = state;
//                 }
//         }
//         public static Node construct(Integer[]arr){
//                 Node root = new Node(arr[0],null,null);
//                 Pair rtp = new Pair(root,1);
//                 Stack <Pair> st = new Stack<>();
//                 st.push(rtp);
//                 int idx = 0;
//                 while(st.size() > 0){
//                         Pair top = st.peek();
//                         if(top.state == 1){
//                                 idx++;
//                                 if(arr[idx] != null){
//                                         top.node.left = new Node(arr[idx],null,null);
//                                         Pair lp = new Pair(top.node.left,1);
//                                         st.push(lp);
//                                 }else{
//                                         top.node.left = null;
//                                 }
//                                 top.state++;
//                         }else if(top.state == 2){
//                                 idx++;
//                                 if(arr[idx] != null){
//                                         top.node.right = new Node(arr[idx],null,null);
//                                         Pair rp = new Pair(top.node.right,1);
//                                         st.push(rp);
//                                 }else{
//                                         top.node.right = null;
//                                 }
//                                 top.state++;
//                         }else{
//                                 st.pop();
//                         }
//                 }
//                 return root;
//         }
// //DISPLAY A SIZE
//         public static void display(Node node){
//                 if(node == null){
//                         return;
//                 }
//                 String str = "";
//                 str += node.left == null? "." : node.left.data + "";
//                 str += "<-" + node.data + "->";
//                 str += node.right == null? "." : node.right.data + "";
//                 System.out.println(str);
//                 display(node.left);
//                 display(node.right);
//         }
//         static ArrayList<Integer> path;
//         public static boolean find(Node node,int data){
//                 if(node == null){
//                         return false;
//                 }
//                 if(node.data == data){
//                         path.add(node.data);
//                         return true;
//                 }
//                 boolean filc = find(node.left,data);
//                 if(filc){
//                         path.add(node.data);
//                         return true;
//                 }
//                 boolean rilc = find(node.right,data);
//                 if(rilc){
//                         path.add(node.data);
//                         return true;
//                 }
//                 return false;
//         }
//         public static void main(String[]args)throws Exception{
//                 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//                 int n = Integer.parseInt(br.readLine());
//                 Integer[]arr = new Integer [n];
//                 String[]values = br.readLine().split(" ");
//                 for(int i = 0;i < n;i++){
//                         if(values[i].equals("n") == false){
//                                 arr[i] = Integer.parseInt(values[i]);
//                         }else{
//                                 arr[i] = null;
//                         }
//                 }
//                 int data = Integer.parseInt(br.readLine());
//                 Node root = construct(arr);
//                 path = new ArrayList<>();
//                 boolean found = find(root,data);
//                 System.out.println(found);
//                 System.out.println(path);
//         }
// }

//PRINT K LEVELS DOWN
// import java.io.*;
// import java.util.*;
// public class Main{
//         public static class Node{
//                 int data;
//                 Node left;
//                 Node right;
//                 Node(int data,Node left,Node right){
//                         this.data = data;
//                         this.left = left;
//                         this.right = right;
//                 }
//         }
//         public static class Pair{
//                 Node node;
//                 int state;
//                 Pair(Node node,int state){
//                         this.node = node;
//                         this.state = state;
//                 }
//         }
//         public static Node construct(Integer[]arr){
//                 Node root = new Node(arr[0],null,null);
//                 Pair rtp = new Pair(root,1);
//                 Stack <Pair> st = new Stack<>();
//                 st.push(rtp);
//                 int idx = 0;
//                 while(st.size() > 0){
//                         Pair top = st.peek();
//                         if(top.state == 1){
//                                 idx++;
//                                 if(arr[idx] != null){
//                                         top.node.left = new Node(arr[idx],null,null);
//                                         Pair lp = new Pair(top.node.left,1);
//                                         st.push(lp);
//                                 }else{
//                                         top.node.left = null;
//                                 }
//                                 top.state++;
//                         }else if(top.state == 2){
//                                 idx++;
//                                 if(arr[idx] != null){
//                                         top.node.right = new Node(arr[idx],null,null);
//                                         Pair rp = new Pair(top.node.right,1);
//                                         st.push(rp);
//                                 }else{
//                                         top.node.right = null;
//                                 }
//                                 top.state++;
//                         }else{
//                                 st.pop();
//                         }
//                 }
//                 return root;
//         }
// //DISPLAY A SIZE
//         public static void display(Node node){
//                 if(node == null){
//                         return;
//                 }
//                 String str = "";
//                 str += node.left == null? "." : node.left.data + "";
//                 str += "<-" + node.data + "->";
//                 str += node.right == null? "." : node.right.data + "";
//                 System.out.println(str);
//                 display(node.left);
//                 display(node.right);
//         }
//         public static void printKLevelsDown(Node node,int k){
//                 if(node == null || k < 0){
//                         return;
//                 }
//                 if(k == 0){
//                         System.out.println(node.data);
//                 }
//                 printKLevelsDown(node.left, k - 1);
//                 printKLevelsDown(node.right, k - 1);
//         }
//         public static void main(String[]args)throws Exception{
//                 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//                 int n = Integer.parseInt(br.readLine());
//                 Integer[]arr = new Integer [n];
//                 String[]values = br.readLine().split(" ");
//                 for(int i = 0;i < n;i++){
//                         if(values[i].equals("n") == false){
//                                 arr[i] = Integer.parseInt(values[i]);
//                         }else{
//                                 arr[i] = null;
//                         }
//                 }
//                 int k = Integer.parseInt(br.readLine());
//                 Node root = construct(arr);
//                 printKLevelsDown(root,k);
//         }
// }

//PRINT NODES K LEVEL FAR
// import java.io.*;
// import java.util.*;
// public class Main{
//         public static class Node{
//                 int data;
//                 Node left;
//                 Node right;
//                 Node(int data,Node left,Node right){
//                         this.data = data;
//                         this.left = left;
//                         this.right = right;
//                 }
//         }
//         public static class Pair{
//                 Node node;
//                 int state;
//                 Pair(Node node,int state){
//                         this.node = node;
//                         this.state = state;
//                 }
//         }
//         public static Node construct(Integer[]arr){
//                 Node root = new Node(arr[0],null,null);
//                 Pair rtp = new Pair(root,1);
//                 Stack <Pair> st = new Stack<>();
//                 st.push(rtp);
//                 int idx = 0;
//                 while(st.size() > 0){
//                         Pair top = st.peek();
//                         if(top.state == 1){
//                                 idx++;
//                                 if(arr[idx] != null){
//                                         top.node.left = new Node(arr[idx],null,null);
//                                         Pair lp = new Pair(top.node.left,1);
//                                         st.push(lp);
//                                 }else{
//                                         top.node.left = null;
//                                 }
//                                 top.state++;
//                         }else if(top.state == 2){
//                                 idx++;
//                                 if(arr[idx] != null){
//                                         top.node.right = new Node(arr[idx],null,null);
//                                         Pair rp = new Pair(top.node.right,1);
//                                         st.push(rp);
//                                 }else{
//                                         top.node.right = null;
//                                 }
//                                 top.state++;
//                         }else{
//                                 st.pop();
//                         }
//                 }
//                 return root;
//         }
// //DISPLAY A SIZE
//         public static void display(Node node){
//                 if(node == null){
//                         return;
//                 }
//                 String str = "";
//                 str += node.left == null? "." : node.left.data + "";
//                 str += "<-" + node.data + "->";
//                 str += node.right == null? "." : node.right.data + "";
//                 System.out.println(str);
//                 display(node.left);
//                 display(node.right);
//         }
//         public static void printKNodesFar(Node node,int data,int k){
//                 path = new ArrayList<>();
//                 find(node,data);
//                 for(int i = 0;i < path.size();i++){
//                         printKLevelsDown(path.get(i), k - i, i == 0? null : path.get(i - 1));
//                 }
//         }
//         static ArrayList<Node> path;
//         public static boolean find(Node node,int data){
//                 if(node == null){
//                         return false;
//                 }
//                 if(node.data == data){
//                         path.add(node);
//                         return true;
//                 }
//                 boolean filc = find(node.left,data);
//                 if(filc){
//                         path.add(node);
//                         return true;
//                 }
//                 boolean rilc = find(node.right,data);
//                 if(rilc){
//                         path.add(node);
//                         return true;
//                 }
//                 return false;
//         }
//         public static void printKLevelsDown(Node node,int k,Node blocker){
//                 if(node == null || k < 0 || node == blocker){
//                         return;
//                 }
//                 if(k == 0){
//                         System.out.println(node.data);
//                 }
//                 printKLevelsDown(node.left, k - 1,blocker);
//                 printKLevelsDown(node.right, k - 1,blocker);
//         }
//         public static void main(String[]args)throws Exception{
//                 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//                 int n = Integer.parseInt(br.readLine());
//                 Integer[]arr = new Integer [n];
//                 String[]values = br.readLine().split(" ");
//                 for(int i = 0;i < n;i++){
//                         if(values[i].equals("n") == false){
//                                 arr[i] = Integer.parseInt(values[i]);
//                         }else{
//                                 arr[i] = null;
//                         }
//                 }
//                 int data = Integer.parseInt(br.readLine());
//                 int k = Integer.parseInt(br.readLine());
//                 Node root = construct(arr);
//                 printKNodesFar(root,data,k);
//         }
// }

//PATH TO LEAF FROM ROOT
// import java.io.*;
// import java.util.*;
// public class Main{
//         public static class Node{
//                 int data;
//                 Node left;
//                 Node right;
//                 Node(int data,Node left,Node right){
//                         this.data = data;
//                         this.left = left;
//                         this.right = right;
//                 }
//         }
//         public static class Pair{
//                 Node node;
//                 int state;
//                 Pair(Node node,int state){
//                         this.node = node;
//                         this.state = state;
//                 }
//         }
//         public static Node construct(Integer[]arr){
//                 Node root = new Node(arr[0],null,null);
//                 Pair rtp = new Pair(root,1);
//                 Stack <Pair> st = new Stack<>();
//                 st.push(rtp);
//                 int idx = 0;
//                 while(st.size() > 0){
//                         Pair top = st.peek();
//                         if(top.state == 1){
//                                 idx++;
//                                 if(arr[idx] != null){
//                                         top.node.left = new Node(arr[idx],null,null);
//                                         Pair lp = new Pair(top.node.left,1);
//                                         st.push(lp);
//                                 }else{
//                                         top.node.left = null;
//                                 }
//                                 top.state++;
//                         }else if(top.state == 2){
//                                 idx++;
//                                 if(arr[idx] != null){
//                                         top.node.right = new Node(arr[idx],null,null);
//                                         Pair rp = new Pair(top.node.right,1);
//                                         st.push(rp);
//                                 }else{
//                                         top.node.right = null;
//                                 }
//                                 top.state++;
//                         }else{
//                                 st.pop();
//                         }
//                 }
//                 return root;
//         }
// //DISPLAY A SIZE
//         public static void display(Node node){
//                 if(node == null){
//                         return;
//                 }
//                 String str = "";
//                 str += node.left == null? "." : node.left.data + "";
//                 str += "<-" + node.data + "->";
//                 str += node.right == null? "." : node.right.data + "";
//                 System.out.println(str);
//                 display(node.left);
//                 display(node.right);
//         }
//         public static void pathToLeafFromRoot(Node node,String path,int sum,int lo,int hi){
//                 if(node == null){
//                         return;
//                 }
//                 if(node.left == null && node.right == null){
//                         sum += node.data;
//                         if(sum >= lo && sum <= hi){
//                                 System.out.println(path + node.data);
//                         }
//                         return;
//                 }
//                 pathToLeafFromRoot(node.left, path + node.data + " ", sum + node.data, lo, hi);
//                 pathToLeafFromRoot(node.right, path + node.data + " ", sum + node.data, lo, hi);
//         }
//         public static void main(String[]args)throws Exception{
//                 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//                 int n = Integer.parseInt(br.readLine());
//                 Integer[]arr = new Integer [n];
//                 String[]values = br.readLine().split(" ");
//                 for(int i = 0;i < n;i++){
//                         if(values[i].equals("n") == false){
//                                 arr[i] = Integer.parseInt(values[i]);
//                         }else{
//                                 arr[i] = null;
//                         }
//                 }
//                 int lo = Integer.parseInt(br.readLine());
//                 int hi = Integer.parseInt(br.readLine());
//                 Node root = construct(arr);
//                 pathToLeafFromRoot(root,"",0,lo,hi);
//         }
//}

///TRANSFORM TO LEFT CLONED TREE
// import java.io.*;
// import java.util.*;
// public class Main{
//         public static class Node{
//                 int data;
//                 Node left;
//                 Node right;
//                 Node(int data,Node left,Node right){
//                         this.data = data;
//                         this.left = left;
//                         this.right = right;
//                 }
//         }
//         public static class Pair{
//                 Node node;
//                 int state;
//                 Pair(Node node,int state){
//                         this.node = node;
//                         this.state = state;
//                 }
//         }
//         public static Node construct(Integer[]arr){
//                 Node root = new Node(arr[0],null,null);
//                 Pair rtp = new Pair(root,1);
//                 Stack <Pair> st = new Stack<>();
//                 st.push(rtp);
//                 int idx = 0;
//                 while(st.size() > 0){
//                         Pair top = st.peek();
//                         if(top.state == 1){
//                                 idx++;
//                                 if(arr[idx] != null){
//                                         top.node.left = new Node(arr[idx],null,null);
//                                         Pair lp = new Pair(top.node.left,1);
//                                         st.push(lp);
//                                 }else{
//                                         top.node.left = null;
//                                 }
//                                 top.state++;
//                         }else if(top.state == 2){
//                                 idx++;
//                                 if(arr[idx] != null){
//                                         top.node.right = new Node(arr[idx],null,null);
//                                         Pair rp = new Pair(top.node.right,1);
//                                         st.push(rp);
//                                 }else{
//                                         top.node.right = null;
//                                 }
//                                 top.state++;
//                         }else{
//                                 st.pop();
//                         }
//                 }
//                 return root;
//         }
// //DISPLAY A SIZE
//         public static void display(Node node){
//                 if(node == null){
//                         return;
//                 }
//                 String str = "";
//                 str += node.left == null? "." : node.left.data + "";
//                 str += "<-" + node.data + "->";
//                 str += node.right == null? "." : node.right.data + "";
//                 System.out.println(str);
//                 display(node.left);
//                 display(node.right);
//         }
//         public static Node createLeftCloneTree(Node node){
//                 if(node == null){
//                         return null;
//                 }
//                 Node lcr = createLeftCloneTree(node.left);
//                 Node rcr = createLeftCloneTree(node.right);
//                 Node nn = new Node(node.data,lcr,null);
//                 node.left = nn;
//                 node.right = rcr;
//                 return node;
//         }
//         public static void main(String[]args)throws Exception{
//                 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//                 int n = Integer.parseInt(br.readLine());
//                 Integer[]arr = new Integer [n];
//                 String[]values = br.readLine().split(" ");
//                 for(int i = 0;i < n;i++){
//                         if(values[i].equals("n") == false){
//                                 arr[i] = Integer.parseInt(values[i]);
//                         }else{
//                                 arr[i] = null;
//                         }
//                 }
//                 Node root = construct(arr);
//                 root = createLeftCloneTree(root);
//                 display(root);
//         }
// }

//PRINT SINGLE CHILD NODES
// import java.io.*;
// import java.util.*;
// public class Main{
//         public static class Node{
//                 int data;
//                 Node left;
//                 Node right;
//                 Node(int data,Node left,Node right){
//                         this.data = data;
//                         this.left = left;
//                         this.right = right;
//                 }
//         }
//         public static class Pair{
//                 Node node;
//                 int state;
//                 Pair(Node node,int state){
//                         this.node = node;
//                         this.state = state;
//                 }
//         }
//         public static Node construct(Integer[]arr){
//                 Node root = new Node(arr[0],null,null);
//                 Pair rtp = new Pair(root,1);
//                 Stack <Pair> st = new Stack<>();
//                 st.push(rtp);
//                 int idx = 0;
//                 while(st.size() > 0){
//                         Pair top = st.peek();
//                         if(top.state == 1){
//                                 idx++;
//                                 if(arr[idx] != null){
//                                         top.node.left = new Node(arr[idx],null,null);
//                                         Pair lp = new Pair(top.node.left,1);
//                                         st.push(lp);
//                                 }else{
//                                         top.node.left = null;
//                                 }
//                                 top.state++;
//                         }else if(top.state == 2){
//                                 idx++;
//                                 if(arr[idx] != null){
//                                         top.node.right = new Node(arr[idx],null,null);
//                                         Pair rp = new Pair(top.node.right,1);
//                                         st.push(rp);
//                                 }else{
//                                         top.node.right = null;
//                                 }
//                                 top.state++;
//                         }else{
//                                 st.pop();
//                         }
//                 }
//                 return root;
//         }
// //DISPLAY A SIZE
//         public static void display(Node node){
//                 if(node == null){
//                         return;
//                 }
//                 String str = "";
//                 str += node.left == null? "." : node.left.data + "";
//                 str += "<-" + node.data + "->";
//                 str += node.right == null? "." : node.right.data + "";
//                 System.out.println(str);
//                 display(node.left);
//                 display(node.right);
//         }
//         public static void printSingleChildNodes(Node node,Node parent){
//                 if(node == null){
//                         return;
//                 }
//                 if(parent != null && parent.left == node && parent.right == null){
//                         System.out.println(node.data);
//                 }else if(parent != null && parent.right == node && parent.left == null){
//                         System.out.println(node.data);
//                 }
//                 printSingleChildNodes(node.left,node);
//                 printSingleChildNodes(node.right,node);
//         }
//         public static void main(String[]args)throws Exception{
//                 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//                 int n = Integer.parseInt(br.readLine());
//                 Integer[]arr = new Integer [n];
//                 String[]values = br.readLine().split(" ");
//                 for(int i = 0;i < n;i++){
//                         if(values[i].equals("n") == false){
//                                 arr[i] = Integer.parseInt(values[i]);
//                         }else{
//                                 arr[i] = null;
//                         }
//                 }
//                 Node root = construct(arr);
//                 printSingleChildNodes(root,null);
//         }
// }

//REMOVE LEAVES IN A BINARY TREE
// import java.io.*;
// import java.util.*;
// public class Main{
//         public static class Node{
//                 int data;
//                 Node left;
//                 Node right;
//                 Node(int data,Node left,Node right){
//                         this.data = data;
//                         this.left = left;
//                         this.right = right;
//                 }
//         }
//         public static class Pair{
//                 Node node;
//                 int state;
//                 Pair(Node node,int state){
//                         this.node = node;
//                         this.state = state;
//                 }
//         }
//         public static Node construct(Integer[]arr){
//                 Node root = new Node(arr[0],null,null);
//                 Pair rtp = new Pair(root,1);
//                 Stack <Pair> st = new Stack<>();
//                 st.push(rtp);
//                 int idx = 0;
//                 while(st.size() > 0){
//                         Pair top = st.peek();
//                         if(top.state == 1){
//                                 idx++;
//                                 if(arr[idx] != null){
//                                         top.node.left = new Node(arr[idx],null,null);
//                                         Pair lp = new Pair(top.node.left,1);
//                                         st.push(lp);
//                                 }else{
//                                         top.node.left = null;
//                                 }
//                                 top.state++;
//                         }else if(top.state == 2){
//                                 idx++;
//                                 if(arr[idx] != null){
//                                         top.node.right = new Node(arr[idx],null,null);
//                                         Pair rp = new Pair(top.node.right,1);
//                                         st.push(rp);
//                                 }else{
//                                         top.node.right = null;
//                                 }
//                                 top.state++;
//                         }else{
//                                 st.pop();
//                         }
//                 }
//                 return root;
//         }
// //DISPLAY A SIZE
//         public static void display(Node node){
//                 if(node == null){
//                         return;
//                 }
//                 String str = "";
//                 str += node.left == null? "." : node.left.data + "";
//                 str += "<-" + node.data + "->";
//                 str += node.right == null? "." : node.right.data + "";
//                 System.out.println(str);
//                 display(node.left);
//                 display(node.right);
//         }
//         public static Node removeLeaves(Node node){
//                 if(node == null){
//                         return null;
//                 }
//                 if(node.left == null && node.right == null){
//                         return null;
//                 }
//                 node.left = removeLeaves(node.left);
//                 node.right = removeLeaves(node.right);
//                 return node;
//         }
//         public static void main(String[]args)throws Exception{
//                 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//                 int n = Integer.parseInt(br.readLine());
//                 Integer[]arr = new Integer [n];
//                 String[]values = br.readLine().split(" ");
//                 for(int i = 0;i < n;i++){
//                         if(values[i].equals("n") == false){
//                                 arr[i] = Integer.parseInt(values[i]);
//                         }else{
//                                 arr[i] = null;
//                         }
//                 }
//                 Node root = construct(arr);
//                 root = removeLeaves(root);
//                 display(root);
//         }
// }

//DIAMETER OF A BINARY TREE
// import java.io.*;
// import java.util.*;
// public class Main{
//         public static class Node{
//                 int data;
//                 Node left;
//                 Node right;
//                 Node(int data,Node left,Node right){
//                         this.data = data;
//                         this.left = left;
//                         this.right = right;
//                 }
//         }
//         public static class Pair{
//                 Node node;
//                 int state;
//                 Pair(Node node,int state){
//                         this.node = node;
//                         this.state = state;
//                 }
//         }
//         public static Node construct(Integer[]arr){
//                 Node root = new Node(arr[0],null,null);
//                 Pair rtp = new Pair(root,1);
//                 Stack <Pair> st = new Stack<>();
//                 st.push(rtp);
//                 int idx = 0;
//                 while(st.size() > 0){
//                         Pair top = st.peek();
//                         if(top.state == 1){
//                                 idx++;
//                                 if(arr[idx] != null){
//                                         top.node.left = new Node(arr[idx],null,null);
//                                         Pair lp = new Pair(top.node.left,1);
//                                         st.push(lp);
//                                 }else{
//                                         top.node.left = null;
//                                 }
//                                 top.state++;
//                         }else if(top.state == 2){
//                                 idx++;
//                                 if(arr[idx] != null){
//                                         top.node.right = new Node(arr[idx],null,null);
//                                         Pair rp = new Pair(top.node.right,1);
//                                         st.push(rp);
//                                 }else{
//                                         top.node.right = null;
//                                 }
//                                 top.state++;
//                         }else{
//                                 st.pop();
//                         }
//                 }
//                 return root;
//         }
// //DISPLAY A SIZE
//         public static void display(Node node){
//                 if(node == null){
//                         return;
//                 }
//                 String str = "";
//                 str += node.left == null? "." : node.left.data + "";
//                 str += "<-" + node.data + "->";
//                 str += node.right == null? "." : node.right.data + "";
//                 System.out.println(str);
//                 display(node.left);
//                 display(node.right);
//         }
//         public static int height(Node node){
//                 if(node == null){
//                         return -1;
//                 }
//                 int lh = height(node.left);
//                 int rh = height(node.right);
//                 int th = Math.max(lh,rh) + 1;
//                 return th; 
//         }
//         public static int diameter1(Node node){
//                 if(node == null){
//                         return 0;
//                 }
//                 int ld = diameter1(node.left);
//                 int rd = diameter1(node.right);
//                 int f = height(node.left) + height(node.right) + 2;
//                 int dia = Math.max(f,Math.max(ld,rd));
//                 return dia;
//         }
//         static class DiaPair{
//                 int ht;
//                 int dia;
//         }
//         public static DiaPair diameter2(Node node){
//                 if(node == null){
//                         DiaPair bp = new DiaPair();
//                         bp.ht = -1;
//                         bp.dia = 0;
//                         return bp;
//                 }
//                 DiaPair lp = diameter2(node.left);
//                 DiaPair rp = diameter2(node.right);
//                 DiaPair mp = new DiaPair();
//                 mp.ht = Math.max(lp.ht , rp.ht) + 1;
//                 int fes = lp.ht + rp.ht + 2;
//                 mp.dia = Math.max(fes,Math.max(lp.dia,rp.dia));
//                 return mp; 
//         }
//         public static void main(String[]args)throws Exception{
//                 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//                 int n = Integer.parseInt(br.readLine());
//                 Integer[]arr = new Integer [n];
//                 String[]values = br.readLine().split(" ");
//                 for(int i = 0;i < n;i++){
//                         if(values[i].equals("n") == false){
//                                 arr[i] = Integer.parseInt(values[i]);
//                         }else{
//                                 arr[i] = null;
//                         }
//                 }
//                 Node root = construct(arr);
//                 // int diameter = 0;
//                 // diameter = diameter1(root);
//                 // System.out.println(diameter);
//                 DiaPair p = diameter2(root);
//                 System.out.println(p.dia);
//         }
// }

//TILT OF A BINARY TREE
// import java.io.*;
// import java.util.*;
// public class Main{
//         public static class Node{
//                 int data;
//                 Node left;
//                 Node right;
//                 Node(int data,Node left,Node right){
//                         this.data = data;
//                         this.left = left;
//                         this.right = right;
//                 }
//         }
//         public static class Pair{
//                 Node node;
//                 int state;
//                 Pair(Node node,int state){
//                         this.node = node;
//                         this.state = state;
//                 }
//         }
//         public static Node construct(Integer[]arr){
//                 Node root = new Node(arr[0],null,null);
//                 Pair rtp = new Pair(root,1);
//                 Stack <Pair> st = new Stack<>();
//                 st.push(rtp);
//                 int idx = 0;
//                 while(st.size() > 0){
//                         Pair top = st.peek();
//                         if(top.state == 1){
//                                 idx++;
//                                 if(arr[idx] != null){
//                                         top.node.left = new Node(arr[idx],null,null);
//                                         Pair lp = new Pair(top.node.left,1);
//                                         st.push(lp);
//                                 }else{
//                                         top.node.left = null;
//                                 }
//                                 top.state++;
//                         }else if(top.state == 2){
//                                 idx++;
//                                 if(arr[idx] != null){
//                                         top.node.right = new Node(arr[idx],null,null);
//                                         Pair rp = new Pair(top.node.right,1);
//                                         st.push(rp);
//                                 }else{
//                                         top.node.right = null;
//                                 }
//                                 top.state++;
//                         }else{
//                                 st.pop();
//                         }
//                 }
//                 return root;
//         }
// //DISPLAY A SIZE
//         public static void display(Node node){
//                 if(node == null){
//                         return;
//                 }
//                 String str = "";
//                 str += node.left == null? "." : node.left.data + "";
//                 str += "<-" + node.data + "->";
//                 str += node.right == null? "." : node.right.data + "";
//                 System.out.println(str);
//                 display(node.left);
//                 display(node.right);
//         }
//         public static int height(Node node){
//                 if(node == null){
//                         return -1;
//                 }
//                 int lh = height(node.left);
//                 int rh = height(node.right);
//                 int th = Math.max(lh,rh) + 1;
//                 return th; 
//         }
//         static int tilt = 0;
//         public static int tilt(Node node){
//                 if(node == null){
//                         return 0;
//                 }
//                 int ls = tilt(node.left);
//                 int rs = tilt(node.right);
//                 int ltilt = Math.abs(ls - rs);
//                 tilt += ltilt;
//                 int ts = ls + rs + node.data;
//                 return ts;
//         }
//         public static void main(String[]args)throws Exception{
//                 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//                 int n = Integer.parseInt(br.readLine());
//                 Integer[]arr = new Integer [n];
//                 String[]values = br.readLine().split(" ");
//                 for(int i = 0;i < n;i++){
//                         if(values[i].equals("n") == false){
//                                 arr[i] = Integer.parseInt(values[i]);
//                         }else{
//                                 arr[i] = null;
//                         }
//                 }
//                 Node root = construct(arr);
//                 tilt(root);
//                 System.out.println(tilt);
//         }
// }

//IS A TREE BINARY SEARCH TREE
// import java.io.*;
// import java.util.*;
// public class Main{
//         public static class Node{
//                 int data;
//                 Node left;
//                 Node right;
//                 Node(int data,Node left,Node right){
//                         this.data = data;
//                         this.left = left;
//                         this.right = right;
//                 }
//         }
//         public static class Pair{
//                 Node node;
//                 int state;
//                 Pair(Node node,int state){
//                         this.node = node;
//                         this.state = state;
//                 }
//         }
//         public static Node construct(Integer[]arr){
//                 Node root = new Node(arr[0],null,null);
//                 Pair rtp = new Pair(root,1);
//                 Stack <Pair> st = new Stack<>();
//                 st.push(rtp);
//                 int idx = 0;
//                 while(st.size() > 0){
//                         Pair top = st.peek();
//                         if(top.state == 1){
//                                 idx++;
//                                 if(arr[idx] != null){
//                                         top.node.left = new Node(arr[idx],null,null);
//                                         Pair lp = new Pair(top.node.left,1);
//                                         st.push(lp);
//                                 }else{
//                                         top.node.left = null;
//                                 }
//                                 top.state++;
//                         }else if(top.state == 2){
//                                 idx++;
//                                 if(arr[idx] != null){
//                                         top.node.right = new Node(arr[idx],null,null);
//                                         Pair rp = new Pair(top.node.right,1);
//                                         st.push(rp);
//                                 }else{
//                                         top.node.right = null;
//                                 }
//                                 top.state++;
//                         }else{
//                                 st.pop();
//                         }
//                 }
//                 return root;
//         }
// //DISPLAY A SIZE
//         public static void display(Node node){
//                 if(node == null){
//                         return;
//                 }
//                 String str = "";
//                 str += node.left == null? "." : node.left.data + "";
//                 str += "<-" + node.data + "->";
//                 str += node.right == null? "." : node.right.data + "";
//                 System.out.println(str);
//                 display(node.left);
//                 display(node.right);
//         }
//         public static class BSTPair{
//                 boolean isBST;
//                 int min;
//                 int max;
//         }
//         public static BSTPair isBST(Node node){
//                 if(node == null){
//                         BSTPair bp = new BSTPair();
//                         bp.min = Integer.MAX_VALUE;
//                         bp.max = Integer.MIN_VALUE;
//                         bp.isBST = true;
//                         return bp;
//                 }
//                 BSTPair lp = isBST(node.left);
//                 BSTPair rp = isBST(node.right);
//                 BSTPair mp = new BSTPair();
//                 mp.isBST = lp.isBST & rp.isBST && (node.data >= lp.max && node.data <= rp.min);
//                 mp.min = Math.min(node.data,Math.min(lp.min,rp.min));
//                 mp.max = Math.max(node.data,Math.max(lp.max,rp.max));
//                 return mp;
//         }
//         public static void main(String[]args)throws Exception{
//                 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//                 int n = Integer.parseInt(br.readLine());
//                 Integer[]arr = new Integer [n];
//                 String[]values = br.readLine().split(" ");
//                 for(int i = 0;i < n;i++){
//                         if(values[i].equals("n") == false){
//                                 arr[i] = Integer.parseInt(values[i]);
//                         }else{
//                                 arr[i] = null;
//                         }
//                 }
//                 Node root = construct(arr);
//                 BSTPair bp = isBST(root);
//                 System.out.println(bp.isBST);
//         }
// }

//BALANCED BINARY TREE
// import java.io.*;
// import java.util.*;
// public class Main{
//         public static class Node{
//                 int data;
//                 Node left;
//                 Node right;
//                 Node(int data,Node left,Node right){
//                         this.data = data;
//                         this.left = left;
//                         this.right = right;
//                 }
//         }
//         public static class Pair{
//                 Node node;
//                 int state;
//                 Pair(Node node,int state){
//                         this.node = node;
//                         this.state = state;
//                 }
//         }
//         public static Node construct(Integer[]arr){
//                 Node root = new Node(arr[0],null,null);
//                 Pair rtp = new Pair(root,1);
//                 Stack <Pair> st = new Stack<>();
//                 st.push(rtp);
//                 int idx = 0;
//                 while(st.size() > 0){
//                         Pair top = st.peek();
//                         if(top.state == 1){
//                                 idx++;
//                                 if(arr[idx] != null){
//                                         top.node.left = new Node(arr[idx],null,null);
//                                         Pair lp = new Pair(top.node.left,1);
//                                         st.push(lp);
//                                 }else{
//                                         top.node.left = null;
//                                 }
//                                 top.state++;
//                         }else if(top.state == 2){
//                                 idx++;
//                                 if(arr[idx] != null){
//                                         top.node.right = new Node(arr[idx],null,null);
//                                         Pair rp = new Pair(top.node.right,1);
//                                         st.push(rp);
//                                 }else{
//                                         top.node.right = null;
//                                 }
//                                 top.state++;
//                         }else{
//                                 st.pop();
//                         }
//                 }
//                 return root;
//         }
// //DISPLAY A SIZE
//         public static void display(Node node){
//                 if(node == null){
//                         return;
//                 }
//                 String str = "";
//                 str += node.left == null? "." : node.left.data + "";
//                 str += "<-" + node.data + "->";
//                 str += node.right == null? "." : node.right.data + "";
//                 System.out.println(str);
//                 display(node.left);
//                 display(node.right);
//         }
//         static boolean isBal = true;
//         public static int isBalanced(Node node){
//                 if(node == null){
//                         return 0;
//                 }
//                 int lh = isBalanced(node.left);
//                 int rh = isBalanced(node.right);
//                 int gap = Math.abs(lh - rh);
//                 if(gap > 1){
//                         isBal = false;
//                 } 
//                 int th = Math.max(lh,rh) + 1;
//                 return th;
//         }
//         public static class BalPair{
//                 int ht;
//                 boolean isBal;
//         }
//         public static BalPair isBal(Node node){
//                 if(node == null){
//                         BalPair bp = new BalPair();
//                         bp.ht = 0;
//                         bp.isBal = true;
//                         return bp;
//                 }
//                 BalPair lp = isBal(node.left);
//                 BalPair rp = isBal(node.right);
//                 BalPair mp = new BalPair();
//                 mp.isBal = Math.abs(lp.ht - rp.ht) <= 1 && lp.isBal && rp.isBal;
//                 mp.ht = Math.max(lp.ht,rp.ht) + 1;
//                 return mp;
//         }
//         public static void main(String[]args)throws Exception{
//                 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//                 int n = Integer.parseInt(br.readLine());
//                 Integer[]arr = new Integer [n];
//                 String[]values = br.readLine().split(" ");
//                 for(int i = 0;i < n;i++){
//                         if(values[i].equals("n") == false){
//                                 arr[i] = Integer.parseInt(values[i]);
//                         }else{
//                                 arr[i] = null;
//                         }
//                 }
//                 Node root = construct(arr);
//                 isBalanced(root);
//                 System.out.println(isBal);
//         }
// }

//LARGEST BST SUBTREE
// import java.io.*;
// import java.util.*;
// public class Main{
//         public static class Node{
//                 int data;
//                 Node left;
//                 Node right;
//                 Node(int data,Node left,Node right){
//                         this.data = data;
//                         this.left = left;
//                         this.right = right;
//                 }
//         }
//         public static class Pair{
//                 Node node;
//                 int state;
//                 Pair(Node node,int state){
//                         this.node = node;
//                         this.state = state;
//                 }
//         }
//         public static Node construct(Integer[]arr){
//                 Node root = new Node(arr[0],null,null);
//                 Pair rtp = new Pair(root,1);
//                 Stack <Pair> st = new Stack<>();
//                 st.push(rtp);
//                 int idx = 0;
//                 while(st.size() > 0){
//                         Pair top = st.peek();
//                         if(top.state == 1){
//                                 idx++;
//                                 if(arr[idx] != null){
//                                         top.node.left = new Node(arr[idx],null,null);
//                                         Pair lp = new Pair(top.node.left,1);
//                                         st.push(lp);
//                                 }else{
//                                         top.node.left = null;
//                                 }
//                                 top.state++;
//                         }else if(top.state == 2){
//                                 idx++;
//                                 if(arr[idx] != null){
//                                         top.node.right = new Node(arr[idx],null,null);
//                                         Pair rp = new Pair(top.node.right,1);
//                                         st.push(rp);
//                                 }else{
//                                         top.node.right = null;
//                                 }
//                                 top.state++;
//                         }else{
//                                 st.pop();
//                         }
//                 }
//                 return root;
//         }
// //DISPLAY A SIZE
//         public static void display(Node node){
//                 if(node == null){
//                         return;
//                 }
//                 String str = "";
//                 str += node.left == null? "." : node.left.data + "";
//                 str += "<-" + node.data + "->";
//                 str += node.right == null? "." : node.right.data + "";
//                 System.out.println(str);
//                 display(node.left);
//                 display(node.right);
//         }
//         public static class BSTPair{
//                 boolean isBST;
//                 int min;
//                 int max;
//                 Node root;
//                 int size;
//         }
//         public static BSTPair isBST(Node node){
//                 if(node == null){
//                         BSTPair bp = new BSTPair();
//                         bp.min = Integer.MAX_VALUE;
//                         bp.max = Integer.MIN_VALUE;
//                         bp.isBST = true;
//                         bp.root = null;
//                         bp.size = 0;
//                         return bp;
//                 }
//                 BSTPair lp = isBST(node.left);
//                 BSTPair rp = isBST(node.right);
//                 BSTPair mp = new BSTPair();
//                 mp.isBST = lp.isBST & rp.isBST && (node.data >= lp.max && node.data <= rp.min);
//                 mp.min = Math.min(node.data,Math.min(lp.min,rp.min));
//                 mp.max = Math.max(node.data,Math.max(lp.max,rp.max));
//                 if(mp.isBST){
//                         mp.root = node;
//                         mp.size = lp.size + rp.size + 1;
//                 }else if(lp.size > rp.size){
//                         mp.root = lp.root;
//                         mp.size = lp.size;
//                 }else{
//                         mp.root = rp.root;
//                         mp.size = rp.size;
//                 }
//                 return mp;
//         }
//         public static void main(String[]args)throws Exception{
//                 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//                 int n = Integer.parseInt(br.readLine());
//                 Integer[]arr = new Integer [n];
//                 String[]values = br.readLine().split(" ");
//                 for(int i = 0;i < n;i++){
//                         if(values[i].equals("n") == false){
//                                 arr[i] = Integer.parseInt(values[i]);
//                         }else{
//                                 arr[i] = null;
//                         }
//                 }
//                 Node root = construct(arr);
//                 BSTPair bp = isBST(root);
//                 System.out.println(bp.root.data + "@" + bp.size);
//         }
// }


                         //BINARY SEARCH TREE(BST)

//CONSTRUCT A BST
// import java.io.*;
// import java.util.*;
// public class Main{
//         public static class Node{
//                 int data;
//                 Node left;
//                 Node right;
//                 Node(int data,Node left,Node right){
//                         this.data = data;
//                         this.left = left;
//                         this.right = right;
//                 }
//         }
//         public static Node construct(int[]arr,int lo,int hi){
//                 if(lo > hi){
//                         return null;
//                 }
//                 int mid = (lo + hi) / 2;
//                 int data = arr[mid];
//                 Node lc = construct(arr,lo,mid - 1);
//                 Node rc = construct(arr,mid + 1,hi);
//                 Node node = new Node(data,lc,rc);
//                 return node;
//         }
// //DISPLAY A SIZE
//         public static void display(Node node){
//                 if(node == null){
//                         return;
//                 }
//                 String str = "";
//                 str += node.left == null? "." : node.left.data + "";
//                 str += "<-" + node.data + "->";
//                 str += node.right == null? "." : node.right.data + "";
//                 System.out.println(str);
//                 display(node.left);
//                 display(node.right);
//         }
//         public static void main(String[]args)throws Exception{
//                 int[] arr = {12,25,37,50,52,75,87};
//                 Node root = construct(arr,0,arr.length - 1);
//                 display(root);
//         }
// }

//SIZE,SUM,MAX,MIN IN BST
// import java.io.*;
// import java.util.*;
// public class Main{
//         public static class Node{
//                 int data;
//                 Node left;
//                 Node right;
//                 Node(int data,Node left,Node right){
//                         this.data = data;
//                         this.left = left;
//                         this.right = right;
//                 }
//         }
//         public static class Pair{
//                 Node node;
//                 int state;
//                 Pair(Node node,int state){
//                         this.node = node;
//                         this.state = state;
//                 }
//         }
//         public static Node construct(Integer[]arr){
//                 Node root = new Node(arr[0],null,null);
//                 Pair rtp = new Pair(root,1);
//                 Stack <Pair> st = new Stack<>();
//                 st.push(rtp);
//                 int idx = 0;
//                 while(st.size() > 0){
//                         Pair top = st.peek();
//                         if(top.state == 1){
//                                 idx++;
//                                 if(arr[idx] != null){
//                                         top.node.left = new Node(arr[idx],null,null);
//                                         Pair lp = new Pair(top.node.left,1);
//                                         st.push(lp);
//                                 }else{
//                                         top.node.left = null;
//                                 }
//                                 top.state++;
//                         }else if(top.state == 2){
//                                 idx++;
//                                 if(arr[idx] != null){
//                                         top.node.right = new Node(arr[idx],null,null);
//                                         Pair rp = new Pair(top.node.right,1);
//                                         st.push(rp);
//                                 }else{
//                                         top.node.right = null;
//                                 }
//                                 top.state++;
//                         }else{
//                                 st.pop();
//                         }
//                 }
//                 return root;
//         }
// //DISPLAY A SIZE
//         public static void display(Node node){
//                 if(node == null){
//                         return;
//                 }
//                 String str = "";
//                 str += node.left == null? "." : node.left.data + "";
//                 str += "<-" + node.data + "->";
//                 str += node.right == null? "." : node.right.data + "";
//                 System.out.println(str);
//                 display(node.left);
//                 display(node.right);
//         }
// //SIZE,SUM,MAX AND HEIGHT
//         public static int size(Node node){
//                 if(node == null){
//                         return 0;
//                 }
//                 int ls = size(node.left);
//                 int rs = size(node.right);
//                 int ts = ls + rs + 1;
//                 return ts;
//         }
//         public static int sum(Node node){
//                 if(node == null){
//                         return 0;
//                 }
//                 int lsm = sum(node.left);
//                 int rsm = sum(node.right);
//                 int tsm = lsm + rsm + node.data;
//                 return tsm;
//         }
//         public static int max(Node node){
//                 if(node.right != null){
//                         return max(node.right);
//                 }else{
//                         return node.data;
//                 }
//         }
//         public static int min(Node node){
//                 if(node.left != null){
//                         return min(node.right);
//                 }else{
//                         return node.data;
//                 }
//         }
//         public static boolean find(Node node,int data){
//                 if(node == null){
//                         return false;
//                 }
//                 if(data > node.data){
//                         return find(node.right,data);
//                 }else if(data < node.data){
//                         return find(node.left,data);
//                 }else{
//                         return true;
//                 }
//         }
//         public static void main(String[]args)throws Exception{
//                 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//                 int n = Integer.parseInt(br.readLine());
//                 Integer[]arr = new Integer [n];
//                 String[]values = br.readLine().split(" ");
//                 for(int i = 0;i < n;i++){
//                         if(values[i].equals("n") == false){
//                                 arr[i] = Integer.parseInt(values[i]);
//                         }else{
//                                 arr[i] = null;
//                         }
//                 }
//                 Node root = construct(arr);
//                 int size = size(root);
//                 int sum = sum(root);
//                 int max = max(root);
//                 int min = min(root);
//                 System.out.println(size);
//                 System.out.println(sum);
//                 System.out.println(max);
//                 System.out.println(min);
//         }
// }

//ADD NODE TO BST
// import java.io.*;
// import java.util.*;
// public class Main{
//         public static class Node{
//                 int data;
//                 Node left;
//                 Node right;
//                 Node(int data,Node left,Node right){
//                         this.data = data;
//                         this.left = left;
//                         this.right = right;
//                 }
//         }
//         public static class Pair{
//                 Node node;
//                 int state;
//                 Pair(Node node,int state){
//                         this.node = node;
//                         this.state = state;
//                 }
//         }
//         public static Node construct(Integer[]arr){
//                 Node root = new Node(arr[0],null,null);
//                 Pair rtp = new Pair(root,1);
//                 Stack <Pair> st = new Stack<>();
//                 st.push(rtp);
//                 int idx = 0;
//                 while(st.size() > 0){
//                         Pair top = st.peek();
//                         if(top.state == 1){
//                                 idx++;
//                                 if(arr[idx] != null){
//                                         top.node.left = new Node(arr[idx],null,null);
//                                         Pair lp = new Pair(top.node.left,1);
//                                         st.push(lp);
//                                 }else{
//                                         top.node.left = null;
//                                 }
//                                 top.state++;
//                         }else if(top.state == 2){
//                                 idx++;
//                                 if(arr[idx] != null){
//                                         top.node.right = new Node(arr[idx],null,null);
//                                         Pair rp = new Pair(top.node.right,1);
//                                         st.push(rp);
//                                 }else{
//                                         top.node.right = null;
//                                 }
//                                 top.state++;
//                         }else{
//                                 st.pop();
//                         }
//                 }
//                 return root;
//         }
// //DISPLAY A SIZE
//         public static void display(Node node){
//                 if(node == null){
//                         return;
//                 }
//                 String str = "";
//                 str += node.left == null? "." : node.left.data + "";
//                 str += "<-" + node.data + "->";
//                 str += node.right == null? "." : node.right.data + "";
//                 System.out.println(str);
//                 display(node.left);
//                 display(node.right);
//         }
//         public static Node add(Node node,int data){
//                 if(node == null){
//                         return new Node(data,null,null);
//                 }
//                 if(data > node.data){
//                         node.right = add(node.right,data);
//                 }else if(data < node.data){
//                         node.left = add(node.left,data);
//                 }else{
//                         //nothing to do
//                 }
//                 return node;
//         }
//         public static void main(String[]args)throws Exception{
//                 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//                 int n = Integer.parseInt(br.readLine());
//                 Integer[]arr = new Integer [n];
//                 String[]values = br.readLine().split(" ");
//                 for(int i = 0;i < n;i++){
//                         if(values[i].equals("n") == false){
//                                 arr[i] = Integer.parseInt(values[i]);
//                         }else{
//                                 arr[i] = null;
//                         }
//                 }
//                 int data = Integer.parseInt(br.readLine());
//                 Node root = construct(arr);
//                 root = add(root,data);
//         }
// }

//REMOVE NODE FROM BST
// import java.io.*;
// import java.util.*;
// public class Main{
//         public static class Node{
//                 int data;
//                 Node left;
//                 Node right;
//                 Node(int data,Node left,Node right){
//                         this.data = data;
//                         this.left = left;
//                         this.right = right;
//                 }
//         }
//         public static class Pair{
//                 Node node;
//                 int state;
//                 Pair(Node node,int state){
//                         this.node = node;
//                         this.state = state;
//                 }
//         }
//         public static Node construct(Integer[]arr){
//                 Node root = new Node(arr[0],null,null);
//                 Pair rtp = new Pair(root,1);
//                 Stack <Pair> st = new Stack<>();
//                 st.push(rtp);
//                 int idx = 0;
//                 while(st.size() > 0){
//                         Pair top = st.peek();
//                         if(top.state == 1){
//                                 idx++;
//                                 if(arr[idx] != null){
//                                         top.node.left = new Node(arr[idx],null,null);
//                                         Pair lp = new Pair(top.node.left,1);
//                                         st.push(lp);
//                                 }else{
//                                         top.node.left = null;
//                                 }
//                                 top.state++;
//                         }else if(top.state == 2){
//                                 idx++;
//                                 if(arr[idx] != null){
//                                         top.node.right = new Node(arr[idx],null,null);
//                                         Pair rp = new Pair(top.node.right,1);
//                                         st.push(rp);
//                                 }else{
//                                         top.node.right = null;
//                                 }
//                                 top.state++;
//                         }else{
//                                 st.pop();
//                         }
//                 }
//                 return root;
//         }
// //DISPLAY A SIZE
//         public static void display(Node node){
//                 if(node == null){
//                         return;
//                 }
//                 String str = "";
//                 str += node.left == null? "." : node.left.data + "";
//                 str += "<-" + node.data + "->";
//                 str += node.right == null? "." : node.right.data + "";
//                 System.out.println(str);
//                 display(node.left);
//                 display(node.right);
//         }
//         public static int max(Node node){
//                 if(node.right != null){
//                         return max(node.right);
//                 }else{
//                         return node.data;
//                 }
//         }
//         public static Node remove(Node node,int data){
//                 if(node == null){
//                         return null;
//                 }
//                 if(data > node.data){
//                         node.right = remove(node.right,data);
//                 }else if(data < node.data){
//                         node.left = remove(node.left,data);
//                 }else{
//                         if(node.left != null && node.right != null){
//                                 int lmax = max(node.left);
//                                 node.data = lmax;
//                                 node.left = remove(node.left,lmax);
//                                 return node;
//                         }else if(node.left != null){
//                                 return node.left;
//                         }else if(node.right != null){
//                                 return node.right;
//                         }else{
//                                 return null;
//                         }
//                 }
//                 return node;
//         }
//         public static void main(String[]args)throws Exception{
//                 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//                 int n = Integer.parseInt(br.readLine());
//                 Integer[]arr = new Integer [n];
//                 String[]values = br.readLine().split(" ");
//                 for(int i = 0;i < n;i++){
//                         if(values[i].equals("n") == false){
//                                 arr[i] = Integer.parseInt(values[i]);
//                         }else{
//                                 arr[i] = null;
//                         }
//                 }
//                 int data = Integer.parseInt(br.readLine());
//                 Node root = construct(arr);
//                 root = remove(root,data);
//         }
// }

//REPLACE SUM OF LARGER IN BST
// import java.io.*;
// import java.util.*;
// public class Main{
//         public static class Node{
//                 int data;
//                 Node left;
//                 Node right;
//                 Node(int data,Node left,Node right){
//                         this.data = data;
//                         this.left = left;
//                         this.right = right;
//                 }
//         }
//         public static class Pair{
//                 Node node;
//                 int state;
//                 Pair(Node node,int state){
//                         this.node = node;
//                         this.state = state;
//                 }
//         }
//         public static Node construct(Integer[]arr){
//                 Node root = new Node(arr[0],null,null);
//                 Pair rtp = new Pair(root,1);
//                 Stack <Pair> st = new Stack<>();
//                 st.push(rtp);
//                 int idx = 0;
//                 while(st.size() > 0){
//                         Pair top = st.peek();
//                         if(top.state == 1){
//                                 idx++;
//                                 if(arr[idx] != null){
//                                         top.node.left = new Node(arr[idx],null,null);
//                                         Pair lp = new Pair(top.node.left,1);
//                                         st.push(lp);
//                                 }else{
//                                         top.node.left = null;
//                                 }
//                                 top.state++;
//                         }else if(top.state == 2){
//                                 idx++;
//                                 if(arr[idx] != null){
//                                         top.node.right = new Node(arr[idx],null,null);
//                                         Pair rp = new Pair(top.node.right,1);
//                                         st.push(rp);
//                                 }else{
//                                         top.node.right = null;
//                                 }
//                                 top.state++;
//                         }else{
//                                 st.pop();
//                         }
//                 }
//                 return root;
//         }
// //DISPLAY A SIZE
//         public static void display(Node node){
//                 if(node == null){
//                         return;
//                 }
//                 String str = "";
//                 str += node.left == null? "." : node.left.data + "";
//                 str += "<-" + node.data + "->";
//                 str += node.right == null? "." : node.right.data + "";
//                 System.out.println(str);
//                 display(node.left);
//                 display(node.right);
//         }
//         static int sum = 0;
//         public static void rwsol(Node node){
//                 if(node == null){
//                         return;
//                 }
//                 rwsol(node.right);
//                 int od = node.data;
//                 node.data = sum;
//                 sum += od;
//                 rwsol(node.left);
//         }
//         public static void main(String[]args)throws Exception{
//                 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//                 int n = Integer.parseInt(br.readLine());
//                 Integer[]arr = new Integer [n];
//                 String[]values = br.readLine().split(" ");
//                 for(int i = 0;i < n;i++){
//                         if(values[i].equals("n") == false){
//                                 arr[i] = Integer.parseInt(values[i]);
//                         }else{
//                                 arr[i] = null;
//                         }
//                 }
//                 Node root = construct(arr);
//                 rwsol(root);
//                 display(root);
//         }
// }

//LOWEST COMMON ANCESTOR IN BST
// import java.io.*;
// import java.util.*;
// public class Main{
//         public static class Node{
//                 int data;
//                 Node left;
//                 Node right;
//                 Node(int data,Node left,Node right){
//                         this.data = data;
//                         this.left = left;
//                         this.right = right;
//                 }
//         }
//         public static class Pair{
//                 Node node;
//                 int state;
//                 Pair(Node node,int state){
//                         this.node = node;
//                         this.state = state;
//                 }
//         }
//         public static Node construct(Integer[]arr){
//                 Node root = new Node(arr[0],null,null);
//                 Pair rtp = new Pair(root,1);
//                 Stack <Pair> st = new Stack<>();
//                 st.push(rtp);
//                 int idx = 0;
//                 while(st.size() > 0){
//                         Pair top = st.peek();
//                         if(top.state == 1){
//                                 idx++;
//                                 if(arr[idx] != null){
//                                         top.node.left = new Node(arr[idx],null,null);
//                                         Pair lp = new Pair(top.node.left,1);
//                                         st.push(lp);
//                                 }else{
//                                         top.node.left = null;
//                                 }
//                                 top.state++;
//                         }else if(top.state == 2){
//                                 idx++;
//                                 if(arr[idx] != null){
//                                         top.node.right = new Node(arr[idx],null,null);
//                                         Pair rp = new Pair(top.node.right,1);
//                                         st.push(rp);
//                                 }else{
//                                         top.node.right = null;
//                                 }
//                                 top.state++;
//                         }else{
//                                 st.pop();
//                         }
//                 }
//                 return root;
//         }
// //DISPLAY A SIZE
//         public static void display(Node node){
//                 if(node == null){
//                         return;
//                 }
//                 String str = "";
//                 str += node.left == null? "." : node.left.data + "";
//                 str += "<-" + node.data + "->";
//                 str += node.right == null? "." : node.right.data + "";
//                 System.out.println(str);
//                 display(node.left);
//                 display(node.right);
//         }
//         public static int lca(Node node,int d1,int d2){
//                 if(d1 < node.data && d2 < node.data){
//                         return lca(node.left,d1,d2);
//                 }else if(d1 > node.data && d2 > node.data){
//                         return lca(node.right,d1,d2);
//                 }else{
//                         return node.data;
//                 }
//         }
//         public static void main(String[]args)throws Exception{
//                 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//                 int n = Integer.parseInt(br.readLine());
//                 Integer[]arr = new Integer [n];
//                 String[]values = br.readLine().split(" ");
//                 for(int i = 0;i < n;i++){
//                         if(values[i].equals("n") == false){
//                                 arr[i] = Integer.parseInt(values[i]);
//                         }else{
//                                 arr[i] = null;
//                         }
//                 }
//                 int d1 = Integer.parseInt(br.readLine());
//                 int d2 = Integer.parseInt(br.readLine());
//                 Node root = construct(arr);
//                 int lca = lca(root,d1,d2);
//                 System.out.println(lca);
//         }
// }

//PRINT IN RANGE IN BST
// import java.io.*;
// import java.util.*;
// public class Main{
//         public static class Node{
//                 int data;
//                 Node left;
//                 Node right;
//                 Node(int data,Node left,Node right){
//                         this.data = data;
//                         this.left = left;
//                         this.right = right;
//                 }
//         }
//         public static class Pair{
//                 Node node;
//                 int state;
//                 Pair(Node node,int state){
//                         this.node = node;
//                         this.state = state;
//                 }
//         }
//         public static Node construct(Integer[]arr){
//                 Node root = new Node(arr[0],null,null);
//                 Pair rtp = new Pair(root,1);
//                 Stack <Pair> st = new Stack<>();
//                 st.push(rtp);
//                 int idx = 0;
//                 while(st.size() > 0){
//                         Pair top = st.peek();
//                         if(top.state == 1){
//                                 idx++;
//                                 if(arr[idx] != null){
//                                         top.node.left = new Node(arr[idx],null,null);
//                                         Pair lp = new Pair(top.node.left,1);
//                                         st.push(lp);
//                                 }else{
//                                         top.node.left = null;
//                                 }
//                                 top.state++;
//                         }else if(top.state == 2){
//                                 idx++;
//                                 if(arr[idx] != null){
//                                         top.node.right = new Node(arr[idx],null,null);
//                                         Pair rp = new Pair(top.node.right,1);
//                                         st.push(rp);
//                                 }else{
//                                         top.node.right = null;
//                                 }
//                                 top.state++;
//                         }else{
//                                 st.pop();
//                         }
//                 }
//                 return root;
//         }
// //DISPLAY A SIZE
//         public static void display(Node node){
//                 if(node == null){
//                         return;
//                 }
//                 String str = "";
//                 str += node.left == null? "." : node.left.data + "";
//                 str += "<-" + node.data + "->";
//                 str += node.right == null? "." : node.right.data + "";
//                 System.out.println(str);
//                 display(node.left);
//                 display(node.right);
//         }
//         public static void pir(Node node,int d1,int d2){
//                 if(node == null){
//                         return;
//                 }
//                 if(d1 < node.data && d2 < node.data){
//                         pir(node.left,d1,d2);
//                 }else if(d1 > node.data && d2 > node.data){
//                         pir(node.right,d1,d2);
//                 }else{
//                         pir(node.left,d1,d2);
//                         System.out.println(node.data);
//                         pir(node.right,d1,d2);
//                 }
//         }
//         public static void main(String[]args)throws Exception{
//                 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//                 int n = Integer.parseInt(br.readLine());
//                 Integer[]arr = new Integer [n];
//                 String[]values = br.readLine().split(" ");
//                 for(int i = 0;i < n;i++){
//                         if(values[i].equals("n") == false){
//                                 arr[i] = Integer.parseInt(values[i]);
//                         }else{
//                                 arr[i] = null;
//                         }
//                 }
//                 int d1 = Integer.parseInt(br.readLine());
//                 int d2 = Integer.parseInt(br.readLine());
//                 Node root = construct(arr);
//                 pir(root,d1,d2);
//         }
// }

//TARGET SUM PAIR IN BST
// import java.io.*;
// import java.util.*;
// public class Main{
//         public static class Node{
//                 int data;
//                 Node left;
//                 Node right;
//                 Node(int data,Node left,Node right){
//                         this.data = data;
//                         this.left = left;
//                         this.right = right;
//                 }
//         }
//         public static class Pair{
//                 Node node;
//                 int state;
//                 Pair(Node node,int state){
//                         this.node = node;
//                         this.state = state;
//                 }
//         }
//         public static Node construct(Integer[]arr){
//                 Node root = new Node(arr[0],null,null);
//                 Pair rtp = new Pair(root,1);
//                 Stack <Pair> st = new Stack<>();
//                 st.push(rtp);
//                 int idx = 0;
//                 while(st.size() > 0){
//                         Pair top = st.peek();
//                         if(top.state == 1){
//                                 idx++;
//                                 if(arr[idx] != null){
//                                         top.node.left = new Node(arr[idx],null,null);
//                                         Pair lp = new Pair(top.node.left,1);
//                                         st.push(lp);
//                                 }else{
//                                         top.node.left = null;
//                                 }
//                                 top.state++;
//                         }else if(top.state == 2){
//                                 idx++;
//                                 if(arr[idx] != null){
//                                         top.node.right = new Node(arr[idx],null,null);
//                                         Pair rp = new Pair(top.node.right,1);
//                                         st.push(rp);
//                                 }else{
//                                         top.node.right = null;
//                                 }
//                                 top.state++;
//                         }else{
//                                 st.pop();
//                         }
//                 }
//                 return root;
//         }
// //DISPLAY A SIZE
//         public static void display(Node node){
//                 if(node == null){
//                         return;
//                 }
//                 String str = "";
//                 str += node.left == null? "." : node.left.data + "";
//                 str += "<-" + node.data + "->";
//                 str += node.right == null? "." : node.right.data + "";
//                 System.out.println(str);
//                 display(node.left);
//                 display(node.right);
//         }
//         public static boolean find(Node node,int data){
//                 if(node == null){
//                         return false;
//                 }
//                 if(data > node.data){
//                         return find(node.right,data);
//                 }else if(data < node.data){
//                         return find(node.left,data);
//                 }else{
//                         return true;
//                 }
//         }
//         public static void travelAndPrint(Node root,Node node,int tar){
//                 if(node == null){
//                         return;
//                 }
//                 travelAndPrint(root,node.left,tar);
//                 int comp = tar - node.data;
//                 if(node.data < comp){
//                         if(find(root,comp) == true){
//                                 System.out.println(node.data + " " + comp);
//                         }
//                 }
//                 travelAndPrint(root,node.right,tar);
//         }
//         public static void main(String[]args)throws Exception{
//                 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//                 int n = Integer.parseInt(br.readLine());
//                 Integer[]arr = new Integer [n];
//                 String[]values = br.readLine().split(" ");
//                 for(int i = 0;i < n;i++){
//                         if(values[i].equals("n") == false){
//                                 arr[i] = Integer.parseInt(values[i]);
//                         }else{
//                                 arr[i] = null;
//                         }
//                 }
//                 int data = Integer.parseInt(br.readLine());
//                 Node root = construct(arr);
//                 travelAndPrint(root,root,data);
//         }
// }


                      //INTRODUCTION TO DYNAMIC PROGRAMMMING
//we use DP when nummbers repeat itself or when recursion again comes down

//fibonacci numbers in DP(using memoization method)
// import java.io.*;
// import java.util.*;
// public class Main{
//         public static void main(String[]args)throws Exception{
//                 Scanner scn = new Scanner(System.in);
//                 int n = scn.nextInt();
//                 int fibn = FibMemoized(n,new int[n + 1]);
//                 System.out.println(fibn);
//         } 
//         //in this approach numbers repeat it means that time complexity is not linear
//         public static int Fib(int n){
//                 if(n == 0 || n == 1){
//                         return n;
//                 }
//                 System.out.println("hello" + n);
//                 int fibnm1 = Fib(n - 1);
//                 int fibnm2 = Fib(n - 2);
//                 int fibn = fibnm1 + fibnm2;
//                 return fibn;
//         }
//         //in this approach time complexity is linear and this is dynamic programming  
//         public static int FibMemoized(int n,int[]qb){
//                 if(n == 0 || n == 1){
//                         return n;
//                 }
//                 if(qb[n] != 0){
//                         return qb[n];
//                 }
//                 System.out.println("hello" + n);
//                 int fibnm1 = FibMemoized(n - 1,qb);
//                 int fibnm2 = FibMemoized(n - 2,qb);
//                 int fibn = fibnm1 + fibnm2;
//                 qb[n] = fibn;
//                 return fibn;
//         }
// }

//CLIMBING STAIRS with max 3 jumps
// import java.io.*;
// import java.util.*;
// public class Main{
//         public static void main(String[]args)throws Exception{
//                 Scanner scn = new Scanner(System.in);
//                 int n = scn.nextInt();
//                 int cp = countPathsTab(n);
//                 System.out.println(cp);
//         } 
//         //memoization method
//         public static int countPaths(int n,int[]qb){
//                 if(n == 0){
//                         return 1;
//                 }else if(n < 0){
//                         return 0;
//                 }
//                 if(qb[n] > 0){
//                         return qb[n];
//                 }
//                 int nm1 = countPaths(n - 1,qb);
//                 int nm2 = countPaths(n - 2,qb);
//                 int nm3 = countPaths(n - 3,qb);
//                 int cp = nm1 + nm2 + nm3;
//                 qb[n] = cp;
//                 return cp;
//         }
//         //tabulation method
//         public static int countPathsTab(int n){
//                 int[]dp = new int[n + 1];
//                 dp[0] = 1;
//                 for(int i = 1;i <= n;i++){
//                         if(i == 1){
//                                 dp[i] = dp[i - 1];
//                         }else if(i == 2){
//                                 dp[i] = dp[i - 1] + dp[i - 2];
//                         }else{
//                                 dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
//                         }
//                 }
//                 return dp[n];
//         }
// }

//CLIMBING STAIRS WITH VARIABLE JUMBS
// import java.io.*;
// import java.util.*;
// public class Main{
//         public static void main(String[]args)throws Exception{
//                 Scanner scn = new Scanner(System.in);
//                 int n = scn.nextInt();
//                 int[]arr = new int[n];
//                 for(int i = 0;i < arr.length;i++){
//                         arr[i] = scn.nextInt();
//                 }
//                 int[]dp = new int[n + 1];
//                 dp[n] = 1;
//                 for(int i = n - 1;i >= 0;i--){
//                         for(int j = 1;j <= arr.length && i + j < dp.length;j++){
//                                 dp[i] += dp[i + j];
//                         }
//                 }
//                 System.out.println(dp[0]);
//         }
// }

//CLIMB STAIRS WITH MINIMUM MOVES
// import java.io.*;
// import java.util.*;
// public class Main{
//         public static void main(String[]args)throws Exception{
//                 Scanner scn = new Scanner(System.in);
//                 int n = scn.nextInt();
//                 int[]arr = new int[n];
//                 for(int i = 0;i < arr.length;i++){
//                         arr[i] = scn.nextInt();
//                 }
//                 Integer[]dp = new Integer[n + 1];
//                 dp[n] = 0;
//                 for(int i = n - 1;i >= 0;i--){
//                         if(arr[i] > 0){
//                                 int min = Integer.MAX_VALUE;
//                                 for(int j = 1;j <= arr[i] && i + j < dp.length;j++){
//                                         if(dp[i + j] != null){
//                                                 min = Math.min(min,dp[i + j]);
//                                         }
//                                 }
//                                 if(min != Integer.MAX_VALUE){
//                                         dp[i] = min + 1;
//                                 }
//                         }
//                 }
//                 System.out.println(dp[0]);
//         }
// }

//MINIMUM COST PATH
// import java.io.*;
// import java.util.*;
// public class Main{
//         public static void main(String[]args)throws Exception{
//                 Scanner scn = new Scanner(System.in);
//                 int n = scn.nextInt();
//                 int m = scn.nextInt();
//                 int[][]arr = new int[n][m];
//                 for(int i = 0;i < arr.length;i++){
//                         for(int j = 0;j < arr[0].length;j++){
//                                 arr[i][j] = scn.nextInt();
//                         }
//                 }
//                 int[][]dp = new int[n][m];
//                 for(int i = dp.length - 1;i >= 0;i--){
//                         for(int j = dp[0].length - 1;j >= 0;j--){
//                                 if(i == dp.length - 1 && j == dp[0].length - 1){
//                                         dp[i][j] = arr[i][j];
//                                 }else if(i == dp.length - 1){
//                                         dp[i][j] = dp[i][j + 1] + arr[i][j];
//                                 }else if(i == dp[0].length - 1){
//                                         dp[i][j] = dp[i + 1][j] + arr[i][j];
//                                 }else{
//                                         dp[i][j] = Math.min(dp[i + 1][j],dp[i][j + 1]) + arr[i][j];
//                                 }
//                         }
//                 }
//                 System.out.println(dp[0][0]);
//         }
// }

//GOLDMINE-path wth maximum gold
// import java.io.*;
// import java.util.*;
// public class Main{
//         public static void main(String[]args)throws Exception{
//                 Scanner scn = new Scanner(System.in);
//                 int n = scn.nextInt(); 
//                 int m = scn.nextInt();
//                 int[][]arr = new int[n][m];
//                 for(int i = 0;i < arr.length;i++){
//                         for(int j = 0;j < arr[0].length;j++){
//                                 arr[i][j] = scn.nextInt();
//                         }
//                 }
//                 int[][]dp = new int[n][m];
//                 for(int j = arr[0].length - 1;j >= 0;j--){
//                         for(int i = arr.length - 1;i >= 0;i--){
//                                 if(j == arr[0].length - 1){
//                                         dp[i][j] = arr[i][j];
//                                 }else if(i == 0){
//                                         dp[i][j] = arr[i][j] + Math.max(dp[i][j + 1],dp[i + 1][j + 1]);
//                                 }else if(i == arr.length - 1){
//                                         dp[i][j] = arr[i][j] + Math.max(dp[i][j + 1],dp[i - 1][j + 1]);
//                                 }else{
//                                         dp[i][j] = arr[i][j] + Math.max(dp[i][j + 1],Math.max(dp[i + 1][j + 1],dp[i - 1][j + 1]));
//                                 }
//                         }
//                 }
//                 int max = dp[0][0];
//                 for(int i = 1;i < dp.length;i++){
//                         if(dp[i][0] > max){
//                                 max = dp[i][0];
//                         }
//                 }
//                 System.out.println(max);
//         }
// }

//TARGET SUM SUBSETS
// import java.io.*;
// import java.util.*;
// public class Main{
//         public static void main(String[]args)throws Exception{
//                 Scanner scn = new Scanner(System.in);
//                 int n = scn.nextInt();
//                 int[]arr = new int[n];
//                 for(int i = 0;i < arr.length;i++){
//                         arr[i] = scn.nextInt();
//                 }
//                 int tar = scn.nextInt();
//                 boolean[][]dp = new boolean[n + 1][tar + 1];
//                 for(int i = 0;i < dp.length;i++){
//                         for(int j = 0;j < dp[0].length;j++){
//                                 if(i == 0 && j == 0){
//                                         dp[i][j] = true;
//                                 }else if(i == 0){
//                                         dp[i][j] = false;
//                                 }else if(j == 0){
//                                         dp[i][j] = true;
//                                 }else{
//                                         if(dp[i - 1][j] == true){
//                                                 dp[i][j] = true;
//                                         }else{
//                                                 int val = arr[i - 1];
//                                                 if(j >= val){
//                                                         if(dp[i - 1][j - val] == true){
//                                                                 dp[i][j] = true;
//                                                         }
//                                                 }
//                                         }
//                                 }
//                         }
//                 }
//                 System.out.println(dp[arr.length][tar]);
//         }
// }

//COIN CHANGE COMBINATION
// import java.io.*;
// import java.util.*;
// public class Main{
//         public static void main(String[]args)throws Exception{
//                 Scanner scn = new Scanner(System.in);
//                 int n = scn.nextInt();
//                 int[]arr = new int[n];
//                 for(int i = 0;i < arr.length;i++){
//                         arr[i] = scn.nextInt();
//                 }
//                 int amt = scn.nextInt();
//                 int[]dp = new int[amt + 1];
//                 dp[0] = 1;
//                 for(int i = 0;i < arr.length;i++){
//                         for(int j = arr[i];j < dp.length;j++){
//                                 dp[j] += dp[j - arr[i]];
//                         }
//                 } 
//                 System.out.println(dp[amt]);
//         }
// }

//COIN CHANGE PERMUTATIONS
// import java.io.*;
// import java.util.*;
// public class Main{
//         public static void main(String[]args)throws Exception{
//                 Scanner scn = new Scanner(System.in);
//                 int n = scn.nextInt();
//                 int[]coins = new int[n];
//                 for(int i = 0;i < coins.length;i++){
//                         coins[i] = scn.nextInt();
//                 }
//                 int tar = scn.nextInt();
//                 int[]dp = new int[tar + 1];
//                 dp[0] = 1;
//                 for(int amt = 1;amt <= tar;amt++){
//                         for(int coin : coins){
//                                 if(coin <= amt){
//                                         int ramt = amt - coin;
//                                         dp[amt] += dp[ramt];
//                                 }
//                         }
//                 } 
//                 System.out.println(dp[tar]);
//         }
// }

//0-1 KNAPSACK PROBLEM
// import java.io.*;
// import java.util.*;
// public class Main{
//         public static void main(String[]args)throws Exception{
//                 Scanner scn = new Scanner(System.in);
//                 int n = scn.nextInt();
//                 int[]vals = new int[n];
//                 int[]wts = new int[n];
//                 for(int i = 0;i < vals.length;i++){
//                         vals[i] = scn.nextInt();
//                 }
//                 for(int i = 0;i < wts.length;i++){
//                         wts[i] = scn.nextInt();
//                 }
//                 int cap = scn.nextInt();
//                 int[][]dp = new int[n + 1][cap + 1];
//                 for(int i = 1;i < dp.length;i++){
//                         for(int j = 1;j < dp[0].length;j++){
//                                 if(j >= wts[i - 1]){
//                                         int rCap = j - wts[i - 1];
//                                         if(dp[i - 1][rCap] + vals[i - 1] > dp[i - 1][j]){
//                                                 dp[i][j] = dp[i - 1][rCap] + vals[i - 1];
//                                         }else{
//                                                 dp[i][j] = dp[i - 1][j]; //when i doesnot bat
//                                         }
//                                 }else{
//                                         dp[i][j] = dp[i - 1][j]; //when i doesnot bat
//                                 }
//                         }
//                 }
//                 System.out.println(dp[n][cap]);
//         }
// }

//UNBOUNDED KNAPSACK
// import java.io.*;
// import java.util.*;
// public class Main{
//         public static void main(String[]args)throws Exception{
//                 Scanner scn = new Scanner(System.in);
//                 int n = scn.nextInt();
//                 int[]vals = new int[n];
//                 for(int i = 0;i < vals.length;i++){
//                         vals[i] = scn.nextInt();
//                 }
//                 int[]wts = new int[n];
//                 for(int i = 0;i < wts.length;i++){
//                         wts[i] = scn.nextInt();
//                 }
//                 int cap = scn.nextInt();
//                 int[]dp = new int[cap + 1];
//                 dp[0] = 0;
//                 for(int bagc = 1;bagc <= cap;bagc++){
//                         int max = 0;
//                         for(int i = 0;i < n;i++){
//                                 if(wts[i] <= bagc){
//                                         int rbagc = bagc - wts[i];
//                                         int rbagv = dp[rbagc];
//                                         int tbagv = rbagv + vals[i];
//                                         if(tbagv > max){
//                                                 max = tbagv;
//                                         }
//                                 }
//                         }
//                         dp[bagc] = max;
//                 }
//                 System.out.println(dp[cap]);
//         }
// }

//COUNT BINARY STRINGS WITH  NO CONSECUTIVE ZEROES
// import java.io.*;
// import java.util.*;
// public class Main{
//         public static void main(String[]args)throws Exception{
//                 Scanner scn = new Scanner(System.in);
//                 int n = scn.nextInt();
//                 int oczeroes = 1;
//                 int ocones = 1;
//                 for(int i = 2;i <= n;i++){
//                         int nzeroes = ocones;
//                         int nones = oczeroes + ocones;
//                         oczeroes = nzeroes;
//                         ocones = nones;
//                 }
//                 System.out.println(oczeroes + ocones);
//         }
// }

//ARRANGE BUILDINGS WITH NO CONSECUTIVE BUILDINGS
// import java.io.*;
// import java.util.*;
// public class Main{
//         public static void main(String[]args)throws Exception{
//                 Scanner scn = new Scanner(System.in);
//                 long n = scn.nextInt();
//                 long os = 1;
//                 long ob = 1;
//                 for(int i = 2;i <= n;i++){
//                         long nb = os;
//                         long ns = ob + os;
//                         ob = nb;
//                         os = ns;
//                 }
//                 long total = ob + os;
//                 total = total * total;
//                 System.out.println(total);
//         }
//}

//COUNT ENCODINGS
// import java.io.*;
// import java.util.*;
// public class Main{
//         public static void main(String[]args)throws Exception{
//                 Scanner scn = new Scanner(System.in);
//                 String str = scn.next();
//                 int[]dp = new int[str.length()];
//                 dp[0] = 1;
//                 for(int i = 1;i < dp.length;i++){
//                         if(str.charAt(i - 1) == '0' && str.charAt(i) == '0'){
//                                 dp[i] = 0;
//                         }else if(str.charAt(i - 1) == '0' && str.charAt(i) != '0'){
//                                 dp[i] = dp[i - 1];
//                         }else if(str.charAt(i - 1) != '0' && str.charAt(i) == '0'){
//                                 if(str.charAt(i - 1) == '1' || str.charAt(i - 1) == '2'){
//                                         dp[i] = (i >= 2 ? dp[i - 2] : 1);
//                                 }else{
//                                         dp[i] = 0;
//                                 }
//                         }else{
//                                 if(Integer.parseInt(str.substring(i - 1,i + 1)) <= 26){
//                                         dp[i] = dp[i - 1] + (i >= 2 ? dp[i - 2] : 1);
//                                 }else{
//                                         dp[i] = dp[i - 1];
//                                 }
//                         }
//                 }
//                 System.out.println(dp[str.length() - 1]);
//         }
// }

//COUNT A+B+C+ SUBSEQUENCES
// import java.io.*;
// import java.util.*;
// public class Main{
//         public static void main(String[]args)throws Exception{
//                 Scanner scn = new Scanner(System.in);
//                 String str = scn.next();
//                 int a = 0;
//                 int ab = 0;
//                 int abc = 0;
//                 for(int i = 0;i < str.length();i++){
//                         char ch = str.charAt(i);
//                         if(ch == 'a'){
//                                 a = 2 * a + 1;
//                         }else if(ch == 'b'){
//                                 ab = 2 * ab + a;
//                         }else if(ch == 'c'){
//                                 abc = 2 * abc + ab;
//                         }
//                 }
//                 System.out.println(abc);
//         }
// }

//MAXIMUM SUM NON ADJACENT ELEMENTS PROBLEM
// import java.io.*;
// import java.util.*;
// public class Main{
//         public static void main(String[]args)throws Exception{
//                 Scanner scn = new Scanner(System.in);
//                 int n = scn.nextInt();
//                 int[]arr = new int[n];
//                 for(int i = 0;i < arr.length;i++){
//                         arr[i] = scn.nextInt();
//                 }
//                 int inc = arr[0];
//                 int exc = 0;
//                 for(int i = 1;i < arr.length;i++){
//                         int ninc = exc + arr[i];
//                         int nexc = Math.max(inc,exc);
//                         inc = ninc;
//                         exc = nexc;
//                 }
//                 int ans = Math.max(inc,exc);
//                 System.out.println(ans);
//         }
// }

//PAINT HOUSES
// import java.io.*;
// import java.util.*;
// public class Main{
//         public static void main(String[]args)throws Exception{
//                 Scanner scn = new Scanner(System.in);
//                 int n = scn.nextInt();
//                 int[][]arr = new int[n][3];
//                 for(int i = 0;i < arr.length;i++){
//                         for(int j = 0;j < arr[0].length;j++){
//                                 arr[i][j] = scn.nextInt();
//                         }
//                 }
//                 long[][]dp = new long[n][3];
//                 dp[0][0] = arr[0][0];
//                 dp[0][1] = arr[0][1];
//                 dp[0][2] = arr[0][2];
//                 for(int i = 1;i < arr.length;i++){
//                         dp[i][0] = arr[i][0] + Math.min(dp[i - 1][1],dp[i - 1][2]);
//                         dp[i][1] = arr[i][1] + Math.min(dp[i - 1][0],dp[i - 1][2]);
//                         dp[i][2] = arr[i][2] + Math.min(dp[i - 1][0],dp[i - 1][1]);
//                 }
//                 long ans = Math.min(dp[n - 1][0],Math.min(dp[n - 1][1],dp[n - 1][2]));
//                 System.out.println(ans);
//         }
// }

//PAINT HOUSE-2(many colours)
// import java.io.*;
// import java.util.*;
// public class Main{
//         public static void main(String[]args)throws Exception{
//                 Scanner scn = new Scanner(System.in);
//                 int n = scn.nextInt();
//                 int c = scn.nextInt();
//                 int[][]arr = new int[n][c];
//                 for(int i = 0;i < arr.length;i++){
//                         for(int j = 0;j < arr[0].length;j++){
//                                 arr[i][j] = scn.nextInt();
//                         }
//                 }
//                 int[][]dp = new int[arr.length][arr[0].length];
//                 int least = Integer.MAX_VALUE;
//                 int sleast = Integer.MAX_VALUE;
//                 for(int j = 0;j < arr[0].length;j++){
//                         dp[0][j] = arr[0][j];
//                         if(arr[0][j] <= least){
//                                 sleast = least;
//                                 least = arr[0][j];
//                         }else if(arr[0][j] <= sleast){
//                                 sleast = arr[0][j];
//                         }
//                 }
//                 for(int i = 1;i < dp.length;i++){
//                         int nleast = Integer.MAX_VALUE;
//                         int nsleast = Integer.MAX_VALUE;
//                         for(int j = 0;j < dp[0].length;j++){
//                                 if(least == dp[i - 1][j]){
//                                         dp[i][j] = sleast + arr[i][j];
//                                 }else {
//                                         dp[i][j] = least + arr[i][j];
//                                 }
//                                 if(dp[i][j] <= nleast){
//                                         nsleast = nleast;
//                                         nleast = dp[i][j];
//                                 }else if(dp[i][j] <= nsleast){
//                                         nsleast = dp[i][j];
//                                 }
//                         }
//                         least = nleast;
//                         sleast = nsleast;
//                 }
//                 System.out.println(least);
//         }
// }

//PAINT FENCE(LEETCODE)
// import java.io.*;
// import java.util.*;
// public class Main{
//         public static void main(String[]args)throws Exception{
//                 Scanner scn = new Scanner(System.in);
//                 int n = scn.nextInt();
//                 int k = scn.nextInt();
//                 long same = k * 1;
//                 long diff = k * (k - 1);
//                 long total = same + diff;
//                 for(int i = 3;i <= n;i++){
//                         same = diff * 1;
//                         diff = total * (k - 1);
//                         total = same + diff;
//                 }
//                 System.out.println(total);
//         }
// }

//TILING WITH DOMINOS
// import java.io.*;
// import java.util.*;
// public class Main{
//         public static void main(String[]args)throws Exception{
//                 Scanner scn = new Scanner(System.in);
//                 int n = scn.nextInt();
//                 int[]dp = new int[n + 1];
//                 dp[1] = 1;
//                 dp[2] = 2;
//                 for(int i = 3;i <= n;i++){
//                         dp[i] = dp[i - 1] + dp[i - 2];
//                 }
//                 System.out.println(dp[n]);
//         }
// }

//TILING WITH M X 1 TILES
// import java.io.*;
// import java.util.*;
// public class Main{
//         public static void main(String[]args)throws Exception{
//                 Scanner scn = new Scanner(System.in);
//                 int n = scn.nextInt();
//                 int m = scn.nextInt();
//                 int[]dp = new int[n + 1];
//                 for(int i = 1;i <= n;i++){
//                         if(i < m){
//                                 dp[i] = 1;
//                         }else if(i == m){
//                                 dp[i] = 2;
//                         }else{
//                                 dp[i] = dp[i - 1] + dp[i - m];
//                         }
//                 }
//                 System.out.println(dp[n]);
//         }
// }

//FRIENDS PAIRING PROBLEM
// import java.io.*;
// import java.util.*;
// public class Main{
//         public static void main(String[]args)throws Exception{
//                 Scanner scn = new Scanner(System.in);
//                 int n = scn.nextInt();
//                 int[]dp = new int[n + 1];
//                 dp[1] = 1;
//                 dp[2] = 2;
//                 for(int i = 3;i <= n;i++){
//                         dp[i] = dp[i - 1] + dp[i - 2] * (i - 1);
//                 }
//                 System.out.println(dp[n]);
//         }
// }

//PARTITION INTO SUBSETS
// import java.io.*;
// import java.util.*;
// public class Main{
//         public static void main(String[]args)throws Exception{
//                 Scanner scn = new Scanner(System.in);
//                 int n = scn.nextInt();
//                 int k = scn.nextInt();
//                 if(n == 0 || k == 0 || n < k){
//                         System.out.println(0);
//                         return;
//                 }
//                 long[][]dp = new long[k + 1][n + 1];
//                 for(int t = 1;t <= k;t++){
//                         for(int p = 1;p <= n;p++){
//                                 if(p < t){
//                                         dp[t][p] = 0;
//                                 }else if(p == t){
//                                         dp[t][p] = 1;
//                                 }else{
//                                         dp[t][p] = dp[t- 1][p - 1] + dp[t][p - 1] * t;
//                                 }
//                         }
//                 }
//                 System.out.println(dp[k][n]);
//         }
// }

//BEST TIME TO BUY AND SELL STOCKS
// import java.io.*;
// import java.util.*;
// public class Main{
//         public static void main(String[]args)throws Exception{
//                 Scanner scn = new Scanner(System.in);
//                 int n = scn.nextInt();
//                 int[]prices = new int[n];
//                 for(int i = 0;i < prices.length;i++){
//                         prices[i] = scn.nextInt();
//                 }
//                 int lsf = Integer.MAX_VALUE;
//                 int op = 0;
//                 int pist = 0;
//                 for(int i = 0;i < prices.length;i++){
//                         if(prices[i] < lsf){
//                                 lsf = prices[i];
//                         }
//                         pist = prices[i] - lsf;
//                         if(pist > op){
//                                 op = pist;
//                         }
//                 }
//                 System.out.println(op);
//         }
// }

//BEST TIME TO BUY AND SELL STOCKS
// import java.io.*;
// import java.util.*;
// public class Main{
//         public static void main(String[]args)throws Exception{
//                 Scanner scn = new Scanner(System.in);
//                 int n = scn.nextInt();
//                 int[]arr = new int[n];
//                 for(int i = 0;i < arr.length;i++){
//                         arr[i] = scn.nextInt();
//                 }
//                 int bd = 0;
//                 int sd = 0;
//                 int profit = 0;
//                 for(int i = 1;i < arr.length;i++){
//                         if(arr[i] >= arr[i - 1]){
//                                 sd++;
//                         }else{
//                                 profit += arr[sd] - arr[bd];
//                                 sd = bd = i;
//                         }
//                 }
//                 profit += arr[sd] - arr[bd];
//                 System.out.println(profit);
//         }
// }

//BEST TIME TO BUY AND SELL STOCKS WITH TRANSACTON FEE-infifnite transction allowed
// import java.io.*;
// import java.util.*;
// public class Main{
//         public static void main(String[]args)throws Exception{
//                 Scanner scn = new Scanner(System.in);
//                 int n = scn.nextInt();
//                 int[]arr = new int[n];
//                 for(int i = 0;i < arr.length;i++){
//                         arr[i] = scn.nextInt();
//                 }
//                 int fee = scn.nextInt();
//                 int obsp = -arr[0];
//                 int ossp = 0;
//                 for(int i = 1;i < arr.length;i++){
//                         int nbsp = 0;
//                         int nssp = 0;
//                         if(ossp - arr[i] > obsp){
//                                 nbsp = ossp - arr[i];
//                         }else{
//                                 nbsp = obsp;
//                         }
//                         if(obsp + arr[i] - fee > ossp){
//                                 nssp = obsp + arr[i] - fee;
//                         }else{
//                                 nssp = ossp;
//                         }
//                         obsp = nbsp;
//                         ossp = nssp;
//                 }
//                 System.out.println(ossp);
//         }
// }

//BEST TIME TO BUY AND SELL STOCKS WITH COOLED DOWN-infifnite transction allowed
// import java.io.*;
// import java.util.*;
// public class Main{
//         public static void main(String[]args)throws Exception{
//                 Scanner scn = new Scanner(System.in);
//                 int n = scn.nextInt();
//                 int[]arr = new int[n];
//                 for(int i = 0;i < arr.length;i++){
//                         arr[i] = scn.nextInt();
//                 }
//                 int obsp = -arr[0];
//                 int ossp = 0;
//                 int ocsp = 0;
//                 for(int i = 1;i < arr.length;i++){
//                         int nbsp = 0;
//                         int nssp = 0;
//                         int ncsp = 0;
//                         if(ossp - arr[i] > obsp){
//                                 nbsp = ossp - arr[i];
//                         }else{
//                                 nbsp = obsp;
//                         }
//                         if(obsp + arr[i] > ossp){
//                                 nssp = obsp + arr[i];
//                         }else{
//                                 nssp = ossp;
//                         }
//                         if(ossp > ocsp){
//                                 ncsp = ossp;
//                         }else{
//                                 ncsp = ocsp;
//                         }
//                         obsp = nbsp;
//                         ossp = nssp;
//                         ocsp = ncsp;
//                 }
//                 System.out.println(ossp);
//         }
// }

//BEST TIME TO BUY AND SELL STOCKS WITH TWO TRANSCTIONS ALLOWED
// import java.io.*;
// import java.util.*;
// public class Main{
//         public static void main(String[]args)throws Exception{
//                 Scanner scn = new Scanner(System.in);
//                 int n = scn.nextInt();
//                 int[]arr = new int[n];
//                 for(int i = 0;i < arr.length;i++){
//                         arr[i] = scn.nextInt();
//                 }
//                 int mpist = 0;
//                 int leastsf = arr[0];
//                 int[]dpl = new int[arr.length];
//                 for(int i = 1;i < arr.length;i++){
//                         if(arr[i] < leastsf){
//                                 leastsf = arr[i];
//                         }
//                         mpist = arr[i] - leastsf;
//                         if(mpist > dpl[i - 1]){
//                                 dpl[i] = mpist;
//                         }else{
//                                 dpl[i] = dpl[i - 1];
//                         }
//                 }
//                 int mpibt = 0;
//                 int maxat = arr[arr.length - 1];
//                 int[]dpr = new int[arr.length];
//                 for(int i = arr.length - 2;i >= 0;i--){
//                         if(arr[i] > maxat){
//                                 maxat = arr[i];
//                         }
//                         mpist = maxat - arr[i];
//                         if(mpibt > dpl[i + 1]){
//                                 dpr[i] = mpibt;
//                         }else{
//                                 dpl[i] = dpl[i + 1];
//                         }
//                 }
//                 int op = 0;
//                 for(int i = 0;i < arr.length;i++){
//                         if(dpl[i] + dpr[i] > op){
//                                 op = dpl[i] + dpr[i];
//                         }
//                 }
//                 System.out.println(op);
//         }
// }

//BEST TIME TO BUY AND SELL STOCKS WITH k TRANSCTIONS 
// import java.io.*;
// import java.util.*;
// public class Main{
//         public static void main(String[]args)throws Exception{
//                 Scanner scn = new Scanner(System.in);
//                 int n = scn.nextInt();
//                 int[]arr = new int[n];
//                 for(int i = 0;i < arr.length;i++){
//                         arr[i] = scn.nextInt();
//                 }
//                 int k = scn.nextInt();
//                 int[][]dp = new int[k + 1][n];
//                 for(int t = 1;t <= k;t++){
//                         int max = Integer.MIN_VALUE;
//                         for(int d = 1;d < arr.length;d++){
//                                 if(dp[t - 1][d - 1] - arr[d - 1] > max){
//                                         max = dp[t - 1][d - 1] - arr[d - 1];
//                                 }
//                                 if(max + arr[d] > dp[t][d - 1]){
//                                         dp[t][d] = max + arr[d];
//                                 }else{
//                                         dp[t][d] = dp[t][d - 1];
//                                 }
//                         }
//                 }
//                 System.out.println(dp[k][n - 1]);
//         }
// }


                          //HASHMAPS AND HEAPS
// import java.io.*;
// import java.util.*;
// public class Main{
//         public static void main(String[]args)throws Exception{
//                 HashMap<String,Integer>hm = new HashMap<>();
//                 hm.put("India",135);
//                 hm.put("China",200);
//                 hm.put("Pak",30);
//                 hm.put("US",20);
//                 hm.put("UK",10);
//                 System.out.println(hm);
//                 hm.put("Nigeria",5);
//                 hm.put("US",25);
//                 System.out.println(hm);
//                 System.out.println(hm.get("India"));
//                 System.out.println(hm.get("Utopia"));
//                 System.out.println(hm.containsKey("India"));
//                 System.out.println(hm.containsKey("Utopia"));
//                 Set<String>keys = hm.keySet();
//                 System.out.println(keys);
//                 for(String key : hm.keySet()){
//                         Integer val = hm.get(key);
//                         System.out.println(key + " " + val);
//                 }
//         }
// }

//HIGHEST FREQUENCY CHARACTER
// import java.io.*;
// import java.util.*;
// public class Main{
//         public static void main(String[]args)throws Exception{
//                 Scanner scn = new Scanner(System.in);
//                 String str = scn.nextLine();
//                 HashMap<Character,Integer>hm = new HashMap<>();
//                 for(int i = 0;i < str.length();i++){
//                         char ch = str.charAt(i);
//                         if(hm.containsKey(ch)){
//                                 int of = hm.get(ch);
//                                 int nf = of + 1;
//                                 hm.put(ch,nf);
//                         }else{
//                                 hm.put(ch,1);
//                         }
//                 }
//                 char mfc = str.charAt(0);
//                 for(Character key : hm.keySet()){
//                         if(hm.get(key) > hm.get(mfc)){
//                                 mfc = key;
//                         }
//                 }
//                 System.out.println(mfc);
//         }
// }

//GET COMMON ELEMENT
// import java.io.*;
// import java.util.*;
// public class Main{
//         public static void main(String[]args)throws Exception{
//                 Scanner scn = new Scanner(System.in);
//                 int n1 = scn.nextInt();
//                 int[]a1 = new int[n1];
//                 for(int i = 0;i < a1.length;i++){
//                         a1[i] = scn.nextInt();
//                 }
//                 int n2 = scn.nextInt();
//                 int[]a2 = new int[n1];
//                 for(int i = 0;i < a2.length;i++){
//                         a2[i] = scn.nextInt();
//                 }
//                 HashMap<Integer,Integer>fmap = new HashMap<>();
//                 for(int val : a1){
//                         if(fmap.containsKey(val)){
//                                 int of = fmap.get(val);
//                                 int nf = of + 1;
//                                 fmap.put(val,nf);
//                         }else{
//                                 fmap.put(val,1);
//                         }
//                 }
//                 for(int val : a2){
//                         if(fmap.containsKey(val)){
//                                 System.out.println(val);
//                                 fmap.remove(val);
//                         }
//                 }
//         }
// }

//GET COMMON ELEMENT-2
// import java.io.*;
// import java.util.*;
// public class Main{
//         public static void main(String[]args)throws Exception{
//                 Scanner scn = new Scanner(System.in);
//                 int n1 = scn.nextInt();
//                 int[]a1 = new int[n1];
//                 for(int i = 0;i < a1.length;i++){
//                         a1[i] = scn.nextInt();
//                 }
//                 int n2 = scn.nextInt();
//                 int[]a2 = new int[n1];
//                 for(int i = 0;i < a2.length;i++){
//                         a2[i] = scn.nextInt();
//                 }
//                 HashMap<Integer,Integer>fmap = new HashMap<>();
//                 for(int val : a1){
//                         if(fmap.containsKey(val)){
//                                 int of = fmap.get(val);
//                                 int nf = of + 1;
//                                 fmap.put(val,nf);
//                         }else{
//                                 fmap.put(val,1);
//                         }
//                 }
//                 for(int val : a2){
//                         if(fmap.containsKey(val) && fmap.get(val) > 0){
//                                 System.out.println(val);
//                                 int of = fmap.get(val);
//                                 int nf = of - 1;
//                                 fmap.put(val,nf);
//                         }
//                 }
//         }
// }

//LONGEST CONSECUTIVE SEQUENCE
// import java.io.*;
// import java.util.*;
// public class Main{
//         public static void main(String[]args)throws Exception{
//                 Scanner scn = new Scanner(System.in);
//                 int n = scn.nextInt();
//                 int[]arr = new int[n];
//                 for(int i = 0;i < arr.length;i++){
//                         arr[i] = scn.nextInt();
//                 }
//                 HashMap<Integer,Boolean>map = new HashMap<>();
//                 for(int val : arr){
//                         map.put(val,true);
//                 }
//                 for(int val : arr){
//                         if(map.containsKey(val - 1)){
//                                 map.put(val,false);
//                         }
//                 }
//                 int msp = 0;
//                 int ml = 0;
//                 for(int val : arr){
//                         if(map.get(val) == true){
//                                 int tl = 1;
//                                 int tsp = val;
//                                 while(map.containsKey(tsp + tl)){
//                                         tl++;
//                                 }
//                                 if(tl > ml){
//                                         msp = tsp;
//                                         ml = tl;
//                                 }
//                         }
//                 }
//                 for(int i = 0;i < ml;i++){
//                         System.out.println(msp + i);
//                 }
//         }
// }

                  //INTRODUCTION TO HEAPS
// import java.io.*;
// import java.util.*;
// public class Main{
//         public static void main(String[]args)throws Exception{
//                 PriorityQueue<Integer>pq = new PriorityQueue<>(Collections.reverseOrder()); //collections.reverseorder() gives highest priority to larger number
//                 int[]ranks = {22,99,3,11,88,4,1};
//                 for(int val : ranks){
//                         pq.add(val);
//                 }
//                 while(pq.size() > 0){
//                         System.out.println(pq.peek());
//                         pq.remove();
//                 }
//         } 
// }

//HOW TO FIND K LARGEST ELEMENT IN A ARRAY
// import java.io.*;
// import java.util.*;
// public class Main{
//         public static void main(String[]args)throws Exception{
//                 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//                 int n = Integer.parseInt(br.readLine());
//                 int[]arr = new int[n];
//                 for(int i = 0;i < n;i++){
//                         arr[i] = Integer.parseInt(br.readLine());
//                 }
//                 int k = Integer.parseInt(br.readLine());
//                 PriorityQueue<Integer>pq = new PriorityQueue<>();
//                 for(int i = 0;i < arr.length;i++){
//                         if(i < k){
//                                 pq.add(arr[i]);
//                         }else{
//                                 if(arr[i] > pq.peek()){
//                                         pq.remove();
//                                         pq.add(arr[i]);
//                                 }
//                         }
//                 }
//                 while(pq.size() > 0){
//                         System.out.println(pq.remove());
//                 }
//         }
// }

//HOW TO SORT A NEARLY SORTED ARRAY
// import java.io.*;
// import java.util.*;
// public class Main{
//         public static void main(String[]args)throws Exception{
//                 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//                 int n = Integer.parseInt(br.readLine());
//                 int[]arr = new int[n];
//                 for(int i = 0;i < n;i++){
//                         arr[i] = Integer.parseInt(br.readLine());
//                 }
//                 int k = Integer.parseInt(br.readLine());
//                 PriorityQueue<Integer>pq = new PriorityQueue<>();
//                 for(int i = 0;i <= k;i++){
//                         pq.add(arr[i]);
//                 }
//                 for(int i = k + 1;i < arr.length;i++){
//                         System.out.println(pq.remove());
//                         pq.add(arr[i]);
//                 }
//                 while(pq.size() > 0){
//                         System.out.println(pq.remove());
//                 }
//         }
// }

//MEDIAN PRIORITY QUEUE
// import java.io.*;
// import java.util.*;
// public class Main{
//         public static class MedieanPriorityQueue{
//                 PriorityQueue<Integer>left;
//                 PriorityQueue<Integer>right;
//                 public MedieanPriorityQueue(){
//                         left = new PriorityQueue<>(Collections.reverseOrder());
//                         right = new PriorityQueue<>();
//                 }
//                 public void add(int val){
//                         if(right.size() > 0 && val > right.peek()){
//                                 right.add(val);
//                         }else{
//                                 left.add(val);
//                         }
//                         if(right.size() - left.size() == 2){
//                                 left.add(right.remove());
//                         }else if(left.size() - right.size() == 2){
//                                 right.add(left.remove());
//                         }
//                 }
//                 public int remove(){
//                         if(this.size() == 0){
//                                 System.out.println("Underflow");
//                                 return -1;
//                         }else if(left.size() >= right.size()){
//                                 return left.remove();
//                         }else{
//                                 return right.remove();
//                         }
//                 }
//                 public int peek(){
//                         if(this.size() == 0){
//                                 System.out.println("Underflow");
//                                 return -1;
//                         }else if(left.size() >= right.size()){
//                                 return left.peek();
//                         }else{
//                                 return right.peek();
//                         }
//                 }
//                 public int size(){
//                         return left.size() + right.size();
//                 }
//         }
//         //further code is not visible in lecture so please dont forget to do further code
// }

//MERGE K SORTED LISTS

//WRITE PRIORITY QUEUE IN HEAP

//HOW TO IMPLEMENT HASHMAP IN JAVA

//CONSTRUCTOR FOR LINEAR TIME COMPLEXITY IN HEAP

//GENERIC HEAP - COMPARABLE VS COMPARATOR


                      //INTRODUCTION TO GRAPH
// import java.io.*;
// import java.util.*;
// public class Main{
//         static class Edge{
//                 int src;
//                 int nbr;
//                 int wt;
//                 Edge(int src,int nbr,int wt){
//                         this.src = src;
//                         this.nbr = nbr;
//                         this.wt = wt;
//                 }
//         }
//         public static void main(String[]args)throws Exception{
//                 int vces = 7; //0,1,2,3,4,5,6,
//                 ArrayList<Edge>[]graph = new ArrayList[vces];
//                 for(int i = 0;i < vces;i++){
//                         graph[i] = new ArrayList<Edge>();
//                 }
//                 graph[0].add(new Edge(0,3,40));
//                 graph[0].add(new Edge(0,1,10));
//                 graph[1].add(new Edge(1,0,10));
//                 graph[1].add(new Edge(1,2,10));
//                 graph[2].add(new Edge(2,3,10));
//                 graph[2].add(new Edge(2,1,10));
//                 graph[3].add(new Edge(3,0,40));
//                 graph[3].add(new Edge(3,2,10));
//                 graph[3].add(new Edge(3,4,2));
//                 graph[4].add(new Edge(4,3,2));
//                 graph[4].add(new Edge(4,5,3));
//                 graph[4].add(new Edge(4,6,3));
//                 graph[5].add(new Edge(5,4,3));
//                 graph[5].add(new Edge(5,6,3));
//                 graph[6].add(new Edge(6,5,3));
//                 graph[6].add(new Edge(6,4,8));
//         }
// }

//HOW TO FIND PATH IN GRAPH USING DEPTH FIRST SEARCH
// import java.io.*;
// import java.util.*;
// public class Main{
//         static class Edge{
//                 int src;
//                 int nbr;
//                 int wt;
//                 Edge(int src,int nbr,int wt){
//                         this.src = src;
//                         this.nbr = nbr;
//                         this.wt = wt;
//                 }
//         }
//         public static void main(String[]args)throws Exception{
//                 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//                 int vtces = Integer.parseInt(br.readLine());
//                 ArrayList<Edge>[]graph = new ArrayList[vtces];
//                 for(int i = 0;i < vtces;i++){
//                         graph[i] = new ArrayList<>();
//                 }
//                 int edges = Integer.parseInt(br.readLine());
//                 for(int i = 0;i < edges;i++){
//                         String[]parts = br.readLine().split(" ");
//                         int v1 = Integer.parseInt(parts[0]);
//                         int v2 = Integer.parseInt(parts[1]);
//                         int wt = Integer.parseInt(parts[2]);
//                         graph[v1].add(new Edge(v1,v2,wt));
//                         graph[v2].add(new Edge(v2,v1,wt));
//                 }
//                 int src = Integer.parseInt(br.readLine());
//                 int dest = Integer.parseInt(br.readLine());
//                 boolean[]visited = new boolean[vtces];
//                 boolean path = hasPath(graph,src,dest,visited);
//                 System.out.println(path);
//         }
//         public static boolean hasPath(ArrayList<Edge>[]graph,int src,int dest,boolean[]visited){
//                 if(src == dest){
//                         return true;
//                 }
//                 visited[src] = true;
//                 for(Edge edge : graph[src]){
//                         if(visited[edge.nbr] == false){
//                                 boolean hasNbrPath = hasPath(graph,edge.nbr,dest,visited);
//                                 if(hasNbrPath == true){
//                                         return true;
//                                 }
//                         }
//                 }
//                 return false;
//         }
//}

//HOW TO FIND ALL PATH IN GRAPH USING DEPTH FIRST SEARCH
// import java.io.*;
// import java.util.*;
// public class Main{
//         static class Edge{
//                 int src;
//                 int nbr;
//                 int wt;
//                 Edge(int src,int nbr,int wt){
//                         this.src = src;
//                         this.nbr = nbr;
//                         this.wt = wt;
//                 }
//         }
//         public static void main(String[]args)throws Exception{
//                 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//                 int vtces = Integer.parseInt(br.readLine());
//                 ArrayList<Edge>[]graph = new ArrayList[vtces];
//                 for(int i = 0;i < vtces;i++){
//                         graph[i] = new ArrayList<>();
//                 }
//                 int edges = Integer.parseInt(br.readLine());
//                 for(int i = 0;i < edges;i++){
//                         String[]parts = br.readLine().split(" ");
//                         int v1 = Integer.parseInt(parts[0]);
//                         int v2 = Integer.parseInt(parts[1]);
//                         int wt = Integer.parseInt(parts[2]);
//                         graph[v1].add(new Edge(v1,v2,wt));
//                         graph[v2].add(new Edge(v2,v1,wt));
//                 }
//                 int src = Integer.parseInt(br.readLine());
//                 int dest = Integer.parseInt(br.readLine());
//                 boolean[]visited = new boolean[vtces];
//                 printAllPath(graph,src,dest,visited,src +"");
//         }
//         public static void printAllPath(ArrayList<Edge>[]graph,int src,int dest,boolean[]visited,String psf){
//                 if(src == dest){
//                         System.out.println(psf);
//                         return;
//                 }
//                 visited[src] = true;
//                 for(Edge edge : graph[src]){
//                         if(visited[edge.nbr] == false){
//                                 printAllPath(graph,edge.nbr,dest,visited,psf + edge.nbr);
//                         }
//                 }
//                 visited[src] = false;
//         }
// }

//MULTISOVER 
// import java.io.*;
// import java.util.*;
// public class Main{
//         static class Edge{
//                 int src;
//                 int nbr;
//                 int wt;
//                 Edge(int src,int nbr,int wt){
//                         this.src = src;
//                         this.nbr = nbr;
//                         this.wt = wt;
//                 }
//         }
//         static class Pair implements Comparable<Pair>{
//                 int wsf;
//                 String psf;
//                 Pair(int wsf,String psf){
//                         this.wsf = wsf;
//                         this.psf = psf;
//                 }
//                 public int compareTo(Pair o){
//                         return this.wsf - o.wsf;
//                 }
//         }
//         public static void main(String[]args)throws Exception{
//                 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//                 int vtces = Integer.parseInt(br.readLine());
//                 ArrayList<Edge>[]graph = new ArrayList[vtces];
//                 for(int i = 0;i < vtces;i++){
//                         graph[i] = new ArrayList<>();
//                 }
//                 int edges = Integer.parseInt(br.readLine());
//                 for(int i = 0;i < edges;i++){
//                         String[]parts = br.readLine().split(" ");
//                         int v1 = Integer.parseInt(parts[0]);
//                         int v2 = Integer.parseInt(parts[1]);
//                         int wt = Integer.parseInt(parts[2]);
//                         graph[v1].add(new Edge(v1,v2,wt));
//                         graph[v2].add(new Edge(v2,v1,wt));
//                 }
//                 int src = Integer.parseInt(br.readLine());
//                 int dest = Integer.parseInt(br.readLine());
//                 int criteria = Integer.parseInt(br.readLine());
//                 int k = Integer.parseInt(br.readLine());
//                 boolean[]visited = new boolean[vtces];
//                 multisolver(graph,src,dest,visited,criteria,k,src +"",0);
//                 System.out.println("Smallest Path = " + spath + "@" + spathwt);
//                 System.out.println("Largest Path = " + lpath + "@" + lpathwt);
//                 System.out.println("Just larger Path than = " + criteria + "=" + cpath + "@" + cpathwt);
//                 System.out.println("just Smaller Path than = " + criteria + "=" + fpath + "@" + fpathwt);
//                 System.out.println(k + "th largest path =" + pq.peek().psf + "@" + pq.peek().wsf);
//         }
//         static String spath;
//         static Integer spathwt = Integer.MAX_VALUE;
//         static String lpath;
//         static Integer lpathwt = Integer.MIN_VALUE;
//         static String cpath;
//         static Integer cpathwt = Integer.MAX_VALUE;
//         static String  fpath;
//         static Integer fpathwt = Integer.MIN_VALUE;
//         static PriorityQueue<Pair>pq = new PriorityQueue<>();
//         public static void multisolver(ArrayList<Edge>[]graph,int src,int dest,boolean[]visited,int criteria,int k,String psf,int wsf){
//                 if(src == dest){
//                         if(wsf < spathwt){
//                                 spathwt = wsf;
//                                 spath = psf;
//                         }
//                         if(wsf > lpathwt){
//                                 lpathwt = wsf;
//                                 lpath = psf;
//                         }
//                         if(wsf > criteria && wsf < cpathwt){
//                                 cpathwt = wsf;
//                                 cpath = psf;
//                         }
//                         if(wsf < criteria && wsf > fpathwt){
//                                 fpathwt = wsf;
//                                 fpath = psf;
//                         }
//                         if(pq.size() < k){
//                                 pq.add(new Pair(wsf,psf));
//                         }else{
//                                 if(wsf > pq.peek().wsf){
//                                         pq.remove();
//                                         pq.add(new Pair(wsf,psf));
//                                 }
//                         }
//                         return;
//                 }
//                 visited[src] = true;
//                 for(Edge e : graph[src]){
//                         if(visited[e.nbr] == false){
//                                 multisolver(graph, e.nbr, dest, visited, criteria, k, psf + e.nbr, wsf + e.wt);
//                         }
//                 }
//                 visited[src] = false;
//         }
// }

//GET CONNECTED COMPONENTS OF GRAPH
// import java.io.*;
// import java.util.*;
// public class Main{
//         static class Edge{
//                 int src;
//                 int nbr;
//                 int wt;
//                 Edge(int src,int nbr,int wt){
//                         this.src = src;
//                         this.nbr = nbr;
//                         this.wt = wt;
//                 }
//         }
//         public static void main(String[]args)throws Exception{
//                 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//                 int vtces = Integer.parseInt(br.readLine());
//                 ArrayList<Edge>[]graph = new ArrayList[vtces];
//                 for(int i = 0;i < vtces;i++){
//                         graph[i] = new ArrayList<>();
//                 }
//                 int edges = Integer.parseInt(br.readLine());
//                 for(int i = 0;i < edges;i++){
//                         String[]parts = br.readLine().split(" ");
//                         int v1 = Integer.parseInt(parts[0]);
//                         int v2 = Integer.parseInt(parts[1]);
//                         int wt = Integer.parseInt(parts[2]);
//                         graph[v1].add(new Edge(v1,v2,wt));
//                         graph[v2].add(new Edge(v2,v1,wt));
//                 }
//                 ArrayList<ArrayList<Integer>>comps = new ArrayList<>();
//                 boolean[]visited = new boolean[vtces];
//                 for(int v = 0;v < vtces;v++){
//                         if(visited[v] == false){
//                                 ArrayList<Integer>comp = new ArrayList<>();
//                                 drawTreeAndGenerateComp(graph,v,comp,visited);
//                                 comps.add(comp);
//                         }
//                 }
//                 System.out.println(comps);
//         }
//         public static void drawTreeAndGenerateComp(ArrayList<Edge>[]graph,int src,ArrayList<Integer>comp,boolean[]visited){
//                 visited[src] = true;
//                 comp.add(src);
//                 for(Edge e : graph[src]){
//                         if(visited[e.nbr] == false){
//                                 drawTreeAndGenerateComp(graph, e.nbr, comp, visited);
//                         }
//                 }
//         }
// }

//IS GRAPH CONNNECTED
// import java.io.*;
// import java.util.*;
// public class Main{
//         static class Edge{
//                 int src;
//                 int nbr;
//                 int wt;
//                 Edge(int src,int nbr,int wt){
//                         this.src = src;
//                         this.nbr = nbr;
//                         this.wt = wt;
//                 }
//         }
//         public static void main(String[]args)throws Exception{
//                 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//                 int vtces = Integer.parseInt(br.readLine());
//                 ArrayList<Edge>[]graph = new ArrayList[vtces];
//                 for(int i = 0;i < vtces;i++){
//                         graph[i] = new ArrayList<>();
//                 }
//                 int edges = Integer.parseInt(br.readLine());
//                 for(int i = 0;i < edges;i++){
//                         String[]parts = br.readLine().split(" ");
//                         int v1 = Integer.parseInt(parts[0]);
//                         int v2 = Integer.parseInt(parts[1]);
//                         int wt = Integer.parseInt(parts[2]);
//                         graph[v1].add(new Edge(v1,v2,wt));
//                         graph[v2].add(new Edge(v2,v1,wt));
//                 }
//                 ArrayList<ArrayList<Integer>>comps = new ArrayList<>();
//                 boolean[]visited = new boolean[vtces];
//                 for(int v = 0;v < vtces;v++){
//                         if(visited[v] == false){
//                                 ArrayList<Integer>comp = new ArrayList<>();
//                                 drawTreeAndGenerateComp(graph,v,comp,visited);
//                                 comps.add(comp);
//                         }
//                 }
//                 System.out.println(comps.size() == 1);
//         }
//         public static void drawTreeAndGenerateComp(ArrayList<Edge>[]graph,int src,ArrayList<Integer>comp,boolean[]visited){
//                 visited[src] = true;
//                 comp.add(src);
//                 for(Edge e : graph[src]){
//                         if(visited[e.nbr] == false){
//                                 drawTreeAndGenerateComp(graph, e.nbr, comp, visited);
//                         }
//                 }
//         }
// }

//COUNT NUMBER OF ISLANDS USING GRAPHS
// import java.io.*;
// import java.util.*;
// public class Main{
//         public static void main(String[]args)throws Exception{
//                 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//                 int m = Integer.parseInt(br.readLine());
//                 int n = Integer.parseInt(br.readLine());
//                 int[][]arr = new int[m][n];
//                 for(int i = 0;i < arr.length;i++){
//                         String parts = br.readLine();
//                         for(int j = 0;j < arr[0].length;j++){
//                                 arr[i][j] = Integer.parseInt(parts.split("")[j]);
//                         }
//                 }
//                 boolean[][]visited = new boolean[arr.length][arr[0].length];
//                 int count = 0;
//                 for(int i = 0;i < arr.length;i++){
//                         for(int j = 0;j < arr[i].length;j++){
//                                 if(arr[i][j] == 0 && visited[i][j] == false){
//                                         drawTreeForComp(arr,i,j,visited);
//                                         count++;
//                                 }
//                         }
//                 }
//                 System.out.println(count);
//         }
//         public static void drawTreeForComp(int[][]arr,int i, int j, boolean[][]visited){
//                 if(i < 0 || j < 0 || i >= arr.length || j >= arr[0].length || arr[i][j] == 1 || visited[i][j] == true){
//                         return;
//                 }
//                 visited[i][j] = true;
//                 drawTreeForComp(arr, i - 1, j, visited);
//                 drawTreeForComp(arr, i, j + 1, visited);
//                 drawTreeForComp(arr, i, j - 1, visited);
//                 drawTreeForComp(arr, i + 1, j, visited);
//         }
// }

//PERFECT FRIENDS PROBLEM
// import java.io.*;
// import java.util.*;
// public class Main{
//         public static class Edge{
//                 int v;
//                 int n;
//                 Edge(int v,int n){
//                         this.v = v;
//                         this.n = n;
//                 }
//         }
//         public static void main(String[]args)throws Exception{
//                 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//                 int n = Integer.parseInt(br.readLine());
//                 int k = Integer.parseInt(br.readLine());
//                 ArrayList<Edge>[]graph = new ArrayList[n];
//                 for(int v = 0;v < n;v++){
//                         graph[v] = new ArrayList<>();
//                 }
//                 for(int e = 0;e < k;e++){
//                         String line = br.readLine();
//                         String[]parts = line.split(" ");
//                         int v1 = Integer.parseInt(parts[0]);
//                         int v2 = Integer.parseInt(parts[1]);
//                         graph[v1].add(new Edge(v1,v2));
//                         graph[v2].add(new Edge(v2,v1));
//                 }
//                 boolean[]visited = new boolean[n];
//                 ArrayList<ArrayList<Integer>>comps = new ArrayList<>();
//                 for(int v = 0;v < n;v++){
//                         if(visited[v] == false){
//                                 ArrayList<Integer>comp = new ArrayList<>();
//                                 drawTreeAndCreateComp(graph,v,comp,visited);
//                                 comps.add(comp);
//                         }
//                 }
//                 int pairs = 0;
//                 for(int i = 0;i < comps.size();i++){
//                         for(int j = i + 1;j < comps.size();j++){
//                                 int count = comps.get(i).size() * comps.get(j).size();
//                                 pairs += count;
//                         }
//                 }
//                 System.out.println(pairs);
//         }
//         public static void drawTreeAndCreateComp(ArrayList<Edge>[]graph,int src,ArrayList<Integer>comp,boolean[]visited){
//                 visited[src] = true;
//                 comp.add(src);
//                 for(Edge e : graph[src]){
//                         if(visited[e.n] == false){
//                                 drawTreeAndCreateComp(graph, e.n, comp, visited);
//                         }
//                 }
//         }
// }

//HAMILTONIAN PATHS AND CYCLES
// import java.io.*;
// import java.util.*;
// public class Main{
//         static class Edge{
//                 int src;
//                 int nbr;
//                 int wt;
//                 Edge(int src,int nbr,int wt){
//                         this.src = src;
//                         this.nbr = nbr;
//                         this.wt = wt;
//                 }
//         }
//         public static void main(String[]args)throws Exception{
//                 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//                 int vtces = Integer.parseInt(br.readLine());
//                 ArrayList<Edge>[]graph = new ArrayList[vtces];
//                 for(int i = 0;i < vtces;i++){
//                         graph[i] = new ArrayList<>();
//                 }
//                 int edges = Integer.parseInt(br.readLine());
//                 for(int i = 0;i < edges;i++){
//                         String[]parts = br.readLine().split(" ");
//                         int v1 = Integer.parseInt(parts[0]);
//                         int v2 = Integer.parseInt(parts[1]);
//                         int wt = Integer.parseInt(parts[2]);
//                         graph[v1].add(new Edge(v1,v2,wt));
//                         graph[v2].add(new Edge(v2,v1,wt));
//                 }
//                 int src = Integer.parseInt(br.readLine());
//                 HashSet<Integer>visited = new HashSet<>();
//                 hamiltonian(graph,src,visited,src + "",src);
//         }
//         public static void hamiltonian(ArrayList<Edge>[]graph,int src,HashSet<Integer>visited,String psf,int osrc){
//                 if(visited.size() == graph.length - 1){
//                         System.out.print(psf);
//                         boolean closingEdgeFound = false;
//                         for(Edge e : graph[src]){
//                                 if(e.nbr == osrc){
//                                         closingEdgeFound = true;
//                                         break;
//                                 }
//                         }
//                         if(closingEdgeFound == true){
//                                 System.out.println("*");
//                         }else{
//                                 System.out.println(".");
//                         }
//                         return;
//                 }
//                 visited.add(src);
//                 for(Edge e : graph[src]){
//                         if(visited.contains(e.nbr) == false){
//                                 hamiltonian(graph, e.nbr, visited, psf + e.nbr, osrc);
//                         }
//                 }
//                 visited.remove(src);
//         }
// }

//BREADTH FIRST TRAVEL
// import java.io.*;
// import java.util.*;
// public class Main{
//         static class Edge{
//                 int src;
//                 int nbr;
//                 Edge(int src,int nbr,int wt){
//                         this.src = src;
//                         this.nbr = nbr;
//                 }
//         }
//         static class Pair{
//                 int v;
//                 String psf;
//                 Pair(int v,String psf){
//                         this.v = v;
//                         this.psf = psf;
//                 }
//         }
//         public static void main(String[]args)throws Exception{
//                 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//                 int vtces = Integer.parseInt(br.readLine());
//                 ArrayList<Edge>[]graph  = new ArrayList[vtces];
//                 for(int i = 0;i < vtces;i++){
//                         graph[i] = new ArrayList<>();
//                 }
//                 int edges = Integer.parseInt(br.readLine());
//                 for(int i = 0;i < edges;i++){
//                         String[]parts = br.readLine().split(" ");
//                         int v1 = Integer.parseInt(parts[0]);
//                         int v2 = Integer.parseInt(parts[1]);
//                         int wt = Integer.parseInt(parts[2]);
//                         graph[v1].add(new Edge(v1,v2,wt));
//                         graph[v2].add(new Edge(v2,v1,wt));
//                 }
//                 int src = Integer.parseInt(br.readLine());
//                 ArrayDeque<Pair>queue = new ArrayDeque<>();
                // queue.add(new Pair(src,src+""));
                // boolean[]visited = new boolean[vtces];
                // while(queue.size() > 0){
                //         //remove,mark *,work,add *
                //         Pair rem = queue.removeFirst();
                //         if(visited[rem.v] == true){
                //                 continue;
                //         }
                //         visited[rem.v] = true;
                //         System.out.println(rem.v + "@" + rem.psf);
                //         for(Edge e : graph[rem.v]){
                //                 if(visited[e.nbr] == false){
                //                         queue.add(new Pair(e.nbr,rem.psf + e.nbr));
                //                 }
                //         }
                // }
//         }
// }

//IS GRAPH CYCLIC
// import java.io.*;
// import java.util.*;
// public class Main{
//         static class Edge{
//                 int src;
//                 int nbr;
//                 int wt;
//                 Edge(int src,int nbr,int wt){
//                         this.src = src;
//                         this.nbr = nbr;
//                         this.wt = wt;
//                 }
//         }
//         public static void main(String[]args)throws Exception{
//                 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//                 int vtces = Integer.parseInt(br.readLine());
//                 ArrayList<Edge>[]graph = new ArrayList[vtces];
//                 for(int i = 0;i < vtces;i++){
//                         graph[i] = new ArrayList<>();
//                 }
//                 int edges = Integer.parseInt(br.readLine());
//                 for(int i = 0;i < edges;i++){
//                         String[]parts = br.readLine().split(" ");
//                         int v1 = Integer.parseInt(parts[0]);
//                         int v2 = Integer.parseInt(parts[1]);
//                         int wt = Integer.parseInt(parts[2]);
//                         graph[v1].add(new Edge(v1,v2,wt));
//                         graph[v2].add(new Edge(v2,v1,wt));
//                 }
//                 boolean[]visited = new boolean[vtces];
//                 for(int v = 0;v < vtces;v++){
//                         if(visited[v] == false){
//                                 boolean cycle = isCyclic(graph,v,visited);
//                                 if(cycle){
//                                         System.out.println(true);
//                                         return;
//                                 }
//                         }
//                 }
//                 System.out.println(false);
//         }
//         static class Pair{
//                 int v;
//                 String psf;
//                 Pair(int v,String psf){
//                         this.v = v;
//                         this.psf = psf;
//                 }
//         }
//         public static boolean isCyclic(ArrayList<Edge>[]graph,int src,boolean[]visited){
//                 ArrayDeque<Pair>q = new ArrayDeque<>();
//                 q.add(new Pair(src,src+""));
//                 while(q.size() > 0){
//                         //remove,mark *,work,add *
//                         Pair rem = q.removeFirst();
//                         if(visited[rem.v] == true){
//                                 return true;
//                         }
//                         visited[rem.v] = true;
//                         for(Edge e : graph[rem.v]){
//                                 if(visited[e.nbr] == false){
//                                         q.add(new Pair(e.nbr,rem.psf + e.nbr));
//                                 }
//                         }
//                 }
//                 return false;
//         }
// }

//IS GRAPH BIPARTITE
// import java.io.*;
// import java.util.*;
// public class Main{
//         static class Edge{
//                 int src;
//                 int nbr;
//                 int wt;
//                 Edge(int src,int nbr,int wt){
//                         this.src = src;
//                         this.nbr = nbr;
//                         this.wt = wt;
//                 }
//         }
//         public static class Pair{
//                 int v;
//                 String psf;
//                 int level;
//                 Pair(int v,String psf,int level){
//                         this.v = v;
//                         this.psf = psf;
//                         this.level = level;
//                 }
//         }
//         public static void main(String[]args)throws Exception{
//                 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//                 int vtces = Integer.parseInt(br.readLine());
//                 ArrayList<Edge>[]graph = new ArrayList[vtces];
//                 for(int i = 0;i < vtces;i++){
//                         graph[i] = new ArrayList<>();
//                 }
//                 int edges = Integer.parseInt(br.readLine());
//                 for(int i = 0;i < edges;i++){
//                         String[]parts = br.readLine().split(" ");
//                         int v1 = Integer.parseInt(parts[0]);
//                         int v2 = Integer.parseInt(parts[1]);
//                         int wt = Integer.parseInt(parts[2]);
//                         graph[v1].add(new Edge(v1,v2,wt));
//                         graph[v2].add(new Edge(v2,v1,wt));
//                 }
//                 int[]visited = new int[vtces];
//                 Arrays.fill(visited,-1);
//                 for(int v = 0;v < vtces;v++){
//                         if(visited[v] == -1){
//                                 boolean isCompBipartite = checkCompForBiparteness(graph,v,visited);
//                                 if(isCompBipartite == false){
//                                         System.out.println(false);
//                                         return;
//                                 }
//                         }
//                 }
//                 System.out.println(true);
//         }        
//         public static boolean checkCompForBiparteness(ArrayList<Edge>[]graph,int src,int[]visited){
//                 ArrayDeque<Pair>q = new ArrayDeque<>();
//                 q.add(new Pair(src,src+"",0));
//                 while(q.size() > 0){
//                         Pair rem = q.removeFirst();
//                         if(visited[rem.v] != -1){
//                                 if(rem.level != visited[rem.v]){
//                                         return false;
//                                 }
//                         }else{
//                                 visited[rem.v] = rem.level;
//                         }
//                         for(Edge e : graph[rem.v]){
//                                 if(visited[e.nbr] == -1){
//                                         q.add(new Pair(e.nbr, rem.psf + e.nbr, rem.level + 1));
//                                 }
//                         }
//                 }
//                 return true;
//         }
// }

//SPREAD INFECTION
// import java.io.*;
// import java.util.*;
// public class Main{
//         static class Edge{
//                 int src;
//                 int nbr;
//                 Edge(int src,int nbr){
//                         this.src = src;
//                         this.nbr = nbr;
//                 }
//         }
//         public static void main(String[]args)throws Exception{
//                 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//                 int vtces = Integer.parseInt(br.readLine());
//                 ArrayList<Edge>[]graph = new ArrayList[vtces];
//                 for(int i = 0;i < vtces;i++){
//                         graph[i] = new ArrayList<>();
//                 }
//                 int edges = Integer.parseInt(br.readLine());
//                 for(int i = 0;i < edges;i++){
//                         String[]parts = br.readLine().split(" ");
//                         int v1 = Integer.parseInt(parts[0]);
//                         int v2 = Integer.parseInt(parts[1]);
//                         graph[v1].add(new Edge(v1,v2));
//                         graph[v2].add(new Edge(v2,v1));
//                 }
//                 int src = Integer.parseInt(br.readLine());
//                 int t = Integer.parseInt(br.readLine());
//                 ArrayDeque<Pair>q = new ArrayDeque<>();
//                 q.add(new Pair(src,1));
//                 int[]visited = new int[vtces];
//                 int count = 0;
//                 while(q.size() > 0){
//                         Pair rem = q.removeFirst();
//                         if(visited[rem.v] > 0){
//                                 continue;
//                         }
//                         visited[rem.v] = rem.time;
//                         if(rem.time > t){
//                                 break;
//                         }
//                         count++;
//                         for(Edge e : graph[rem.v]){
//                                 if(visited[e.nbr] == 0){
//                                         q.add(new Pair(e.nbr,rem.time + 1));
//                                 }
//                         }
//                 }
//                 System.out.println(count);
//         }
//         public static class Pair{
//                 int v;
//                 int time;
//                 Pair(int v,int time){
//                         this.v = v;
//                         this.time = time;
//                 }
//         }
// }

//DIJKSTRA ALGORITHM
// import java.io.*;
// import java.util.*;
// public class Main{
//         static class Edge{
//                 int src;
//                 int nbr;
//                 int wt;
//                 Edge(int src,int nbr,int wt){
//                         this.src = src;
//                         this.nbr = nbr;
//                         this.wt = wt;
//                 }
//         }
//         public static void main(String[]args)throws Exception{
//                 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//                 int vtces = Integer.parseInt(br.readLine());
//                 ArrayList<Edge>[]graph = new ArrayList[vtces];
//                 for(int i = 0;i < vtces;i++){
//                         graph[i] = new ArrayList<>();
//                 }
//                 int edges = Integer.parseInt(br.readLine());
//                 for(int i = 0;i < edges;i++){
//                         String[]parts = br.readLine().split(" ");
//                         int v1 = Integer.parseInt(parts[0]);
//                         int v2 = Integer.parseInt(parts[1]);
//                         int wt = Integer.parseInt(parts[2]);
//                         graph[v1].add(new Edge(v1,v2,wt));
//                         graph[v2].add(new Edge(v2,v1,wt));
//                 }
//                 int src = Integer.parseInt(br.readLine());
//                 PriorityQueue<Pair>pq = new PriorityQueue<>();
//                 pq.add(new Pair(src,src+"",0));
//                 boolean[]visited = new boolean[vtces];
//                 while(pq.size() > 0){
//                         Pair rem = pq.remove();
//                         if(visited[rem.v] == true){
//                                 continue;
//                         }
//                         visited[rem.v] = true;
//                         System.out.println(rem.v + "via" + rem.psf + "@" + rem.wsf);
//                         for(Edge e : graph[rem.v]){
//                                 if(visited[e.nbr] == false){
//                                         pq.add(new Pair(e.nbr,rem.psf + e.nbr,rem.wsf + e.wt));
//                                 }
//                         }
//                 }
//         }
//         public static class Pair implements Comparable<Pair>{
//                 int v;
//                 String psf;
//                 int wsf;
//                 Pair(int v,String psf,int wsf){
//                         this.v = v;
//                         this.psf = psf;
//                         this.wsf = wsf;
//                 }
//                 public int compareTo(Pair o){
//                         return this.wsf = o.wsf;
//                 }
//         }
// }

//PRIM'S ALGORITHM
// import java.io.*;
// import java.util.*;
// public class Main{
//         static class Edge{
//                 int src;
//                 int nbr;
//                 int wt;
//                 Edge(int src,int nbr,int wt){
//                         this.src = src;
//                         this.nbr = nbr;
//                         this.wt = wt;
//                 }
//         }
//         public static class Pair implements Comparable<Pair>{
//                 int v;
//                 int av;
//                 int wt;
//                 Pair(int v,int av,int wt){
//                         this.v = v;
//                         this.av = av;
//                         this.wt = wt;
//                 }
//                 public int compareTo(Pair o){
//                         return this.wt = o.wt;
//                 }
//         }
//         public static void main(String[]args)throws Exception{
//                 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//                 int vtces = Integer.parseInt(br.readLine());
//                 ArrayList<Edge>[]graph = new ArrayList[vtces];
//                 for(int i = 0;i < vtces;i++){
//                         graph[i] = new ArrayList<>();
//                 }
//                 int edges = Integer.parseInt(br.readLine());
//                 for(int i = 0;i < edges;i++){
//                         String[]parts = br.readLine().split(" ");
//                         int v1 = Integer.parseInt(parts[0]);
//                         int v2 = Integer.parseInt(parts[1]);
//                         int wt = Integer.parseInt(parts[2]);
//                         graph[v1].add(new Edge(v1,v2,wt));
//                         graph[v2].add(new Edge(v2,v1,wt));
//                 }
//                 PriorityQueue<Pair>pq = new PriorityQueue<>();
//                 pq.add(new Pair(0,-1,0));
//                 boolean[]visited = new boolean[vtces];
//                 while(pq.size() > 0){
//                         Pair rem = pq.remove();
//                         if(visited[rem.v] == true){
//                                 continue;
//                         }
//                         visited[rem.v] = true;
//                         if(rem.av != -1){
//                                 System.out.println("[" + rem.v + "-" + rem.av + "@" + rem.wt + "]");
//                         }
//                         for(Edge e : graph[rem.v]){
//                                 if(visited[e.nbr] == false){
//                                         pq.add(new Pair(e.nbr,rem.v,e.wt));
//                                 }
//                         }
//                 }
//         }
// }

//TOPOLOGICAL SORT ALGORITHM WITH DFS
// import java.io.*;
// import java.util.*;
// public class Main{
//         static class Edge{
//                 int src;
//                 int nbr;
//                 int wt;
//                 Edge(int src,int nbr,int wt){
//                         this.src = src;
//                         this.nbr = nbr;
//                         this.wt = wt;
//                 }
//         }
//         public static class Pair{
//                 int src;
//                 int nbr;
//                 Pair(int src,int nbr){
//                         this.src = src;
//                         this.nbr = nbr;
//                 }
//         }
//         public static void main(String[]args)throws Exception{
//                 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//                 int vtces = Integer.parseInt(br.readLine());
//                 ArrayList<Edge>[]graph = new ArrayList[vtces];
//                 for(int i = 0;i < vtces;i++){
//                         graph[i] = new ArrayList<>();
//                 }
//                 int edges = Integer.parseInt(br.readLine());
//                 for(int i = 0;i < edges;i++){
//                         String[]parts = br.readLine().split(" ");
//                         int v1 = Integer.parseInt(parts[0]);
//                         int v2 = Integer.parseInt(parts[1]);
//                         int wt = Integer.parseInt(parts[2]);
//                         graph[v1].add(new Edge(v1,v2,wt));
//                 }
//                 boolean[]visited = new boolean[vtces];
//                 Stack<Integer>st = new Stack<>();
//                 for(int v = 0;v < vtces;v++){
//                         if(visited[v] == false){
//                                 topologicalSort(graph, v, visited, st);
//                         }
//                 }
//                 while(st.size() > 0){
//                         System.out.println(st.pop());
//                 }
//         }
//         public static void topologicalSort(ArrayList<Edge>[]graph,int src,boolean[]visited,Stack<Integer>st){
//                 visited[src] = true;
//                 for(Edge e : graph[src]){
//                         if(visited[e.nbr] == false){
//                                 topologicalSort(graph, e.nbr, visited,st);
//                         }
//                 }
//                 st.push(src);
//         }
// }

//ITERATIVE DEPTH FIRST TRAVERSAL
// import java.io.*;
// import java.util.*;
// public class Main{
//         static class Edge{
//                 int src;
//                 int nbr;
//                 Edge(int src,int nbr){
//                         this.src = src;
//                         this.nbr = nbr;
//                 }
//         }
//         public static class Pair{
//                 int v;
//                 String psf;
//                 Pair(int v,String psf){
//                         this.v = v;
//                         this.psf = psf;
//                 }
//         }
//         public static void main(String[]args)throws Exception{
//                 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//                 int vtces = Integer.parseInt(br.readLine());
//                 ArrayList<Edge>[]graph = new ArrayList[vtces];
//                 for(int i = 0;i < vtces;i++){
//                         graph[i] = new ArrayList<>();
//                 }
//                 int edges = Integer.parseInt(br.readLine());
//                 for(int i = 0;i < edges;i++){
//                         String[]parts = br.readLine().split(" ");
//                         int v1 = Integer.parseInt(parts[0]);
//                         int v2 = Integer.parseInt(parts[1]);
//                         int wt = Integer.parseInt(parts[2]);
//                         graph[v1].add(new Edge(v1,v2));
//                         graph[v2].add(new Edge(v2,v1));
//                 }
//                 int src = Integer.parseInt(br.readLine());
//                 boolean[]visited = new boolean[vtces];
//                 Stack<Pair>st = new Stack<>();
//                 st.push(new Pair(src,src + ""));
//                 while(st.size() > 0){
//                         Pair rem = st.pop();
//                         if(visited[rem.v] == true){
//                                 continue;
//                         }
//                         visited[rem.v] = true;
//                         System.out.println(rem.v + "@" + rem.psf);
//                         for(Edge e : graph[rem.v]){
//                                 if(visited[e.nbr] == false){
//                                         st.push(new Pair(e.nbr, rem.psf + e.nbr));
//                                 }
//                         }
//                 }
//         }
// }



