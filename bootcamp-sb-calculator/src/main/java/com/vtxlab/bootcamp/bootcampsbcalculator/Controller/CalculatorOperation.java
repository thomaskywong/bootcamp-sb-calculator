package com.vtxlab.bootcamp.bootcampsbcalculator.Controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

public interface CalculatorOperation {

  @PostMapping(value = "/x/{x}/y/{y}/operation/{operation}")
  Double calculate(@PathVariable String x, @PathVariable String y, @PathVariable String operation);
  
}
