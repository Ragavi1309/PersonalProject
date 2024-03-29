package com.spring.mfpe.offer;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.boot.test.context.SpringBootTest;

import com.spring.mfpe.offer.entities.Employee;
import com.spring.mfpe.offer.entities.Offer;

@SpringBootTest
public class EmployeeEntityTest {

	@InjectMocks
	Offer offer;
	
	@InjectMocks
	Employee employee;
	
	@Test
	void testNameGetterSetter() {
		employee.setName("emp 1");
		assertEquals(employee.getName(),"emp 1");
	}
	
	@Test
	void testDepartmentGetterSetter() {
		employee.setDepartment("department 1");
		assertEquals(employee.getDepartment(),"department 1");
	}
	
	@Test
	void testGenderGetterSetter() {
		employee.setGender("male");
		assertEquals(employee.getGender(),"male");
	}
	
	
	@Test
	void testAgeDateGetterSetter() {
		employee.setAge(10);
		assertEquals(employee.getAge(),10);
	}
	
	@Test
	void testContactNumberGetterSetter() {
		long number = Long.parseLong(new String("9971930070"));
		employee.setContactNumber(number);
		assertEquals(employee.getContactNumber(),number);
	}
	
	@Test
	void testEmailDateGetterSetter() {
		employee.setEmail("prateek007.purohit@gmail.com");
		assertEquals(employee.getEmail(),"prateek007.purohit@gmail.com");
	}
	
	@Test
	void testPointsGainedGetterSetter() {
		employee.setPointsGained(10);
		assertEquals(employee.getPointsGained(),10);
	}
		
	@Test
	void testOffersGetterSetter() {
		Set<Offer> offers = new HashSet<Offer>();
		offers.add(offer);
		employee.setOffers(offers);
		assertEquals(employee.getOffers(),offers);
	}
	
	@Test
	void testEnagedInOffersGetterSetter() {
		Set<Offer> offers = new HashSet<Offer>();
		offers.add(offer);
		employee.setEngagedInOffers(offers);
		assertEquals(employee.getEngagedInOffers(),offers);
	}
	
	@Test
	void testLikedOffersGetterSetter() {
		Set<Offer> offers = new HashSet<Offer>();
		offers.add(offer);
		employee.setLikedOffers(offers);
		assertEquals(employee.getLikedOffers(),offers);
	}
	
}
