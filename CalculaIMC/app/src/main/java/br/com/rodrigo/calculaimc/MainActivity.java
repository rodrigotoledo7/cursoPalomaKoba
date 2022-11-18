package br.com.rodrigo.calculaimc;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button btcalcular;
    EditText edtnome, edtpeso, edtaltura;
    RadioGroup grupo;
    RadioButton rbfeminino, rbmasculino;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btcalcular = findViewById(R.id.btncalcular);
        edtnome = findViewById(R.id.edtnome);
        edtpeso = findViewById(R.id.edtpeso);
        edtaltura = findViewById(R.id.edtaltura);
        grupo = findViewById(R.id.grupo);
        rbfeminino = findViewById(R.id.rdfeminino);
        rbmasculino = findViewById(R.id.rdmasculino);
        btcalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double peso = Double.parseDouble(edtpeso.getText().toString());
                double altura = Double.parseDouble(edtaltura.getText().toString())/100;
                double imc = peso / (altura*altura);
                int opcao = grupo.getCheckedRadioButtonId();
                String msg;
                if (opcao==R.id.rdmasculino){
                    if (imc < 20){
                        msg = "Abaixo do normal";
                    } else if  ((imc >= 20) && (imc <= 24.9)){
                        msg = "Normal";
                    }else if ((imc>24.9)&&(imc <=29.9)){
                        msg="Obesidade leve";
                    } else if ((imc >29.9)&&(imc<=43)){
                        msg ="Obesidade moderada";
                    } else msg ="Obesidade Morbida";
                } else {
                    // radio Buttom FEMININO
                    if (imc < 19){
                        msg = "Abaixo do normal";
                    } else if  ((imc >= 19) && (imc <= 23.9)){
                        msg = "Normal";
                    }else if ((imc>23.9)&&(imc <=28.9)){
                        msg="Obesidade leve";
                    } else if ((imc >28.9)&&(imc<=39)){
                        msg ="Obesidade moderada";
                    } else msg ="Obesidade Morbida";
                }
                AlertDialog.Builder janela=new AlertDialog.Builder(MainActivity.this);
                janela.setTitle(R.string.app_name);
                janela.setMessage(String.format("IMC = %.2f\n %s\n",imc,msg));
                janela.setNeutralButton("OK",null);
                janela.show();
            }
        });
    }
}
