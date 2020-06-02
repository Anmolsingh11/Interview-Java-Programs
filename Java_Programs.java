/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_programs;
import java.util.*;
import java.util.HashMap;

/**
 *
 * @author Wolf
 */
public class Java_Programs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws Exception  {
        
        /*Factorial fact  = new Factorial ();
        fact.mainMethod(); */
        
        /*Palindrome pal = new Palindrome();
        pal.Mainmethod(); */
        
        /*Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Statement: ");
        String str = sc.nextLine();
        StringPalindrome stp = new StringPalindrome();
        stp.checkPalindrome(str); */
        
        /*practice pc = new practice();
        pc.practice(); */
        
        /*fibonacci f  = new fibonacci();
        f.MainMethod();*/
        
        /*PrimeNumber p = new PrimeNumber();
        p.Method();*/
        
        /*Armstrong_Number Arm= new Armstrong_Number();
        Arm.arm();*/
        /*Remove_Array rem = new Remove_Array();
        rem.main();*/
        
        /*Patterns pat = new Patterns ();
        pat.RevNumberTri();*/
        
        /*Rep_char_inString rep = new Rep_char_inString();
        rep.method();*/
        
        /*GCD gcd = new GCD();
        //gcd.method();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first number to find GCD:-");
        int number1 = scanner.nextInt();
        System.out.println("Please enter second number to find GCD:-");
        int number2 = scanner.nextInt();
      
        System.out.println("GCD of two numbers " + number1 +" and " 
                           + number2 +" is :" + gcd.Anothermethod(number1,number2));*/
        
       /* Sqroot sqr = new Sqroot();
        System.out.print("Enter any number:");
	Scanner scanner = new Scanner(System.in);
	int num = scanner.nextInt(); 
	scanner.close();

	System.out.println("Square root of "+ num+ " is: "+sqr.squareRoot(num));*/
       /* Reverse_array  rev = new Reverse_array();
        String[] names = {"John", "Jammy", "Luke"};
        System.out.println("original array: " + Arrays.toString(names) );
       
        // reversing array with three elements
        rev.Method(names);
        System.out.println("reversed array: " + Arrays.toString(names) );*/
        
        /*reverse_String rever = new reverse_String();
        rever.stringBuilder();*/ 
        /*LEap_Year l = new LEap_Year();
        l.method();*/
        
        /*Binary_Search bin = new Binary_Search();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total number of elements:-");
        int length = sc.nextInt();
        int[] input = new int[length];
        for (int i = 0; i < length; i++) {
            input[i] = sc.nextInt();
        }
        System.out.println("Please enter number to be searched in array(sorted order)");
                                    
        int key = sc.nextInt();
        int index = bin.performBinarySearch(input, key);
        
        if (index == -1) {
            System.out.printf("Sorry, %d is not found in array %n", key);
        } else {
            System.out.printf("%d is found in array at index %d %n", key,
                                                         index);    
        }*/
        
        
        /*revint num = new revint();
        num.method();*/
        
        /*StringAna str = new StringAna();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first String:-");
        String s = sc.nextLine();
        System.out.println("Enter the second String:-");
        String s1 = sc.nextLine();
        char str3 []= s.toCharArray();
        char sstr4[] = s1.toCharArray();
        if (str.areAnagram(str3, sstr4)) 
            System.out.println("The two strings are"
                               + " anagram of each other"); 
        else
            System.out.println("The two strings are not"
                               + " anagram of each other");*/
        
        /*FirstNonrepeatingcharinstring f = new FirstNonrepeatingcharinstring();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your String");
        String str = sc.nextLine();
        int index = f.firstNonRepeating(str); 
  
        System.out.println( 
            index == -1
                ? "Either all characters are repeating or string "
                      + "is empty"
                : "First non-repeating character of " +str+" is "
                      + str.charAt(index)); */
        
       
        

//creating LinkedList with 5 elements including head
     /* LinkedList linkedList = new LinkedList();
      LinkedList.Node head = linkedList.head();
      linkedList.add( new LinkedList.Node("1"));
      linkedList.add( new LinkedList.Node("2"));
      linkedList.add( new LinkedList.Node("3"));
      linkedList.add( new LinkedList.Node("4"));
   
      //finding middle element of LinkedList in single pass
      LinkedList.Node current = head;
      int length = 0;
      LinkedList.Node middle = head;
   
      while(current.next() != null){
          length++;
          if(length%2 ==0){
              middle = middle.next();
          }
          current = current.next();
      }
    
      if(length%2 == 1){
          middle = middle.next();
      }

      System.out.println("length of LinkedList: " + length);
      System.out.println("middle element of LinkedList : "+ middle);*/
      
