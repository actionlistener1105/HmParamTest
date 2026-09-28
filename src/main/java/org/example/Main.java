package org.example;

import ru.netology.services.RestCalcService;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        RestCalcService service = new RestCalcService();
        System.out.println(service.RestCulc(100000, 60000, 150000));
    }
}