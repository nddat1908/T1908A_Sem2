
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadJSON_ex1 {
    public static void main(String[] args) {
        //JSON parser object to parse read file
        JSONParser jsonParser = new JSONParser();
        try(FileReader reader = new FileReader("Exercise1.json"))
        {
            //Read JSON file
            Object obj = jsonParser.parse(reader);

            JSONObject menuList = (JSONObject) obj;
            System.out.println(menuList);

            JSONObject menuObject = (JSONObject) menuList.get("menu");
            System.out.println(menuObject);

            JSONObject popup = (JSONObject) menuObject.get("popup");
            System.out.println(popup);

            JSONArray menuitem = (JSONArray) popup.get("menuitem");
            System.out.println(menuitem);


            //Iterate over employee array
//            menuList.forEach(emp-> parseMenuObject((JSONObject) emp));
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }catch (ParseException e){
            e.printStackTrace();
        }
    }

    private static void parseMenuObject(JSONObject menu){
        JSONObject menuObject = (JSONObject) menu.get("menu");
        String menuitem = (String) menuObject.get("menuitem");
        System.out.println(menuitem);
    }
}
