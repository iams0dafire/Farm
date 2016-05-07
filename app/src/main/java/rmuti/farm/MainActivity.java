package rmuti.farm;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView butplus = (ImageView)findViewById(R.id.headpic2);
        butplus.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent inputdata = new Intent(v.getContext(), Activity_inputdata.class);
                startActivity(inputdata);
            }
        });


    }

    private  void bindWidget() {
        ImageView butplus = (ImageView)findViewById(R.id.headpic2);

    }
}
