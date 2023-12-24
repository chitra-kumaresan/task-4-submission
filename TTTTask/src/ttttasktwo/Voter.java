package ttttasktwo;

public class Voter {
    public Integer voterId;
    public String name;
    public  Integer age;
    //Parameterized constructor
    public  Voter(Integer voterId,String name,Integer age){
        this.voterId=voterId;
        this.age=age;
        this.name=name;
    }
    //Method to run verify method#


    public void main() {
      CheckedException exe=new CheckedException();
      exe.verifyYourAge(age);

    }
    //User defined Class extends exception
    class CheckedException extends Exception{
        //Method to verif the age
        //i/p:24
        //o/p:
        //.....
        //i/p:16
        //o/p:verify your age

        public void verifyYourAge(int age) {
            try {
                if (age < 18) {
                    throw new CheckedException();
                }
            }catch (Exception e){
                System.out.println("Your age :" + age);
                System.out.println("Invalid Age for Voter");
            }
        }

    }
}
