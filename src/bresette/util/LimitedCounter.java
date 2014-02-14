package bresette.util;

public class LimitedCounter
    extends
      Counter
{

  int limit;
  
  public LimitedCounter(int start, int limit)
  {
    super(start);
    this.limit = limit;
  } // LimitedCounter(int, int)
  
  @Override
  public void increment() throws Exception
  {
    if(this.count == this.limit)
      {
        throw new Exception();
      }
    else
      {
        super.increment();
      }
  } // increment()
  
}
