package cl.ipvg.certamen1viaroskazamorano;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivityUno extends AppCompatActivity {
    private TextView Nombre;
    private Button BtnR;
    private TextView Datos2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_uno);
        AdquirirInfoAlumnos();
        BtnR=(Button)findViewById(R.id.btnB);
        Bundle extras = getIntent().getExtras();
        String Alumno1 = extras.getString("Nombre");
        Nombre= (TextView) findViewById(R.id.NaAlumno);
        Nombre.setText(Alumno1);
        Datos2= (TextView) findViewById(R.id.Informacion1);
        Datos2.setText("El o la Estudiante"+Alumno1 + "   y Su Promedio Es:");

        BtnR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent BtnR = new Intent(MainActivityUno.this,MainActivity.class);
                startActivity(BtnR);
            }
        });
    }
    public void  AdquirirInfoAlumnos(){
        Bundle Informacion2_ = getIntent().getExtras();
    }
}