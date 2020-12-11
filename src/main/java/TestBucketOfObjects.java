public class TestBucketOfObjects {
    

    public static void main(String[] args) {

    Triangle tri1 = new Triangle(3,4,5);
    Rectangle rec1 = new Rectangle(6,5);
    Circle cir1 = new Circle(25);
    RegularPolygon pol1 = new RegularPolygon(5,15);
    RegularPolygon pol2 = new RegularPolygon(7,9);

    BucketOfObjects bucket = new BucketOfObjects();
    bucket.addObject(tri1);
    bucket.addObject(rec1);
    bucket.addObject(cir1);
    bucket.addObject(pol1);
    bucket.addObject(pol2);

    System.out.println(tri1.getPerimeter());
    System.out.println(rec1.getPerimeter());
    System.out.println(cir1.getPerimeter());
    System.out.println(pol1.getPerimeter());
    System.out.println(pol2.getPerimeter());

    System.out.println(bucket.getTotalPerimeter());
    System.out.println(bucket.getTotalArea());
    System.out.println(bucket.toString());




}
}
