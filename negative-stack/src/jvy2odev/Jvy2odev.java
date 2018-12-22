package jvy2odev;
import java.util.Scanner;

// 

public class Jvy2odev {         
        static int deger=4;
        private int top; 
        public final int MAX_SIZE = deger;       
        static int[] elements;     
        public Jvy2odev() { // Metod yaratan yapici islev -constructor-
            top = -1; 
            elements = new int[MAX_SIZE]; 
        }
        public boolean full() { 
        return (top == MAX_SIZE-1); 
                                } 
        public boolean empty() { 
        return (top == -1); 
                                } 
        public void push (int x){
        if (full()) throw new RuntimeException("Hata: Yigit dolu");
        ++top;
        elements[top]=x;
                                }
        public void pushnegative (int x){
        if (full()) throw new RuntimeException("Hata: Yigit dolu");
        ++top;              
        elements[top]=x;
        
                                        }
        static void show(){
            for(int i = 0 ; i < elements.length/2 ; i++)
        {
            int temp = elements[i];
            elements[i] = elements[elements.length-i-1];
            elements[elements.length-i-1]=temp;
        }
            for(int k:elements){
            System.out.print(k+"\t");
            }
                            }    
        static Scanner oku=new Scanner(System.in);
    public static void main(String[] args) {
        Jvy2odev s=new Jvy2odev(); //Yigit nesnesi yaratan islev
           
        while (true) {
             for (int i = 1; i <= deger; i++) {
            System.out.println(i+". Degeri Giriniz");
            int girilen=oku.nextInt();
                 if (girilen<0) {
                     System.out.println("Negatif deger girildiginden dolayi kuyruk sonlandiriliyor...");
                     s.pushnegative(girilen);
                     break;                 
                 }
                 else{
                 s.push(girilen);                                 
                 }                              }
             break;
        }       
          show();
    } 
}
