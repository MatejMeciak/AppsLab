package com.company;

public class Triangle {
    int a;
    int b;
    int c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public static int getPerimeter(Triangle triangle){
        return triangle.a + triangle.b + triangle.c;
    }

    public static int getArea(Triangle triangle){
        int s = (triangle.a + triangle.b + triangle.c) / 2;
        return (int) Math.sqrt(s*(s - triangle.a)*(s - triangle.b)*(s- triangle.c));
    }
}