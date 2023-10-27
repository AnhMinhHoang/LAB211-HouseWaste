/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import repository.HouseWasteRepositoy;

/**
 *
 * @author GoldCandy
 */
public class HouseWasteController {

    HouseWasteRepositoy repo;

    public HouseWasteController() {
        repo = new HouseWasteRepositoy();
    }

    public void run() {
        repo.estimateCost();
    }
}
