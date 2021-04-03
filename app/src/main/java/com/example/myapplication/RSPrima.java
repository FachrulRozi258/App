package com.example.myapplication;

import android.app.ListActivity;
import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class RSPrima extends ListActivity {
    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        String[] listAct = new String[]{"Call Center", "SMS Center", "Driving Direction", "Website", "Info","Exit"};
        this.setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listAct));
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
            if (pilihan.equals("Call Center")) {
                String notelpon ="tel:02199672";
                a = new Intent(Intent.ACTION_DIAL, Uri.parse(notelpon));

            } else if (pilihan.equals("SMS Center"))
            {
                String smsText="Fachrul Rozi H/L";
                a = new Intent(Intent.ACTION_VIEW);
                a.setData(Uri.parse("sms:089754389904"));
                a.putExtra("sms_body",smsText);

            } else if (pilihan.equals("Driving Direction"))
            {
                String lokasiRS ="google.navigation:q=0.49683811142514595, 101.40041655307256";
                a = new Intent(Intent.ACTION_VIEW,Uri.parse(lokasiRS));

            } else if (pilihan.equals("Website"))
            {
                String website ="https://rsprimapekanbaru.com/";
                a = new Intent(Intent.ACTION_VIEW,Uri.parse(website));
            } else if (pilihan.equals("Info"))
            {
                a = new Intent(Intent.ACTION_WEB_SEARCH);
                a.putExtra(SearchManager.QUERY,"Rumah Sakit Prima");
            }

            startActivity(a);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

