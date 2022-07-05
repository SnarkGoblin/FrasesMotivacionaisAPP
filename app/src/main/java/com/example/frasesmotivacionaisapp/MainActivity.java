package com.example.frasesmotivacionaisapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView frase; //Variável de tipo texto
    private Button gerarFrase; //Variável de tipo Botão



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        frase = findViewById(R.id.frase);
        gerarFrase = findViewById(R.id.gerarFrase);

        getSupportActionBar().hide(); //Esconder a action bar

        //Este bloco faz com que a variável gerarFrase tenha uma ação ao clicar. A ação de mudar de frase
        //ao clicar
        gerarFrase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //String que armazena as frases
                String[] frasesMotivacionais = {"Na vida um monte de gente sabe o que fazer, mas poucos fazem, de fato, o que sabem que é preciso.Saber não é o suficiente. Você precisa agir",
                        "Saiba que são suas decisões, e não suas condições, que determinam seu destino",
                        "Se você faz o que sempre fez, você obterá o que você sempre obteve",
                        "É nos momentos de decisão que o seu destino é traçado",
                        "Onde há foco a energia flui"
                };

                Random aleatorio = new Random(); //Classe random, faz com que receba valores aleatórios. Variável do tipo Random

                //Variável numerosAleatorios do tipo int que recebe a variável random. Que pega o array de strings
                int frasesAleatorias = aleatorio.nextInt(frasesMotivacionais.length);

            frase.setText(frasesMotivacionais[frasesAleatorias]); //frase seta os valores em frasesMotivacionais de froma aleatoria(numerosAleatorios)

            }

        });

    }

}





















