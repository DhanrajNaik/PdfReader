package com.dhanraj.pdfreaderapp;

import android.graphics.Bitmap;
import android.os.Handler;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

import java.io.File;

import es.voghdev.pdfviewpager.library.PDFViewPager;
import es.voghdev.pdfviewpager.library.adapter.PDFPagerAdapter;
import es.voghdev.pdfviewpager.library.asset.CopyAsset;
import es.voghdev.pdfviewpager.library.asset.CopyAssetThreadImpl;

public class Main2Activity extends AppCompatActivity  {



    Integer pageNumber = 1;
    String pdfName = "HV.pdf";

    PDFViewPager pdfViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

    /*    pdfViewPager = (PDFViewPager) findViewById(R.id.pdfViewPager);

        CopyAsset copyAsset = new CopyAssetThreadImpl(getApplicationContext(), new Handler());
        copyAsset.copy(pdfName, new File(getCacheDir(), pdfName).getAbsolutePath());

        pdfViewPager = new PDFViewPager(this, pdfName);*/
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if(pdfViewPager!=null){
            ((PDFPagerAdapter) pdfViewPager.getAdapter()).close();
        }

    }


}
