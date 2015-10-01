package com.training.component.api.v1;

import com.training.component.exception.badmethodexception;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/api/v1/helloworld")
public class helloworld{
  @GET
  public String getHelloWorldMessage(){
	if(true){
		throw new badmethodexception();
	}
	return "hi";
  }
}
