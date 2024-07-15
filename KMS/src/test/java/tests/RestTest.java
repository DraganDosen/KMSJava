package tests;
import static org.junit.Assert.*;
import org.testng.Assert;   //used to validate response status 
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestTest {

	@Test
    public void kms()
{  
 // Specify the base URL to the RESTful web service
 RestAssured.baseURI = "https://kmslh.com/";
 // Get the RequestSpecification of the request to be sent to the server
 RequestSpecification httpRequest = RestAssured.given();

 Response response = httpRequest.get("");

 // Get the status code of the request. 
 //If request is successful, status code will be 200
int statusCode = response.getStatusCode();
String body = response.asPrettyString();
if (body.contains("Knowledge Management System - KMS Lighthouse")) {
	System.out.println("Knowledge Management System - KMS Lighthouse");
	
}
else Assert.fail();

if (body.contains("KMS lighthouse")) {
	System.out.println("KMS lighthouse");
	
}
else Assert.fail();

 // Assert that correct status code is returned.
Assert.assertEquals(statusCode /*actual value*/, 200 /*expected value*/, 
  "Correct status code returned");

}
	

      
   
}


