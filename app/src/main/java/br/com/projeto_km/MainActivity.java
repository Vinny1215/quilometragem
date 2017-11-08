package br.com.projeto_km;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    ListView list_view;
    EditText txt_km;

    private Spinner categoria;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ArrayAdapter<CharSequence> adapter =
                ArrayAdapter.createFromResource(
                        this, R.array.categoria_mes,
                        android.R.layout.simple_spinner_item);
        categoria = (Spinner)findViewById(R.id.categoria);
        categoria.setAdapter(adapter);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.action_visualizar) {
            startActivity(new Intent(this, Visualizar_dados.class));
            return true;
        }else if (id == R.id.action_calcular)
            return true;

        return super.onOptionsItemSelected(item);
    }


    public void inserir(View view) {

        String produto = txt_km.getText().toString();

        if(produto.isEmpty()) return;

    }
}
