public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
        Employee obj1 = new Employee("Robert", 1994, "64C - Wallstreet");
        Employee obj2 = new Employee("Sam", 2000, "68D - Wallstreet");
        Employee obj3 = new Employee("John", 1999, "26B - Wallstreet");

        System.out.println("Name    Year of Joining     Address");

        obj1.printinfo();
        obj2.printinfo();
        obj3.printinfo();
        
    }
}
