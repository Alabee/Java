public class Bct_Students {
    String name;
    String reg_no;
    int age;
    
    public Bct_Students(){
        
    }
    
    public void get_details(String s_name, String s_reg, int s_age){
       name = s_name;
       age = s_age;
       reg_no = s_reg;
    }
    
    public void display(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Registration" + reg_no);
    }
    
    public static void main(String []args){
        Bct_Students ian = new Bct_Students();
        ian.get_details("Mutevu Ian", "CT202/0027/16", 19);
        ian.display();
        
        
        
    }
    
}
