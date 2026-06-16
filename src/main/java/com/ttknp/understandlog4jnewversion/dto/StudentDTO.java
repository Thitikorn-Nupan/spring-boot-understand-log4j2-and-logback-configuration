package com.ttknp.understandlog4jnewversion.dto;

import com.ttknp.understandlog4jnewversion.entity.Student;
import com.ttknp.understandlog4jnewversion.service.StudentService;
import lombok.extern.log4j.Log4j2;
import java.util.List;

@Log4j2
public class StudentDTO implements StudentService {
    @Override
    public List<Student> getAllStudents() {
        List<Student> studentList = List.of(
                Student.builder().id(1).fullname("alex ryder").age((short)26).build(),
                Student.builder().id(2).fullname("kevin own").age((short)26).build(),
                Student.builder().id(3).fullname("jack slider").age((short)27).build()
        );
        log.debug("studentList size => {}",studentList);
        return studentList;
    }
}
