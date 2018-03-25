package com.example.janac.roomdatabaseapplication;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;
import android.graphics.Bitmap;

/**
 * Created by janac on 13-Mar-18.
 */

@Entity(tableName = "users") // here i change the table name user to users.
class User { // by default table name same as class name it means here table name is User.
    @PrimaryKey // each table must contain a primary key.
    private int id;

    @ColumnInfo(name = "first_name") // here i change the column name firstName to first_name
    private String firstName; // by default room use variable name is column name it means firstName.
    @ColumnInfo(name = "emails") // here i change the column name email to emails
    private String email;

    @Ignore
    Bitmap picture;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Bitmap getPicture() {
        return picture;
    }

    public void setPicture(Bitmap picture) {
        this.picture = picture;
    }
}
