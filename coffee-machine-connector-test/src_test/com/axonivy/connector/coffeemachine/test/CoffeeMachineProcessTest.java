package com.axonivy.connector.coffeemachine.test;

import org.junit.jupiter.api.Test;

import ch.ivyteam.ivy.bpm.engine.client.BpmClient;
import ch.ivyteam.ivy.bpm.engine.client.element.BpmProcess;
import ch.ivyteam.ivy.bpm.exec.client.IvyProcessTest;

@IvyProcessTest
public class CoffeeMachineProcessTest {

	private static final BpmProcess demoProcess = BpmProcess.path("DemoCoffeeMachine");

	@Test
	public void callProcess(BpmClient bpmClient) throws NoSuchFieldException {
		demoProcess.elementName("startCheckStatus");
	}

}
