/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data_access;

import common.Validation;

/**
 *
 * @author GoldCandy
 */
public class HouseWasteDAO {

    private static HouseWasteDAO instance = null;
    Validation valid = new Validation();

    public static HouseWasteDAO Instance() {
        if (instance == null) {
            synchronized (HouseWasteDAO.class) {
                if (instance == null) {
                    instance = new HouseWasteDAO();
                }
            }
        }
        return instance;
    }

    public int estimateCost() {
        String s = valid.inputString("enter the amount of garbage at each station(kg)");
        int money = 0;
        double time = 0;
        int total = 0;
        String[] amounts = s.split(" ");
        for (String amount : amounts) {
            try {
                total = total + Integer.parseInt(amount);
            } catch (NumberFormatException e) {
                System.err.println(amount + " is not an integer");
                continue;
            }
            time = time + 8;
            if (total >= 10000) {
                //dump and collected the remaining waste(16 minutes)
                //go to the dump and return to station(30 minutes)
                if(total == 10000){
                    time = time + 30;
                }
                else{
                    time = time + 8 + 30;
                }
                //take garbage to dump
                total = total - 10000;
                money = money + 57000;
            }
        }
        //dump the remaining garbage
        if(total > 0){
            time = time + 30;
            money = money + 57000;
        }
        //return to base(+ 30 minutes)
        if (time != 0) {
            time = (time + 30) / 60;
        }
        return money + (int) (time * 120000);
    }
}
