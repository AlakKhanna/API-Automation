package RestAPI.misc.Gson.Example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.testng.annotations.Test;

public class SimpleSer {

    //{
    //    "firstname" : "Alak",
    //    "lastname" : "Khanna",
    //    "gender" : "M",
    //    "age" : 31,
    //    "salary" : 50000,
    //    "married" : true
    //}

    @Test
    public  void test1 ()
    {
        Employe employe = new Employe();
        employe.setFirstname("Alak");
        employe.setLastname("Khanna");
        employe.setGender("F");
        employe.setAge(34);
        employe.setSalary(100000);
        employe.setMarried(true);

        Gson gsonbuilder = new GsonBuilder().setPrettyPrinting().create();
        String jsonemploye= gsonbuilder.toJson(employe);
        System.out.println(jsonemploye);
    }
}


