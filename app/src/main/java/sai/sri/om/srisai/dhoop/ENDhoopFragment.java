package sai.sri.om.srisai.dhoop;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import sai.sri.om.srisai.R;
import sai.sri.om.srisai.kakad.ENKakadFragment;
import sai.sri.om.srisai.kakad.HIKakadFragment;
import sai.sri.om.srisai.kakad.TEKakadFragment;

/**
 * Created by vishalyelisetti on 2/19/17.
 */

public class ENDhoopFragment extends Fragment implements View.OnClickListener {

    View myView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        myView = inflater.inflate(R.layout.en_dhoop, container, false);

        Button dhoopen = (Button) myView.findViewById(R.id.english);
        Button dhoophi = (Button) myView.findViewById(R.id.hindi);
        Button dhooptu = (Button) myView.findViewById(R.id.telugu);

        dhoopen.setOnClickListener(this);
        dhoophi.setOnClickListener(this);
        dhooptu.setOnClickListener(this);

        return myView;
    }

    @Override
    public void onClick(View v) {
        Fragment fragment = null;
        switch (v.getId()) {
            case R.id.english:
                fragment = new ENDhoopFragment();
                replaceFragment(fragment);
                break;
            case R.id.hindi:
                fragment = new HIDhoopFragment();
                replaceFragment(fragment);
                break;
            case R.id.telugu:
                fragment = new TEDhoopFragment();
                replaceFragment(fragment);
                break;
        }
    }

    public void replaceFragment(Fragment someFragment) {
        FragmentTransaction transaction = getFragmentManager().beginTransaction();
        transaction.replace(R.id.content_frame, someFragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }
}
