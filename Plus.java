public class Plus {
    public Plus(){
        int n=5;
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n; j++) {
                if (j==((n/2)+1) || i==((n/2)+1)) {
                    System.out.print("* ");
                    
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println(" ");
            
        }

    }
    public static void main(String[] args) {
        new Plus();
    }
}
