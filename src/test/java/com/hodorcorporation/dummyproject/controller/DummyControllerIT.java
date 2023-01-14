package com.hodorcorporation.dummyproject.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.hodorcorporation.dummyproject.entity.Dummy;
import com.hodorcorporation.dummyproject.repository.DummyRepository;
import com.hodorcorporation.dummyproject.service.DummyService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultActions;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
@TestPropertySource(locations = "classpath:application-test.properties")
class DummyControllerIT {

    @Autowired
    private MockMvc mockMvc;
    @Autowired
    private DummyService dummyService;
    @Autowired
    private ObjectMapper objectMapper;
    @Autowired
    private DummyRepository dummyRepository;
    private Dummy dummy;
    private Dummy dummy2;
    private Dummy dummy3;
    private List<Dummy> dummies;

    @BeforeEach
    void setUp() {
        dummy = new Dummy(1L, "hodor");
        dummy2 = new Dummy(2L, "hodor");
        dummy3 = new Dummy(3L, "hodor");
        dummies = Arrays.asList(dummy);
        dummyRepository.save(dummy);
        dummyRepository.save(dummy2);
        dummyRepository.save(dummy3);
    }

    @Test
    void createDummy() throws Exception {
        // given
        Dummy createDummy = new Dummy();
        createDummy.setName("create");

        // when
        ResultActions resultActions = mockMvc.perform(post("/dummy")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(createDummy)));

        // then
        resultActions.andExpect(status().isCreated());
        Dummy result = dummyService.createDummy(createDummy);
        assertThat(result.getName()).isEqualTo(createDummy.getName());
    }

    @Test
    void getDummyById() throws Exception {
        // given
        Long id = 1L;

        // when
        MvcResult mvcResult = mockMvc.perform(get("/dummy")
                        .param("id", "1")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andReturn();

        // then
        String result = mvcResult.getResponse().getContentAsString();
        assertTrue(result.contains("hodor"));

    }

    @Test
    void getAllDummies() throws Exception {
        // given
        // when
        MvcResult mvcResult = mockMvc.perform(get("/dummy/all")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andReturn();

        // then
        String result = mvcResult.getResponse().getContentAsString();
        assertTrue(result.contains("hodor"));
    }

    @Test
    @Rollback
    void updateDummy() throws Exception {
        // given
        Dummy updateDummy = new Dummy();
        updateDummy.setId(2L);
        updateDummy.setName("update");

        // when
        ResultActions resultActions = mockMvc.perform(put("/dummy")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(updateDummy)));

        // then
        resultActions.andExpect(status().isOk());
        Dummy result = dummyService.updateDummy(updateDummy);
        assertThat(result.getName()).isEqualTo(updateDummy.getName());
    }

    @Test
    @Rollback
    void deleteDummyById() throws Exception {
        // given
        Long id = 3L;

        // when
        MvcResult mvcResult = mockMvc.perform(delete("/dummy")
                        .param("id", "3")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isNoContent())
                .andReturn();

        // then
    }
}