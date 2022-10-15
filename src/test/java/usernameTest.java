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
        student = new Student("Jack", 12, "", "", new String[]{"ECE", "DBC"}, new String[]{"Gamig", "Pain"});
        lect = new lecturer("Johnathan", 34, "", "", new String[]{"ECE", "DBZ"}, new String[]{"Gaming", "Pain"});
    }

    @Test
    @DisplayName("Check to see if the username is gotten correctly")
    void testUsername(){
        assertTrue("Jack12" == student.getUsername());

    }




}
