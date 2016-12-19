package xyz.fatahillah.musicapp.model;

/**
 * Created by mac on 12/19/16.
 */

public class Song {

    private String mName;
    private String mArtist;
    private String mAlbum;

    public Song(String mName, String mArtist, String mAlbum) {
        this.mName = mName;
        this.mArtist = mArtist;
        this.mAlbum = mAlbum;
    }

    public String getName() {
        return mName;
    }

    public void setName(String mName) {
        this.mName = mName;
    }

    public String getArtist() {
        return mArtist;
    }

    public void setArtist(String mArtist) {
        this.mArtist = mArtist;
    }

    public String getAlbum() {
        return mAlbum;
    }

    public void setAlbum(String mAlbum) {
        this.mAlbum = mAlbum;
    }

    @Override
    public String toString() {
        return mName;
    }
}
