package com.codeaches.carinventoryservice;

import java.util.Set;

import org.springframework.web.bind.annotation.RequestBody;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

public interface CarInventoryControllerInterface {

  @ApiOperation(value    = "Add a new car to the inventory", 
                nickname = "addCar", 
                response = String.class, 
                responseContainer = "String")
  @ApiResponses(value = {
                  @ApiResponse(code = 200, message = "Car Added Successfully", 
                               response = String.class, responseContainer = "String"),
                  @ApiResponse(code = 405, message = "Invalid input") })
  public String addCar(
      @ApiParam(value = "Car that needs to be added to the inventory", required = true) 
      @RequestBody(required = true) String car);

  @ApiOperation(value = "View cars in the inventory", nickname = "viewCars", response = Set.class, responseContainer = "Set<String>")
  @ApiResponses(value = {
      @ApiResponse(code = 200, message = "List of Cars returned successfully", response = Set.class, responseContainer = "Set<String>") })
  public Set<String> viewCars();
}
