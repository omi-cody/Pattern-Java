public class HollowIncTriangle {
    public HollowIncTriangle(){
        int n=6;
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i; j++) {
                if (i==n || j==1 || j==i) {
                    System.out.print("* ");  
                }else{
                    System.out.print("  ");  
                }
                   
            }
            System.out.println(" ");
             
        }
    }
    public static void main(String[] args) {
        new HollowIncTriangle();
    }
}
