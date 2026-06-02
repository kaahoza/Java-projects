
import java.util.*;
import java.text.SimpleDateFormat;

public class Employee {
    int id;
    String name;
    String lastname;
    private List<String> attendance;

    public Employee(int id ,String name, String lastname ){
      this.name = name;
      this.lastname = lastname;
      this.attendance = new ArrayList<>();
    }

    public void markAttendance() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        attendance.add(dateFormat.format(date));
    }
     public List<String> getAttendance() {
        return attendance;
     }
    public int getId() {
        return id;
    }
    public String getName(){
        return name;
    }

    public String getLastname() {

        return lastname;
    }


}
