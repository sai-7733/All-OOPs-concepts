import java.util.*;
interface I1{
    void set(String pin);
}
interface I2{
    String get();
}
abstract class A{
    static Scanner sc=new Scanner(System.in);
    String m1(float a){
        System.out.println(a);
        return sc.next();
    }
    String m1(char a){
        System.out.println(a);
        return sc.next();
    }
}
class C extends A implements I1,I2{
    public String pin="0101";
    public void set(String pin){
        this.pin=pin;
    }
    public String get(){
        return pin;
    }
}
public class main extends C{
    public static void main(String args[]){
        C obj=new C();
        obj.set(sc.next());
        System.out.println(obj.get());
        System.out.println(obj.m1(sc.nextFloat()));
        System.out.println(obj.m1(sc.next().charAt(0)));
    }
}