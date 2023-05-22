package uz.pdp.unittestdemog19.controller;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import uz.pdp.unittestdemog19.entity.Gender;
import uz.pdp.unittestdemog19.entity.Student;
import uz.pdp.unittestdemog19.service.StudentService;

import static net.bytebuddy.matcher.ElementMatchers.is;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@ExtendWith(SpringExtension.class)
@WebMvcTest(controllers = StudentController.class)
class StudentControllerTest {


//    @InjectMocks
//    StudentController studentController;
    @MockBean
    StudentService studentService;

    @Autowired
    MockMvc mockMvc;

//    @Before("")
//    public void startUp(){
//        MockitoAnnotations.openMocks(this);
//        this.mockMvc= MockMvcBuilders.standaloneSetup(studentController).build();
//    }

//    @Test
//    void testPostMappingStudent() throws Exception {
//        //given
//        Student student=new Student("Tesha","tesha@gamil.com", Gender.MALE);
//        //when
//        when(studentService.addStudent(any())).thenReturn(student);
//        ObjectMapper mapper=new ObjectMapper();
//        mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
//        byte[] bytes = mapper.writeValueAsString(student).getBytes();
//        String s=new String(bytes);
//        MvcResult result = this.mockMvc.perform(post("/api/v1/students")
//                        .contentType(MediaType.APPLICATION_JSON)
//                        .characterEncoding("UTF-8")
//                        .accept(MediaType.APPLICATION_JSON)
//                        .content(s)
//                )
//                .andDo(MockMvcResultHandlers.print())
//                .andExpect(MockMvcResultMatchers.status().isOk())
//                .andReturn();
//        Assertions.assertEquals(200,result.getResponse().getStatus());
//    }


//    @Test
//    void testPostMappingStudent() throws Exception {
//        //given
//        Student student=new Student("Tesha","tesha@gamil.com", Gender.MALE);
//        when(studentService.addStudent(any())).thenReturn(student);
//        ObjectMapper objectMapper = new ObjectMapper();
//        ResultActions resultActions = mockMvc.perform(
//                        post("/api/students")
//                                .content(objectMapper.writeValueAsString(student))
//                                .contentType(MediaType.APPLICATION_JSON)
//                                .accept(MediaType.APPLICATION_JSON)
//                )
//                .andDo(print())
//                .andExpect(status().isOk())
//                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
////                .andExpect((ResultMatcher) jsonPath("$.name", is("Tesha")))
//                .andExpect(result -> {
//                    Student readValue = objectMapper.readValue(result.getResponse().getContentAsByteArray(), Student.class);
////                    String readValue=new String(result.getResponse().getContentAsByteArray());
//                    Assertions.assertEquals(readValue,student);
//
//                })
//                .andExpect(jsonPath("$").isNotEmpty());
//
//    }
}