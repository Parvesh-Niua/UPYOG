package org.upyog.employee.dasboard.web.controllers;

import org.upyog.employee.dasboard.web.models.EmployeeDashboardResponse;
import org.upyog.employee.dasboard.web.models.ErrorRes;
import org.junit.Test;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.context.annotation.Import;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.upyog.employee.dasboard.TestConfiguration;

    import java.util.ArrayList;
    import java.util.HashMap;
    import java.util.List;
    import java.util.Map;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
* API tests for EmployeeDashaboardApiController
*/
@Ignore
@RunWith(SpringRunner.class)
@WebMvcTest(EmployeeDashaboardApiController.class)
@Import(TestConfiguration.class)
public class EmployeeDashaboardApiControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void employeeDashaboardSearchPostSuccess() throws Exception {
        mockMvc.perform(post("/employee-dasboard/employee-dashaboard/_search").contentType(MediaType
        .APPLICATION_JSON_UTF8))
        .andExpect(status().isOk());
    }

    @Test
    public void employeeDashaboardSearchPostFailure() throws Exception {
        mockMvc.perform(post("/employee-dasboard/employee-dashaboard/_search").contentType(MediaType
        .APPLICATION_JSON_UTF8))
        .andExpect(status().isBadRequest());
    }

}
