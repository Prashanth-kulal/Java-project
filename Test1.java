package hospital.management.system;
class Patient{
    String name;
    int age;
    public Patient(String n1,int a1){
        this.name=n1;
        this.age=a1;

    }
    public void display(){
        String message="Patient "+name+"aged "+age+"years got admitted today";
        System.out.println(message);
    }
}
public class Test1 {
    public static void main(String[] args) {
        System.out.println("hospital");
        Patient suresh=new Patient("Suresh Prabhu",69);
        suresh.display();

    }
}
