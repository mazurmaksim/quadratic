package com.quadratic.equation.controller;

import com.quadratic.equation.entity.Calc;
import com.quadratic.equation.service.OperationService;
import com.quadratic.equation.service.CalculationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/")
public class MainController {

    @Autowired
    private OperationService operationService;
    @Autowired
    private CalculationService calculationService;

    @RequestMapping(method = RequestMethod.GET)
    public String index(Model model){
        List<Calc> equations = calculationService.findAll();
        model.addAttribute("equations", equations);
        return "index";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String calculation(
            @RequestParam String a,
            @RequestParam String b,
            @RequestParam String c,
            Model model
    ) {
        if(Double.valueOf(a) == 0) {
            new RuntimeException("A can't be a 0");
        }

        operationService.calculate(Double.valueOf(a), Double.valueOf(b), Double.valueOf(c));
        List<Calc> calculations = calculationService.findAll();
        model.addAttribute("calculations", calculations);
        return "index";
    }


}
