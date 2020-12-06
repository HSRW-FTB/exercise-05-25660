public class BucketOfObjects {
   
    private GeometricObject[] items;

    public BucketOfObjects() {}

    public void addObject(GeometricObject obj)
    {
        items = new GeometricObject[4];
        for(int i = 0; i < items.length; i++)
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
   
    public String toString()
    {
      String obj = "";
  
      for(int i = 0; i < items.length; i++)
      {
        if(i == (items.length-1))
        {
            obj = obj + String.valueOf(items[i]);
        }
        else
        {
            obj = obj + (String.valueOf(items[i]) + ", ");
        }
      }
      return obj;
    }
}
