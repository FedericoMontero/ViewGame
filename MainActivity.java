package com.fedemcodee.federico.gview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    List<Book> lstBook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lstBook = new ArrayList<>();
        lstBook.add(new Book("Historia manga", "vdsvsa", "avdsvnv:jBnowiafeiofjeio", R.drawable.foto1));
        lstBook.add(new Book("Historia manga2", "Catvdsvda", "vdsvsd", R.drawable.foto16));
        lstBook.add(new Book("Historia manga3", "Catvdsvdsvia", "dvsvdv", R.drawable.foto2));
        lstBook.add(new Book("Historia manga4", "Catdvdsvria", "vdsvdsv", R.drawable.foto3));
        lstBook.add(new Book("Historia manga6", "Cadvdsvia", "vdsvvdvsvn", R.drawable.foto4));
        lstBook.add(new Book("Historia manga", "Catvddsvdria", "vsdvs", R.drawable.foto5));
        lstBook.add(new Book("Historia manga2", "Catvddvria", "vdsvsv", R.drawable.foto6));
        lstBook.add(new Book("Historia manga3", "Catdvsdsvgoria", "dvvsvd", R.drawable.foto7));
        lstBook.add(new Book("Historia manga5", "vdsva", "vdsvsvs", R.drawable.foto8));
        lstBook.add(new Book("Historia manga6", "Cvdsvdsva", "dsvdsvs", R.drawable.foto9));
        lstBook.add(new Book("Historia manga", "Catdsvdia", "vsdvsvds", R.drawable.foto10));
        lstBook.add(new Book("Historia manga2", "Catdvsvdsia", "vdsvsv", R.drawable.foto11));
        lstBook.add(new Book("Historia manga3", "Cvdsdsvria", "vsdvsvsv", R.drawable.foto12));
        lstBook.add(new Book("Historia manga4", "Cavdsvdsria", "vsdvsvn", R.drawable.foto13));
        lstBook.add(new Book("Historia manga5", "Cadvsdsvia", "vsdvsvsdvn", R.drawable.foto14));
        lstBook.add(new Book("Historia manga6", "Cdvdia", "Dvdsvsdvn", R.drawable.foto15));


        RecyclerView myrv = (RecyclerView) findViewById(R.id.recyclerview_id);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(this,lstBook);
        myrv.setLayoutManager(new GridLayoutManager(this,3));
        myrv.setAdapter(myAdapter);
    }
}
