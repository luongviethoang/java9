package polymorphism;

public class TestShape {
    Shape s1 = new Rectangle("red",3,5);
        System.out.println(s1);
        System.out.println("Area is: "+s1.getArea());

    Shape s2 = new Triangle("blue",2,4);
        System.out.println(s2);
        System.out.println("Area is: "+s2.getArea());

    Shape s3 = new Shape("green");
        System.out.println(s3);
        System.out.println("Area is "+s3.getArea());
}
}
