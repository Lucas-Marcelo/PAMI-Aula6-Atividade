package br.com.example.cadastro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void proxima(View view)
    {
        Intent atividade = new Intent(this, AdicionalActivity.class);
        startActivity(atividade);
    }
}
