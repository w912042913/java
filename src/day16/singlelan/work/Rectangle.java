package day16.singlelan.work;

public class Rectangle extends Shape {
   private  int width;
   private  int height;

    @Override
    public int getArea() {
        return super.getArea();
    }

    @Override
    public int getPer() {
        return super.getPer();
    }

    @Override
    public void show() {
        super.show();
    }

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(String color, int width, int height) {
        super(color);
        this.width = width;
        this.height = height;
    }
}