      /*Binarytree bt = Binarytree.Create();
    // traversing binary tree in PreOrder without using recursion
    System.out.println("printing nodes of a binary tree in preOrder using recursion");
    bt.preOrderWithoutRecursion();
    System.out.println("\nprinting nodes of binary tree on InOrder using iteration");
    bt.inOrderWithoutRecursion();
    System.out.println("\nprinting nodes of binary tree on post order using iteration");
    bt.postOrderWithoutRecursion();*/
        
        
        /*int arr[] = {10, 7, 8, 9, 1, 5}; 
        int n = arr.length;  
        quicksort ob = new quicksort(); 
        ob.sort(arr, 0, n-1); 
        System.out.println("\nsorted array"); 
        ob.printArray(arr);*/
        
        /*insertionsort in = new insertionsort();
        int[] unsorted = { 32, 23, 45, 87, 92, 31, 19 };
    System.out.println("integer array before sorting : "
                          + Arrays.toString(unsorted));

    in.insertionSort(unsorted);

    System.out.println("integer array after sorting : "
                          + Arrays.toString(unsorted));*/
        
        /*bubblesort b = new bubblesort();
        b.bubbleSort(new int[] { 20, 12, 45, 19, 91, 55 });
        b.bubbleSort(new int[] { -1, 0, 1 });
        b.bubbleSort(new int[] { -3, -9, -2, -1 });*/
        
        /*Permutation p = new Permutation();
        p.permutation("GOD");*/
        
    /*    MatrixAddandSub m = new MatrixAddandSub();
        Scanner scnr = new Scanner(System.in);

    System.out.print("Please Enter number of rows: ");
    int rows = scnr.nextInt();

    System.out.print("Please Enter number of columns: ");
    int columns = scnr.nextInt();
    System.out.println();

    System.out.println("Please Enter first matrix");
    int[][] a = m.read(scnr, rows, columns);
    System.out.println();

    System.out.println("Please Enter second matrix");
    int[][] b = m.read(scnr, rows, columns);

    scnr.close();
    int[][] sum = m.add(a, b);

    // subtracting two matrices
    int[][] difference1 = m.subtract(a, b);
    int[][] difference2 = m.subtract(b, a);

    System.out.println("The sum of two matrices is: ");
    System.out.println("A + B =");
    m.printMatrix(sum);

    System.out.println("The differnece of two matrices is: ");
    System.out.println("A - B =");
    m.printMatrix(difference1);

    System.out.println("Subtraction of matrix in opposite order");
    System.out.println("B - A =");
    m.printMatrix(difference2);

    scnr.close(); */
        
    /*Stringspace s = new Stringspace();
    s.method();*/
        
        
     ReverseLinklist.Node head = new ReverseLinklist.Node(1);
    ReverseLinklist linkedlist = new ReverseLinklist(head);

    // adding node into singly linked list
    linkedlist.add(new ReverseLinklist.Node(2));
    linkedlist.add(new ReverseLinklist.Node(3));
    // printing a singly linked list
    linkedlist.print();

    // reversing the singly linked list
    linkedlist.reverse();

    // printing the singly linked list again
    linkedlist.print();
    
       
  }
}

