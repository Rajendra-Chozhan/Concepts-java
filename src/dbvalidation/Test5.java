//package dbvalidation;
//
//import java.io.FileNotFoundException;
//import java.io.FileReader;
//import java.io.IOException;
//import java.nio.charset.StandardCharsets;
//import java.nio.file.Paths;
//import java.util.ArrayList;
//import java.util.Iterator;
//
//import org.json.simple.JSONArray;
//import org.json.simple.JSONObject;
//import org.json.simple.parser.JSONParser;
//import org.json.simple.parser.ParseException;
//
//import com.google.common.io.Files;
//
//public class Test5 {
//
//
//	public static void main(String[] args) {
//
//		 try {
//		        JSONParser parser = new JSONParser();
//		        //Use JSONObject for simple JSON and JSONArray for array of JSON.
//		        JSONObject data = (JSONObject) parser.parse(
//		              new FileReader("E:\\Api Testing\\Json Files\\Json3.json"));//path to the JSON file.
//
//		        String json = data.toJSONString();
//		    } catch (IOException | ParseException e) {
//		        e.printStackTrace();
//		    }}
//}
