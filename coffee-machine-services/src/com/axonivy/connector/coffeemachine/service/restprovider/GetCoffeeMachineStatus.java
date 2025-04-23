package com.axonivy.connector.coffeemachine.service.restprovider;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.axonivy.connector.coffeemachine.services.GetCoffeeMachineStatusData;

import ch.ivyteam.ivy.environment.Ivy;
import ch.ivyteam.ivy.process.call.SubProcessCall;

@Path("getCoffeeMachineStatus")
public class GetCoffeeMachineStatus {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public GetCoffeeMachineStatusData getCoffeeMachineStatus() {
		String resultString = SubProcessCall.withPath("GetCoffeeMachineStatus").call().get("status").toString();

		Ivy.log().info("Result: " + resultString);

		GetCoffeeMachineStatusData getCoffeeMachineStatusData = new GetCoffeeMachineStatusData();
		getCoffeeMachineStatusData.setStatus(resultString);
		return getCoffeeMachineStatusData;
	}
}