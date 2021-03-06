
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadJSON_ex3 {
    public static void main(String[] args) {
        //JSON parser object to parse read file
        JSONParser jsonParser = new JSONParser();
        try(FileReader reader = new FileReader("Exercise3.json"))
        {
            //Read JSON file
            Object obj = jsonParser.parse(reader);

            JSONObject menuList = (JSONObject) obj;
            System.out.println(menuList);

            JSONObject menuObjects = (JSONObject) menuList.get("menu");
            System.out.println(menuObjects);

            JSONArray itemObjects = (JSONArray) menuObjects.get("item") ;
            System.out.println(itemObjects);

            String headerObjects = (String) menuObjects.get("header");
            System.out.println(headerObjects);
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }catch (ParseException e){
            e.printStackTrace();
        }
    }
}
