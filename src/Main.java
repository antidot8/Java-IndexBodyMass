public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 82.4;
        double height = 1.9;
        double bmi = service.calculate(82.4, 1.9);
        System.out.println(bmi);
    }
}
