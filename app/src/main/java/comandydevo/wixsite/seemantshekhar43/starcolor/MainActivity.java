package comandydevo.wixsite.seemantshekhar43.starcolor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.listView);

        final ArrayList<String> color = new ArrayList<String>();
        color.add("blue");
        color.add("red");
        color.add("yellow");
        color.add("green");

        ArrayAdapter arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,color);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                // go to the second screen
                Intent intent = new Intent(getApplicationContext(),secondActivity.class);

                // transfer the info from first to second screen
                // its of the key value type key is name and value is color
                intent.putExtra("name",color.get(position));


                startActivity(intent);




            }
        });

    }
}
