package bresette.util;

public class NamedCounter
extends DecrementableCounter
{
  String name;
  
  public NamedCounter(String name, int start)
  {
    super(start);
    System.err.println("NamedCounter(\"" + name + "\", " + start + ")");
    this.name = name;
  } // NamedCounter(String, int)
  
  @Override
  public String toString()
  {
    return this.name + super.toString();
  } // String toString()
} // class NamedCounter
