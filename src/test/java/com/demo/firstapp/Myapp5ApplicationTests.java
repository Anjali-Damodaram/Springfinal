package com.demo.firstapp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration
class Myapp5ApplicationTests {
	@InjectMocks
private Myapp5Application controller;
/*@Test
public void contextLoads() throws Exception{
	Myapp5Application.main(new String[] {});
}*/
@Test
public void Test(){
controller.main(new String[] {});
}
}		 
