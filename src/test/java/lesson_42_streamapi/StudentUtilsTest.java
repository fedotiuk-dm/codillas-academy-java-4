package lesson_42_streamapi;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import java.util.Optional;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("StudentUtils")
class StudentUtilsTest {

    private final List<Student> students = List.of(
            new Student("Anna", 19, 4.8),
            new Student("Bohdan", 22, 3.7),
            new Student("Iryna", 21, 5.0),
            new Student("Oleh", 20, 4.2),
            new Student("Maria", 23, 3.9)
    );

    @Test
    @DisplayName("should filter students with grade less than 4")
    void shouldFilterStudentsWithGradeLessThan4() {
        List<Student> filteredStudents = StudentUtils.filterStudentsWithGradeLessThan4(students);

        assertThat(filteredStudents).containsExactly(
                new Student("Bohdan", 22, 3.7),
                new Student("Maria", 23, 3.9)
        );
    }

    @Test
    @DisplayName("should find student with highest grade")
    void shouldFindStudentWithHighestGrade() {
        Optional<Student> student = StudentUtils.findStudentWithHighestGrade(students);

        assertThat(student).contains(new Student("Iryna", 21, 5.0));
    }

    @Test
    @DisplayName("should count students older than 20")
    void shouldCountStudentsOlderThan20() {
        long count = StudentUtils.countStudentsOlderThan20(students);

        assertThat(count).isEqualTo(3);
    }

    @Test
    @DisplayName("should create list of names sorted by grade descending")
    void shouldCreateListOfNamesSortedByGradeDescending() {
        List<String> names = StudentUtils.getStudentNamesSortedByGradeDesc(students);

        assertThat(names).containsExactly("Iryna", "Anna", "Oleh", "Maria", "Bohdan");
    }

    @Test
    @DisplayName("should check if at least one student has grade 5")
    void shouldCheckIfAtLeastOneStudentHasGrade5() {
        boolean hasStudentWithGrade5 = StudentUtils.hasStudentWithGrade5(students);

        assertThat(hasStudentWithGrade5).isTrue();
    }

    @Test
    @DisplayName("should get names of students with grade greater than 4")
    void shouldGetNamesOfStudentsWithGradeGreaterThan4() {
        List<String> names = StudentUtils.getStudentNamesWithGradeGreaterThan4(students);

        assertThat(names).containsExactly("Anna", "Iryna", "Oleh");
    }
}
