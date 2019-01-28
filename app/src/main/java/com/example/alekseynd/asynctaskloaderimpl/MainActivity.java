package com.example.alekseynd.asynctaskloaderimpl;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements ContactsAdapter.OnItemClickListener {

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

    @Override
    public void onItemClick() {
        Toast.makeText(this, "clicked", Toast.LENGTH_SHORT).show();
    }
}
