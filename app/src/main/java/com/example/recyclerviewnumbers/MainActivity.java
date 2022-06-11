package com.example.recyclerviewnumbers;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ArrayList<String> names, numbers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        names = new ArrayList<>();
        numbers = new ArrayList<>();

        uploadData(names, numbers);
        recyclerView = findViewById(R.id.recyclerview);
        NumberAdapter numberAdapter = new NumberAdapter(names, numbers);
        recyclerView.setAdapter(numberAdapter);
    }

    private void uploadData(ArrayList<String> names, ArrayList<String> numbers) {
        names.add("Adyl");
        names.add("Asan");
        names.add("Aibek");
        names.add("Adilet");
        names.add("Akobir");
        names.add("Altynai");
        names.add("Azat");
        names.add("Aikokul");
        names.add("Asylbek");
        names.add("Alybek");
        names.add("Atai");
        names.add("Aliyar");
        names.add("Arsen");
        names.add("Argen");
        names.add("Alhan");

        Random random = new Random();
        String random_text = "";
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 6; j++) {
                if (j % 2 == 0) {
                    random_text += " ";
                }
                random_text += String.valueOf(random.nextInt(10));
            }
            numbers.add("+996 555 " + random_text);
            random_text = "";
        }
    }
}