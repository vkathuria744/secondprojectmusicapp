package quizapp.com.secondproject;

public class TopGrossing {

    private String mSongName;
    private String mArtist;
    private String mAlbum;
    private int mImageResourceId;
    private String mDuration;

    public TopGrossing(String songname, String artist, String album, int imageresourceId, String duration) {
        mSongName = songname;
        mArtist = artist;
        mAlbum = album;
        mImageResourceId = imageresourceId;
        mDuration = duration;
    }

    public String getSongName() {return mSongName; }

    public String getAlbum() {return mAlbum; }

    public String getArtist() {return mArtist; }

    public int getImageResourceId() {return mImageResourceId; }

    public String getDuration() {return mDuration; }

}
