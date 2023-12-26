package SRP;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5.0, 3.0);

        AreaPrinter areaPrinter = new AreaPrinter();
        areaPrinter.printArea(rectangle);

        AreaFileWriter areaFileWriter = new AreaFileWriter();
        areaFileWriter.writeAreaToFile(rectangle);
    }
}
