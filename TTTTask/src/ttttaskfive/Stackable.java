package ttttaskfive;

public class Stackable{
    //Main method to push ,pop,and show datas in stack
    public static void main(String[] args) {
        Stacking s=new Stacking();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.push(60);


        System.out.println( "Popped data :" + s.pop());


        s.show();


    }
}
