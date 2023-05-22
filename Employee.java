

public class Employee {
    String ename; 
    int eyear; 
    String eAddress; 

    public Employee(String name, int year, String Address){
        this.ename = name; 
        this.eyear = year;
        this.eAddress = Address; 
    }

    //print with alignment 
    void printinfo(){
                
        System.out.printf("%-7s", ename);
        System.out.printf("%10d", eyear);
        System.out.printf("%25s", eAddress);
        System.out.println(" ");
    }
    
    
}