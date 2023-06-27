/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midsemester;

/**
 *
 * @author summer
 */
public class Item {
    private int item_number;
    private String item_description;
    private double item_cost;
    
    Item(int item_number, String item_description, double item_cost)
    {
        this.item_number = item_number;
        this.item_description = item_description;
        this.item_cost = item_cost;
    }
    
    public int getNumber()
    {
        return item_number;
    }
    public String getDescription()
    {
        return item_description;
    }
    public double getCost()
    {
        return item_cost;
    }
    public void setNumber(int item_number)
    {
        this.item_number = item_number;
    }
    public void setDescription(String item_description)
    {
        this.item_description = item_description;
    }
    public void setCost(double item_cost)
    {
        this.item_cost = item_cost;
    }
}
