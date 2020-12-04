import java.util.*;

public class Classroom {

    private String id;
    private Course course;
    private Student[] participants;
    private String room;
    private String term;

    private Classroom() {}

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
         id = Course.getID();
        return id + "-" + term;
    }

    public void addStudent(Student student)
    {
        for(int i = 0;i < participants.length; i++)
        {
           participants[i] = student;
        }
    }

    public String getParticipantsEmail()
    {
        int i = 0;
        while (i < participants.length)
        {
            i++;
            return participants[i].getID() + "@student.hsrw";
        }
        return null;
    }

    public int getTotalParticipants()
    {
        return participants.length;
    }
}
