package RestAPI.misc.Gson.Example;

import com.google.gson.Gson;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Deser {

    @Test
    public void Deserializationtest (){

        String jsonstring = "{\n" +
                "  \"firstname\": \"Alak\",\n" +
                "  \"lastname\": \"Khanna\",\n" +
                "  \"gender\": \"F\",\n" +
                "  \"age\": 34,\n" +
                "  \"salary\": 100000,\n" +
                "  \"married\": true\n" +
                "}\n";
        Gson gson = new Gson();

        Employe employe= gson.fromJson(jsonstring,Employe.class);

        String firstname = employe.getFirstname();
        String lastname = employe.getLastname();

        Assert.assertEquals(firstname, "Alak");


    }
}
