package sai.sri.om.srisai;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by vishalyelisetti on 2/19/17.
 */

public class KakadFragment extends Fragment implements View.OnClickListener{

    View myView;

    public KakadFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        myView = inflater.inflate(R.layout.kakad, container, false);

        Button kakaden = (Button) myView.findViewById(R.id.button4);
        Button kakadhi = (Button) myView.findViewById(R.id.button5);
        Button kakadtu = (Button) myView.findViewById(R.id.button6);

        kakaden.setOnClickListener(this);
        kakadhi.setOnClickListener(this);
        kakadtu.setOnClickListener(this);

        return myView;
    }

    @Override
    public void onClick(View v) {
        Fragment fragment = null;
        switch (v.getId()) {
            case R.id.button4:
                fragment = new KakadFragment();
                replaceFragment(fragment);
                break;

            case R.id.button5:
                fragment = new DhoopFragment();
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
