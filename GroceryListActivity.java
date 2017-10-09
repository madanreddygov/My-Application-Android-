package com.example.s528131.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class GroceryListActivity extends AppCompatActivity {



    TableLayout t1;

    public void newActivity(View v){
        //Toast.makeText(this,"working",Toast.LENGTH_SHORT).show();
        Intent i=new Intent(GroceryListActivity.this,AddItemActivity.class);
        startActivityForResult(i,0);
    }






    public void init(){
        t1=(TableLayout)findViewById(R.id.tImp);
        Food[] fArray=new Food[]{
                new Food("Milk", 2.79),
                new Food("Orange Juice", 4.38),
                new Food("Bread", 1.59),
                new Food("Fat Freeze Frozen Yogurt", 3.99)
        };
        for(int i=0;i<fArray.length;i++){
            TableRow    r1=new TableRow(this);
            TextView    d1=new TextView(this);
            d1.setText(fArray[i].getName()+"\n"+fArray[i].getPrice()+"\n____________________________________________________");
            r1.addView(d1);
            t1.addView(r1);

        }

    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grocery_list);
        init();



    }

    @Override
    protected void onActivityResult(int requestCode,int resultCode,Intent data){
        String ans=data.getStringExtra("Name");
        String price=data.getStringExtra("Price").toString();
        TableRow x=new TableRow(this);
        TextView y=new TextView(this);
        y.setText(ans+"\n"+price+"\n____________________________________________________");
        x.addView(y);
        t1.addView(x);
    }




}
