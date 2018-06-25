package com.example.jcarlos.nicolsrest_v3;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class SliderAdapter extends PagerAdapter {

    Context context;
    LayoutInflater inflater;

    // list of images
    public int[] lst_images = {
            R.drawable.desayuno,
            R.drawable.comida,
            R.drawable.delivery
    };
    public int[] lst_images2 = {
            R.drawable.siguiente2,
            R.drawable.siguiente2,
            R.drawable.siguiente2
    };
    // list of titles
    public String[] lst_title = {
            "DESAYUNOS",
            "ALMUERZO",
            "DELIVERY"
    }   ;
    // list of descriptions
    public String[] lst_description = {
            " Deliciosos desayunos acompañados de tostadas, un poco de fruta, embutidos, cereales, un poco de pan y en ocasiones, queso o yogures ",
            " Degustaras de la variedad de platos preparardos con la mejor calidad de cocina",
            "Estamos al pendiente de nuestro cliente para que nuestras comidas lleguen hasta sus hogares"
    };
    // list of background colors
    public int[]  lst_backgroundcolor = {
            Color.rgb(239,85,85),
            Color.rgb(255,136,0),
            Color.rgb(1,188,212)
    };
    public String[] lst_botones= {
            "SIGUIENTE",
            "SIGUIENTE",
            "SIGUIENTE",
            "FINALIZAR"
    };

    public String[] lst_finalizar= {
            "DESLIZA",
            "DESLIZA",
            "PRESIONA AQUI PARA FINALIZAR"
    };
    public SliderAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return lst_title.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return (view==(LinearLayout)object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.slide,container,false);
        LinearLayout layoutslide = (LinearLayout) view.findViewById(R.id.slidelinearlayout);
        ImageView imgslide = (ImageView)  view.findViewById(R.id.slideimg);
        TextView txttitle= (TextView) view.findViewById(R.id.txttitle);
        TextView description = (TextView) view.findViewById(R.id.txtdescription);
        ImageView imageView=(ImageView)view.findViewById(R.id.imagensiguiente);
        layoutslide.setBackgroundColor(lst_backgroundcolor[position]);
        TextView textView=(TextView)view.findViewById(R.id.finalizar);
        imgslide.setImageResource(lst_images[position]);
        txttitle.setText(lst_title[position]);
        textView.setText(lst_finalizar[position]);
        imageView.setImageResource(lst_images2[position]);
        description.setText(lst_description[position]);
        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((LinearLayout)object);
    }
}
