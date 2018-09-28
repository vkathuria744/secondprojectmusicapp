package quizapp.com.secondproject;

public class NewReleases {

    private String mArtistName;
    private int mImageResourceId;

    public NewReleases(String artistname, int imageResourceId){
        mArtistName = artistname;
        mImageResourceId = imageResourceId;

    }

    public String getArtistName() { return mArtistName;}
    public int getImageResourceId() { return mImageResourceId;}
}


