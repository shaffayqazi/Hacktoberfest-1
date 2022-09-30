
public class Circle {

    Circle(int r)
{
    System.out.println("Constructor called");
     this.raduis = r;
}

   public double raduis;

    public double area()
    {
        return Math.PI*this.raduis*this.raduis;

    }
}

    class Cylinder extends Circle{
    public int height;
    Cylinder(int b,int r){
   super(r);
   this.height= b;
}



    public double Volume()
    {
        return Math.PI*this.raduis*this.raduis*this.height;
    }
}

class Launcher{

    public static void main(String[] args) {

        Circle objC = new Circle(12);
        Cylinder objCL = new Cylinder(12,2);

        double c = objC.area();
        System.out.println(c);
        double cl =  objCL.Volume();
        System.out.println(cl);
    }

}