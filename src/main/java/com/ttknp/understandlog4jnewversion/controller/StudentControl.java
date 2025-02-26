package com.ttknp.understandlog4jnewversion.controller;

import com.ttknp.understandlog4jnewversion.dto.StudentDTO;
import com.ttknp.understandlog4jnewversion.service.StudentService;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Log4j2
@RestController
@RequestMapping(value = "/api")
public class StudentControl {
    private StudentService studentService;

    public StudentControl() {
        this.studentService = new StudentDTO();
    }

    @GetMapping(value = "/{key}")
    public ResponseEntity mainStudentApi(@PathVariable("key") String key) {

        if (key.equals("students")) {
            log.warn("Key is 'students'");
            return ResponseEntity.ok(studentService.getAllStudents());
        }
        log.warn("Key isn't 'students'");
        return ResponseEntity.status(200)
                .header("Message","Key wasn't correct")
                .body(null);

    }
}
