public class Point {

    private int x;
    private int y;

    // no-arg constructor
    public Point(){

    }

    // constructor
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // getters
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    // setters
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    // Distance between this point and point 0,0
    public double distance(){
        return distance(0,0);
    }

    // Distance between this point and point x,y
    public double distance(int x, int y){
        return Math.sqrt((x - this.x) * (x - this.x) + (y - this.y) * (y - this.y));
    }

    // Distance between another point and this point
    public double distance(Point anotherPoint){
        return distance(anotherPoint.x, anotherPoint.y);
    }
}

