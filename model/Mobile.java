package model;

import java.util.ArrayList;

public class Mobile {

    private Long num;

    public Mobile(Long num){
        this.num=num;
    }

   
    
    public void display(){

        System.out.println(num);

    }


    public boolean checkNum(Long response){
        return response.equals(num);
    }

    public Long getNum(){
        return num;
    }

}
