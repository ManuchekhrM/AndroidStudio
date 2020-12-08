package manu.meli.contacts;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity implements  ContactAdapter.OnItemClickListener{

    FloatingActionButton fab;
    RecyclerView recyclerView;
    ContactAdapter adapter;
    InfoContactAdapter information;

    //Массив с данными о контактах
    Contact[] contacts = new Contact[12];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, AddNewContactActivity.class);
                startActivity(intent);



            }
        });
        // Заполняем массив
        setContactsArray();

        // Инициалтзируем RecyclerView список
        initRecyclerView();

    }

    private void setContactsArray() {
        contacts[0] = new Contact(1, "Manuchekhr", "Melibaev", "melibaev.m.i@gmail.com", "+992-935-59-00-00");
        contacts[1] = new Contact(2, "Anush", "Bekov","melibaev.m.i@gmail.com", "+992-935-59-00-00");
        contacts[2] = new Contact(3, "Firuz", "Yorbekov","melibaev.m.i@gmail.com", "+992-935-59-00-00");
        contacts[3] = new Contact(4, "Muhammadjon", "Sharipov","melibaev.m.i@gmail.com", "+992-935-59-00-00");
        contacts[4] = new Contact(5, "Faridun", "Umarov","melibaev.m.i@gmail.com", "+992-935-59-00-00");
        contacts[5] = new Contact(6, "Farhod", "Manuylov","melibaev.m.i@gmail.com", "+992-935-59-00-00");
        contacts[6] = new Contact(7, "Abror", "Pi","melibaev.m.i@gmail.com", "+992-935-59-00-00");
        contacts[7] = new Contact(8, "Nohid", "Pi","melibaev.m.i@gmail.com", "+992-935-59-00-00");
        contacts[8] = new Contact(9, "Suhrob", "Kriptonit","melibaev.m.i@gmail.com", "+992-935-59-00-00");
        contacts[9] = new Contact(10, "Rustam", "Odilov","melibaev.m.i@gmail.com", "+992-935-59-00-00");
        contacts[10] = new Contact(11, "Juma", "German","melibaev.m.i@gmail.com", "+992-935-59-00-00");
        contacts[11] = new Contact(12, "Mubin", "Kholov","melibaev.m.i@gmail.com", "+992-935-59-00-00");

    }




    private void initRecyclerView() {
        recyclerView = findViewById(R.id.RecyclerView);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        DividerItemDecoration itemDecoration = new DividerItemDecoration(this, linearLayoutManager.getOrientation());
        adapter = new ContactAdapter(contacts, this);


        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.addItemDecoration(itemDecoration);
        recyclerView.setAdapter(adapter);
        recyclerView.setHasFixedSize(true);
    }


    @Override
    public void onItemClick(int position) {
        Intent contactInfo = new Intent(this, information.getClass());
        startActivity(contactInfo);


    }
}