package comandydevo.wixsite.seemantshekhar43.starcolor;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class secondActivity extends AppCompatActivity {

    // code to use string to call image
    public static int getImageId(Context context, String imageName) {
        return context.getResources().getIdentifier("drawable/" + imageName, null, context.getPackageName());
    }
    Button button;
    ImageView imageView;
    TextView textView;
    String col;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        button = (Button) findViewById(R.id.backButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // back to the main activity
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);

            }
        });

        // getting the info
        Intent intent = getIntent();
        col = intent.getStringExtra("name");

        imageView = (ImageView) findViewById(R.id.color);
        imageView.setImageResource(getImageId(this, col));

        textView = (TextView) findViewById(R.id.colorName);
        textView.setText(col + " Star");
    }
}
