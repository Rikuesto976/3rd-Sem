class InvalidAgeException extends Exception{
    public InvalidAgeException(String msg)
    {
        super(msg);
        System.out.println("Age must be above 18 to vote. ");
    }
}