public class BucketOfObjects {
   
    private GeometricObject[] items;

    public BucketOfObjects() {}

    public void addObject(GeometricObject obj)
    {
        for(int i = 0; ; i++)
        {
            items[i] = obj;
        }
    }

    public double getTotalArea()
    {
        for(int i = 0; ;i++)
       {
            return items[i].getArea();
       }
    }
    
    public double getTotalPerimeter()
    {
        for(int i = 0; ;i++)
       {
            return items[i].getPerimeter();
       }
    }

    public String toString()
    {
        return "fuck";
    }
}
