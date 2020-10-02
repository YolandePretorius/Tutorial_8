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
	
	//Test fails as it implies that two different objects has the same hascode
	@Test
	public void testStudentsEqualAndDifferentHashcode() { 	
		assertTrue( 							
				student1.equals(student2) &&	
				student1.hashCode() != student2.hashCode());// two different objects should not have the same hashcode
		
				
	}

	@Test 
	public void testStudentsDifferendAndSamehashcode() {
		assertTrue(
				(!student1.equals(student2)) &&		//If student1 is not equal to student 2 and hascodes are equal it will give a True
				student1.hashCode() == student2.hashCode());
	}
	
	
	//The Test with OR will be true
	
	//if student 1 is equal to student 2 OR the hashcodes are the same
	@Test
	public void testStudentEqualORHashcodeEqual() { 
		assertTrue( 							// .equals look at the objects not the memory location of studend
				student1.equals(student2) ||	// with the or || the test will pass if students are equal or hashCodes are equal
				student1.hashCode() == student2.hashCode()); 
		
				
	}
	
	//if student 1 is equal to student 2 OR the hashcodes are not the same
		@Test
		public void testStudentEqualORHashcodeNotEqual() { 
			assertTrue( 							// .equals look at the objects not the memory location of studend
					student1.equals(student2) ||	// with the or || the test will pass if students are equal or hashCodes are equal
					student1.hashCode() != student2.hashCode()); 
			
					
		}
	


}