class Factorial
{
    public void mainMethod()
    {
        int  fact = 1;
        Scanner sc = new Scanner(System.in);
        try{
         // the scanner class is in java.util package and it has a total of 12 overrided constructor
        System.out.println("Enter a number"); //here System is a java class in lang package while the out is the public member of the printstram class and pritnln iss thhe method in printstream class
        int a = sc.nextInt();
        for(int i = 1; i<= a ;i++)
        {
            fact  *=  i;
        }
        System.out.println(""+fact);
        }catch(Exception E)
        {
            System.out.println("Invalid Input");
        }
    }
}
class Palindrome
{
    public void Mainmethod()
    {
        int remainder, result = 0, n,temp;
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter A Number:-");
        n = sc.nextInt();
        temp = n;
        while(n>0)
        {    
   remainder =n%10;    
   result=(result*10)+remainder;    
   n=n/10;    
  }    
  if(temp==result)    
   System.out.println( temp + " is a palindrome number ");    
  else    
   System.out.println(temp + " is not a palindrome");   
    }
}
class StringPalindrome
{
    
       void checkPalindrome(String input) {
//Assuming result to be true
boolean res = true;
int length = input.length();
//dividing the length of the string by 2 and comparing it.
for(int i=0; i<= length/2; i++) {
if(input.charAt(i) != input.charAt(length-i-1)) {
res = false;
break;
}
}
System.out.println(input + " is palindrome ?="+res );
}

}
class practice
{
    public void practice ()
    {
        int n;
        int temp = n = 6;
        int sum = 0;
        for(int i =1 ;i<=n;i++)
        {
            if(temp % i==0)
            {
                sum += i;
            }
        }
        
        System.out.println(sum);
    }
    }
class fibonacci
{
    public void MainMethod()
    {
        int t1 = 0, t2 = 1,temp,fabo;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an input:-" );
        int n = sc.nextInt();
        System.out.println(t1);
        for(int i =0;i<n;i++)
        {
            fabo = t1 + t2;
            t1=t2;
            t2 = fabo;
            System.out.println(t1);
        }
    }
}

class PrimeNumber 
{
    public void  Method()
    {
        System.out.println("Enter a Number:-");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int remp = n;
        int flag = 0 ;
           for (int i = 2; i <= n / 2; ++i) {

        // condition for non-prime
        if (n % i == 0) {
            flag = 1;
            break;
        }
    }

    if (n == 1) {
        System.out.print("1 is neither prime nor composite.");
    }
    else {
        if (flag == 0)
            System.out.print(" a prime number.");
        else
            System.out.print(" not a prime number.");
    }
        
        
    }
}
class Armstrong_Number
{
    public void arm()
    {
        Scanner sc  = new Scanner(System.in);
        int result= 0,reminder;
        System.out.println("Enter a three Digit Number");
        int a = sc.nextInt();
        
        int temmp = a;
        while(a != 0)
        {
            reminder = a %10;
            result += Math.pow(reminder, 3);
            a= a/10;
        }
        if(result == temmp)
        {
            System.out.println("Armstrong");
        }else
        {
            System.out.println("Not Armstrong");
        }
    }
}
class reverse_String
{
    Scanner sc = new Scanner(System.in);
    public void stringREv()
    {
        System.out.println("Enter a String");
        String s = sc.nextLine();
        byte [] strAsByteArray = s.getBytes(); 
        byte [] result = new byte [strAsByteArray.length]; 
        for(int i=0;i<strAsByteArray.length;i++)
        {
             result[i] =  
             strAsByteArray[strAsByteArray.length-i-1]; 
        }
    }
    public void stringBuilder()
    {
        System.out.print("Enter String:-");
        String input = sc.nextLine();
         StringBuilder input1 = new StringBuilder(); 
  
        // append a string into StringBuilder input1 
        input1.append(input); 
  
        // reverse StringBuilder input1 
        input1 = input1.reverse(); 
  
        // print reversed String 
        System.out.println(input1); 
    }
    public void usingarray()
    {
       System.out.print("Enter String:-");
       String input =  sc.nextLine();
        char[] try1 = input.toCharArray(); 
  
        for (int i = try1.length-1; i>=0; i--) 
            System.out.print(try1[i]); 
    }
}

class Remove_Array
{
    public void main()
    {
        List<Integer> primes = new ArrayList<Integer>();
        primes.add(2);
        primes.add(3);
        primes.add(5);
        primes.add(7);  //duplicate
        primes.add(7);
        primes.add(11);
        
        System.out.println("list of prime numbers : " + primes);
        
        //declaring a lnkedHashSet for prime without duplicates
        Set<Integer> primesWithoutDuplicates = new LinkedHashSet<Integer>(primes);
        
        //emtying the first list
        primes.clear();
        //adding the elements 
         primes.addAll(primesWithoutDuplicates);
        
        System.out.println("list of primes without duplicates : " + primes);
    }
}

