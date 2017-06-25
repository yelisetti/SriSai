package sai.sri.om.srisai.madhyana;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import sai.sri.om.srisai.R;

/**
 * Created by vishalyelisetti on 2/19/17.
 */

public class HIMadhyanaFragment extends Fragment{

    View myView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        myView = inflater.inflate(R.layout.en_madhyana, container, false);
        return myView;
    }
}
