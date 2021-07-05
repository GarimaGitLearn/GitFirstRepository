import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class extractJson {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		// TODO Auto-generated method stub

		String usrDirectory = System.getProperty("user.dir");
		//customerDetailsAppium cs=obj.readValue(new File(usrDirectory + "/src/sample.json"), customerDetailsAppium.class);
		ObjectMapper o=new ObjectMapper();
		CustomerDetailsAppium c=o.readValue(new File(usrDirectory + "/customerInfo0.json"), CustomerDetailsAppium.class);
		
		System.out.println(c.getCourseName());
	}

}
