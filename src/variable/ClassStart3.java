package variable;

public class ClassStart3 {
    public static void main(String[] args) {
        Student student1 = new Student();
        initStudent(student1, "kim", 12,90);
        Student student2 = new Student();
        initStudent(student2, "jung", 15, 80);

        print(student1);
        print(student2);
    }
    static void initStudent(Student s, String name, int age, int grade){
        s.name = name;
        s.age = age;
        s.grade = grade;
    }
    static void print(Student student){
        System.out.println("이름: " + student.name + " 나이: " + student.age + " 성적: " + student.grade);
    }
}
