package ru.netology.services;

public class VacationCalculator {
    public int calculateMonthsOfVacation(int income, int expenses, int threshold) {
        int count = 0;
        int money = 0;

        for (int month = 0; month < 12; month++) {
            if (money >= threshold) {
                count++;
                money -= expenses;
                money -= money / 3;
            } else {
                money += income;
                money -= expenses;
            }
        }
        return count; 
    }
}