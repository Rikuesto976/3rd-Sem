class Student{
    String name, roll;
     
    public Student(String name, String roll){
        this.name=name;
        this.roll = roll;
    }

    public  String toString(){
        return name + " " + roll;
    }
}