class Patterns
{
    public void triangle()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of lines for pyramid:-");
        int n = sc.nextInt();
        if(n >= 10)
        {
            System.out.println("Too many Lines,Try Again");
            triangle();
        }else{
        for(int i =0 ;i<n;i++)
        {
            for(int j=0; j<=i; j++) 
            { 
                // printing stars 
                System.out.print("* "); 
            } 
            System.out.println();
        }
        }
    }
    public void RevTriangle()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of lines for pyramid:-");
        int n = sc.nextInt();
        if(n >= 10)
        {
            System.out.println("Too many Lines,Try Again");
            RevTriangle();
        }else{
        for(int i =0;i<n;i++)
        {
            for(int j=2*(n-i); j>=0; j--) 
            { 
                // printing spaces 
                System.out.print(" "); 
            } 
             
            //  inner loop to handle number of columns 
            //  values changing acc. to outer loop 
            for(int j=0; j<=i; j++) 
            { 
                // printing stars 
                System.out.print("* "); 
            }  
            System.out.println();
        }
        }
    }
    public void full_triangle()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of lines for pyramid:-");
        int n = sc.nextInt();
        if(n >= 10)
        {
            System.out.println("Too many Lines,Try Again");
            full_triangle();
        }else
        {
            for(int i=0;i<n;i++)
            {
                for (int j=n-i; j>1; j--) 
            { 
                // printing spaces 
                System.out.print(" "); 
            } 
   
            //  inner loop to handle number of columns 
            //  values changing acc. to outer loop 
            for (int j=0; j<=i; j++ ) 
            { 
                // printing stars 
                System.out.print("* "); 
            }
            System.out.println(" ");
            }
        }
    }
    public void NumberTri()
    {
        int num = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of lines for pyramid:-");
        int n = sc.nextInt();
        if(n >= 10)
        {
            System.out.println("Too many Lines,Try Again");
            NumberTri();
        }else
        {
            for(int i =0;i<n;i++)
            {
                num=1;
             for(int j=0; j<=i; j++) 
            { 
                // printing num with a space  
                System.out.print(num+ " "); 
  
                //incrementing value of num 
                num++; 
            }
             System.out.println(); 
            }
        }
    }
    public void RevNumberTri()
    {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of lines for pyramid:-");
        int n = sc.nextInt();
        if(n >= 10)
        {
            System.out.println("Too many Lines,Try Again");
            RevNumberTri();
        }else
        {
            for(int i =0;i<n;i++)
        {
            num =1;
            for(int j=2*(n-i); j>=0; j--) 
            { 
                // printing spaces 
                System.out.print(" "); 
            } 
             
            //  inner loop to handle number of columns 
            //  values changing acc. to outer loop 
            for(int j=0; j<=i; j++) 
            { 
                // printing stars 
                System.out.print(num+" ");
                num++;
            }  
            System.out.println();
        }
        }
    }
}

