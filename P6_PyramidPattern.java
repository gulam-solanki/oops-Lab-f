public class P6_PyramidPattern {
    public static void pyramid(int n){
        int space = n;
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=space;j++){
                System.out.print("\t");
            }
            int power = (int) Math.pow(2,i-1);
            for(int k = 1; k<=power; k = k*2){
                System.out.print(k+"\t");
            }
            power = power/2;
            for(int l = power; l>=1; l = l/2){
                System.out.print(l+"\t");
            }
            System.out.println();
        space--;

        }
    }
    public static void main(String[] args) {
        pyramid(8);
    }
}
