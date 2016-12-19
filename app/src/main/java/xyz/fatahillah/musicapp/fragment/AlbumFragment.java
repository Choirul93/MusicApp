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
import xyz.fatahillah.musicapp.model.Album;

/**
 * Created by mac on 12/19/16.
 */

public class AlbumFragment extends Fragment {

    ArrayAdapter<Album> mAdapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View albumFragment = inflater.inflate(R.layout.fragment_album, container, false);

        final ArrayList<Album> items = new ArrayList<Album>();

        // creating album item
        Album album1 = new Album("MKKB","Air Hujan","Trio Kwek Kwek");
        Album album2 = new Album("Bulan Purnama", "Rindu", "Ebiet G. Ade");
        Album album3 = new Album("Alexandria", "Menunggu Pagi", "Peterpan");

        // add album item to album array
        items.add(album1);
        items.add(album2);
        items.add(album3);

        ListView listView = (ListView) albumFragment.findViewById(R.id.album_list_view);

        mAdapter = new ArrayAdapter<Album>(getActivity(), android.R.layout.simple_list_item_1, items);
        listView.setAdapter(mAdapter);


        return albumFragment;
    }
}