class Rep_char_inString
{
   public void method()
   {
       Scanner sc= new Scanner(System.in);
       System.out.println("Enter a String");
       String str = sc.nextLine();
       Map<Character, Integer> baseMap = new HashMap<Character, Integer>();  
        char[] charArray = str.toCharArray();  
        for (Character ch : charArray) {  
            if (baseMap.containsKey(ch)) {  
                baseMap.put(ch, baseMap.get(ch) + 1);  
            } else {  
                baseMap.put(ch, 1);  
            }  
        }  
        Set<Character> keys = baseMap.keySet();  
        for (Character ch : keys) {  
            if (baseMap.get(ch) > 1) {  
                System.out.println(ch + "  is " + baseMap.get(ch) + " times");  
            }  
        }  
   }
}
class GCD
{
    public void method()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two integers:-");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int gcd=0;
        int c = (a>b)?a:b;
        for(int i =1;i<=c;i++)
        {
          if(a%i==0 & b%i==0)
          {
              gcd = i;
          }
        }
        System.out.println("The Greatest Common divisor of "+a+" and "+b+" is:-"+gcd);
    }
    public int Anothermethod(int number1,int number2)
    {
        if(number2 == 0){
            return number1;
        }
        return Anothermethod(number2, number1%number2);
    }
    
}
class Sqroot
{
    public  double squareRoot(int number) {
	double temp;

	double sr = number / 2;

	do {
		temp = sr;
		sr = (temp + (number / temp)) / 2;
	} while ((temp - sr) != 0);

	return sr;
    }
    
}
class Reverse_array
{
    public  void Method(String[] array)
    {
        if (array == null || array.length < 2) {
            return;
        }
        for (int i = 0; i < array.length / 2; i++) {
            String temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
    }
}
class LEap_Year
{
    public void method()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Year");
        int Year = sc.nextInt();
        if(Year% 4 ==0)
        {
            if(Year %100 ==0)
            {
                if(Year %400 ==0)
                {
                    System.out.println(Year+ " is  a leap year");
                }else
                {
                    System.out.println(Year+ " is  not a leap year");
                }
            }else
            {
                System.out.println(Year+ " is  a leap year");
            }
        }else
        {
            System.out.println(Year+ " is  not a leap year");
        }
            
    }
}
class Binary_Search
{
    public int performBinarySearch(int[]input,int number)
    {
       int low =0;
       int high = input.length - 1;
       while(high >= low)
       {
           int middle = (low + high ) /2;
           if (input[middle] == number)
           {
               return middle;
               
           }else if(input[middle] < number)
           {
               low = middle +1;
           }else if(input[middle] > number)
           {
               high = middle -1;
           }
       }
       return -1;
    }
}
class revint
{
    public void method()
    {
        int n = 12;
        int temp = n;
        int reminder ;
        int result =0 ;
        while(n != 0)
        {
         reminder =n%10;    
   result=(result*10)+reminder;    
   n=n/10; 
        }
        System.out.println(result);
    }
}
class StringAna
{
     boolean areAnagram(char[] str1, char[] str2) 
    { 
        // Get lenghts of both strings 
        int n1 = str1.length; 
        int n2 = str2.length; 
  
        // If length of both strings is not same, 
        // then they cannot be anagram 
        if (n1 != n2) 
            return false; 
  
        // Sort both strings 
        Arrays.sort(str1); 
        Arrays.sort(str2); 
  
        // Compare sorted strings 
        for (int i = 0; i < n1; i++) 
            if (str1[i] != str2[i]) 
                return false; 
  
        return true; 
    } 
}
class FirstNonrepeatingcharinstring
{
    static final int NO_OF_CHARS = 256; 
     char count[] = new char[NO_OF_CHARS]; 
     void getCharCountArray(String str) 
    { 
        for (int i = 0; i < str.length(); i++) 
            count[str.charAt(i)]++; 
    } 
  
    
     int firstNonRepeating(String str) 
    { 
        getCharCountArray(str); 
        int index = -1, i; 
  
        for (i = 0; i < str.length(); i++) { 
            if (count[str.charAt(i)] == 1) { 
                index = i; 
                break; 
            } 
        } 
  
        return index; 
    } 
}
class LinkedList{
    private Node head;
    private Node tail;
 
    public LinkedList(){
        this.head = new Node("head");
        tail = head;
    }
 
    public Node head(){
        return head;
    }
 
    public void add(Node node){
        tail.next = node;
        tail = node;
    }
 
    public  class Node{
        private Node next;
        private String data;

        public Node(String data){
            this.data = data;
        }
     
        public String data() {
            return data;
        }

        public void setData(String data) {
            this.data = data;
        }

        public Node next() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }   
        @Override
        public String toString(){
            return this.data;
        }   }}
