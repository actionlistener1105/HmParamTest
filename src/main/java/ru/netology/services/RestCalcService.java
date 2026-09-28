package ru.netology.services;

public class RestCalcService {

    public int RestCulc(int income, int expenses, int threshold){
        int money = 0;
        int countRest = 0;
        for (int month = 0; month < 12; month++){
            if(money > threshold){
                countRest++;
                money = (money - expenses) / 3;
            }
            else {
                money = money + income - expenses;
            }
        }
        return countRest;
    }

}
