package org.example.ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.services.RestCalcService;

import javax.management.ConstructorParameters;

public class RestCulcTest {


    @ParameterizedTest
    @CsvFileSource(resources = "/data.csv")
//    @CsvSource({
//            "100000,60000,150000,2",
//            "10000,3000,20000,3"
//    })
    public void culc(int income, int expenses, int threshold, int expected){
        RestCalcService service = new RestCalcService();

        int actual = service.RestCulc(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);
    }

}
