package testingTutorial;

import static org.junit.jupiter.api.Assertions.*;
import java.util.IdentityHashMap;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LecturerTest {
	
	Lecturer lecture1 = new Lecturer();
	Lecturer lecture2 = new Lecturer();

	@BeforeEach
	void setUp() throws Exception {
		lecture1.setName("Dan");
		lecture2.setName("Dan");
		
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		fail("Not yet implemented");
	}

}
