package com.plantplaces.ui.test;

import org.junit.Test;

import com.plantplaces.dto.Plant;
import com.plantplaces.ui.SearchPlants;

import junit.framework.TestCase;

public class TestSearchPlants extends TestCase {
	private SearchPlants searchPlants;
	private String execute;

	@Test
	public void testSearchPlantsExecute() {
		giveSearchPlantsCreateWithRedbud();
		whenInvokeExecute();
		thenVerifyReturnSuccess();
	}

	@Test
	public void testSearchPlantsNoRedbud(){
		givenSearchPlantsCreatedWithoutRedbud();
		whenInvokeExecute();
		thenVerifyReturnNoResults();
	}
	
	@Test
	public void testSearchPlantsNull(){
		givenSearchPlantsCreatedWithNullPlants();
		whenInvokeExecute();
		thenVerifyReturnNoResults();
	}
	
	private void givenSearchPlantsCreatedWithNullPlants() {
		searchPlants = new SearchPlants();
		
	}

	private void thenVerifyReturnNoResults() {
		// TODO Auto-generated method stub
		assertEquals("noresults", execute);
	}

	private void givenSearchPlantsCreatedWithoutRedbud() {
		// TODO Auto-generated method stub
		searchPlants = new SearchPlants();
		Plant plant = new Plant();
		plant.setName("Pawpaw");
		searchPlants.setPlant(plant);
		
	}

	private void thenVerifyReturnSuccess() {
		assertEquals("success", execute);

	}

	private void whenInvokeExecute() {
		execute = searchPlants.execute();

	}

	private void giveSearchPlantsCreateWithRedbud() {
		searchPlants = new SearchPlants();
		Plant plant = new Plant();
		plant.setName("Redbud");
		searchPlants.setPlant(plant);
	}
}
