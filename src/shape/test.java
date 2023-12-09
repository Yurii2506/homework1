package shape;

public class test {
    public static void main(String[] args) {
        circle circle = new circle();
        ShapePrinter a1 = new ConsoleShapePrinter();
        a1.print(circle);

        rhombus rhombus = new rhombus();
        ShapePrinter a2 = new ConsoleShapePrinter();
        a2.print(rhombus);

        rectangle rectangle = new rectangle();
        ShapePrinter a3 = new ConsoleShapePrinter();
        a3.print(rectangle);

        square square = new square();
        ShapePrinter a4 = new ConsoleShapePrinter();
        a4.print(square);

        triangle triangle = new triangle();
        ShapePrinter a5 = new ConsoleShapePrinter();
        a5.print(triangle);


    }
}