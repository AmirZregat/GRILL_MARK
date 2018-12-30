package com.amirzregat.grillmark;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class FriesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fries);
        ArrayList<mealsList> meals=new ArrayList<mealsList>();
        meals.add(new mealsList("Potato Wedges"));
        meals.add(new mealsList("Potato Wedges with Cheese"));
        meals.add(new mealsList("French Fries"));
        meals.add(new mealsList("French Fries with Cheese"));
        FriesActivity.MyCustomAdapter myCustomAdapter=new FriesActivity.MyCustomAdapter(meals);
        ListView ls=findViewById(R.id.listFries);
        ls.setAdapter(myCustomAdapter);
    }
    public void buBack(View view) {
        Intent intent=new Intent(this,Menu.class);
        startActivity(intent);
    }


    class MyCustomAdapter extends BaseAdapter
    {

        ArrayList<mealsList> meal=new ArrayList<mealsList>();

        MyCustomAdapter(ArrayList<mealsList> meal)
        {
            this.meal=meal;
        }
        @Override
        public int getCount() {
            return meal.size();
        }

        @Override
        public Object getItem(int position) {
            return meal.get(position).nameOfMeal;
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            LayoutInflater layoutInflater=getLayoutInflater();
            View view1=layoutInflater.inflate(R.layout.row2_view,null);
            TextView txtvmeal=view1.findViewById(R.id.txtvMeal);
            txtvmeal.setText(meal.get(position).nameOfMeal);
            return view1;
        }
    }
}
