package bresette.util;

public class DoubleCounter
    extends
      Counter
{

  public DoubleCounter(int start)
  {
    super(start);
  } // DoubleCounter(int)

  @Override
  public void increment() throws Exception
  {
    super.increment();
    super.increment();
  } // increment()
  
} // class DoubleCounter 