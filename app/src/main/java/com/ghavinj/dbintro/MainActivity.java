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
        db.addContact(new Contact("Bony", "7625658798"));
        db.addContact(new Contact("Milka","7665431345"));
        db.addContact(new Contact("Swanson","7830034621"));
        db.addContact(new Contact("Doug","1328974252"));


        //Read contacts back
        Log.d("Reading", "Reading all contacts...");
        List<Contact> contactList = db.getAllContacts();

        for (Contact c: contactList){
            String log = "ID: " + c.getId()+" , Name: " + c.getName()+" , Phone Number: " + c.getPhoneNumber();
            Log.d("Name: ", log);
        }
    }
}
