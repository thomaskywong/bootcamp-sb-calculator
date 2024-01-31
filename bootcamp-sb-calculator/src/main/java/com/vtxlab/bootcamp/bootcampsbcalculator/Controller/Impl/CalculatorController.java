package com.vtxlab.bootcamp.bootcampsbcalculator.Controller.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.vtxlab.bootcamp.bootcampsbcalculator.Controller.CalculatorOperation;
import com.vtxlab.bootcamp.bootcampsbcalculator.Service.CalculatorService;
import com.vtxlab.bootcamp.bootcampsbcalculator.Service.Impl.CalculatorServiceImpl;

@Controller
@ResponseBody
@RequestMapping(value = "/api/v1")
public class CalculatorController implements CalculatorOperation {

  @Autowired
  private CalculatorService calculatorService;

  @Override
  public Double calculate(String x, String y, String operation)
      throws NumberFormatException {
    double xd = 0.0d;
    double yd = 0.0d;

    double result = 0.0d;

    xd = Double.parseDouble(x);
    yd = Double.parseDouble(y);

    if (!("a".equals(operation) || "s".equals(operation)
        || "m".equals(operation) || "d".equals(operation))) {
      throw new IllegalArgumentException(
          "Invalid operation identifier. (Valid Operation: a, s, m, d)");
    }

    switch (operation) {
      case "a":
        // result = new CalculatorServiceImpl().add(xd, yd);
        result = calculatorService.add(xd, yd);
        break;
      case "s":
        // result = new CalculatorServiceImpl().subtract(xd, yd);
        result = calculatorService.subtract(xd, yd);
        break;
      case "m":
        // result = new CalculatorServiceImpl().multiply(xd, yd);
        result = calculatorService.multiply(xd, yd);
        break;
      case "d":
        // result = new CalculatorServiceImpl().divide(xd, yd);
        result = calculatorService.divide(xd, yd);
        break;
      default:
        result = 0.0d;
    }

    return result;


  }



}
