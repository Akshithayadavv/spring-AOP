package com.luv2code.aopdemo.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipDAO {

    public void addAccount(){

        System.out.println(getClass() + ": Doing STUFF: ADDING A MEMBERSHIP ACCOUNT");
   //return "hi";
    }

    public void goToSleep(){
        System.out.println(getClass() +":Go to sleep");
    }
}
