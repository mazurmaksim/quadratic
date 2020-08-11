package com.quadratic.equation.service;

import com.quadratic.equation.entity.Calc;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.Query;
import java.util.List;

@Service("equationService")
@Transactional
public class CalculationServiceImpl implements CalculationService {

    @Autowired
    private SessionFactory sessionFactory;

    public void save(Calc calc) {
        sessionFactory.getCurrentSession().save(calc);
    }

    public List<Calc> findAll() {
        String select = "select * from CALCULATION";
        Query query = sessionFactory.getCurrentSession().createNativeQuery(select, Calc.class);
        return query.getResultList();
    }
}
