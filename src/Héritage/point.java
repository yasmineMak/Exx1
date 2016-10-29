package Héritage;



public class point {
    private double x,y;
    public point(double x,double y) {
        this.x = x;
        this.y = y;
    }
    public point(double x){
        this.x = this.y = x;
    }
    public point(){
        this.x = this.y =0;

    }
    public double getX (){
        return x;
    }
    public  double getY(){
        return y;
    }
    public void deplace (int dx, int dy){
        x+=dx;
        y+=dy;

    }
}
