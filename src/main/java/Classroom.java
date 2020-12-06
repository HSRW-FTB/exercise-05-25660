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
        id = course.getID();
        return id + "-" + term;
    }

    public void addStudent(Student student)
    {
       participants = new Student[100];
       for (int i = 0; i < 100; i++)
       {
          participants[i] = student;
       }
        //participants = new Student[5];
        //participants[0] = student;
    }

    public String getParticipantsEmail()
    {
        String partEmail = "";
        for(int i = 0; i < (participants.length - 1); i++)
        {
            partEmail = partEmail + (this.participants[i].getFQUN() + ", ");
        }
        partEmail = partEmail + this.participants[participants.length-1].getFQUN();
        return partEmail;
    }

    public int getTotalParticipants()
    {
        return participants.length;
    }
}
