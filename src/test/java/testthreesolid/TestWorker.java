package threesolid;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestWorker {

   private Worker w = new Worker();

   @Test
   @DisplayName("sick method true")
   public void testWorkMethod()
   {
      assertTrue(w.sick() == "Missing work");
      System.out.println("ahhh");
   }
   
   //@Test
   @DisplayName("sick method false")
   public void testWorkMethod2()
   {
      assertTrue(w.sick() == "Hire doppelganger to fill in");
   }

}