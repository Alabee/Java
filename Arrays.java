package learn_java;
public class Arrays {
    public static void main(String[] args){
        int[] array = {19, 21, 36, 42, 54};
        for(int i = 0; i < 5; i++){
            System.out.println(array[i]);
        }
        
        //enhanced for loop
        for(int temp : array){
            System.out.println(temp);
        }
        //Declaring empty array
        int[] x = new int[5];
    }
    
}
