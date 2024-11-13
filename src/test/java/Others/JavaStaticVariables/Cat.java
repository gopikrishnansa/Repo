package Others.JavaStaticVariables;

public class Cat {
    private static  int catCount = 0;
    String name = "gopi";
    int age;
    int livesRemaining;

    public void meow(){
        System.out.println("Meow");
    }
    public void Cat(){
        catCount++;
    }
    public static int getCatCount(){
        return catCount;
    }
}
