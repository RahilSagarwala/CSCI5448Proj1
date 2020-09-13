package nameGenerator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class nameGeneratorTest {

   @Test
   void getUniqueName_returns_name_with_same_first_Letter() {
      nameGenerator ng = new nameGenerator();
      String name = ng.getUniqueName("Tiger");
      String firstLet = Character.toString(name.charAt(0));
      assertTrue(firstLet.equalsIgnoreCase("t"));
   }

   @Test
   void getUniqueName_returns_unique_names_on_multiple_calls(){
      nameGenerator ng = new nameGenerator();
      String name1 = ng.getUniqueName("Tiger");
      String name2 = ng.getUniqueName("Tiger");
      assertNotEquals(name1, name2);
   }
}