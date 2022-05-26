package kz.kaitanov.fitnessbackend.web.controller.rest;

import kz.kaitanov.fitnessbackend.annotation.IT;
import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Test;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@IT
@RequiredArgsConstructor
@Sql(executionPhase = Sql.ExecutionPhase.BEFORE_TEST_METHOD, value = "/scripts/ExerciseRestController/create-exercise-before.sql")
@Sql(executionPhase = Sql.ExecutionPhase.AFTER_TEST_METHOD, value = "/scripts/ExerciseRestController/clear-exercise-after.sql")
public class ExerciseRestControllerIT {

    private final MockMvc mockMvc;
    private final ExerciseRestController controller;


    @Test
    void shouldGetExerciseList() throws Exception {
        mockMvc.perform(get("/api/v1/exercise")).
                andExpect(status().isCreated())
                .andDo(print());
    }

    @Test
    void shouldSaveExercise() throws Exception {
        mockMvc.perform(post("/api/v1/exercise")).
                andExpect(status().isCreated())
                .andDo(print());
    }

    @Test
    void shouldUpdateExercise() throws Exception {
        mockMvc.perform(put("/api/v1/exercise")).
                andExpect(status().isCreated())
                .andExpect(status().isNotFound())
                .andDo(print());
    }

    @Test
    void shouldGetExerciseById() throws Exception {
        mockMvc.perform(get("/api/v1/exercise/101"))
                .andExpect(status().isOk())
                .andExpect(status().isNotFound())
                .andDo(print());
    }

    @Test
    void shouldDeleteExerciseByID() throws Exception {

        mockMvc.perform(delete("/api/v1/exercise/104"))
                .andExpect(status().isOk())
                .andExpect(status().isNotFound())
                .andDo(print());
    }
}
