package com.example.aula14b;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = findViewById(R.id.recycler);
        List<Item> itens = new ArrayList<Item>();
        itens.add(new Item("Vitor Hashimoto", "vitorbest@gmail.com", R.drawable.men1));
        itens.add(new Item("Leonardo O. Cordeiro", "leozin11@gmail.com", R.drawable.men));
        itens.add(new Item("Bruna Silva", "brnslv@gmail.com", R.drawable.girl));
        itens.add(new Item("Jonathan Faria ", "fariajonathan@etec.sp.gov.br", R.drawable.men1));
        itens.add(new Item("Gabriela Giordina", "gabigio@gmail.com", R.drawable.girl));
        itens.add(new Item("Anderson Lima", "comercial_anderson@gmail.com", R.drawable.men));
        itens.add(new Item("Sasha Cabrina", "cabrina23@gmail.com", R.drawable.girl));
        itens.add(new Item("Patrícia Calabianco", "patypaty47@gmail.com", R.drawable.girl));
        itens.add(new Item("Vitor Hashimoto", "vitorbest@gmail.com", R.drawable.men1));
        itens.add(new Item("Leonardo O. Cordeiro", "leozin11@gmail.com", R.drawable.men));
        itens.add(new Item("Bruna Silva", "brnslv@gmail.com", R.drawable.girl));
        itens.add(new Item("Jonathan Faria ", "fariajonathan@etec.sp.gov.br", R.drawable.girl));
        itens.add(new Item("Gabriela Giordina", "gabigio@gmail.com", R.drawable.girl));
        itens.add(new Item("Anderson Lima", "comercial_anderson@gmail.com", R.drawable.men));
        itens.add(new Item("Sasha Cabrina", "cabrina23@gmail.com", R.drawable.girl));
        itens.add(new Item("Patrícia Calabianco", "patypaty47@gmail.com", R.drawable.girl));
        itens.add(new Item("Vitor Hashimoto", "vitorbest@gmail.com", R.drawable.men1));
        itens.add(new Item("Leonardo O. Cordeiro", "leozin11@gmail.com", R.drawable.men));
        itens.add(new Item("Bruna Silva", "brnslv@gmail.com", R.drawable.girl));
        itens.add(new Item("Jonathan Faria ", "fariajonathan@etec.sp.gov.br", R.drawable.men1));
        itens.add(new Item("Gabriela Giordina", "gabigio@gmail.com", R.drawable.girl));
        itens.add(new Item("Anderson Lima", "comercial_anderson@gmail.com", R.drawable.men));
        itens.add(new Item("Sasha Cabrina", "cabrina23@gmail.com", R.drawable.girl));
        itens.add(new Item("Patrícia Calabianco", "patypaty47@gmail.com", R.drawable.girl));
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter(getApplicationContext(), itens));
    }
}