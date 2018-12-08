package ru.ibs.education.services;

import org.springframework.beans.factory.annotation.Autowired;
import ru.ibs.education.model.CalculationRequest;
import ru.ibs.education.model.CalculationResponse;
import ru.ibs.education.persistence.repositories.CalculationRepository;

public class DBCalculationService implements CalculationService {

    private static final String EXECUTOR = "POSTGRES";

    @Autowired
    private CalculationRepository repository;

    @Override
    public CalculationResponse calc(CalculationRequest request) {
        CalculationResponse response = new CalculationResponse(EXECUTOR);
        response.setSourceRequest(request.toString());
        try {
            double result = repository.getCalculationResult(request.getFirst(), request.getSecond(), request.getOperation());
            response.setResult(result);
            response.setSuccess(true);
        } catch (Exception e) {
            response.setSuccess(false);
            StringBuilder message = new StringBuilder();
            fillMessageRecursive(message, e);
            response.setMessage(message.toString());
        }
        return response;
    }

    private void fillMessageRecursive(StringBuilder message, Throwable throwable) {
        if (throwable == null) {
            return;
        }
        if (message.length() > 0) {
            message.append(" вызвано ");
        }
        message.append(throwable.getMessage());
        fillMessageRecursive(message, throwable.getCause());
    }
}
