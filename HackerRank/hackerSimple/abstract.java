import java.io.*;
import java.util.*;


abstract class Book{
    abstract void display();
}

class MyBook extends Book{
    String title;
    String author;
    int price;
    MyBook(String title,String author,int price){
        this.title = title;
        this.author = author;
        this.price = price;
    }
    void display(){
        System.out.println("Title: "+title+"\nAuthor: "+author+"\nPrice: "+price);
    }
}

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String t = sc.next();
        String a = sc.next();
        int price = sc.nextInt();
        Book b1 = new MyBook(t,a,price);
        b1.display();
    }
}
