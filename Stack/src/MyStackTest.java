import static org.junit.Assert.*;

import java.util.EmptyStackException;

import org.junit.Before;
import org.junit.Test;

public class MyStackTest {

	MyStack stack;
	@Before
	public void setUp() throws Exception {
		
		stack=new MyStack();
		stack.push(1);
		stack.push(2);
		stack.push(3);
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	@Test
	public void popTest(){
		assertEquals("pop test",3,stack.pop());
		assertEquals("pop test",2,stack.pop());
		assertEquals("pop test",1,stack.pop());
		
		try{
			stack.pop();
		}
		catch(EmptyStackException e)
		{
			System.out.println("exception acught");
		}
	}

}
