public class excep {
    public static void main(String[] args) {
        try {
            int arr[] = { 1, 2, 3, 4, };
            System.out.println(arr[10]);

        } catch (ArrayIndexOutOfBoundsException e) {
            // TODO: handle exception
            System.out.println(e);

        }
        System.out.println("rest of thec ode");
    }
}
