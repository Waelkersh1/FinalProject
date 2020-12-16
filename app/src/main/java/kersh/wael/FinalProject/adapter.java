package kersh.wael.FinalProject;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class adapter extends ArrayAdapter<Route>{


    public adapter(@NonNull Context context, int resource) {
        super(context, resource);
    }

    public adapter(@NonNull Context context, int resource, int textViewResourceId) {
        super(context, resource, textViewResourceId);
    }

    public adapter(@NonNull Context context, int resource, @NonNull Route[] objects) {
        super(context, resource, objects);
    }

    public adapter(@NonNull Context context, int resource, int textViewResourceId, @NonNull Route[] objects) {
        super(context, resource, textViewResourceId, objects);
    }

    public adapter(@NonNull Context context, int resource, @NonNull List<Route> objects) {
        super(context, resource, objects);
    }

    public adapter(@NonNull Context context, int resource, int textViewResourceId, @NonNull List<Route> objects) {
        super(context, resource, textViewResourceId, objects);
    }
}


