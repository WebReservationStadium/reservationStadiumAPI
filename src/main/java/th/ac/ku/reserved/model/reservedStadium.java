package th.ac.ku.reserved.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class reservedStadium {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int stadium;
    private String name;
    private String day;
    private String start;
    private String end;
    private boolean status;

    public int getStadium() {
        return stadium;
    }

    public void setStadium(int stadium) {
        this.stadium = stadium;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }
    @Override
    public String toString() {
        return "reservedStadium{" +
                "id=" + id +
                ", stadium=" + stadium +
                ", name='" + name + '\'' +
                ", day='" + day + '\'' +
                ", start='" + start + '\'' +
                ", end='" + end + '\'' +
                ", status=" + status +
                '}';
    }


}