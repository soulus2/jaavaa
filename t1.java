//1

public class main {
 
    public static void main(String []args) {
        for (int i=10;i<100;i++){
            for (int j = 10; j < 100; j++) {
                if ((i*100+j)%(i*j)==0) {
                    System.out.println(i+", "+j);
                }
            }
        }
    }
 }
