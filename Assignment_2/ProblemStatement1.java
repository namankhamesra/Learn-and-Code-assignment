package Assignment_2;

public class Data {
    int firstNumber;
    double decimalNumber;
    String text;

    public void addRealNumbers(int firstNumber, int secondNumber) {
        int result = firstNumber + secondNumber;
        System.out.println("Result: " + result);
    }

    public void convertTextToUpperCase(String inputString) {
        text = inputString.toUpperCase();
        System.out.println("Updated String: " + text);
    }
}

public class ProblemStatement1 {
    public static void main(String[] args) {
        Data data = new Data();
        data.firstNumber = 10;
        data.decimalNumber = 20.5;
        data.text = "hello";
        
        data.addRealNumbers(data.firstNumber, 5);
        data.convertTextToUpperCase("world");
    }
}
