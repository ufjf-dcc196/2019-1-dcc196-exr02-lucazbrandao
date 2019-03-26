package ufjf.br.dcc196;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtFirstNumber;
    TextView txtSecondNumber;
    TextView txtResult;
    Button btnSum;
    Button btnSub;
    Button btnMul;
    Button btnDiv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtFirstNumber = findViewById(R.id.txt_firstnumber);
        txtSecondNumber = findViewById(R.id.txt_secondnumber);
        txtResult = findViewById(R.id.txt_result);

        btnSum = findViewById(R.id.btn_sum);
        btnSub = findViewById(R.id.btn_sub);
        btnMul = findViewById(R.id.btn_mul);
        btnDiv = findViewById(R.id.btn_div);

        btnSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer result;
                result = sum(Integer.valueOf(txtFirstNumber.getText().toString()), Integer.valueOf(txtSecondNumber.getText().toString()));
                txtResult.setText(result.toString());
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer result;
                result = sub(Integer.valueOf(txtFirstNumber.getText().toString()), Integer.valueOf(txtSecondNumber.getText().toString()));
                txtResult.setText(result.toString());
            }
        });

        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer result;
                result = mul(Integer.valueOf(txtFirstNumber.getText().toString()), Integer.valueOf(txtSecondNumber.getText().toString()));
                txtResult.setText(result.toString());
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer result;
                result = div(Integer.valueOf(txtFirstNumber.getText().toString()), Integer.valueOf(txtSecondNumber.getText().toString()));
                txtResult.setText(result.toString());
            }
        });

    }

    public int sum(int a, int b) {
        return a + b;
    }
    public  int sub(int a, int b) {
        return a - b;
    }
    public int mul(int a, int b) {
        return a * b;
    }
    public int div(int a, int b) {
        return a / b;
    }
}
