package ru.ibs.education.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import ru.ibs.education.model.CalculationRequest;
import ru.ibs.education.model.CalculationResponse;
import ru.ibs.education.services.CalculationService;

/**
 * Контроллер расчетов.
 *
 * @author vbotalov
 */
@RestController
@RequestMapping("/calculator")
public class CalculationController {

    private final CalculationService calculationService;

    @Autowired
    public CalculationController(@Qualifier("database") CalculationService calculationService) {
        this.calculationService = calculationService;
    }

    @RequestMapping(value = "/calc", method = RequestMethod.POST)
    public CalculationResponse pay(@RequestBody CalculationRequest request) {
        return calculationService.calc(request);
    }

}
