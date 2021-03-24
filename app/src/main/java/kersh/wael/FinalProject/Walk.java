package kersh.wael.FinalProject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class  Walk<EtStep> extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_walk);
    }
    private EditText EtDistance ,EtStep , EtCal, EtTime , Walk;
    private Button BtnStop, BtnRes, btnSave,;
    private ImageButton btnRE;

    public void setEtDistance(EditText etDistance) {
        EtDistance = etDistance;
    }

    public void setEtStep(EditText etStep) {
        EtStep = etStep;
    }

    public void setEtCal(EditText etCal) {
        EtCal = etCal;
    }

    public void setEtTime(EditText etTime) {
        EtTime = etTime;
    }

    public void setWalk(EditText walk) {
        Walk = walk;
    }

    public void setBtnStop(Button btnStop) {
        BtnStop = btnStop;
    }

    public void setBtnRes(Button btnRes) {
        BtnRes = btnRes;
    }

    public EditText getEtDistance() {
        return EtDistance;
    }

    public EditText getEtStep() {
        return EtStep;
    }

    public EditText getEtCal() {
        return EtCal;
    }

    public EditText getEtTime() {
        return EtTime;
    }

    public EditText getWalk() {
        return Walk;
    }

    public Button getBtnStop() {
        return BtnStop;
    }

    public Button getBtnRes() {
        return BtnRes;
    }

    public ImageButton getBtnRE() {
        return btnRE;
    }

    public void setBtnRE(ImageButton btnRE) {
        this.btnRE = btnRE;
    }

    public Button getBtnSave() {
        return btnSave;
    }

    public void setBtnSave(Button btnSave) {
        this.btnSave = btnSave;
    }
}