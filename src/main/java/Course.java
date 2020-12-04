public class Course {
    
    private String id;
    private String name;
    private Professor lecturer;
    private int credit;

    private Course() {}

    public Course(String id, String name, Professor professor, int credit)
    {
        this.id = id;
        this.name = name;
        this.lecturer = professor;
        this.credit = credit;
    }

    public String getID()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setLecturer(Professor lecturer)
    {
        this.lecturer = lecturer;
    }

    public Professor getLecturer()
    {
        return lecturer;
    }

    public int getCredit()
    {
        return credit;
    }

    public void setCredit(int credit)
    {
        this.credit = credit;
    }

}

