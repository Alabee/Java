package learn_java;
public class BicycleRegistration {
    public static void main(String[] args){
        Bicycle bike1, bike2;
        String owner1, owner2;
        
        bike1 = new Bicycle( );
        bike1.setOwnerName("Adam SMith");
        
        bike2 = new Bicycle( );
        bike2.setOwnerName("Ben Jones");
        
        owner1 = bike1.getOwnerName();
        owner2 = bike1.getOwnerName();
        
        System.out.println(bike1.salute);
        System.out.println(owner1 + " owns a bicycle");
        System.out.println(owner2 + " owns a bicycle too");
       
    }
}
