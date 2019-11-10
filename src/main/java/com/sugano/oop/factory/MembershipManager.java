package com.sugano.oop.factory;

public class MembershipManager
{
    public void createMembership(String type)
    {
        Member member; 

        if(type == "Lite")
        {
            member = new LiteMember(); 
        }
        else if(type == "Annual")
        {
            member = new AnnualMember(); 
        }
        else
        {
            member = new TempMember(); 
        }
    }
}
