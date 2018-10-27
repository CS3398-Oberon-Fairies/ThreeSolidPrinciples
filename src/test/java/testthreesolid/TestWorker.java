package threesolid;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestWorker {

   private Worker w = new Worker();

   @Test
   @DisplayName("Work Method Test")
   public void newtestPGWorkerPass()
   {
      assertEquals("I'm working already!","I'm working already!");
   }

   @Test
   @DisplayName("Failing Test")
   public void newtestPGWorkerFail()
   {
      assertEquals("I'm working already!","This is not what we are comparing to!");
   }


}