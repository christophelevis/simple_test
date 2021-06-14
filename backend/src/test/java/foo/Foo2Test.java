package foo;

import org.junit.Test;
import static org.junit.Assert.*;

public class Foo2Test {

  @Test
  public void testAdd() throws Exception {
  	assertEquals(Foo2.div(10, 5), 2);
  }
}
