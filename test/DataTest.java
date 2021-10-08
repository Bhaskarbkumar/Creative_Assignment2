package test;

import model.BasicPlan;
import model.PlanDatabase;
import model.DataPlan;
import java.util.ArrayList;


public class DataTest {

    
    public static void main(String[] args) {

        ArrayList<DataPlan> Data = PlanDatabase.dplan;
        String[] abd = new String[] {"philips","taj","mahal"};
        
        //DataPlan bp;
        for(int i=0;i<3;i++){
            System.out.println(abd[i]);
        }
        
       //System.out.println(pricing.get(0));
    
    }
    
}
