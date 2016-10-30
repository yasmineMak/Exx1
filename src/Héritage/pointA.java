package Héritage ;



public class pointA extends point{
    public  pointA(double x, double y)
    {
        super(x,y);
    }
    public void affichercoord()
    {
        System.out.println("("+getX()+","+getY()+")");
    }
}
//
