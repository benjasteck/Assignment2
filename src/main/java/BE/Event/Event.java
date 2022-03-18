package BE.Event;

public class Event {
    private String Title;
    private String Location;
    private String Time;
    private String Desc;
    private String Misc1;
    private String Misc2;
    private String Misc3;
    private String Misc4;
    private String Misc5;
    private int id;

    public Event(String title, String location, String time, String desc, String misc1, String misc2, String misc3, String misc4, String misc5, int id) {
        this.Title = title;
        this.Location = location;
        this.Time = time;
        this.Desc = desc;
        this.Misc1 = misc1;
        this.Misc2 = misc2;
        this.Misc3 = misc3;
        this.Misc4 = misc4;
        this.Misc5 = misc5;
        this.id = id;
    }
    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public String getTime() {
        return Time;
    }

    public void setTime(String time) {
        Time = time;
    }

    public String getDesc() {
        return Desc;
    }

    public void setDesc(String desc) {
        Desc = desc;
    }

    public String getMisc1() {
        return Misc1;
    }

    public void setMisc1(String misc1) {
        Misc1 = misc1;
    }

    public String getMisc2() {
        return Misc2;
    }

    public void setMisc2(String misc2) {
        Misc2 = misc2;
    }

    public String getMisc3() {
        return Misc3;
    }

    public void setMisc3(String misc3) {
        Misc3 = misc3;
    }

    public String getMisc4() {
        return Misc4;
    }

    public void setMisc4(String misc4) {
        Misc4 = misc4;
    }

    public String getMisc5() {
        return Misc5;
    }

    public void setMisc5(String misc5) {
        Misc5 = misc5;
    }

    private int getId(int id){
        return id;
    }



}
