package hometask;

import lombok.Data;

public class Point {
    @ToString(includeName = true)
    int x;
    @ToString(includeName = true)
    int y;

    public static void main(String[] args) {


    }
}
//Point[5, 10]
//Rectangle[[5, 10], width=20, height=30]