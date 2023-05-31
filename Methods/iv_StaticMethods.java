public class iv_StaticMethods {
    public static void main(String[] args) {
        iv_StaticMethods Sm =new iv_StaticMethods();
        int tot= Sm.add(2,3);
    }

    public static int add(int x, int y){
        int z= x+y;
        System.out.println(z);
        return z;
    }
}
