package model;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.*;


public class DataPlan extends BasicPlan {
    
    private String data;
    private char currency = '$';
    public DataPlan(String data,String price,String talktime,String sms,String validity){
        super(price, talktime, sms, validity);
        this.data=data;

    }


@Override
public void display(){
      super.display();
    System.out.println(data+" "+"GB"+"    "+currency+"" +price + "    " + "unlimited" + "  " + " " + "unlimited" +" "+ "  " + validity+" "+"days");

}
@Override
public void  buy(){
    System.out.println("paythrough credit card");
}

@Override
public void cashBack(int price){

      Double promo_amount=0.5*price;
      System.out.println(promo_amount);

}

@Override
public void render(Graphics2D g2){
    g2.setColor(Color.BLUE);
    g2.setFont(new Font("Courier", Font.ITALIC,100));
    g2.drawString("DATA PLAN ",450,100);
    g2.setColor(Color.RED);
    g2.setFont(new Font("Courier", Font.ITALIC,60));
    g2.drawString("Data ",50,190);
    g2.setColor(Color.RED);
    g2.setFont(new Font("Courier", Font.ITALIC,60));
    g2.drawString("Price ",300,190);
    g2.setColor(Color.RED);
    g2.setFont(new Font("Courier", Font.ITALIC,60));
    g2.drawString("Talktime ",490,190);
    g2.setColor(Color.RED);
    g2.setFont(new Font("Courier", Font.ITALIC,60));
    g2.drawString("SMS",850,190);
    g2.setColor(Color.RED);
    g2.setFont(new Font("Courier", Font.ITALIC,60));
    g2.drawString("Validity ",1050,190);
    g2.setColor(Color.YELLOW);
    g2.setFont(new Font("courier",Font.BOLD,44));
   // g2.drawString(customerName, 50, 100);
 // for(int i=0;i<PlanDatabase.plan.size();i++){
     g2.drawString(data, 50, 290);
    g2.drawString(price, 300,290);
    g2.drawString(talktime, 490,290);
    g2.drawString(sms, 850, 290);
    g2.drawString(validity, 1050,290);


}
}

