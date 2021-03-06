package kersh.wael.FinalProject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class Run extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_run);
    }
    private EditText EtRun,EtDistance2,EtCalo,EtTime2;
    private Button BtnS,BtnRE,btnSAVE,btnSTART;
    private ImageButton btnReturn;

    public EditText getEtRun() {
        return EtRun;
    }

    public void setEtRun(EditText etRun) {
        EtRun = etRun;
    }

    public EditText getEtDistance2() {
        return EtDistance2;
    }

    public void setEtDistance2(EditText etDistance2) {
        EtDistance2 = etDistance2;
    }

    public EditText getEtCalo() {
        return EtCalo;
    }

    public void setEtCalo(EditText etCalo) {
        EtCalo = etCalo;
    }

    public EditText getEtTime2() {
        return EtTime2;
    }

    public void setEtTime2(EditText etTime2) {
        EtTime2 = etTime2;
    }

    public Button getBtnS() {
        return BtnS;
    }

    public void setBtnS(Button btnS) {
        BtnS = btnS;
    }

    public Button getBtnRE() {
        return BtnRE;
    }

    public void setBtnRE(Button btnRE) {
        BtnRE = btnRE;
    }

    public ImageButton getBtnReturn() {
        return btnReturn;
    }

    public void setBtnReturn(ImageButton btnReturn) {
        this.btnReturn = btnReturn;
    }

    public Button getBtnSAVE() {
        return btnSAVE;
    }

    public void setBtnSAVE(Button btnSAVE) {
        this.btnSAVE = btnSAVE;
    }

    public Button getBtnSTART() {
        return btnSTART;
    }

    public void setBtnSTART(Button btnSTART) {
        this.btnSTART = btnSTART;
    }
}
