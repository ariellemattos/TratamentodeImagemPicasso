package br.com.senaijandira.tratamentodeimagenspicasso;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    String urlImagem = "http://10.0.2.2/imagens/mario.jpg";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imageView);


//        Carregar imagem na interwebs
        Picasso.get().load(urlImagem). into(imageView);
    }
}
