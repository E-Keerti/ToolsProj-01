package com.nit.main;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AppTest 
{
    @Test
    public void testSumWithPositive()
    {
    	App app=new App();
    	int execpted=300;
    	int actual = app.sum(100, 200);
    	assertEquals(execpted,actual);
    }
    
    @Test
    public void testSumWithNegative()
    {
    	App app=new App();
    	int execpted=-300;
    	int actual = app.sum(-100,-200);
    	assertEquals(execpted,actual);
    }
    
    @Test
    public void testSumWithMixedValues()
    {
    	App app=new App();
    	int execpted=100;
    	int actual = app.sum(-100,200);
    	assertEquals(execpted,actual);
    }
    
}
