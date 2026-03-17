package mytools;

public class calc {
    public static int sum(int a, int b){
        return a+b;
    }
    public static int difference(int a, int b){
        return a-b;
    }
    public static int product(int a, int b){
        return a*b;
    }
    public static float quotiont(float a, float b){
        if(b==0){
            return 0;
        }
        return a/b;
    }
}
