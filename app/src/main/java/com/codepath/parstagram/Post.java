package com.codepath.parstagram;

import com.parse.ParseClassName;
import com.parse.ParseFile;
import com.parse.ParseObject;
import com.parse.ParseUser;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@ParseClassName("Post")
public class Post extends ParseObject {
    public static final String KEY_DESCRIPTION = "description";
    public static final String KEY_IMAGE = "image";
    public static final String KEY_USER = "user";
    public static final String KEY_CREATED_AT = "createdAt";



    public String getKeyDescription() {
        return getString(KEY_DESCRIPTION);
    }

    public void setKeyDescription(String caption) {
        put(KEY_DESCRIPTION, caption);
    }

    public ParseFile getKeyImage() {
        return getParseFile(KEY_IMAGE);
    }

    public void setKeyImage(ParseFile parseFile) {
        put(KEY_IMAGE, parseFile);
    }

    public ParseUser getKeyUser() {
        return getParseUser(KEY_USER);
    }

    public void setKeyUser(ParseUser parseUser) {
        put(KEY_USER, parseUser);
    }

    public Date getKeyCreatedAt() {
        return getCreatedAt();
    }

    public void setKeyCreatedAt(Date date) {
        put(KEY_CREATED_AT, date);
    }

    public String getCreatedString() {
        Date date = getKeyCreatedAt();
        String pattern = "MM/dd/yyyy";

        // Create an instance of SimpleDateFormat used for formatting
        // the string representation of date according to the chosen pattern
        DateFormat df = new SimpleDateFormat(pattern);

        // Using DateFormat format method we can create a string
        // representation of a date with the defined format.
        String string_date = df.format(date);
        return string_date;
    }
}
