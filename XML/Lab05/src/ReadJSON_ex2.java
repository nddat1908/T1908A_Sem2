
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadJSON_ex2 {
    public static void main(String[] args) {
        //JSON parser object to parse read file
        JSONParser jsonParser = new JSONParser();
        try(FileReader reader = new FileReader("Exercise2.json"))
        {
            //Read JSON file
            Object obj = jsonParser.parse(reader);

            JSONObject widgetList = (JSONObject) obj;
            System.out.println(widgetList);

            JSONObject widgetObject = (JSONObject) widgetList.get("widget");
            System.out.println(widgetObject);

            JSONObject windowObjects = (JSONObject) widgetObject.get("window");
            System.out.println(windowObjects);
            JSONObject imageObjects = (JSONObject) widgetObject.get("image");
            System.out.println(imageObjects);
            JSONObject textObjects = (JSONObject) widgetObject.get("text");
            System.out.println(textObjects);



        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }catch (ParseException e){
            e.printStackTrace();
        }
    }


}
