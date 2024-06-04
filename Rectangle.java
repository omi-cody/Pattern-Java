public class Rectangle {
    public Rectangle(){
        int n=5;
        for (int i = 1; i<=n; i++) {
            for (int j = 1; j <=n; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }

    }
    
public static void main(String []args){
    new Rectangle();
}
    
}