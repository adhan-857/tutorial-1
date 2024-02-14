package id.ac.ui.cs.advprog.eshop;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class EshopApplicationTests {

    @Test
    void contextLoads() {
        EshopApplication.main(new String[]{});
        assertTrue(true, "The context loads successfully");
    }
}
