package kersh.wael.FinalProject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class Cycling extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cycling);
    }
    private EditText EtText1,EtDistance24,EtCalore1,EtTime3;
    private Button BtnRES,BtnST;

    public EditText getEtText1() {
        return EtText1;
    }

    public void setEtText1(EditText etText1) {
        EtText1 = etText1;
    }

    public EditText getEtDistance24() {
        return EtDistance24;
    }

    public void setEtDistance24(EditText etDistance24) {
        EtDistance24 = etDistance24;
    }

    public EditText getEtCalore1() {
        return EtCalore1;
    }

    public void setEtCalore1(EditText etCalore1) {
        EtCalore1 = etCalore1;
    }

    public EditText getEtTime3() {
        return EtTime3;
    }

    public void setEtTime3(EditText etTime3) {
        EtTime3 = etTime3;
    }

    public Button getBtnRES() {
        return BtnRES;
    }

    public void setBtnRES(Button btnRES) {
        BtnRES = btnRES;
    }

    public Button getBtnST() {
        return BtnST;
    }

    public void setBtnST(Button btnST) {
        BtnST = btnST;
    }
}