package rmuti.farm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Activity_inputdata extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_inputdata);

        ImageView butBackToMain = (ImageView)findViewById(R.id.backToMain);
        butBackToMain.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent mainActivity = new Intent(v.getContext(), MainActivity.class);
                startActivity(mainActivity);
            }
        });
    }
}
