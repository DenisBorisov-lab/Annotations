package hometask;


import lombok.SneakyThrows;

import java.lang.reflect.Field;

@ToString(includeName = true)
public class Point {
    @ToString(includeName = true)
    int x;
    @ToString(includeName = true)
    int y;

    @SneakyThrows
    public static void main(String[] args) {
        Point point = new Point();
        System.out.println(ToStrings.converter(point));
    }
}
//Point[5, 10]
//Rectangle[[5, 10], width=20, height=30]