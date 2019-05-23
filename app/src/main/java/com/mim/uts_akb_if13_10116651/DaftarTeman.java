package com.mim.uts_akb_if13_10116651;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class DaftarTeman extends android.widget.ArrayAdapter {
    List<ModelDaftarTeman> listStudent;
    Context context;
    int layout;

    public DaftarTeman(Context context, int layout, List<ModelDaftarTeman> listStudent) {
        super(context, layout, listStudent);
        this.context=context;
        this.layout=layout;
        this.listStudent=listStudent;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v=convertView;
        StudentHolder holder;

        if(v==null){
            LayoutInflater vi=((Activity)context).getLayoutInflater();
            v=vi.inflate(layout, parent,false);

            holder=new StudentHolder();
            holder.imageView=(ImageView) v.findViewById(R.id.image);
            holder.nameView=(TextView) v.findViewById(R.id.name);
            holder.nimView=(TextView) v.findViewById(R.id.nim);
            holder.kelasView=(TextView) v.findViewById(R.id.kelas);
            holder.teleponView=(TextView) v.findViewById(R.id.telepon);
            holder.emailView=(TextView) v.findViewById(R.id.email);
            holder.sosmedView=(TextView) v.findViewById(R.id.sosmed);

            v.setTag(holder);
        }
        else{
            holder=(StudentHolder) v.getTag();
        }

        ModelDaftarTeman student=listStudent.get(position);
        holder.imageView.setImageResource(student.getImage());
        holder.nameView.setText(student.getName());
        holder.nimView.setText(String.valueOf(student.getNim()));
        holder.kelasView.setText(student.getKelas());
        holder.teleponView.setText(student.getTelepon());
        holder.emailView.setText(student.getEmail());
        holder.sosmedView.setText(student.getSosmed());

        return v;
    }

    static class StudentHolder{
        ImageView imageView;
        TextView nameView;
        TextView nimView;
        TextView kelasView;
        TextView teleponView;
        TextView emailView;
        TextView sosmedView;
    }
}
