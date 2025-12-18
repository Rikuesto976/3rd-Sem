public class Voting {
    String name;
    int age;

    public Voting(String name, int age) throws InvalidAgeException {
         if (age < 18) throw new InvalidAgeException("");
        this.name = name;
        this.age = age;
    }

    public Voting(int age) throws InvalidAgeException {
        this("Unknown", age);
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }

    public static void main(String[] args) {
        try {
            Voting v = new Voting("Anurodh", 8);
            System.out.println(v);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
