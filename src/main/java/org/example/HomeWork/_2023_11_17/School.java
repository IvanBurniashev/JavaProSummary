package org.example.HomeWork._2023_11_17;

import java.lang.reflect.Field;
import java.util.Arrays;

public class School {
    @StudentInfo(name = "Tom", surname = "Smith", age = 15)
    Student student1;
    @StudentInfo(name = "Mary", surname = "Jennings", age = 17)
    Student student2;

    public static void main(String[] args) {
        School school = new School();
        Injector.inject(school);
        System.out.println(school.student1);
        System.out.println(school.student2);
    }

    static class Injector {
        public static void inject(Object instance) {
            Field[] fields = instance.getClass().getDeclaredFields();
            for (Field field : fields) {
                if (field.isAnnotationPresent(StudentInfo.class)) {
                    StudentInfo studentInfo = field.getAnnotation(StudentInfo.class);
                    field.setAccessible(true);
                    try {
                        field.set(instance, new Student(studentInfo.name(), studentInfo.surname(), studentInfo.age()));
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
