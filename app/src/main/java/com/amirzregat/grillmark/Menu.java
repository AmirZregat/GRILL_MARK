package com.amirzregat.grillmark;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.ViewFlipper;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Menu extends AppCompatActivity {
ViewFlipper viewFlipper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
//flipper
        int images[]={R.drawable.slide1,R.drawable.slide2,R.drawable.slide3,R.drawable.slide4};
        viewFlipper=findViewById(R.id.v_flipper);

    for(int i=0;i<images.length;i++)
    {
        flipperImages(images[i]);
    }
//end of flipper

    ArrayList<menuList> items=new ArrayList<>();
        items.add(new menuList("Chicken",R.drawable.chickenburger));
        items.add(new menuList("Beef",R.drawable.hamburger));
        items.add(new menuList("Snacks",R.drawable.snack));
        items.add(new menuList("Angus Beef",R.drawable.angus));
        items.add(new menuList("Fries",R.drawable.potatoes));
        items.add(new menuList("Cold Drink",R.drawable.cola));

        MyCustomAdapter myadapter=new MyCustomAdapter(items);

    ListView ls=findViewById(R.id.menuListView);

    ls.setAdapter(myadapter);

    ls.setOnItemClickListener(new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
           switch (position)
               {
                   case 0:
                   {
                       Intent intent=new Intent(Menu.this,chickenActivity.class);
                       startActivity(intent);
                   break;
                   }
                   case 1:
                   {

                       Intent intent=new Intent(Menu.this,beefActivity.class);
                       startActivity(intent);
                   break;
                   }
                   case 2:
                   {

                       Intent intent=new Intent(Menu.this,snacksActivity.class);
                       startActivity(intent);
                       break;

                   }
                   case 3:
                   {

                       Intent intent=new Intent(Menu.this,angusActivity.class);
                       startActivity(intent);
                       break;
                   }
                   case 4:
                   {

                       Intent intent=new Intent(Menu.this,FriesActivity.class);
                       startActivity(intent);
                   }
                   case 5:
                   {

                       Intent intent=new Intent(Menu.this,drinkActivity.class);
                       startActivity(intent);
                       break;

                   }

               }

        }
    });

    }
    public void flipperImages(int image )
    {
        ImageView imageView=new ImageButton(this);
        imageView.setBackgroundResource(image);
        viewFlipper.addView(imageView);
        viewFlipper.setFlipInterval(3000);
        viewFlipper.setAutoStart(true);
        viewFlipper.setInAnimation(this,android.R.anim.slide_in_left);
        viewFlipper.setOutAnimation(this,android.R.anim.slide_out_right);

    }

    public void backClick(View view) {
        Intent intent=new Intent(this,Home.class);
        startActivity(intent);
    }

    class MyCustomAdapter extends BaseAdapter
    {
        ArrayList<menuList> items=new ArrayList<menuList>();
        MyCustomAdapter(ArrayList<menuList>items){
this.items=items;
        }

        @Override
        public int getCount() {
            return items.size();
        }

        @Override
        public Object getItem(int position) {
            return items.get(position).nameOfItem;
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            LayoutInflater layoutInflater=getLayoutInflater();
            View view1=layoutInflater.inflate(R.layout.row_view,null);
            TextView txtv=view1.findViewById(R.id.txtvName);
            ImageView imgv=view1.findViewById(R.id.image);
            txtv.setText(items.get(position).nameOfItem);
            imgv.setBackgroundResource(items.get(position).images);
            return view1;
        }
    }
}
