package com.company;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AggregatorWebService
{
    public static void main( String[] args )    {
        SpringApplication.run(AggregatorWebService.class);
        System.out.println( "Hello World!" );
    }
}
