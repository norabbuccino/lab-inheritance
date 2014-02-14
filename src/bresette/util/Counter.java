package bresette.util;

public class Counter
{
  // +--------+------------------------------------------------------------
  // | Fields |
  // +--------+

  int count;
  int start;

  // +--------------+------------------------------------------------------
  // | Constructors |
  // +--------------+

  public Counter(int value)
  {
    this.count = value;
    this.start = value;
    System.err.println("Counter(" + start + ")");
  } // Counter(int)

  // +---------+-----------------------------------------------------------
  // | Methods |
  // +---------+

  public void increment()
    throws Exception
  {
    this.count++;
  } // increment()

  public void reset()
  {
    this.count = this.start;
  } // reset()

  public String toString()
  {
    return "[" + this.count + "]";
  } // toString()

  public int value()
  {
    return this.count;
  }

}
