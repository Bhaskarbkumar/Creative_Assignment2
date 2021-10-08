package model;

import java.util.ArrayList;

public class PlanDatabase {
    
    //public static final ArrayList<Integer> pricing = new ArrayList<>();
    //public static final int[] price = new int[3];
    //public static final ArrayList<Double> talktime = new ArrayList<>();
    //public static final ArrayList<Integer>  sms= new ArrayList<>();
    //public static final ArrayList<Integer> valid = new ArrayList<>();

    public static final ArrayList<BasicPlan> plan = new ArrayList<>();
    public static final ArrayList<DataPlan> dplan = new ArrayList<>();
    public static final ArrayList<Mobile> mob = new ArrayList<>();

    
    static{
        //pricing.add(150);
        //pricing.add(200);
        //pricing.add(250);
         
        
        mob.add(new Mobile(9169268123L));
        mob.add(new Mobile(8106240757L));
        mob.add(new Mobile(7659879658L)); 
  

        plan.add(new BasicPlan("$150", "$141.98", "50 msgs",  "28 days"));
        plan.add(new BasicPlan("$200", "$191.89", "100 msgs", "56 days"));
        plan.add(new BasicPlan("$250", "$238.76", "175 msgs", "84 days"));

        //dplan.add(new DataPlan("five", 340.87, 50, 28, 1));
        //dplan.add(new DataPlan("six", 539.99, 100, 56, 1));
        //dplan.add(new DataPlan("seven", 741.23, 175, 84, 1));


    

    }

    
 
    
  }


