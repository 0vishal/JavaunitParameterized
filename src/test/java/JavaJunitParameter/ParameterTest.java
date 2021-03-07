package JavaJunitParameter;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.jupiter.api.Assertions;
import java.util.Collection;
import java.util.Arrays;


    @RunWith(Parameterized.class)

    public class ParameterTest {

        private final String email;
        UserRegistration operation;

        public ParameterTest(String email) {
            this.email = email;
        }

        @BeforeAll
        public void initialize() {
            this.operation = new UserRegistration();
        }


        @Parameterized.Parameters
        public static Collection input() {
            return Arrays.asList( new Object[]{"vishal@gmail.com", "vishal-135@gmail.com,", "vishal.25@yahoo.com"});
        }

        @Test
        public void validEmailTest() {
            boolean result = operation.validateEmail(email);
            Assertions.assertTrue(result);
        }
    }
