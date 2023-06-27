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
public class Books extends Item {
    private double VAT;
    private int ISBN_number;
    private String  book_category;
    private String book_author;
    
    
    Books(int item_number,String item_description,double item_cost,int ISBN_number,String book_category,String book_author )
    {
        super(item_number,item_description,item_cost);
        //this.VAT =VAT;
                this.ISBN_number = ISBN_number;
                this.book_category = book_category;
                this.book_author = book_author;
               
    }
    
    
    public int getISBNNumber()
    {
       return ISBN_number;
    }
    public String getCategory()
    {
        return book_category;
    }
    public String getAuthor()
    {
        return book_author;
    }
    
    public void setISBNNumber(int ISBN_number)
    {
        this.ISBN_number = ISBN_number;
    }
    public void setCategory(String book_category)
    {
        this.book_category = book_category;
    }
    public void setAuthor(String book_author)
    {
        this.book_author = book_author;
    }
    public String toString()
    {
        return "Number:" + super.getNumber() + "\nDescription:"+super.getDescription() + "\nCost:"+super.getCost()+  "\nISBN:"+getISBNNumber() + "\nCategory:"+getCategory()+ "\nAuthor:"+getAuthor();
    }
    
}
