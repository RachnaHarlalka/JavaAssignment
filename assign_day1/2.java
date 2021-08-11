import java.util.Scanner;
class Student{
    
    String name;
    int roll;
    float marks;

    void input(){
        Scanner ob = new Scanner(System.in);
        System.out.print("Enter the name : ");
        name = ob.nextLine();
        System.out.print("Enter the Roll no. : ");
        roll = ob.nextInt();
        System.out.print("Enter the marks : ");
        marks = ob.nextFloat();

    }

     void display(){
            System.out.println("Name is : " + name);
            System.out.println("The roll no is " + roll);
            System.out.println("Marks : " + marks);
        }
}

class DriverClass{
    public static void main(String[] args){
        Student st = new Student();
        st.input();
        st.display();
    }
}

