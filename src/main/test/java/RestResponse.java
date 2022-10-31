import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;



public class RestResponse {
    Response res =  RestAssured.given().get("https://reqres.in/api/users?page=2");
    RequresResponse pojoResponse = new RequresResponse();

    @Test
    public void accessValueWithoutPojo(){
        JsonPath json = new JsonPath(res.asString());
        List<Map<Object, Object>> valueList = json.get("data");
        valueList.stream().forEach(x -> System.out.println(x.get("avatar")));
    }

    @Test
    public void deserializeIntoPojo(){
        pojoResponse = res.as(RequresResponse.class);
        pojoResponse.getData().stream().forEach(x-> System.out.println(x.getEmail()));
    }

    @Test
    public void deserializeWithObjectMapper() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        pojoResponse = mapper.readValue(res.asString(), RequresResponse.class);
        pojoResponse.getData().stream().forEach(x -> System.out.println(x.getFirst_name() + " " + x.getLast_name()));
    }

}
