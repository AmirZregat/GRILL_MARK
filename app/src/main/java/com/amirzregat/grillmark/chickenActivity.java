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

public class chickenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chicken);
        ArrayList<mealsList> meals=new ArrayList<mealsList>();
        meals.add(new mealsList("Chicken Burger 150 g"));
        meals.add(new mealsList("Chicken Burger 300g"));
        meals.add(new mealsList("Chicken Burger with mushroom"));
        meals.add(new mealsList("Chicken Burger with BBQ souce"));
        meals.add(new mealsList("Chicken Burger with Mexican"));
        meals.add(new mealsList("Chicken with Honey Mustard souce"));
        meals.add(new mealsList("Healthy chicken 150 g"));
        meals.add(new mealsList("Healthy chicken 300 g"));
        MyCustomAdapter myCustomAdapter=new MyCustomAdapter(meals);
        ListView ls=findViewById(R.id.listChicken);
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
