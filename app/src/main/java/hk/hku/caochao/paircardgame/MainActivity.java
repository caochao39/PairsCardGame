package hk.hku.caochao.paircardgame;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends Activity implements View.OnClickListener{
    private Button buttonArray[][] = new Button[4][4];
   /* private static final int[][] BUTTON_IDS = {
            {R.id.Button1, R.id.Button2, R.id.Button3, R.id.Button4},
            {R.id.Button5, R.id.Button6, R.id.Button7, R.id.Button8},
            {R.id.Button9, R.id.Button10, R.id.Button11, R.id.Button12},
            {R.id.Button13, R.id.Button14, R.id.Button15, R.id.Button16}
    };*/
    private TextView text = (TextView)findViewById(R.id.textView);
    private int click_count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onClick(View v) {
        click_count ++;
        text.setText(click_count);

    }
    protected void startGame()
    {
        for(int row = 0; row < 4; row++)
        {
            for(int col = 0; col < 4; col++)
            {
                //buttonArray[row][col] = (Button)findViewById(BUTTON_IDS[row][col]);
                buttonArray[row][col].setOnClickListener(this);
            }
        }

    }

}
