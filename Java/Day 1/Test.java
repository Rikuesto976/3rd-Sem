public class Test {
    public static void main(String [] args){
        Teacher t = new Teacher("Anu", "01", 4500, 6);

        Employee e = new Employee("Ak", "02", 5000);

        System.out.print(t.getDetails());

        System.out.print(e.getDetails());
    }
}