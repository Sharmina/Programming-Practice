import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class LinkedListTest {

	LinkedList emptyList;
	LinkedList shortList;
	LinkedList midList;
	LinkedList longList;
	@Before
	public void setUp() throws Exception {
		emptyList=new LinkedList();
		
		shortList=new LinkedList();
		shortList.insertAtFront(1);
		
		midList=new LinkedList();
		midList.insertAtFront(2);
		midList.insertAtFront(1);
		
		longList=new LinkedList();
		longList.insertAtFront(4);
		longList.insertAtFront(3);
		longList.insertAtFront(2);
		longList.insertAtFront(1);
	
	}

	@Test
	public void insertTest() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testToString(){
		assertEquals("Empty List correct","",emptyList.toString());
		assertEquals("Short List correct","1",shortList.toString());
		assertEquals("midList List correct","12",midList.toString());
	}
	@Test
	public void testReverseList(){
		emptyList.reverseList();
		assertEquals("Empty List correct","",emptyList.toString());
		
		shortList.reverseList();
		assertEquals("Short List correct","1",shortList.toString());
		
		midList.reverseList();
		assertEquals("midList List correct","21",midList.toString());
		
		longList.reverseList();
		assertEquals("longList List correct","4321",longList.toString());
	}

}
