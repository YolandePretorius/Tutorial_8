package testingTutorial;



import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StudentTest {
	Student student1 =new Student();
	Student student2 =new Student();
	
	@BeforeEach
	public void setUp() throws Exception {
		student1.setName("Bob");
		//student1.setId(012020);
		
		
		student2.setName("Bob");
		//student2.setId(022020);

	}

	@AfterEach
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		assertEquals("Bob",student1.getName());
				
	}
	
	@Test
	public void testnamesequal() {
		assertEquals(student2.getName(),student1.getName());
				
	}
	
	@Test
	public void testHashcodes() {
		assertEquals(student2.hashCode(),student1.hashCode());
				
	}
	
	@Test
	public void testHashcodesAssertTrue() { 	// this test fails as it implies that if student 1 is equal to student 2 
		assertTrue( 							// then the hash codes will not be the same
				student1.equals(student2) &&
				student1.hashCode() != student2.hashCode());
		
				
	}
	
	@Test
	public void testHashcodesAssertTrue2() { 	
		assertTrue( 							
				student1.equals(student2) ||
				student1.hashCode() == student2.hashCode());
		
				
	}
	
	
	
	@Test 
	public void testHashcodesAssertNotTrue() {
		assertTrue(
				(student1 != student2) ||
				student1.hashCode() == student2.hashCode()
				);
		
	}
	
	@Test 
	public void testHashcodesAsserNotStudents() {
		assertTrue(
				(student1 != student2) &&
				student1.hashCode() == student2.hashCode()
				);
		
	}
	
	@Test 
	public void testHashcodesAssertNotAtudentNotHash() {
		assertTrue(
				(student1 != student2) &&
				student1.hashCode() != student2.hashCode()
				);
		
	}
	
	@Test
	public void testIdentityHashMap() {
		assertEquals(student1.hashCode(),student2.hashCode());
		
	}
	



}
