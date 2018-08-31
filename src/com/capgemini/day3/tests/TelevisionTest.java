package com.capgemini.day3.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.capgemini.icici.domain.*;

class TelevisionTest {
	Television tv1;
	
	@BeforeEach
	void setUp() {
		tv1=new Television();
	}

	@Test
	void testChangeState() {
		tv1.changeState();
		assertEquals(true,tv1.getState());
	}
	
	@Test
	void testIncreaseVolume() {
		tv1.increaseVolume();
		assertEquals(1,tv1.getVolume());
	}
	
	@Test
	void testDecreaseVolume() {
		tv1.decreaseVolume();
		assertEquals(0,tv1.getVolume());
	}
	@Test
	void testSetChannel() {
		tv1.setChannel(50);
		assertEquals(50,tv1.getChannel());
		}
	
	@Test
	void testGetInformation() {
		tv1.getDetails();
		}
	
	@AfterEach
	void tearDown() {
		tv1 = null;
	}
	
	
	

}
