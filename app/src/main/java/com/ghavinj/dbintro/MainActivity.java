package com.ghavinj.dbintro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import Data.DatabaseHandler;
import Model.Contact;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DatabaseHandler db = new DatabaseHandler(this);

        //Insert Contacts
        Log.d("Insert", "Inserting...");
        db.addContact(new Contact("Ghavin Johnson", "7625668798"));
        db.addContact(new Contact("Amy","7665432345"));
        db.addContact(new Contact("Mike","7890034621"));
        db.addContact(new Contact("Phil","1328974352"));


        //Read contacts back
        Log.d("Reading", "Reading all contacts...");
        List<Contact> contactList = db.getAllContacts();

        for (Contact c: contactList){
            String log = "ID: " + c.getId()+" , Name: " + c.getName()+" , Phone Number: " + c.getPhoneNumber();
            Log.d("Name: ", log);
        }
    }
}
