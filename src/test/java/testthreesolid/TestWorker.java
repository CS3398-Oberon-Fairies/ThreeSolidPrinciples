package threesolid;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestWorker {

   ProjectManager project_manager = new ProjectManager();
   private Worker w = new Worker();
   private int test = 1;

   @Test
   @DisplayName("Work Method Test")
   public void testWorkMethod()
   {
      assertNotNull(w);
   }
   
   @Test
   @DisplayName("A-Tyler Passing Test")
   public void newtestAMTTestPass()
   {
        assertEquals(w.something(), test);
   }
     
   @Test
   @DisplayName("A-Tyler Failing Test")
   public void newtestAMTTestFail()
   {
        assertNull(project_manager);
   }

}