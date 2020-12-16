package kersh.wael.FinalProject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);
    }

    private EditText EtText;
    private Button BtnWalk, BtnCycle, BtnRun;

    public EditText getEtText() {
        return EtText;
    }

    public void setEtText(EditText etText) {
        EtText = etText;
    }

    public Button getBtnWalk() {
        return BtnWalk;
    }

    public void setBtnWalk(Button btnWalk) {
        BtnWalk = btnWalk;
    }

    public Button getBtnCycle() {
        return BtnCycle;
    }

    public void setBtnCycle(Button btnCycle) {
        BtnCycle = btnCycle;
    }

    public Button getBtnRun() {
        return BtnRun;
    }

    public void setBtnRun(Button btnRun) {
        BtnRun = btnRun;
    }
}
