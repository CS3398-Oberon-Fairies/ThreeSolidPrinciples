package threesolid;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestWorker {

   private Worker w = new Worker();

   @Test
   @DisplayName("Work Method Test")
   public void testWorkMethod()
   {
        assertTrue(true);
      //assertEquals(w.something(), "I'm working already!","I'm working already!");
   }

   @Test
   @DisplayName("Failing Test")
   public void fail()
   {
        assertTrue(false);
      //assertEquals(w.something(), "I'm working already!","I'm working already!");
   }


}