package com.example.alekseynd.asynctaskloaderimpl;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity {

    // добавить фрагмент с recyclerview
    // добавить адаптер, холдер и генератор заглушечных данных
    // добавить обновление данных и состояние ошибки
    // добавить загрузку данных с телефонной книги
    // добавить обработку нажатий
    // добавить декораторы

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.container, RecyclerFragment.newInstance())
                    .commit();
        }
    }
}
