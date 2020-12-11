import java.util.Date;

public class Student extends User {

    private static int idGen = 10000;
    private StudyCourse studycourse;
    Domain domain = Domain.STUDENT; 

    /*private Student()
    {
      Integer.toString(idGen);
      idGen++;
    }*/

    public Student(String firstname , String lastname) 
    {
        super(Integer.toString(idGen), Domain.STUDENT, firstname, lastname);
        idGen++;
    }

    public Student(String firstname, String lastname, Date birthdate)
    {
        super(Integer.toString(idGen), Domain.STUDENT, firstname, lastname, birthdate);        
        idGen++;
    }

    public StudyCourse getStudyCourse() {
        return studycourse;
    }

    public String getStudyCourseDescription() {
        switch (studycourse) {
            case ME: return "Mechanical Engineering, B.Sc.";
            case MSE: return "Mechatronic Systems Engineering, B.Sc."; 
            case EL: return "Electrical Engineering, B.Sc."; 
            case IE: return "Industrial Engineering, B.Sc."; 
            case BMS: return "Biomaterial Science, B.Sc."; 
            case SCB: return "Science Communication & Bionics, B.Sc."; 
            case MME: return "Mechanical Engineering, M.Sc."; 
            case MBB: return "Bionics, B.Sc.";
            default: return "Wrong Study Course";
        }
    }

    public void setStudyCourse(StudyCourse sc) {
        studycourse = sc;
    }

    public void setStudyCourse(String sc) {
        switch (sc) {
            case "ME": studycourse = StudyCourse.ME; break;
            case "MSE": studycourse = StudyCourse.MSE; break;
            case "EL": studycourse = StudyCourse.EL; break;
            case "IE": studycourse = StudyCourse.IE; break;
            case "BMS": studycourse = StudyCourse.BMS; break;
            case "SCB": studycourse = StudyCourse.SCB; break;
            case "MME": studycourse = StudyCourse.MME; break; 
            case "MBB": studycourse = StudyCourse.MBB; break;

        }
    }
}

