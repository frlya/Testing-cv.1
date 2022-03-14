import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FactorialTest {

  @Test
  public void SimpleTest() {
    Assertions.assertEquals(Factorial.recursive(5), 120);
  }
}
