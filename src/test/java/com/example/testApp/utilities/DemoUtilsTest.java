package com.example.testApp.utilities;


import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.*;

import java.time.Duration;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


@DisplayNameGeneration(DisplayNameGenerator.Simple.class)

class DemoUtilsTest {
    DemoUtils demoUtils ;
     @BeforeEach
     void setupBeforeEach(){
         demoUtils = new DemoUtils();
         System.out.println("@BeforeEach executes before the execution of each test method");
     }


    @Test
    @DisplayName("Equals and not equals")
      void testEqualsAndNotEquals() {
        System.out.println("Running test : testEqualsAndNotEquals");

       //assert
        assertEquals(6,demoUtils.add(2,4),"a+b must be 6");
        assertNotEquals(8,demoUtils.add(2,4),"2+4 must not be 8");
    }

    @Test
    @DisplayName("Null And Not NUll")
    @EnabledForJreRange(min = JRE.JAVA_20)
     void testNullAndNotNUll(){
        System.out.println("Running test : testNullAndNotNull");
        String str1 = null;
        String str2 = "yacine";
        assertNull(demoUtils.checkNull(str1),"object must be null");
        assertNotNull(demoUtils.checkNull(str2),"object must not be null");
    }

    @Test
    @DisplayName("Same And Not Same")
    void testSameAndNotSame(){

        String str = "Luv2Code";
        assertSame(demoUtils.getAcademy(),demoUtils.getAcademyDuplicate(),"Objects should refer to same object");
        assertNotSame(str,demoUtils.getAcademy(),"Objects should not refer to same object");
    }

    @Test
    @DisplayName("True and False")
    void testTrueFalse(){
        int gradOne = 10;
        int gradeTwo = 5;
        assertTrue(demoUtils.isGreater(gradOne,gradeTwo),"this should return true");
        assertFalse(demoUtils.isGreater(gradeTwo,gradOne),"this should return false");

    }

    @Test
    @DisplayName("Array Equals")
     void testArrayEquals(){
          String[] array = {"A", "B", "C"};
          assertArrayEquals(array,demoUtils.getFirstThreeLettersOfAlphabet(),"Arrays should be the same");
    }

     @Test
     @DisplayName("Iterable Equals")
     @EnabledIfEnvironmentVariable(named="testApp_ENV",matches = "DEV")
     void IterableEquas(){
         List<String> theList = List.of("luv", "2", "code");
         assertIterableEquals(theList,demoUtils.getAcademyInList(),"Expected list should be the same as actual list");
     }

     @Test
     @DisplayName("Line Match")
     void testLineMatch(){
         List<String> theList = List.of("luv", "2", "code");
         assertLinesMatch(theList,demoUtils.getAcademyInList(),"Lines should match");
     }

     @Test
     @DisplayName("Throws and does not Throw")
     void testThrowsAndDoesNotThrow(){
         assertThrows(Exception.class,()->{demoUtils.throwException(-1);},"Shoud throw exception");
         assertDoesNotThrow(()->{demoUtils.throwException(5);},"Should not throw exeption");

     }

     @Test
     @DisplayName("TimeOut")
     @EnabledOnOs(OS.MAC)
     void testTimeOut(){
         assertTimeoutPreemptively(Duration.ofSeconds(3),()->{demoUtils.checkTimeout();},
                 "method should execute in 3 seconds");

     }
     @Test
     @DisplayName("Multiply")
     void testMultiply(){
         assertEquals(6,demoUtils.multiply(3,2),"3*2 must be 6");
     }

/*

    @AfterEach
    void tearDownAfterEach(){
        System.out.println("Running afterEach \n");
    }

    @BeforeAll
    static void setupBeforeEachCLass(){
        System.out.println("@BeforeAll executes only once before all test methods executions in the class\n");
    }

    @AfterAll
    static void tearDownAfterAll(){
        System.out.println("@afterAll executes only once after all test methods executions in the class ");
    }*/
}