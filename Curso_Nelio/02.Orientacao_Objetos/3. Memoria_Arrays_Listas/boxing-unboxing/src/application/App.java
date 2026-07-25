package application;

public class App {
    public static void main(String[] args) {
        int x = 20;
        Object obj = x; 
        // boxing
        System.out.println(obj); // 20

        int y= (int) obj;
        // unboxing
        System.out.println(y); // 20


        
        int z = 20;
        Integer obj1 = z; 
        System.out.println(obj1); // 20

        int k= obj1;
        System.out.println(k); // 20


    }
}

