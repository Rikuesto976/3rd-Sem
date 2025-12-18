public class Teacher extends Employee {
    int numClass;

    public Teacher(String name, String id, int m, int n){
        super(name, id, m);
        this.numClass=n;
    }

    public int getYearly(){
        return super.getYearly() + numClass*1000;
    }

    public String getDetails(){
        return super.getDetails() + " " + numClass;
    }
}
