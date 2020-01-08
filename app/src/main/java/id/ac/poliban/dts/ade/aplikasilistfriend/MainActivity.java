package id.ac.poliban.dts.ade.aplikasilistfriend;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<String> friend = new ArrayList<>();
    {
        friend.add("Indonesia");
        friend.add("Malaysia");
        friend.add("Singapura");
        friend.add("Italia");
        friend.add("Inggris");
        friend.add("Belanda");
        friend.add("Argentina");
        friend.add("Chile");
        friend.add("Mesir");
        friend.add("Uganda");
        friend.add("Palestina");
        friend.add("India");
        friend.add("Hongkong");
        friend.add("Taiwan");
        friend.add("Thailand");
        friend.add("Banglades");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(getSupportActionBar()!=null)
            setTitle("Aplikasi List Friend");

        ListView listView = findViewById(R.id.list_view);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                R.layout.item_rows_friend, R.id.tv_item_friend, friend);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener((parent, view, position, id) -> Toast.makeText(this, "anda mengklik" +
                friend.get(position),Toast.LENGTH_SHORT).show());
    }
}