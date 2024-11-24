package Others.StringBuilder;
import java.lang.*;
import java.sql.SQLOutput;

public class StringBuilder {

    public static class Con {
        public static String myName = "sasi";
        public void printName(String name) {
            name = name + " krishnan";
            System.out.println(name);
        }

    }

    public static class Blah{
        public static void justPrint(){
            System.out.println(Con.myName);
        }
    }

    public static void main(String[] args) {
        Con ob = new Con();
        ob.printName("gopi");
        //Blah trst = new Blah();
        Blah.justPrint();


    }
}

