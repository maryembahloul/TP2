package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int mCount = 0;
    private TextView mShowCount;
    public static final String EXTRA_MESSAGE =
            "com.example.android.myapplication.extra.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);
        Log.d("Question1:", "Réponse:La deuxième activité est ajoutée en tant que classe Java, le fichier de présentation (layout) XML " +
                "est créé et le fichier AndroidManifest.xml est modifié pour déclarer une deuxième activité.");
        Log.d("Question2:", "Réponse: Le bouton Back (Précédent) ne fonctionne plus dans la deuxième activité pour " +
                "renvoyer l'utilisateur à l'activité principale.");
        Log.d("Question3:", "Réponse: new Intent(Context context, Class<?> class)");
        Log.d("Question4:", "Réponse: Comme extra d'intention (Intent)");
        Log.d("Question5:", "Tout ce qui précède");


    }

    public void countUp(View view) {
        ++mCount;
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));
    }

    public void launchSecondActivity(View view) {
        Intent intent = new Intent(this, secondactivity.class);
        String message = mShowCount.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);

    }
}
