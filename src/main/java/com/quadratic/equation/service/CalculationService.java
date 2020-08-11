package com.quadratic.equation.service;

import com.quadratic.equation.entity.Calc;

import java.util.List;

public interface CalculationService {

    public void save(Calc calc);

    public List<Calc> findAll();

}
