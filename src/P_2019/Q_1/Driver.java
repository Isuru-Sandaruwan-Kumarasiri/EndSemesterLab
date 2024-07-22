package P_2019.Q_1;

public class Driver {
    public static void main(String[] args) {

         decimal_to_Binary(5);
    }
    public static void decimal_to_Binary(int number){
        Stack s=new Stack();
        while(number!=0){
            int b=number%2;
            s.push(b);
            number=number/2;
        }
        s.display();
    }
}
