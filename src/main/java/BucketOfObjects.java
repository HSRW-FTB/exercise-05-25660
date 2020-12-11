public class BucketOfObjects {
   
    private GeometricObject[] items = new GeometricObject[10];
    private int index = -1;

    public BucketOfObjects() {}

    public void addObject(GeometricObject obj)
    {
        this.index++;
        this.items[this.index] = obj;
    }

    public double getTotalArea()
    {
        double Area = 0;
        for(int i = 0; i <= index; i++)
       {
            Area = Area + items[i].getArea();
       }
       return Area;
    }
    
    public double getTotalPerimeter()
    {
        double Perimeter = 0;
        for(int i = 0; i <= index; i++)
       {
            Perimeter = Perimeter + items[i].getPerimeter();
       }
       return Perimeter;
    }

    public String toString()
    {

        String objectsType= "";
        int i;
        for (i= 0 ; i <= index; i++){
            if (items[i].getClass().equals(Rectangle.class))
            {
                objectsType = objectsType +  "Rectangle";
            }
            else if (items[i].getClass().equals(Circle.class))
            {
                objectsType = objectsType +  "Circle";
            }
            else if (items[i].getClass().equals(Triangle.class))
            {
                objectsType = objectsType +  "Triangle";
            }
            else
            {
                objectsType = objectsType +  "RegularPolygon";
            }
            objectsType = objectsType +  ", ";
        }
        objectsType = objectsType.substring(0,objectsType.length() -2);

        return objectsType;
    }
}
