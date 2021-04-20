package hometask;

import hometask.ToString;

@ToString(includeName = true)
public class Point {
    @ToString(includeName = true)
    int x;
    @ToString(includeName = true)
    int y;

    public static void main(String[] args) {
        Point point = new Point();
        System.out.println(point.x);
    }
}
//Point[5, 10]
//Rectangle[[5, 10], width=20, height=30]