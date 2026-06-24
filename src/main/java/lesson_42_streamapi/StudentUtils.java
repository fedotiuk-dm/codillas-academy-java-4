package lesson_42_streamapi;

import lombok.experimental.UtilityClass;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;


@UtilityClass
public class StudentUtils {

    public static List<Student> filterStudentsWithGradeLessThan4(Collection<Student> students) {
        return students.stream()
                .filter(student -> student.grade() < 4.0)
                .toList();
    }

    public static Optional<Student> findStudentWithHighestGrade(Collection<Student> students) {
        return students.stream()
                .max(Comparator.comparingDouble(Student::grade));
    }

    public static long countStudentsOlderThan20(Collection<Student> students) {
        return students.stream()
                .filter(student -> student.age() > 20)
                .count();
    }

    public static List<String> getStudentNamesSortedByGradeDesc(Collection<Student> students) {
        return students.stream()
                .sorted(Comparator.comparingDouble(Student::grade).reversed())
                .map(Student::name)
                .toList();
    }

    public static boolean hasStudentWithGrade5(Collection<Student> students) {
        return students.stream()
                .anyMatch(student -> student.grade() == 5.0);
    }

    public static List<String> getStudentNamesWithGradeGreaterThan4(Collection<Student> students) {
        return students.stream()
                .filter(student -> student.grade() > 4.0)
                .map(Student::name)
                .toList();
    }

    public static void printStudentNamesWithGradeGreaterThan4(Collection<Student> students) {
        getStudentNamesWithGradeGreaterThan4(students).forEach(System.out::println);
    }
}
