package general;

public class Point {
    private double x;
    private int y;
    private double r;
    private String result;

    public Point (double x, int y, double r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    public Point(){};

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public String chekPenetration (double x, int y, double r){
        if (x > 0 && y > 0 ) return areaOne(x, y, r);
        if (x < 0 && y > 0) return "Нету пробития";
        if (x < 0 && y < 0) return areaThree(x, y, r);
        if (x > 0 && y < 0) return areaFour(x, y, r);
        return areaOn(x, y, r);
    }

    public String areaOne (double x, int y, double r){
        if (x <= r/2 && y <= r) return "Есть пробитие";
        return "Нету пробития";
    }

    public String areaThree (double x, int y, double r) {
        if (y <= -x - (r/2)) return "Есть пробитие";
        return "Нету пробития";
    }

    public String areaFour (double x, int y, double r) {
        if (Math.pow(x,2) + Math.pow(y, 2) <= Math.pow(r, 2)) return "Есть пробитие";
        return "Нету пробития";
    }

    public String areaOn (double x, int y, double r) {
        if (y == 0) {
            if (y <= r && y >= (r/2 * (-1))) return "Есть пробитие";
            return "Нету пробития";
        }
        if (Math.abs(x) <= r) return "Есть пробитие";
        return "Нету пробития";
    }
}
