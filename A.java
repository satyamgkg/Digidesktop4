// Access specifier

class A  
{  
private void display()  
 {  
     System.out.println("Try to access the private method outside the class ");  
 }  
       
}  
public class PrivateExample2 {  
public static void main(String[] args) {  
    A a=new A();  
   a.display();  
      
}  
}  