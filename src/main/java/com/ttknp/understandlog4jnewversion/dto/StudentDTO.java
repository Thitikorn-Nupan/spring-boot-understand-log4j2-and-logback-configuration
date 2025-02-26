package com.ttknp.understandlog4jnewversion.dto;

import com.ttknp.understandlog4jnewversion.entity.Student;
import com.ttknp.understandlog4jnewversion.service.StudentService;

import java.util.List;

public class StudentDTO implements StudentService {
    @Override
    public List<Student> getAllStudents() {
        return List.of(
                Student.builder().id(1).fullname("alex ryder").age((short)26).build(),
                Student.builder().id(2).fullname("kevin own").age((short)26).build(),
                Student.builder().id(3).fullname("jack slider").age((short)27).build()
        );
    }
}
