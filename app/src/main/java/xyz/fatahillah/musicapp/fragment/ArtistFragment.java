package xyz.fatahillah.musicapp.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

import xyz.fatahillah.musicapp.R;
import xyz.fatahillah.musicapp.model.Artist;

/**
 * Created by mac on 12/19/16.
 */

public class ArtistFragment extends Fragment {

    ArrayAdapter<Artist> mAdapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View artistFragment = inflater.inflate(R.layout.fragment_song, container, false);

        final ArrayList<Artist> items = new ArrayList<Artist>();

        // creating song item
        Artist artist1 = new Artist("MKKB", "Air Hujan", "Trio Kwek Kwek");
        Artist artist2 = new Artist("Bulan Purnama", "Rindu", "Ebiet G. Ade");
        Artist artist3 = new Artist("Alexandria", "Menunggu Pagi", "Peterpan");

        // add song item to song array
        items.add(artist1);
        items.add(artist2);
        items.add(artist3);

        ListView listView = (ListView) artistFragment.findViewById(R.id.song_list_view);

        mAdapter = new ArrayAdapter<Artist>(getActivity(), android.R.layout.simple_list_item_1, items);
        listView.setAdapter(mAdapter);


        return artistFragment;
    }
}
