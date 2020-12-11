import java.util.*;

public class Classroom {

    private String id;
    private Course course;
    private Student[] participants = new Student[10];
    private String room;
    private String term;
    private int index = -1;

    //private Classroom() {}

    public Classroom(Course course, String room)
    {
        this.course = course;
        this.room = room;
    }

    public Classroom(Course course, String room, java.util.Date date)
    {
        this.course = course;
        this.room = room;
    }

    public Course getCourse()
    {
        return course;
    }

    public String getRoom()
    {
        return room;
    }

    public void setRoom(String room)
    {
        this.room = room;
    }

    public String getTerm()
    {
        Calendar cal = new GregorianCalendar();
        int m = cal.get(Calendar.MONTH);
        int y = cal.get(Calendar.YEAR);

        if(m> 2 && m < 10)
        {
            term = "SS" + y;
            return term;
        }
        else
        {
            term = "WS" + y + "/" + ((y%2000)+1);
            return term;
        }
    }

    public String getID()
    {
        id = course.getID();
        return id + "-" + term;
    }

    public void addStudent(Student student)
    {
        this.index++;
        this.participants[this.index] = student;   
    }

    public String getParticipantsEmail()
    {
        String partEmail = "";
        for(int i = 0; i <= index; i++)
        {
            partEmail = partEmail + participants[i].getFQUN() + ", ";
        }

        partEmail = partEmail.substring(0, partEmail.length() - 2);
        return partEmail;
    }

    public int getTotalParticipants()
    {
        int total = 0;
        for (int i = 0; i <= index; i++)
        {
            total++;
        }
        return total;
    }
}
