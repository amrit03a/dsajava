package array;
import java.lang.reflect.Method;
import java.util.Scanner;
class Library {
    public void searchbook() {
        System.out.println("searching Book...");
    }
    public void issuebook() {
        System.out.println("issuing Book...");
    }
    public void submitbook() {
        System.out.println("submitting Book...");
    }
}
public class test{
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Library library = new Library();
        System.out.println("Enter method name:");
        String methodName = sc.nextLine();
        Method method = Library.class.getMethod(methodName);
        // Call method dynamically
        method.invoke(library);
    }
}