class Binarytree {
   class TreeNode {
    String data;
    TreeNode left, right;
    TreeNode(String value) {
      this.data = value;
      left = right = null;
    }
    boolean isLeaf() {
      return left == null ? right == null : false;
    } }
  // root of binary tree
  TreeNode root;
  /**
   * Java method to visit tree nodes in PreOrder traversal without recursion.
   */
  public void inOrderWithoutRecursion() {
        Stack<TreeNode> nodes = new Stack<>();
        TreeNode current = root;

        while (!nodes.isEmpty() || current != null) {

            if (current != null) {
                nodes.push(current);
                current = current.left;
            } else {
                TreeNode node = nodes.pop();
                System.out.printf("%s ", node.data);
                current = node.right;
            }

        }
    }
  public void preOrderWithoutRecursion() {
    Stack<TreeNode> nodes = new Stack<>();
    nodes.push(root);

    while (!nodes.isEmpty()) {
      TreeNode current = nodes.pop();
      System.out.printf("%s ", current.data);

      if (current.right != null) {
        nodes.push(current.right);
      }
      if (current.left != null) {
        nodes.push(current.left);
      }
    }
  }
  /**
   * Java method to create binary tree with test data
   * 
   * @return a sample binary tree for testing
   */
  public  Binarytree create() {
    Binarytree tree = new Binarytree();
    TreeNode root = new TreeNode("a");
    tree.root = root;
    tree.root.left = new TreeNode("b");
    tree.root.left.left = new TreeNode("c");

    tree.root.left.right = new TreeNode("d");
    tree.root.right = new TreeNode("e");
    tree.root.right.right = new TreeNode("f");

    return tree;
  }
  public  Binarytree Create() {
        Binarytree tree = new Binarytree();
        TreeNode root = new TreeNode("40");
        tree.root = root;
        tree.root.left = new TreeNode("20");
        tree.root.left.left = new TreeNode("10");
        tree.root.left.left.left = new TreeNode("5");

        tree.root.left.right = new TreeNode("30");
        tree.root.right = new TreeNode("50");
        tree.root.right.right = new TreeNode("60");
        tree.root.right.right.left = new TreeNode("67");
        tree.root.right.right.right = new TreeNode("78");

        return tree;
    }
  public void postOrderWithoutRecursion() {
    Stack<TreeNode> nodes = new Stack<>();
    nodes.push(root);

    while (!nodes.isEmpty()) {
      TreeNode current = nodes.peek();

      if (current.isLeaf()) {
        TreeNode node = nodes.pop();
        System.out.printf("%s ", node.data);
      } else {

        if (current.right != null) {
          nodes.push(current.right);
          current.right = null;
        }

        if (current.left != null) {
          nodes.push(current.left);
          current.left = null;
        }
      }

    }
  }
}
class quicksort
{
  
   int partition(int arr[], int low, int high) 
    { 
        int pivot = arr[high];  
        int i = (low-1); // index of smaller element 
        for (int j=low; j<high; j++) 
        { 
            // If current element is smaller than the pivot 
            if (arr[j] < pivot) 
            { 
                i++; 
  
                // swap arr[i] and arr[j] 
                int temp = arr[i]; 
                arr[i] = arr[j]; 
                arr[j] = temp; 
            } 
        } 
  
        // swap arr[i+1] and arr[high] (or pivot) 
        int temp = arr[i+1]; 
        arr[i+1] = arr[high]; 
        arr[high] = temp; 
  
        return i+1; 
    } 
  
  
    /* The main function that implements QuickSort() 
      arr[] --> Array to be sorted, 
      low  --> Starting index, 
      high  --> Ending index */
    void sort(int arr[], int low, int high) 
    { 
        if (low < high) 
        { 
            /* pi is partitioning index, arr[pi] is  
              now at right place */
            int pi = partition(arr, low, high); 
  
            // Recursively sort elements before 
            // partition and after partition 
            sort(arr, low, pi-1); 
            sort(arr, pi+1, high); 
        } 
    } 
  
    /* A utility function to print array of size n */
    void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i]+" "); 
        System.out.println(); 
    } 
    
}

