package org.example;
@SpringBootApplication
public class QcalcApplication {
    public static void main(String[] args) {
        //SpringApplication.run(QcalcApplication.class, args);

        // StandardCalculator calc = new StandardCalculator();

        // calc.add(Double.MAX_VALUE, 1.0);

        // calc.printResult();
        // calc.add(Double.MAX_VALUE, Double.MAX_VALUE);

        // calc.printResult();
        LogicCalculator calc = new LogicCalculator();
        StandardCalculator sd=new StandardCalculator();
//        System.out.println();
        calc.getVersion();

        calc.AND(5, 7);

        calc.printResult();

    }
}
