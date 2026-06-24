package lesson_42_streamapi;

import java.util.List;

public class Main {
    public static void main() {
        List<Student> students = List.of(
                new Student("Anna", 19, 4.8),
                new Student("Bohdan", 22, 3.7),
                new Student("Iryna", 21, 5.0),
                new Student("Oleh", 20, 4.2),
                new Student("Maria", 23, 3.9)
        );

        System.out.println("Students with grade less than 4.0:");
        System.out.println(StudentUtils.filterStudentsWithGradeLessThan4(students));

        System.out.println("Student with the highest grade:");
        System.out.println(StudentUtils.findStudentWithHighestGrade(students).orElse(null));

        System.out.println("Students older than 20:");
        System.out.println(StudentUtils.countStudentsOlderThan20(students));

        System.out.println("Names sorted by grade descending:");
        System.out.println(StudentUtils.getStudentNamesSortedByGradeDesc(students));

        System.out.println("Has student with grade 5.0:");
        System.out.println(StudentUtils.hasStudentWithGrade5(students));

        System.out.println("Names with grade greater than 4.0:");
        StudentUtils.printStudentNamesWithGradeGreaterThan4(students);
    }
}
