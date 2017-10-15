package learn_java;
public class Switch_case {
    public static void main(String[] args){
        int c =2;
        
        switch(c){
            case 0:
                System.out.println("Ugali");
                break;
            case 1:
                System.out.println("Rice");
                break;
            case 2:
                System.out.println("Mhogo");
                break;
            case 3:
                System.out.println("Chapati");
                break;
        }
        //if you do not break, it outputs all the choices from the selection and the ones below it
    }
    
}
