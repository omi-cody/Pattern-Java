public class HollowDecTriangle {
    public HollowDecTriangle(){
        int n=6;
        for (int i = 1; i <=n; i++) {
            for (int j = i; j <=n; j++) {
                if (i==1 || j==n || j==i  ) {
                    System.out.print("* ");
                    
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println(" ");
        }
    }
    public static void main(String[] args) {
        new HollowDecTriangle();
    }
}

