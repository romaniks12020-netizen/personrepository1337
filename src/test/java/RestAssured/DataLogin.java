package RestAssured;

import RestAssured.entity.PostUser;
import net.bytebuddy.implementation.bytecode.Throw;
import tools.jackson.core.type.TypeReference;
import tools.jackson.databind.ObjectMapper;

import javax.imageio.IIOException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class DataLogin {
    List<PostUser> dataGeneration = new ArrayList<>();
    ObjectMapper mapper = new ObjectMapper();
    public List<PostUser> init (){
     dataGeneration.clear();
        try {
            InputStream inputStream = DataLogin.class.getResourceAsStream("data/login.json");
            dataGeneration = mapper.readValue(inputStream, new TypeReference<List<PostUser>>() {
            });
            return dataGeneration;
        } catch (Exception e){

        }
        throw new RuntimeException();
    }
}
