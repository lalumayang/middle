package tw.edu.ntut.csie.app01_105590001;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private EditText mEdtScore;
    private Button mButton;
    private TextView mTxtGrade,mTxtR;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEdtScore = (EditText)findViewById(R.id.edtScore);
        mButton = (Button)findViewById(R.id.button);
        mTxtGrade = (TextView)findViewById(R.id.txtGrade);
        mTxtR = (TextView)findViewById(R.id.txtR);
        mButton.setOnClickListener(btnOKOnClick);
    }

    private View.OnClickListener btnOKOnClick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            int iSco = Integer.parseInt(mEdtScore.getText().toString());

            String strSug = getString(R.string.grade);


            if ((iSco <= 100) && (iSco >= 90))
                strSug = "A";
            else if ((iSco <= 89) && (iSco >= 80))
                strSug = "B";
            else if ((iSco <= 79) && (iSco >= 70))
                strSug = "C";
            else if ((iSco <= 69) && (iSco >= 60))
                strSug = "D";
            else if ((iSco <= 59) && (iSco >= 0))
                strSug = "F";
            else if ((iSco > 100) || (iSco < 0))
                strSug = "X";
            mTxtR.setText(strSug);
        }

    };

}



