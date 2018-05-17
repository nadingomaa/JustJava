package com.example.android.justjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {
    int mQuantity=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void increment(View view) {
        mQuantity=mQuantity+1;
        display(mQuantity);
    }

    public void decrement(View view) {
        mQuantity=mQuantity-1;
        display(mQuantity);
    }


    public void submitOrder(View view) {
        displayPrice(mQuantity);
    }

    private void display(int mQuantity) {

        TextView quantity=findViewById(R.id.text_view_quatity);
        quantity.setText(mQuantity);

    }

    private void displayPrice(int mQuantity) {
        TextView price=findViewById(R.id.text_view_price);
        price.setText(NumberFormat.getCurrencyInstance().format(mQuantity*5));


    }

}
