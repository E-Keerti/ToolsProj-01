package com.nit.main;


public class App
{
	public int sum(int x,int y)
	{
		return x+y;
	}
    public static void main(String[] args)
    {
    	App app =new App();
    	int sum = app.sum(10,30);
        System.out.println("sum::"+sum);
    }
}
