public class student {
    int id;
    String name;

    void insertrecord(int i, String n) {
        id = i;
        name = n;

    }

    void displayinfo() {
        System.out.println(id + name);

    }

    /**
     * Innerstudent
     */
    public class Innerstudent {
        public static void main(String[] args) {
            student s1 = new student();
            student s2 = new student();
            s1.insertrecord(111, "koushik");
            s2.insertrecord(1222, "sumuk");
            s1.displayinfo();
            s2.displayinfo();
        }

    }
}
