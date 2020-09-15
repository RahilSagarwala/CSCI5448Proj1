package nameGenerator;

import java.util.HashSet;
import java.util.Map;

import static java.lang.Character.toLowerCase;
import static java.util.Map.entry;

public class nameGenerator {
   // Default Constructor
   public nameGenerator(){
      super();

      // Initialization of immutable map code from:
      // https://javatutorial.net/java-9-immutable-map-example
      nameBank = Map.ofEntries(entry('a', new String[]{"Al", "Allison", "Ali", "Alister", "Allen"}),
                               entry('b', new String[]{"Benjamin", "Brian", "Brittany", "Bethany", "Brandon"}),
                               entry('c', new String[]{"Charlie", "Chloe", "Cameron", "Catherine"}),
                               entry('d', new String[]{"Daniel", "Dustin", "Danielle", "Derek"}),
                               entry('e', new String[]{"Ellen", "Eliana", "Eric", "Eugene", "Esther"}),
                               entry('h', new String[]{"Hank", "Heather", "Henry", "Hectar"}),
                               entry('l', new String[]{"Lilly", "Larry", "Luther", "Luke"}),
                               entry('r', new String[]{"Ralphie", "Rahil", "Ryan", "Roger", "Ruth", "Rachel"}),
                               entry('t', new String[]{"Tony", "Tiffany", "Tyler", "Tatiana"}),
                               entry('w', new String[]{"Walter", "Wendy", "Wesley", "Willow"}),
                               entry('y', new String[]{"Yasmeen", "Yolanda", "Yuri", "Yosef"}),
                               entry('z', new String[]{"Zane", "Zeke", "Zoey", "Zelda"}));

      usedNames = new HashSet<String>();
   }

   // public method to get a unique name per type
   // Pass in the type requesting a name, and it will
   // return a name that starts with the same letter
   public String getUniqueName(String t){
      Character firstLet = toLowerCase(t.charAt(0));

      String[] nameList = nameBank.get(firstLet);

      for(int i = 0; i < nameList.length; i++){
         if(!usedNames.contains(nameList[i])){
            usedNames.add(nameList[i]);
            return nameList[i];
         }
      }
      return null;
   }

   // Private member variables
   private Map<Character, String[]> nameBank;
   private HashSet<String> usedNames;
}
