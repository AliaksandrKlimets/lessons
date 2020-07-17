package com.company.digital_journal;

import com.company.digital_journal.entity.*;

import java.util.*;

public class JournalMain {

    public static void main(String[] args) {
        ClassTeacher teacher = new ClassTeacher("Tamara", "Vasilyevna", "2282828", Category.HIGH);
        Journal journal = new Journal(teacher);
        Student s1 = new Student("Alex", "Ivanov", "+375292262728");
        Student s2 = new Student("Vitya", "Petrov", "+375294875874");
        Student s3 = new Student("Pasha", "Babariko", "+375334474849");
        journal.getStudents().add(s1);
        journal.getStudents().add(s2);
        journal.getStudents().add(s3);

        Map<Subject, List<Integer>> s1Subject = new HashMap<>();
        s1Subject.put(Subject.MATH, Arrays.asList(10, 8, 9, 2));
        s1Subject.put(Subject.BIOLOGY, Arrays.asList(10, 2, 3, 2));
        s1Subject.put(Subject.INFORMATICS, Arrays.asList(5, 8, 9, 2));

        Map<Subject, List<Integer>> s2Subject = new HashMap<>();
        s2Subject.put(Subject.MATH, Arrays.asList(10, 6, 9, 2));
        s2Subject.put(Subject.BIOLOGY, Arrays.asList(6, 3, 3, 2));
        s2Subject.put(Subject.INFORMATICS, Arrays.asList(5, 8, 8, 2));

        Map<Subject, List<Integer>> s3Subject = new HashMap<>();
        s3Subject.put(Subject.MATH, Arrays.asList(2, 8, 9, 2));
        s3Subject.put(Subject.BIOLOGY, Arrays.asList(3, 2, 1, 8));
        s3Subject.put(Subject.INFORMATICS, Arrays.asList(5, 8, 6, 2));

        journal.getStudentsMarks().put(s1, s1Subject);
        journal.getStudentsMarks().put(s2, s2Subject);
        journal.getStudentsMarks().put(s3, s3Subject);
        new Launcher(journal).launch();
    }

}
