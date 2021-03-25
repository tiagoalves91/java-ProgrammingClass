public class Point {
    private int x;
    private int y;


    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distance () {
        return distance(0,0);
    }
    public double distance(int x, int y){ // returns distance btn this points(x,y)
        return Math.sqrt((x - this.x) * (x - this.x) + (y - this.y) * (y - this.y));
    }
    public double distance(Point another) {// returns distance btn this point & another point
        return distance(another.x, another.y);
    }// end of instance methods

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
