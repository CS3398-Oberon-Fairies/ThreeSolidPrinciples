package threesolid;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestWorker {

   private Worker w = new Worker();
   private Worker w2 ;
   int worker_pay = w.something();

   @Test
   @DisplayName("Worker Method Pass")
   public void newestRTPWorkerPass()
   {
        assertNull(w2);

   }

   @Test
   @DisplayName("Worker Method Fail")
   public void newestRTPWorkerFail()
   {
        assertEquals(worker_pay,1000);

   }

}
