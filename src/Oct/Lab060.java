package Oct;

public class Lab060 {
    public static void main(String[] args) {
        int a=10, b=20, c=30;
        int largest=a > b ? a : b > c ? b : c;
        System.out.println("Largest of the 3 nos is:" +largest);
    }
}
