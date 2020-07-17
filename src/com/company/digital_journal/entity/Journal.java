package com.company.digital_journal.entity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Journal {

    private ClassTeacher teacher;

    private List<Student> students = new ArrayList<>();

    private Map<Student, Map<Subject, List<Integer>>> studentsMarks = new HashMap<>();

    public Journal(ClassTeacher teacher) {
        this.teacher = teacher;
    }

    public ClassTeacher getTeacher() {
        return teacher;
    }

    public void setTeacher(ClassTeacher teacher) {
        this.teacher = teacher;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public Map<Student, Map<Subject, List<Integer>>> getStudentsMarks() {
        return studentsMarks;
    }

    public void setStudentsMarks(Map<Student, Map<Subject, List<Integer>>> studentsMarks) {
        this.studentsMarks = studentsMarks;
    }
}
