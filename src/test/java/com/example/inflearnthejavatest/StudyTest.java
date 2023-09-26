package com.example.inflearnthejavatest;

import static org.junit.jupiter.api.Assertions.*;

import java.util.function.Supplier;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class StudyTest {


    @Test
    @DisplayName("스터디 만들기")
    void create_new_study() {

        Study study = new Study();
        assertNotNull(study);
        assertEquals(StudyStatus.DRAFT, study.getStatus(), () -> "스터디를 처음 만들면 상태값이 DRAFT여야 한다.");
        System.out.println("create");
    }

    @Test
    void create_new_study_again() {
        assertAll(
                "heading",
                () -> assertEquals(4, 2 * 2, "4 is 2 times 2"),
                () -> assertEquals("java", "C/C++", () -> "java를 입력 해야 합니다.")
        );
        System.out.println("create1");
    }

    // BeforeAll, AfterAll 은 static으로 선언해야한다.
    @BeforeAll
    static void beforeAll() {
        System.out.println("beforeAll");
    }
    @AfterAll
    static void afterAll() {
        System.out.println("afterAll");
    }

    // 테스트
    @BeforeEach
    void beforeEach() {
        System.out.println("beforeEach");
    }
    @AfterEach
    void afterEach() {
        System.out.println("afterEach");
    }
}