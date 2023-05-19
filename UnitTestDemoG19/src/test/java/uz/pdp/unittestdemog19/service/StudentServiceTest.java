package uz.pdp.unittestdemog19.service;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import uz.pdp.unittestdemog19.entity.Gender;
import uz.pdp.unittestdemog19.entity.Student;
import uz.pdp.unittestdemog19.exceptions.BadRequestException;
import uz.pdp.unittestdemog19.repository.StudentRepository;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.spy;


class StudentServiceTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    @Disabled
    void getAllStudents() {
    }

    @Test
    void   should_return_success_result_when_add_Student() {
        //given
        Student student=new Student("Jamila","jamila@gamil.com", Gender.FEMALE);
        StudentRepository studentRepository= Mockito.mock(StudentRepository.class);
        StudentService studentService=spy(new StudentService(studentRepository));
        given(studentRepository.selectExistsEmail(student.getEmail())).willReturn(false);
        given(studentRepository.save(any())).willReturn(student);
        //when
        Student student1 = studentService.addStudent(student);
        //then
        assertEquals(student.getEmail(),student1.getEmail());


    }

    @Test
    void   should_throw_BadRequestException_when_add_Student() {
        //given
        Student student=new Student("Jamila","jamila@gamil.com", Gender.FEMALE);
        StudentRepository studentRepository= Mockito.mock(StudentRepository.class);
        StudentService studentService=spy(new StudentService(studentRepository));
        given(studentRepository.selectExistsEmail(student.getEmail())).willReturn(true);
        given(studentRepository.save(any())).willReturn(student);
        //when
        //then
        assertThrows(BadRequestException.class,() ->
                studentService.addStudent(student));



    }


    @Test
    @Disabled
    void addStudentV2() {
    }

    @Test
    @Disabled
    void deleteStudent() {
    }

    @Test
    public  void should_return_max_value(){
        //given
        int a=20;
        int b=30;

        StudentRepository repository = Mockito.mock(StudentRepository.class);
        StudentService service = spy(new StudentService(repository));
        //when
        int great = service.iSGreat(a, b);
        //then
        assertEquals(b,great);



    }

    @Test
    public  void should_fail_max_value(){
        //given
        int a=20;
        int b=30;

        StudentRepository repository = Mockito.mock(StudentRepository.class);
        StudentService service = spy(new StudentService(repository));
        //when
        int great = service.iSGreat(a, b);
        //then
        assertEquals(a,great);



    }
}