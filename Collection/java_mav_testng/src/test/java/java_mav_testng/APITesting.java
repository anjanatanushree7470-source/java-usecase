package java_mav_testng;


	 
	import org.testng.annotations.Test;
	import io.restassured.response.Response;
	import static io.restassured.RestAssured.*;
	import static org.hamcrest.Matchers.*;
	 
	public class APITesting
	{
	 
		@Test
		
		public void getUserTest()
		{
				given()
				.when().get("https://dummyjson.com/products")
				.then()
				.statusCode(200)
				.body("id", equalTo(2));
			
		}
		
	}

}
