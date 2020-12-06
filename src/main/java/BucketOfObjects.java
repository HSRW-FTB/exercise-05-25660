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
        double Area = 0;
        for(int i = 0; i < items.length; i++)
       {
            Area = Area + items[i].getArea();
       }
       return Area;
    }
    
    public double getTotalPerimeter()
    {
        double Perimeter = 0;
        for(int i = 0; i < items.length; i++)
       {
            Perimeter = Perimeter + items[i].getPerimeter();
       }
       return Perimeter;
    }
    }

    public String toString()
    {
        return "nvm";
    }
}
