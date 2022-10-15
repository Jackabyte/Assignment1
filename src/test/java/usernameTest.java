import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class usernameTest {
    Student student;
    lecturer lect;

    @BeforeEach
    void setUp() {
        student = new Student("Jack", 12, 23144, "12/12/2010", "", new String[]{"ECE", "DBC"}, new String[]{"Gamig", "Pain"});
        lect = new lecturer("Johnathan", 34, 12345, "09/03/2000", "", new String[]{"ECE", "DBZ"}, new String[]{"Gaming", "Pain"});
    }

    @Test
    @DisplayName("Check to see if the student username is gotten correctly")
    void testStudentUsername(){
        assertTrue("Jack12".equals(student.getUsername()));
    }
    @Test
    @DisplayName("Check to see if the lecturer username is gotten correctly")
    void testLecturerUsername(){
        assertTrue("Johnathan34".equals(lect.getUsername()));
    }





}
