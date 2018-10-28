package threesolid;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestWorker {

   private Worker w = new Worker();

   @Test
   @DisplayName("Correct_sick")
   public void testWorkMethod()
   {
        assertTrue(w.sick2() == "Missing work");
   }

   @Test
   @DisplayName("wrong_sick")
   public void fail()
   {
        assertTrue(w.sick2() == "Hiring a doppelganger");
   }


}