package org.example.art_demo.controller;


import org.springframework.ui.Model;
import org.example.art_demo.model.Student;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Controller
public class StudentController {
    private final List<Student> studentList = new ArrayList<>();

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String home() {
        return "home";
    }

    //для получения списка студентов
    @RequestMapping(value = "/student-list", method = RequestMethod.GET)
    public String getAllStudent(Model model) {
        model.addAttribute("students", studentList);
        return "students";
    }

    //для заполнения формы студента. GET запрос
    @RequestMapping(value = "/student/create", method = RequestMethod.GET)
    public String employeeCreate(Model model) {
        model.addAttribute("student", new Student());
        return "createStudent";
    }

    //для добавления студента. POST запрос
    @RequestMapping(value = "/student-create", method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE,
            produces = {MediaType.APPLICATION_ATOM_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
    public String createStudent(Student student) {
        System.out.println(student.getFullName() + ":" + student.getGroup());
        student.setId((long) (studentList.size() + 1));
        studentList.add(student);
        System.out.println(student.getDateBorn().toString());
        return "redirect:/student-list";
    }

    @RequestMapping(value = "/student-delete/{id}", method = RequestMethod.GET)
    public String deleteById(@PathVariable Long id) {
        for (Student s : studentList) {
            if (Objects.equals(s.getId(), id)) {
                studentList.remove(s);
                break;
            }
        }
        return "redirect:/student-list";
    }

}
