package variable;

public class ClassStart4 {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "park";
        student1.age = 17;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "정";
        student2.age = 19;
        student2.grade = 80;

        Student[] students = {student1,student2};
        students[0] =student1;
        students[1] =student2;

        System.out.println(students[0].name);
        System.out.println(students[0]);
        System.out.println(student1);

        System.out.println(student1.name);
        System.out.println(student2.age+"dd: "+student2.grade);

        for(int i=0; i<students.length; i++){
            Student s = students[i];
            System.out.println("이름: "+s.name);
        }

        for(Student s: students){
            System.out.println("name: "+s.name);
        }

    }
}
