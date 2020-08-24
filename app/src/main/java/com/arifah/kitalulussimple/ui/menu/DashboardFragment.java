package com.arifah.kitalulussimple.ui.menu;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.arifah.kitalulussimple.Main2Activity;
import com.arifah.kitalulussimple.MainActivity;
import com.arifah.kitalulussimple.R;
import com.arifah.kitalulussimple.adapter.RequestAdapterRecyclerView;
import com.arifah.kitalulussimple.model.Menu;
import com.arifah.kitalulussimple.ui.home.HomeFragment;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class DashboardFragment extends Fragment {

    private RecyclerView recyclerView;
    private RequestAdapterRecyclerView adapter;
    private ArrayList<Menu> menuArrayList;
    private TextView btn_back;
    private FragmentManager fragmentManager;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_menu, container, false);

        btn_back = root.findViewById(R.id.tv_back);
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                HomeFragment homeFrag= new HomeFragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.nav_host_fragment, homeFrag, "findThisFragment")
                        .addToBackStack(null)
                        .commit();
            }
        });

        addData();
        RecyclerView recyclerView = (RecyclerView) root.findViewById(R.id.rv_list_request);

        RequestAdapterRecyclerView mAdapter = new RequestAdapterRecyclerView(menuArrayList);

        final LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(mAdapter);

        return root;
    }

    void addData(){

        menuArrayList = new ArrayList<>();
        menuArrayList.add(new Menu("Americano", "Rp. 11.000", "https://tukangreview.com/wp-content/uploads/2019/10/Cara-Membuat-Americano-Tanpa-Mesin.jpg"));
        menuArrayList.add(new Menu("Ice Latte", "Rp. 9.000", "https://www.baristainstitute.com/sites/default/files/styles/some_share/public/images/Tazza_Ice_Latte.jpg?itok=nb39ZGmv"));
        menuArrayList.add(new Menu("Chocolatte", "Rp. 8.500", "https://www.torani.com/sites/default/files/styles/torani_syrup_recipe_detail/public/recipes/illustration/84_mochas_11849.jpg?itok=zMq6sIzv"));
        menuArrayList.add(new Menu("Cappucino", "Rp. 6.500", "https://upload.wikimedia.org/wikipedia/commons/thumb/c/c8/Cappuccino_at_Sightglass_Coffee.jpg/640px-Cappuccino_at_Sightglass_Coffee.jpg"));

    }

}
