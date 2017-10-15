package learn_java;
public class And_or {
    public static void main(String[] args){
        int a = 15;
        int b = -23;
        
        if (a > 0 && b > 0){
            System.out.println("Both are positive");
        }
        else if (a > 0 || b > 0){
            System.out.println("One is positive");
        }
        else{
            System.out.println("Both are negative");
        }
    }
}
