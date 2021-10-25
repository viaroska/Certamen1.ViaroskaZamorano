package cl.ipvg.certamen1viaroskazamorano;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText Nombre;
    EditText Carrera;
    Button BtnCalcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Carrera = (EditText)findViewById(R.id.CaCarrera);
        Intent act = new Intent(this,MainActivityUno.class);
        Nombre= (EditText)findViewById (R.id.NaNombre);
        BtnCalcular = (Button)findViewById(R.id.BtnCalcular1);
        BtnCalcular.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                act.putExtra("Nombre",Nombre.getText().toString());

                Intent BtnCalcular = new Intent(MainActivity.this,MainActivityUno.class);

                startActivity(act);
            }
        });
    }
}