package com.example.dodawanie;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class DodawanieApplicationTests {

    @Test
    public void added(){
        DodawanieApplication app=new DodawanieApplication();
        assertEquals(10,app.added(5,5));
    }

}
