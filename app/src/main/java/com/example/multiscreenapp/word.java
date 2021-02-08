package com.example.multiscreenapp;

public class word {

    /**
     * Default translation for the word
     */
    private String mMiwokTranslation;

    /**
     * Miwok translation for the word
     */
    private String mDefaultTranslation;

    /**
     * Constant value that represents no image was provided for this word
     */
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Image resource id of the word
     */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /**
     * Image resource ID for the word
     */
    private int mAudioResourceId;

    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param miwokTranslation   is the word in the Miwok language
     * @param audioResourceId    is the id of audio
     */
    public word(String defaultTranslation, String miwokTranslation, int audioResourceId) {
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
        mAudioResourceId = audioResourceId;
    }

    /**
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param miwokTranslation   is the word in the Miwok language
     * @param imageResourceId    is the id of the image
     * @param audioResourceId    is the id of audio
     */
    public word(String defaultTranslation, String miwokTranslation, int imageResourceId, int audioResourceId) {
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;
    }

    /**
     * Get the default translation of the word.
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * Get the miwok translation of the word.
     */
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    /**
     * @return the image resource id of the word.
     */
    public int getImageResoruceId() {
        return mImageResourceId;
    }

    /**
     * returns wether the given word has image or not
     */
    public boolean hasImage() {
        return NO_IMAGE_PROVIDED != mImageResourceId;
    }

    /**
     * returns audio resource id of the word
     */
    public int getAudioResourceId() {
        return mAudioResourceId;
    }
}
