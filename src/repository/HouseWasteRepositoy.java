/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

import data_access.HouseWasteDAO;
import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author GoldCandy
 */
public class HouseWasteRepositoy implements IHouseWasteRepository {

    @Override
    public void estimateCost() {
        Locale loc = new Locale("vi", "VN");
        NumberFormat vn = NumberFormat.getInstance(loc);
        System.out.println("The total cost is "
                + vn.format(HouseWasteDAO.Instance().estimateCost())
                + "VND");
    }
}
