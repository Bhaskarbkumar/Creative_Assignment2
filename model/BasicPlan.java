package model;

import java.awt.Color;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.awt.*;
import model.PlanDatabase;

public class BasicPlan{

    protected String price;
   // private String pric=String.valueOf(price);
    protected String talktime;
    protected String sms;
   // private String smss=String.valueOf(sms);
    protected String validity;
    protected char currency ='$' ;
    private String customerName="$150";
    private Graphics2D g2;
    private Graphics2D g3;
    private Graphics2D g4;
    
    

   public  BasicPlan(String price,String talktime,String sms,String validity){
       this.price=price;
       this.talktime=talktime;
       //this.currency=currency;
       this.sms=sms;
       this.validity=validity;
       
        
    }

    public void display(){

        System.out.println(currency+"" +price + "    " +currency+ talktime + "  " + " " + sms +" "+"perday"+ "  " + validity+" "+"days");

    }

    public void  buy(){
        System.out.println("NO upi's working, paythrough credit card");
    }

    public void cashBack(int price){

          Double promo_amount=0.2*price;
          System.out.println(promo_amount);

    }

    public void checkPhoneNumber(){

    }
    public void render(Graphics2D g2){
        g2.setColor(Color.BLUE);
        g2.setFont(new Font("Courier", Font.ITALIC,100));
        g2.drawString("BASIC PLAN ",450,100);
        g2.setColor(Color.RED);
        g2.setFont(new Font("Courier", Font.ITALIC,60));
        g2.drawString("Price ",50,190);
        g2.setColor(Color.RED);
        g2.setFont(new Font("Courier", Font.ITALIC,60));
        g2.drawString("Talktime ",340,190);
        g2.setColor(Color.RED);
        g2.setFont(new Font("Courier", Font.ITALIC,60));
        g2.drawString("SMS",680,190);
        g2.setColor(Color.RED);
        g2.setFont(new Font("Courier", Font.ITALIC,60));
        g2.drawString("Validity ",1050,190);
        g2.setColor(Color.YELLOW);
        g2.setFont(new Font("courier",Font.BOLD,44));
       // g2.drawString(customerName, 50, 100);
     // for(int i=0;i<PlanDatabase.plan.size();i++){
        g2.drawString(price, 50,290);
        g2.drawString(talktime, 340,290);
        g2.drawString(sms, 680, 290);
        g2.drawString(validity, 1050,290);
        //g2.drawString(price, 150, 100);
        
            
       }


        
         //  } 
       

}


