package learn_java;
class Bicycle {
    private String ownerName;
    
    public String salute = "hello";
    public void Bicycle( ){
        ownerName = "Unknown";
    }
    public String getOwnerName( ){
        return ownerName;
    }
    public void setOwnerName(String name){
        ownerName = name;
    }
    
}
