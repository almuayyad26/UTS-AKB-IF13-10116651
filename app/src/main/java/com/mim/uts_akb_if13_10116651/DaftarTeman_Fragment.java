package com.mim.uts_akb_if13_10116651;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class DaftarTeman_Fragment extends Fragment {
    @Nullable
   // String[] listArray={"ASP","C#","C++","HTML5","Javascript","Java","Objective-C","Perl","PHP","Python","Swift",};
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_daftarteman, container, false);
        ListView listview =(ListView) view.findViewById(R.id.listView);

        List<ModelDaftarTeman> listStudent=new ArrayList<>();

        ModelDaftarTeman student,student2,student3;

        student=new ModelDaftarTeman();
        student.setImage(R.drawable.teman);
        student.setName("A Aris Fauzi");
        student.setNim(10116563);
        student.setKelas("IF13");
        student.setTelepon("083821281334");
        student.setEmail("aarisfauji24@gmail.com");
        student.setSosmed("@arisfauzi");
        listStudent.add(student);

        student2=new ModelDaftarTeman();
        student2.setImage(R.drawable.teman);
        student2.setName("Hilfi Muhamad Aryawan");
        student2.setNim(10116587);
        student2.setKelas("IF13");
        student2.setTelepon("083652647988");
        student2.setEmail("hilfima@gmail.com");
        student2.setSosmed("@hilfima");
        listStudent.add(student2);

        student3=new ModelDaftarTeman();
        student3.setImage(R.drawable.teman);
        student3.setName("Yusup Maulana Ibrohim");
        student3.setNim(10116689);
        student3.setKelas("IF13");
        student3.setTelepon("08563237862");
        student3.setEmail("yusupmaulanaibrohim@gmail.com");
        student3.setSosmed("@yusupma");

        listStudent.add(student3);

        ArrayAdapter adapter = new DaftarTeman(getActivity(),R.layout.activity_listview,listStudent);
        listview.setAdapter(adapter);
        return view;
        //10116651-Muhamad Iyad Muayyad-IF13
    }

}
