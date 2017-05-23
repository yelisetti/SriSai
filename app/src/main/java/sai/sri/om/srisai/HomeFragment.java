package sai.sri.om.srisai;

import android.app.Dialog;
import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by Yelisetti on 5/20/17.
 */

public class HomeFragment extends Fragment {

    View myView;

    private Button button;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        myView = inflater.inflate(R.layout.home, container, false);

        TextView mLink = (TextView) myView.findViewById(R.id.addresslink);
        if (mLink != null) {
            mLink.setMovementMethod(LinkMovementMethod.getInstance());
        }


        button = (Button) myView.findViewById(R.id.schedule);

        // add button listener
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                // custom dialog
                final Dialog dialog = new Dialog(getActivity());
                dialog.setContentView(R.layout.schedule);

                Button dialogButton = (Button) dialog.findViewById(R.id.ok_button);
                // if button is clicked, close the custom dialog
                dialogButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });

                dialog.show();
            }
        });

        return myView;
    }
}
