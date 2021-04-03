package com.example.myapplication;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.io.PrintStream;

public class RS  extends ListActivity {
    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        String[] listRS = new String[]{"Rumah Sakit Eka Hospital", "Rumah Sakit Awal Bros", "Rumah Sakit Aulia Hospital", "Rumah Sakit Sansani", "Rumah Sakit Prima"};
        this.setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listRS));
    }

    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        Object o = this.getListAdapter().getItem(position);
        String pilihan = o.toString();
        tampilkanpilihan(pilihan);
    }

    private void tampilkanpilihan(String pilihan) {
        try {
            Intent a = null;
            if (pilihan.equals("Rumah Sakit Eka Hospital")) {
                a = new Intent(this, RSEkaHospital.class);

            } else if (pilihan.equals("Rumah Sakit Awal Bros")) {

            } else if (pilihan.equals("Rumah Sakit Aulia Hospital")) {

            } else if (pilihan.equals("Rumah Sakit Sansani")) {

            } else if (pilihan.equals("Rumah Sakit Prima")) {

            }
            startActivity(a);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}