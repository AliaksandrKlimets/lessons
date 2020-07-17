package com.company.digital_journal.util;

import com.company.digital_journal.entity.Journal;
import com.company.digital_journal.entity.Student;
import com.company.digital_journal.entity.Subject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class JournalUtil {

    private InputUtil inputUtil = new InputUtil();

    public void showJournal(Journal journal) {
        while (true) {
            System.out.println("1) Show journal as it is: ");
            System.out.println("2) Show sorted by student name: ");
            System.out.println("3) Show sorted by average mark: ");
            System.out.println("4) Exit: ");
            switch (inputUtil.getInteger()) {
                case 1: {
                    displayJournal(journal);
                    break;
                }
                case 2: {
                    displayJournalSortedByName(journal);
                    break;
                }
                case 3: {
                    displayJournalSortedByMark(journal);
                    break;
                }
                case 4: {
                    return;
                }
                default: {
                    System.out.println("Try again...");
                    break;
                }
            }
        }
    }

    private void displayJournalSortedByMark(Journal journal) {
        for (Subject subject : Subject.values()) {
            System.out.println(subject);
            List<Student> studentSet = sortByAverageMark(journal, subject);
            for (Student student : studentSet) {
                System.out.print(student.getFirstName() + " " + student.getLastName() + ": ");
                System.out.print(journal.getStudentsMarks().get(student).get(subject)
                        .stream()
                        .map(i -> i + "")
                        .collect(Collectors.joining(" ")));
                System.out.print(" Average: " + getAverage(journal.getStudentsMarks().get(student).get(subject)));
                System.out.println();
            }
            System.out.println("\n");
        }
    }

    private double getAverage(List<Integer> marks) {
        double res = 0.0;
        for (Integer i : marks) {
            res += i;
        }
        return res / marks.size();
    }

    private void displayJournalSortedByName(Journal journal) {
        for (Subject subject : Subject.values()) {
            System.out.println(subject);
            List<Student> students = journal.getStudentsMarks().keySet().stream()
                    .sorted((a, b) -> (a.getFirstName() + a.getLastName()).compareToIgnoreCase(b.getFirstName() + b.getLastName()))
                    .collect(Collectors.toList());

            for (Student student : students) {
                System.out.print(student.getFirstName() + " " + student.getLastName() + ": ");
                System.out.print(journal.getStudentsMarks().get(student).get(subject)
                        .stream()
                        .map(i -> i + "")
                        .collect(Collectors.joining(" ")));
                System.out.println();
            }
            System.out.println("\n");
        }
    }

    private void displayJournal(Journal journal) {
        for (Subject subject : Subject.values()) {
            System.out.println(subject);
            for (Student student : journal.getStudentsMarks().keySet()) {
                showStudentMarks(journal, student, subject);
            }
            System.out.println("\n");
        }
    }

    private void showStudentMarks(Journal journal, Student student, Subject subject) {
        System.out.print(student.getFirstName() + " " + student.getLastName() + ": ");
        System.out.print(journal.getStudentsMarks().get(student).get(subject)
                .stream()
                .map(i -> i + "")
                .collect(Collectors.joining(" ")));
        System.out.println();
    }

    public void showAverageMarkBySubject(Journal journal) {
        while (true) {
            System.out.println("1) Math: ");
            System.out.println("2) Biology: ");
            System.out.println("3) Informatics: ");
            System.out.println("4) Exit: ");
            switch (inputUtil.getInteger()) {
                case 1: {
                    displayAverageBySubject(journal, Subject.MATH);
                    break;
                }
                case 2: {
                    displayAverageBySubject(journal, Subject.BIOLOGY);
                    break;
                }
                case 3: {
                    displayAverageBySubject(journal, Subject.INFORMATICS);
                    break;
                }
                case 4: {
                    return;
                }
                default: {
                    System.out.println("Try again...");
                    break;
                }
            }
        }
    }

    private void displayAverageBySubject(Journal journal, Subject subject) {
        System.out.println(subject);
        List<Student> studentSet = sortByAverageMark(journal, subject);
        for (Student student : studentSet) {
            System.out.print(student.getFirstName() + " " + student.getLastName() + ": ");
            System.out.print(" Average: " + getAverage(journal.getStudentsMarks().get(student).get(subject)));
            System.out.println();
        }
        System.out.println("\n");
    }

    private List<Student> sortByAverageMark(Journal journal, Subject subject) {
        return journal.getStudentsMarks().keySet().stream()
                .sorted((a, b) -> Double.compare(getAverage(journal.getStudentsMarks().get(b).get(subject)),
                        getAverage(journal.getStudentsMarks().get(a).get(subject))))
                .collect(Collectors.toList());
    }

    public void showAverageMarkByStudent(Journal journal) {
        while (true) {
            String fullName = inputUtil.getString("Enter student full name");
            if (fullName.equalsIgnoreCase("E")) {
                return;
            }
            if (journal.getStudents().stream().anyMatch(i -> (i.getFirstName() + " " + i.getLastName()).equalsIgnoreCase(fullName))) {
                Student student = journal.getStudents().stream()
                        .filter(i -> (i.getFirstName() + " " + i.getLastName()).equalsIgnoreCase(fullName))
                        .findFirst().get();

                for (Subject subject : Subject.values()) {
                    System.out.println(subject);
                    showStudentMarks(journal, student, subject);
                }
            } else {
                System.out.println("Student not found; enter E to exit");
            }
        }
    }

    public void addMark(Journal journal) {
        while (true) {
            String fullName = inputUtil.getString("Enter student full name");
            if (journal.getStudents().stream().anyMatch(i -> (i.getFirstName() + " " + i.getLastName()).equalsIgnoreCase(fullName))) {
                Student student = journal.getStudents().stream()
                        .filter(i -> (i.getFirstName() + " " + i.getLastName()).equalsIgnoreCase(fullName))
                        .findFirst().get();
                int i = inputUtil.getInteger();
                journal.getStudentsMarks().get(student).get(Subject.MATH).add(i);
                return;
            } else {
                System.out.println("Student not found");
            }
        }
    }

    public void addStudent(Journal journal) {
        String name = inputUtil.getString("Enter name: ");
        String lastname = inputUtil.getString("Enter last name: ");
        String phone;
        while (true) {
            phone = inputUtil.getString("Enter phone: ");
            if (!phone.matches("^(\\+375)(29|33|25|44)[\\d]{7}$")) {
                System.out.println("Try again, incorrect phone");
            } else {
                break;
            }
        }
        Student student = new Student(name, lastname, phone);
        journal.getStudents().add(student);

        Map<Subject, List<Integer>> subjects = new HashMap<>();
        for (Subject subject : Subject.values()) {
            subjects.put(subject, new ArrayList<>());
        }
        journal.getStudentsMarks().put(student, subjects);
    }
}
