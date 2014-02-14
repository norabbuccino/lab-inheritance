package bresette.util;

import static org.junit.Assert.*;

import org.junit.Test;

public class CounterTest
{

  @Test
  public void test() throws Exception 
  {
    Counter alpha = new NamedCounter("alfa", 0);
    Counter beta = new DoubleCounter(123);
    DecrementableCounter gamma = new DecrementableCounter(-5);
    assertEquals("original alpha", 0, alpha.value());
    assertEquals("original beta", 123, beta.value());
    assertEquals("original gamma", -5, gamma.value());
    for (int i = 0; i < 10; i++) 
      {
        alpha.increment();
        beta.increment();
        gamma.increment();
      } // for
    assertEquals("updated alpha", 10, alpha.value());
    assertEquals("updated beta", 143, beta.value());
    assertEquals("updated gamma", 5, gamma.value());
    alpha.reset();
    beta.reset();
    gamma.reset();
    assertEquals("reset alpha", 0, alpha.value());
    assertEquals("reset beta", 123, beta.value());
    assertEquals("reset gamma", -5, gamma.value());
    
    gamma.reset();
    assertEquals("reset gamma", -5, gamma.value());
    gamma.decrement();
    assertEquals("decremented gamma", -6, gamma.value());
    
    //assertEquals("name of NamedCounter alpha", "alfa[0]", alpha.toString());
  } // test()

}
