package com.hdfc.employeemanagementsystem.restcontroller;

import com.hdfc.employeemanagementsystem.entity.Employee;
import com.hdfc.employeemanagementsystem.service.IEmployeeService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(value = EmployeeController.class)
class EmployeeControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private IEmployeeService employeeService;

    @Test
    void getRatingByCustomerId() throws Exception {
        Employee employee = new Employee(1,"Ramesh","25/09/2000");
        when(employeeService.getEmployeeById(1)).thenReturn(employee);
        mockMvc.perform(get("/employees/getRatingBy/{employeeId}",1)
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.employeeName").value("Ramesh"));


    }

//    private String mapToJson(Object object) throws JsonProcessingException {
//        ObjectMapper objectMapper = new ObjectMapper();
//        return objectMapper.writeValueAsString(object);
//    }
//
//    @Test
//    void getAll() {
//
//    }

}