package test;

import java.util.ArrayList;

import model.PlanDatabase;
import model.BasicPlan;
import model.Mobile;

public class PlanDataTest {

    //int[] pricing = PlanData.price;

    public static void main(String[] args) {

    ArrayList<BasicPlan> pricing = PlanDatabase.plan;
    ArrayList<Mobile> david = PlanDatabase.mob;
    System.out.println(david.get(0));
    
    Mobile bp;
    for(int i=0;i<3;i++){
    bp = david.get(i);
    bp.display();
    //bp.buy();
    //bp.cashBack(150);
    }
    
   //System.out.println(pricing.get(0));

}
}



