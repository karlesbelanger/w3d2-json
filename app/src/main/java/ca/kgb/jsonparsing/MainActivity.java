package ca.kgb.jsonparsing;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();
    private String jsonString = "[{\"name\":\"Juan\",\"age\":20,\"grade\":8.1},"+
            "{\"name\":\"Miguel\",\"age\":23,\"grade\":8.3},"+
            "{\"name\":\"Roberto\",\"age\":39,\"grade\":9.3},"+
            "{\"name\":\"Luis\",\"age\":19,\"grade\":6.9},"+
            "{\"name\":\"Gaudencio\",\"age\":25,\"grade\":4.3}]";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void DoMagic(View view) {
        try {
            JSONArray jsonArray = new JSONArray(jsonString);
            JSONObject jsonObject;
            String name;
            int age;
            double grade;
            for (int i = 0; i < jsonArray.length(); i++) {
//                Log.d(TAG, "DoMagic 'i':" + i + " : "+ jsonArray.get(i));
                jsonObject = new JSONObject(jsonArray.get(i).toString());
                name = jsonObject.getString("name");
                age = Integer.parseInt( jsonObject.getString("age"));
                grade = Double.parseDouble( jsonObject.getString("grade"));
                Log.d(TAG, "DoMagic 'i':" + i +
                        ", Name : "+ name +
                        ", Grade : " + grade +
                        ", Age : " + age);
            }
        }catch (JSONException e){
            e.printStackTrace();
        }

    }
}
