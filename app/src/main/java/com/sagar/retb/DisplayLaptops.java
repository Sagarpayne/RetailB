package com.sagar.retb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class DisplayLaptops extends AppCompatActivity {
    private final String android_version_names[] = {
            "HP",
            "Dell",
            "Mac",
            "Samsung",
            "acer",

    "Microsoft"};

    private final String android_image_urls[] = {
            "https://dri1.img.digitalrivercontent.net/Storefront/Company/msintl/images/English/en-INTL-Lenovo-Z50-QF9-00446/en-INTL-L-Lenovo-Z50-QF9-00446-mnco.jpg",
            "https://dri1.img.digitalrivercontent.net/Storefront/Company/msintl/images/English/en-INTL-Lenovo-Z50-QF9-00446/en-INTL-L-Lenovo-Z50-QF9-00446-mnco.jpg",
            "https://dri1.img.digitalrivercontent.net/Storefront/Company/msintl/images/English/en-INTL-Lenovo-Z50-QF9-00446/en-INTL-L-Lenovo-Z50-QF9-00446-mnco.jpg",
            "https://dri1.img.digitalrivercontent.net/Storefront/Company/msintl/images/English/en-INTL-Lenovo-Z50-QF9-00446/en-INTL-L-Lenovo-Z50-QF9-00446-mnco.jpg",
            "https://dri1.img.digitalrivercontent.net/Storefront/Company/msintl/images/English/en-INTL-Lenovo-Z50-QF9-00446/en-INTL-L-Lenovo-Z50-QF9-00446-mnco.jpg",
            "https://dri1.img.digitalrivercontent.net/Storefront/Company/msintl/images/English/en-INTL-Lenovo-Z50-QF9-00446/en-INTL-L-Lenovo-Z50-QF9-00446-mnco.jpg"


    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_product);


        initViews();
    }
    private void initViews(){
        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.rv);
        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(getApplicationContext(),2);
        recyclerView.setLayoutManager(layoutManager);

        ArrayList<Products> productses = prepareData();
        DataAdapter adapter = new DataAdapter(getApplicationContext(), productses);
        recyclerView.setAdapter(adapter);

    }
    private ArrayList<Products> prepareData(){

        ArrayList<Products> android_version = new ArrayList<>();
        for(int i=0;i<android_version_names.length;i++){
            Products products = new Products();
            products.setAndroid_version_name(android_version_names[i]);
            products.setAndroid_image_url(android_image_urls[i]);
            android_version.add(products);
        }
        return android_version;
    }
}
