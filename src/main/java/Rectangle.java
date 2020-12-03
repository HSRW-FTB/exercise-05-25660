public class Rectangle extends GeometricObject {

    private double width, height; 

    public Rectangle() {} 

    public Rectangle(double width, double height)
    {  
        this.width = width; 
        this.height = height;
    } 

    public Rectangle (double width, double height, String color, boolean filled) 
    {
        super(color, filled);
        this.width = width; 
        this.height = height; 
    }

    public double getWidth()
    {
        return width;
    }

    public double getHeight()
    {
        return height;
    }
  
    public void setWidth(double width)
    {
        this.width = width;
    }

    public void setHeight(double height)
    {
        this.height = height;
    } 

    public double getArea() 
    {
        return width * height;
    }
    
    public double getPerimeter()
    {
        return 2 * (width + height);
    } 

    public void setFilled(int n) 
    {
        if(n > 0)
        {
            super.setFilled(true);
        } 
        else
        {
            super.setFilled(false);
        } 
    }

    public void changeColor(String color) 
    { 
        super.setColor(color);
    }
 
}
