package com.example.s528131.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by S528131 on 3/1/2017.
 */
public class AddItemActivity extends Activity {

    public void retback(View v){
        Intent i=new Intent(AddItemActivity.this,GroceryListActivity.class);
        finish();
        startActivity(i);

    }



    public void addList(View v){
        //Toast.makeText(this,"In add method",Toast.LENGTH_SHORT).show();
        TextView name=(TextView)findViewById(R.id.editText2);
        TextView price=(TextView)findViewById(R.id.editText3);
        String n=name.getText().toString();
        String p=price.getText().toString();
        if (n.matches("") && p.matches("")){
            Toast.makeText(this,"Name and Price fields are empty",Toast.LENGTH_LONG).show();
            System.out.println("sfsjfksjlj");
        }
        else if(n.matches("")){
            Toast.makeText(this,"Name field is empty",Toast.LENGTH_LONG).show();
        }
        else if(p.matches("")){
            Toast.makeText(this,"Price field is empty",Toast.LENGTH_LONG).show();
        }
        else{
            Toast.makeText(this,"Added Successfully",Toast.LENGTH_LONG).show();
            Intent i=new Intent();
            i.putExtra("Name",n);
            i.putExtra("Price",p);
            setResult(RESULT_OK,i);
            onBackPressed();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_item_activity);

    }

    public void goGoogle(View view) {
        TextView search=(TextView)findViewById(R.id.editText2);
        String searc = search.getText().toString();
        Uri uri = Uri.parse("http://www.google.com/#q=" + searc);
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
}