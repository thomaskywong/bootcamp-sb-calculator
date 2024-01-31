package com.vtxlab.bootcamp.bootcampsbcalculator.Service.Impl;

import java.math.BigDecimal;
import java.math.RoundingMode;
import org.springframework.stereotype.Service;
import com.vtxlab.bootcamp.bootcampsbcalculator.Service.CalculatorService;

@Service
public class CalculatorServiceImpl implements CalculatorService {

  @Override
  public double add(double x, double y) {
    return BigDecimal.valueOf(x).add(BigDecimal.valueOf(y)).doubleValue();
  }

  @Override
  public double subtract(double x, double y) {
    return BigDecimal.valueOf(x).subtract(BigDecimal.valueOf(y)).doubleValue();
  }

  @Override
  public double multiply(double x, double y) {
    return BigDecimal.valueOf(x).multiply(BigDecimal.valueOf(y)).doubleValue();
  }

  @Override
  public double divide(double x, double y) {
    return BigDecimal.valueOf(x).divide(BigDecimal.valueOf(y),2,RoundingMode.HALF_UP).doubleValue();
  }

}
