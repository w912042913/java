package day16.singlelan.work;

public class Shape {
    private int  area;
    private int per;
    private  String   color;
    int r=5;



    public Shape() {
    }

    public Shape(String color) {
        this.color = color;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getPer() {
        return per;
    }

    public void setPer(int per) {
        this.per = per;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void show(){
        System.out.println("面积"+"="+r*r*3.14+"周长"+"="+2*3.14*r+"颜色"+"="+color);
    }

}
