import java.util.ArrayList;
import java.util.HashMap;

public class School {
    public static void School(String[] args) {
        System.out.println("Hello World!");
    }

    public class Course {

        public int course_id;
        public int year;
        public String semester;
        public Teacher teacher;

        public Course() {
            this.course_id = course_id;
            this.year = year;
            this.semester = semester;
            this.teacher = teacher;
        }
    }


    public class Teacher {
        int teacher_Id;
        ArrayList<Course> courses;

        public Teacher() {
            this.teacher_Id = teacher_Id;
            this.courses = new ArrayList<>();
        }

    }

    public class Student {

        int student_ID;
        HashMap<Course, Double> grades;

        public Student() {
            this.student_ID = student_ID;
            this.grades = new HashMap<>();
            ;
        }
    }

    public Teacher findTeacher(Course course) {
        return course.teacher;
    }

    public double findGrade(Student student, Course course) {

        double grade = student.grades.get(course);
        return grade;
    }

    public double findAverage(Student student, int year, String semester) {
        double sum = 0;
        int count = 0;
        for (Course key : student.grades.keySet()) {
            if (key.year == year && key.semester == semester) {
                count = count + 1;
                sum = sum + student.grades.get(key);
            }
        }
        return sum / count;

    }

    public HashMap<Course, Double> getCoursesGrades(Student student, int year, String semester) {
        HashMap<Course, Double> studentGrade = new HashMap<>();
        for (Course key : student.grades.keySet()) {
            if (key.year == year && key.semester == semester) {

                studentGrade.put(key, student.grades.get(key));
            }
        }
        return studentGrade;

    }
}





