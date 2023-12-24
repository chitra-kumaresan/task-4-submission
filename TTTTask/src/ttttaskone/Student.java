package ttttaskone;

public class Student {

        public Integer rollNo;
        public String name;
        public Integer age;
        public Character c;

        public String course;
        //  parameterised constructor
        public Student(Integer rollNo,String name,String course,Integer age){
            this.rollNo=rollNo;
            this.name=name;
            this.course=course;
            this.age=age;

        }
        //  Method to check the exceptions in Student class
        public void exceptionChecker() {
            AgeNotWithinRangeException exception=new AgeNotWithinRangeException();
            exception.verifyYourAge(age);
            NameNotValidException notValidException=new NameNotValidException();
            notValidException.verifyYourName(name);

        }
        class AgeNotWithinRangeException extends Exception {
            //Input: if age=24
            //Output: ageNotWithinRange exception
            public void verifyYourAge(int age) {

                try {
                    if (age<=15 || age>=21){
                        System.out.println("AgeNotWithinRangeException occured");
                        System.out.println("your age is : "+age);
                        throw new AgeNotWithinRangeException();

                    }
                } catch (Exception e){
                    System.out.println("Please check your age?");
                }
            }
        }
        class NameNotValidException extends Exception{
            //Input:if name is chi@@a
            //Output:Namenotvalid exception
            public void verifyYourName(String name){
                try{
                    for (int i = 0; i <name.length() ; i++) {
                        char c = name.charAt(i);
                        Boolean d = Character.isDigit(c);
                        Boolean e=Character.isWhitespace(c);
                        if (d== true ||e==true){
                        }
                    }
                    System.out.println("NameNotValidException occured");
                    throw new NameNotValidException();
                }catch(Exception e){
                    System.out.println("Your name is :"+ name);
                    System.out.println("Please Check your name?");
                }

            }

        }
    }
