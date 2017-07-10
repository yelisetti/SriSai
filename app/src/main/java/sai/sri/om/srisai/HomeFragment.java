package sai.sri.om.srisai;

import android.app.Fragment;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import sai.sri.om.srisai.adapaters.ExpandableListViewAdapter;

/**
 * Created by Yelisetti on 5/20/17.
 */

public class HomeFragment extends Fragment {

    View myView;

    ExpandableListAdapter listAdapter;
    ExpandableListView expListView;
    List<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        myView = inflater.inflate(R.layout.home, container, false);

        // get the listview
        expListView = (ExpandableListView) myView.findViewById(R.id.lvExp);

        // preparing list data
        prepareListData();

        listAdapter = new ExpandableListViewAdapter(getActivity().getApplicationContext(), listDataHeader, listDataChild);

        // setting list adapter
        expListView.setAdapter(listAdapter);

        // Listview Group click listener
        expListView.setOnGroupClickListener(new ExpandableListView.OnGroupClickListener() {

            @Override
            public boolean onGroupClick(ExpandableListView parent, View v,
                                        int groupPosition, long id) {
                // Toast.makeText(getApplicationContext(),
                // "Group Clicked " + listDataHeader.get(groupPosition),
                // Toast.LENGTH_SHORT).show();
                return false;
            }
        });

        // Listview Group expanded listener
        expListView.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {

            @Override
            public void onGroupExpand(int groupPosition) {
//                Toast.makeText(getActivity().getApplicationContext(),
//                        listDataHeader.get(groupPosition) + " Expanded",
//                        Toast.LENGTH_SHORT).show();
            }
        });

        // Listview Group collasped listener
        expListView.setOnGroupCollapseListener(new ExpandableListView.OnGroupCollapseListener() {

            @Override
            public void onGroupCollapse(int groupPosition) {
//                Toast.makeText(getActivity().getApplicationContext(),
//                        listDataHeader.get(groupPosition) + " Collapsed",
//                        Toast.LENGTH_SHORT).show();

            }
        });

        // Listview on child click listener
        expListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {

            @Override
            public boolean onChildClick(ExpandableListView parent, View v,
                                        int groupPosition, int childPosition, long id) {
                // TODO Auto-generated method stub
//                Toast.makeText(
//                        getActivity().getApplicationContext(),
//                        listDataHeader.get(groupPosition)
//                                + " : "
//                                + listDataChild.get(
//                                listDataHeader.get(groupPosition)).get(
//                                childPosition), Toast.LENGTH_SHORT)
//                        .show();
                return false;
            }
        });
        return myView;
    }

    /*
     * Preparing the list data
     */
    private void prepareListData() {
        listDataHeader = new ArrayList<String>();
        listDataChild = new HashMap<String, List<String>>();

        // Adding child data
        listDataHeader.add(getString(R.string.Address));
        listDataHeader.add(getString(R.string.POBOX_header));
        listDataHeader.add(getString(R.string.CallUs));
        listDataHeader.add(getString(R.string.Email));
        listDataHeader.add(getString(R.string.daily_schedule));
        listDataHeader.add("Events/Website");
        
        // Adding child data
        List<String> address = new ArrayList<String>();
        address.add(getResources().getString(R.string.address));

        List<String> pobox = new ArrayList<String>();
        pobox.add(getResources().getString(R.string.pobox));

        List<String> phone = new ArrayList<String>();
        phone.add(getResources().getString(R.string.phone));

        List<String> email = new ArrayList<String>();
        email.add(getResources().getString(R.string.email));

        List<String> schedule = new ArrayList<String>();
        schedule.add(String.valueOf(getResources().getText(R.string.schedule)));

        List<String> events = new ArrayList<String>();
        events.add("Please visit:\n" + "http://www.saibabamn.org/");

        listDataChild.put(listDataHeader.get(0), address); // Header, Child data
        listDataChild.put(listDataHeader.get(1), pobox);
        listDataChild.put(listDataHeader.get(2), phone);
        listDataChild.put(listDataHeader.get(3), email);
        listDataChild.put(listDataHeader.get(4), schedule);
        listDataChild.put(listDataHeader.get(5), events);
    }
}
