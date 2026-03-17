/*Write a function to give demostrate the functionality of 3D matrix in 1D matirx. Function prototye: void set (int value,int
 indexX,int indexY,int indexZ, int [] 1dArray); void get (int value,int indexX,int indexY,int indexZ, int [] 1dArray). */

 class DemonstrateMatrix{
    static int x = 3;
    static int y = 3;
    static int z = 3;
    void set(int value, int indexX, int indexY, int indexZ, int[] Array){
        Array[indexX*y*z + + indexY*z + z] = value;
    }

    void get(int value, int indexX, int indexY, int indexZ, int[] Array){
        System.out.println(Array[indexX*y*z + + indexY*z + z] = value);
    }
 }

 public class P1_DemonstrateMatrix {
    static int x = 3;
    static int y = 3;
    static int z = 3;
    public static void set(int value, int indexX, int indexY, int indexZ, int[] Array){
        Array[indexX*y*z + + indexY*z + z] = value;
    }

    public static void get(int value, int indexX, int indexY, int indexZ, int[] Array){
        System.out.println(Array[indexX*y*z + + indexY*z + z] = value);
    }

    public static void main(String[] args) {
        int[] arr = new int[x*y*z];
        set(5, 2,0,1,arr);
        set(7, 1,0,1,arr);
        set(15, 0,0,2,arr);

        get(5, 2,0,1,arr);
        get(7, 1,0,1,arr);
        get(15, 0,0,2,arr);

    }
}
