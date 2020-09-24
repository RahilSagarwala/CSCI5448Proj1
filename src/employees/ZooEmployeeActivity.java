package employees;

public class ZooEmployeeActivity {
   public ZooEmployeeActivity(String name, String type, String action) {
      this.name = name;
      this.type = type;
      this.action = action;
   }

   public String getName() { return name; }
   public String getType() { return type; }
   public String getAction() { return action; }

   private final String name;
   private final String type;
   private final String action;
}
