package sai.sri.om.srisai;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by vishalyelisetti on 2/19/17.
 */

public class MadhyanaFragment extends Fragment{

    View myView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        myView = inflater.inflate(R.layout.madhyana, container, false);
        return myView;
    }
}
