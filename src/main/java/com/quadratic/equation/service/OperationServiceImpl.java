package com.quadratic.equation.service;

import com.quadratic.equation.entity.Calc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("calculateService")
public class OperationServiceImpl implements OperationService {

    @Autowired
    CalculationService calculationService;

    public void calculate(double a, double b, double c) {
        Double r_x1 = null;
        Double r_x2 = null;

        if (a == 0)
            throw new ArithmeticException();

        double discriminant = Discriminant(a, b, c);
        if (discriminant > 0) {
            r_x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            r_x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
        } else if (discriminant == 0) {
            r_x1 = -b / (2 * a);
        } else {

            throw new RuntimeException("Дискримінант менший нуля");
        }

        Calc calc = new Calc(a, b, c, r_x1, r_x2);
        calculationService.save(calc);
    }

    private double Discriminant(double a, double b, double c) {
        return Math.pow(b, 2) - 4 * a * c;
    }

    private void saveCalculate(Calc calc) {
        calculationService.save(calc);
    }


}
