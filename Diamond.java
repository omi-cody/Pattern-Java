public class Diamond {
    public Diamond(){
        int n = 6;
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print("  ");
            }
            // System.out.println(" ");

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <i; j++) {
                System.out.print("* ");
            }

            System.out.println(" ");

        }
        for (int i = 2; i <=n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("  ");
            }
            // System.out.println(" ");

            for (int j = i; j <=n; j++) {
                System.out.print("* ");
            }
            for (int j = i; j <n; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");

        }
    }
    public static void main(String[] args) {
        new Diamond();
    }
}
