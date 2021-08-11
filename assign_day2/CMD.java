import java.util.Scanner;
class Test {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("First value : " + args[0]);
    
        System.out.println("Second value : " + args[1]);

        int x = Integer.parseInt(args[0]); //first arguments   
        int y = Integer.parseInt(args[1]); //second arguments  
        int sum = x + y;  
        
        System.out.print("Sum : " + sum);


    }

}