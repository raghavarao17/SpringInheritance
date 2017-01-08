package com.spring.di.demo.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.di.demo.domain.Capital;

public class SpringInheritanceMain
{

    public static void main( String[] args )
    {
    	//When we are working with application context.xml , 
    	//1.Load the file in step 1
    	//2. Create the Bean instance manually
    	//3. Load the reference bean with the bean name:
        ApplicationContext appContext = new ClassPathXmlApplicationContext( "applicationContext.xml" );
        
        Capital capital = (Capital) appContext.getBean( "capitalBean" );
        String countryName = capital.getCountryName();// am getting this from country class
        String capitalName = capital.getCapitalName();
        System.out.println( countryName + " have " + capitalName );
    }
}