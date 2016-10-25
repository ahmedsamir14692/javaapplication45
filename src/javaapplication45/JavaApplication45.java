
package javaapplication45;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class JavaApplication45 {

    
    public static void main(String[] args) {
        
        int c;
        int r= 9;
       r= r++;  // ++ meaningless is it assign to variable r
       System.out.println(r);
       c= r++;
       
        r= ++r;
      System.out.println(c);
      System.out.println(r);
      long t= 45;
      float e=t;
      double d = 3.5333333355;
      //e=d; error
      int v= 1324242424;
      short s= (short)v;
      System.out.println("the value of v is"+s+"what?!");
      v=(int)s;
      
       System.out.println("the value of v is"+v+"what?!");
      
      float cc = 3.5f;
      float bb= (float)3.5;
      float vv=bb+cc;
      System.out.println(vv);
//      long ff= bb+cc;
  long rr = (long)((float)535354L +bb);    
  
  float fff= 6L;
  //int yy= 4L;   error
  float hhh =6.98f;
  
  double gf= 7.9f;
  double trt= 10e45;    
  char yuu= '\u2122';
  System.out.println(yuu);
  System.out.println("ahmed samir(\u00AE)");
  int rrr=04444444447; 
  System.out.println(rrr);
  int et= 1000_33__444;
  String tre= " ahmed samir ";
  String yui= "samir";
  System.out.println(tre.indexOf(yui));
  System.out.println(tre.trim());
 System.out.println(+32);
 if(gf==7.9f)
 {}
 int io;
 if((io=7)==8) // asign then compare
 {}
 int x;
  x=(gf== 5)? 3:6;
  Integer ewe =87;
  Integer tytr= 342;
  ewe=tytr;
 int we =8;
 t=t;
 char qw=32324;
 int sd='a';
 char rt= (char)('y'+'u'+'e'+'r'+'w');
 System.out.println(rt);
// char weq=sd;
 int tgh=rt;
 short sho=234;
 short ssho=234;
 int sum=sho+ssho;
 int sssunm ='e'+'r'+'s'+'r'+'s'+'r'+'s'+'r'+'s'+'r'+'s'+'r'+'s';
 short sum2=(short) (sho+ssho);
 char fd= (char) (2323+3422322);
        System.out.println(fd);
        
        int dfd = 4234243;
        long dfdfd= 424242424;
        long m= dfd+dfdfd;
        System.out.println(m);
        char ty= 1+2;
         File newe = new File ("C:/Documents and Settings/ahmed samir/Desktop/ahmed565");
    newe.mkdirs();
    
    File mp3 = new File (newe,"mp3.mp3");
        try {
            mp3.createNewFile();
           File song = new File ("C:/Documents and Settings/ahmed samir/Desktop/Jannat_Aiza.Araab.2016_MloK6rb.CoM/Jannat_Aiza.Araab.2016_MloK6rb.CoM/Jannat_Akher.Ahzani.mp3"); 
           FileInputStream inp = new FileInputStream (song); 
           FileOutputStream out = new  FileOutputStream (mp3);
           byte[] bugdf = new byte [1024*1204] ;
           int read;
           while( (read=((inp.read(bugdf)))) >0 )
           {
               out.write(((bugdf)), 0, read);
           }
           
            
        } catch (IOException ex) {
           
        }
        
        if(true){
    System.out.println("ahmed");
        System.out.println("ahmed");}
        else  System.out.println("ahmed");
 
       switch(fd){
           
           
           
           
       }
        
        for (int i = 0; i < 100;i++) {
 //i++;
if(i%2==0)
    continue;
System.out.println(i);
            
        }
        for (int i = 0; i <= 12; i++) {
            for (int j = 0; j <=12; j++) {
                System.out.print("   "+i*j);
            }
            System.out.println("------------------------");
        }
        OuterLoop: for (int i = 0; i <= 12; i++) {
            for (int j = 0; j <=12; j++) {
                System.out.print("*");
            }
            System.out.println("@");
        }
//        int n =new Scanner(System.in).nextInt();
//        int count=0;
//        for (; n!= 1; ) {
//               
//            if(n%2==0)
//            {
//            n=n/2;    
//            }
//            else
//            {
//            n=(3*n+1);
//            System.out.println(n);
//            count++;
//            }}
            
            double verage;
            double counter=0;
           int summ=0;
             int y =new Scanner(System.in).nextInt();
             outerLoop:while(true)
            {
                
                
                if(y!=0)
                {
                    summ=y+summ;
                    counter++;
                     y =new Scanner(System.in).nextInt();
                }
                if(y==0)
                {
                    verage= summ/counter;
                    System.out.println(verage);
                    break ;
                }
                
               
            }
             String name= "ahmed";
             String last= "samira";
             boolean commen=false;
             bigLoop:  for (int i = 0; i < name.length(); i++) {
                 for (int j = 0; j <last.length(); j++) {
                     if(name.charAt(i)==last.charAt(j))
                     {
                         commen=true;
                         System.out.println("commen find");
                                 
                         break bigLoop;
                     }
                 }
        }
        for (char i = 'A'; i <= 'Z'; i++) {
            System.out.println(i);
            
        }
     char a = 'A';
     a= (char) (a+1);
        char b= 'h'+'b';     
        }
        
        
    }
    

