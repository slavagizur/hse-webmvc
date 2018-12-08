package ru.ibs.education.model;

/**
 * Параметры для выполнения расчета.
 *
 * @author vbotalov
 */
public class CalculationRequest {

    /** Первый аргумент. */
    private double first;

    /** Второй аргумент. */
    private double second;

    /** Выполняемая операция. */
    private String operation;

    public double getFirst() {
        return first;
    }

    public void setFirst(double first) {
        this.first = first;
    }

    public double getSecond() {
        return second;
    }

    public void setSecond(double second) {
        this.second = second;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }
}
