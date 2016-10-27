package mk.sid.chpets;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by IP on 10/27/2016.
 */




/**
 * A placeholder fragment containing a simple view.
 */
public  class LostPets extends Fragment {
    /**
     * The fragment argument representing the section number for this
     * fragment.
     */
    private static final String ARG_SECTION_NUMBER = "section_number";

    /**
     * Returns a new instance of this fragment for the given section
     * number.
     */
    public static LostPets newInstance(int sectionNumber) {
        LostPets fragment = new LostPets();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }

    public LostPets() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.lost_pets, container, false);
        TextView textView = (TextView) rootView.findViewById(R.id.section_label);
        textView.setText("test lost pets");
        return rootView;
    }
}