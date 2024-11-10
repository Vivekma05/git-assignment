import java.util.*;
class student{
    String name,usn,phone,branch;
    void read(){
        Scanner s=new Scanner(System.in);
        System.out.println("enter the name");
        name=s.next();
        usn=s.next();
        phone=s.next();
        branch=s.next();

    }
    void display(){
        System.out.println(usn+name+phone+branch);
    }
}
public class lab02 {
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        System.out.println("number:");
        int n=s.nextInt();
        student[] v=new student[n];
        for(int i=0;i<n;i++){
            v[i]=new student();
        }
        for(int i=0;i<n;i++){
            v[i].read();
        }
        for(int i=0;i<n;i++){
            v[i].display();
        }

    }

}
