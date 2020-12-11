public class TestCourse {
    public static void main(String[] args) {

        Professor professor1 = new Professor("abc", "A", "Bc");
        Course oop = new Course ("EL4059", "OOP", professor1, 58);

        System.out.println(oop.getID());
        
    }
}