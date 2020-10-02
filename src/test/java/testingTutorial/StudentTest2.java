package testingTutorial;



import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StudentTest2 {
	Student student1 =new Student();
	Student student2 =new Student();
	
	Map<Integer, Student> hashM = new HashMap<>(); 
	Map<Integer, Student> identity_hash = new IdentityHashMap<Integer, Student>();   // create instance of IdentityHashMap
		int key1 = 1;
		int key2 = 1;
	
	@BeforeEach
	public void setUp() throws Exception {
		student1.setName("Bob");
		student1.setId(012020);
		student1.setFirstName("Brian");
		
		student2.setName("Bob");
		student2.setId(022020);
		student2.setFirstName("Brian");
		
		identity_hash.put(key1,student1);
		identity_hash.put(new Integer(key2), student2);
		hashM.put(key1, student1);
		hashM.put(new Integer(key2), student2);

	}

	@AfterEach
	public void tearDown() throws Exception {
	}
	
	@Test
	void IdentityHashMapTest() {
		
		 assertTrue(
		 
		 identity_hash.size() == 1 // identity map creates another object and place it in another memory location
		 
		 );
	}
	
	@Test
	void HashMapTest() {
		 assertTrue(
				 
				 hashM.size() == 1 // hashmap over writes the value stored in the current key value
				 
			);
		
	}

}


	