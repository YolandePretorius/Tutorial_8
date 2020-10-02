package testingTutorial;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StudentTest3 {
	
	List<Student> list = new ArrayList<>();
	Student student1 =new Student();
	Student student2 =new Student();

	@BeforeEach
	void setUp() throws Exception {
		
		student1.setName("Bob");
		student1.setId(012020);
		student1.setFirstName("Brian");
		
		student2.setName("Billy");
		student2.setId(022020);
		student2.setFirstName("Ben");
		
		list.add(student1);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test (expected  = UnsupportedOperationException.class)
	void testForException() {
		try {
		List<Student> list2 = Collections.unmodifiableList(list);
		System.out.println("Unmodifiable List: " + list2);
		list2.add(student2);
		}catch(Exception e) {
			assertThat(e,UnsupportedOperationException)
		}
	}

}
