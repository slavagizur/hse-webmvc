package ru.ibs.education.persistence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import ru.ibs.education.persistence.model.SampleModel;

/**
 * Репозиторий для общения с БД.
 *
 * @author vbotalov
 */
public interface CalculationRepository extends JpaRepository<SampleModel, Long> {

    /**
     * Вызов запроса с использованием функции f_calc.
     *
     * @param first     первый аргумент расчета
     * @param second    второй аргумент расчета
     * @param operation операция (+,-,*,/)
     * @return результат выполнения операции
     */
    @Query(nativeQuery = true, value = "select f_calc(:first, :second, :oper)")
    double getCalculationResult(@Param("first") double first,
                                @Param("second") double second,
                                @Param("oper") String operation);
}
