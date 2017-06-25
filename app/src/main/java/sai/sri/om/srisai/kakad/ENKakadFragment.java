package sai.sri.om.srisai.kakad;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import sai.sri.om.srisai.R;

/**
 * Created by vishalyelisetti on 2/19/17.
 */

public class ENKakadFragment extends Fragment implements View.OnClickListener{

    View myView;

    public ENKakadFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        myView = inflater.inflate(R.layout.en_kakad, container, false);

        Button kakaden = (Button) myView.findViewById(R.id.english);
        Button kakadhi = (Button) myView.findViewById(R.id.hindi);
        Button kakadtu = (Button) myView.findViewById(R.id.telugu);

        kakaden.setOnClickListener(this);
        kakadhi.setOnClickListener(this);
        kakadtu.setOnClickListener(this);

        return myView;
    }

    @Override
    public void onClick(View v) {
        Fragment fragment = null;
        switch (v.getId()) {
            case R.id.english:
                fragment = new ENKakadFragment();
                replaceFragment(fragment);
                break;
            case R.id.hindi:
                fragment = new HIKakadFragment();
                replaceFragment(fragment);
                break;
            case R.id.telugu:
                fragment = new TEKakadFragment();
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
