package com.rafaelqueiroz.oz_swimtracker;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@Import(TestcontainersConfiguration.class)
@SpringBootTest
class OzSwimtrackerApplicationTests {

	@Test
	void contextLoads() {
	}

}
