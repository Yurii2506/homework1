package shape;

public class ConsoleShapePrinter implements ShapePrinter{
    @Override
    public void print(shape shape){
        System.out.println(shape.getName());
    }

}