class insertionsort{
     public  void insertionSort(int[] unsorted) {
    for (int i = 1; i < unsorted.length; i++) {
      int current = unsorted[i];
      int j = i;

      // create right place by moving elements
      while (j > 0 && unsorted[j - 1] > current) {

        // move
        unsorted[j] = unsorted[j - 1];
        j--;
      }

      // found the right place, insert now
      unsorted[j] = current;
    }
  }
    
}
class bubblesort{
    public  void bubbleSort(int[] numbers) {
        System.out.printf("Unsorted array in Java :%s %n", Arrays.toString(numbers));

        for (int i = 0; i < numbers.length; i++) {
            for (int j = numbers.length -1; j > i; j--) {
                if (numbers[j] < numbers[j - 1]) {
                    swap(numbers, j, j-1);
                }
            }
        }

        System.out.printf("Sorted Array using Bubble sort algorithm :%s %n",
                Arrays.toString(numbers));
    }
    
    /*
     * Utility method to swap two numbers in array
     */
    public  void swap(int[] array, int from, int to){
        int temp = array[from];
        array[from] = array[to];
        array[to] = temp;
    }
}

class Permutation
{
    public  void permutation(String input){
          permutation("", input);
   }
    private  void permutation(String perm, String word) {
        if (word.isEmpty()) {
            System.err.println(perm + word);

        } else {
            for (int i = 0; i<word.length(); i++) {
                permutation(perm + word.charAt(i), word.substring(0, i) 
                                        + word.substring(i + 1, word.length()));
            }
        }

    }
}

class MatrixAddandSub {
 public  int[][] read(Scanner s, int rows, int columns) {
    int[][] result = new int[rows][columns];;
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < columns; j++) {
        System.out.println("Enter value of [" + (i+1) + "][" + (j+1) +"]");
        result[i][j] = s.nextInt();
      }
    }
    return result;
  }
  public  int[][] add(int[][] a, int[][] b) {
    int rows = a.length;
    int columns = a[0].length;
    int[][] result = new int[rows][columns];
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < columns; j++) {
        result[i][j] = a[i][j] + b[i][j];
      }
    }
    return result;
  }
  public  int[][] subtract(int[][] a, int[][] b) {
    int rows = a.length;
    int columns = a[0].length;
    int[][] result = new int[rows][columns];
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < columns; j++) {
        result[i][j] = a[i][j] - b[i][j];
      }
    }
    return result;
  }
  public  void printMatrix(int[][] matrix) {
    int rows = matrix.length;
    int columns = matrix[0].length;
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < columns; j++) {
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
    }
  }
}
class Stringspace{
    public void method()
    {
        //removing white space from String from beginning and end in Java      
        String strWhiteSpace = "    This String contains White Space at beginning and end and middle    ";
        System.out.printf("String before removing White space : %n %s %n", strWhiteSpace);
        System.out.printf("length of String before removing white space %d : ", strWhiteSpace.length());
     
        //trim() method can remove white space from beginning and end of String in Java
        String strWithoutWhiteSpace = strWhiteSpace.trim();
        System.out.printf("String after removing white space from beginning and end %n %s %n", strWithoutWhiteSpace);
        System.out.printf("length of String after removing white space from beginning and end %d : ", strWithoutWhiteSpace.length());

 
     
        //removing white space between String in Java
        String white_space = "ABC DEF GHI";
        System.out.println("String with white space between words: " + white_space);
     
        // \s is regular expression for white space tab etc
        String withoutspace = white_space.replaceAll("\\s", "");
        System.out.println("String after removing white space between words and everywhere: " + withoutspace);      
     
    }
}
class ReverseLinklist{
   static class Node {

    private int data;
    private Node next;

    public Node(int data) {
      this.data = data;
    }

    public int data() {
      return data;
    }

    public Node next() {
      return next;
    }
  }
    private Node head;

  public ReverseLinklist(Node head) {
    this.head = head;
  }

  /**
   * Java method to add an element to linked list
   * @param node
   */
  public void add(Node node) {
    Node current = head;
    while (current != null) {
      if (current.next == null) {
        current.next = node;
        break;
      }
      current = current.next;
    }
  }
  public void print() {
    Node node = head;
    while (node != null) {
      System.out.print(node.data() + " ");
      node = node.next();
    }
    System.out.println("");
  }

  /**
   * Java method to reverse a linked list without recursion
   */
  public void reverse() {
    Node pointer = head;
    Node previous = null, current = null;

    while (pointer != null) {
      current = pointer;
      pointer = pointer.next;

      // reverse the link
      current.next = previous;
      previous = current;
      head = current;
    }

  }
}








