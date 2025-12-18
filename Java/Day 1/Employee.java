public class Employee {
    String name, id;
    int mSal;
    
    public Employee(String name, String id, int mSal){
        this.name=name;
        this.id=id;
        this.mSal=mSal;
    }

    public int getYearly(){
        return mSal*12;
    }

    public String getDetails()
    {
        return name + " "+ id +" "+mSal;
    }
}