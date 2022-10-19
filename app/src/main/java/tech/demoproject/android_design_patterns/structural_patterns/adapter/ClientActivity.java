package tech.demoproject.android_design_patterns.structural_patterns.adapter;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import tech.demoproject.android_design_patterns.R;

public class ClientActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ClientAdapter clientAdapter;
    ArrayList<User> users;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_client);

        recyclerView = findViewById(R.id.recycleViewClient);
        users = new ArrayList<>();
        for(int i = 1; i <= 40 ;i++){
            users.add(new User("User name "+i));
        }

        clientAdapter = new ClientAdapter(this,users);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setAdapter(clientAdapter);
        recyclerView.setLayoutManager(linearLayoutManager);
    }
}