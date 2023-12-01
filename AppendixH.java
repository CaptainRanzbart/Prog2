import java.util.Calendar;
import java.util.Date;

public class AppendixH {
  public class Event {
    private String title;
    private String location;

    private Date startTime;
    private Date endTime;

    public void setStartTime(int year, int month, int day, int hour, int minute){
      Calendar calendar = Calendar.getInstance();
      calendar.set(year,
          month -1,
          day,
          hour,
          minute,
          0);

      this.startTime = calendar.getTime();
    }
    public void setEndTime(int year, int month, int day, int hour, int minute){
      Calendar calendar = Calendar.getInstance();
      calendar.set(
          year,
          month,
          day,
          hour,
          minute,
          0
      );

      this.endTime = calendar.getTime();
    }

    public Date getStartTime(){
      return startTime;
    }
    public Date getEndTime(){
      return endTime;
    }
    public String getLocation(){
      return location;
    }
    public Event setLocation(String location){
      this.location = location;
      return this;
    }
    public Event setTitle(String title){
      this.title = title;
      return this;
    }
  }
  public class EventBuilder{
    private Event event;
    public EventBuilder(){
      this.event = new Event();
    }
    public EventBuilder title(String title){
      this.event.setTitle(title);
      return this;
    }
    public EventBuilder at(String location){
      this.event.setLocation(location);
      return this;
    }
    public EventBuilder startTime(int year, int mont, int day, int hour, int minute){
      this.event.setStartTime(year, mont, day, hour, minute);
      return this;
    }
    public EventBuilder endTime(int year, int mont, int day, int hour, int minute){
      this.event.setEndTime(year, mont, day, hour, minute);
      return this;
    }
    public Event build(){
      return this.event;
    }
  }
  public class EventBuilderMain{
    public void main(String[] args){
      Event prog2lecture = new EventBuilder()
      .title("Programmierung 2 - Method Chaining and Expression Builder Pattern")
          .at("Online meeting")
          .startTime(2020, 4, 22, 8, 15)
          .endTime(2929, 4, 22, 9, 45)
          .build();
    }
  }
}
