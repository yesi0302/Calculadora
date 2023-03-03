package com.example.calculadoraequipo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.mozilla.javascript.Scriptable;
public class MainActivity extends AppCompatActivity {

    private TextView tv_resultado,tv_operacion;
    private Button btn_0,btn_1,btn_2,btn_3,btn_4,btn_5,btn_6,btn_7,btn_8,btn_9,btn_C,btn_div,btn_mult,btn_resta,btn_suma,btn_borrar,btn_igual,btn_parentesis,btn_punto,btn_modulo;
    String data;
    private boolean decimal=false;
    private boolean tipoPar=false;
    private boolean bandera=true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            tv_operacion = (TextView) findViewById(R.id.txt_Operacion);
            tv_resultado = (TextView) findViewById(R.id.txt_Resultado);

            btn_0 = (Button) findViewById(R.id.btn_cero);
            btn_1 = (Button) findViewById(R.id.btn_uno);
            btn_2 = (Button) findViewById(R.id.btn_dos);
            btn_3 = (Button) findViewById(R.id.btn_tres);
            btn_4 = (Button) findViewById(R.id.btn_cuatro);
            btn_5 = (Button) findViewById(R.id.btn_cinco);
            btn_6 = (Button) findViewById(R.id.btn_seis);
            btn_7 = (Button) findViewById(R.id.btn_siete);
            btn_8 = (Button) findViewById(R.id.btn_ocho);
            btn_9 = (Button) findViewById(R.id.btn_nueve);

            btn_suma = (Button) findViewById(R.id.btn_mas);
            btn_resta = (Button) findViewById(R.id.btn_menos);
            btn_mult = (Button) findViewById(R.id.btn_mult);
            btn_div = (Button) findViewById(R.id.btn_div);
            btn_C = (Button) findViewById(R.id.btn_c);
            btn_borrar = (Button) findViewById(R.id.btn_borrar);
            btn_igual = (Button) findViewById(R.id.btn_igual);
            btn_punto = (Button) findViewById(R.id.btn_punto);
            btn_modulo = (Button) findViewById(R.id.btn_modulo);
            btn_parentesis = (Button) findViewById(R.id.btn_parentesis);
        }

    public void calcular (View view){
        decimal=false;
        tipoPar=false;
        bandera=true;

        btn_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = tv_operacion.getText().toString();
                tv_operacion.setText(data + "0");
                tipoPar=true;
            }
        });

        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = tv_operacion.getText().toString();
                tv_operacion.setText(data + "1");
                tipoPar=true;
            }
        });

        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = tv_operacion.getText().toString();
                tv_operacion.setText(data + "2");
                tipoPar=true;
            }
        });

        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = tv_operacion.getText().toString();
                tv_operacion.setText(data + "3");
                tipoPar=true;
            }
        });

        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = tv_operacion.getText().toString();
                tv_operacion.setText(data + "4");
                tipoPar=true;
            }
        });

        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = tv_operacion.getText().toString();
                tv_operacion.setText(data + "5");
                tipoPar=true;
            }
        });

        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = tv_operacion.getText().toString();
                tv_operacion.setText(data + "6");
                tipoPar=true;
            }
        });

        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = tv_operacion.getText().toString();
                tv_operacion.setText(data + "7");
                tipoPar=true;
            }
        });

        btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = tv_operacion.getText().toString();
                tv_operacion.setText(data + "8");
                tipoPar=true;
            }
        });

        btn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = tv_operacion.getText().toString();
                tv_operacion.setText(data + "9");
                tipoPar=true;
            }
        });

        btn_C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv_operacion.setText("");
                tv_resultado.setText("0");
                decimal = false;
                tipoPar=false;
                bandera=true;
            }
        });

        btn_punto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!decimal){
                    data = tv_operacion.getText().toString();
                    tv_operacion.setText(data + ".");
                }
                decimal = true;

            }
        });

        btn_suma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = tv_operacion.getText().toString();
                tv_operacion.setText(data + "+");
                decimal = false;
                tipoPar=false;
            }
        });

        btn_resta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = tv_operacion.getText().toString();
                tv_operacion.setText(data + "-");
                decimal = false;
                tipoPar=false;
            }
        });

        btn_modulo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = tv_operacion.getText().toString();
                tv_operacion.setText(data + "%");
                decimal = false;
                tipoPar=false;
            }
        });

        btn_mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = tv_operacion.getText().toString();
                tv_operacion.setText(data + "*");
                decimal = false;
                tipoPar=false;
            }
        });

        btn_div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = tv_operacion.getText().toString();
                tv_operacion.setText(data + "/");
                decimal = false;
            }
        });

        btn_borrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = tv_operacion.getText().toString();
                if (text.length() > 1) {
                    text = text.substring(0, text.length() - 1);
                    tv_operacion.setText(text);
                    if (text.charAt(text.length() - 1) == '.') {
                        decimal = true;
                    } else {
                        decimal = false;
                    }
                } else {
                    tv_operacion.setText("");
                    decimal = false;
                    tipoPar=false;
                    bandera=true;
                }
            }
        });

        btn_parentesis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tipoPar==true) {
                    if (bandera == true) {
                        data = tv_operacion.getText().toString();
                        tv_operacion.setText(data + "*(");
                        bandera = false;
                    } else {
                        data = tv_operacion.getText().toString();
                        tv_operacion.setText(data + ")");
                        bandera = true;
                    }
                }else {
                    if (bandera == true) {
                        data = tv_operacion.getText().toString();
                        tv_operacion.setText(data + "(");
                        bandera = false;
                    } else {
                        data = tv_operacion.getText().toString();
                        tv_operacion.setText(data + ")");
                        bandera = true;
                    }
                }
                decimal = false;
            }
        });

        btn_igual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    data = tv_operacion.getText().toString();
                    //Toast.makeText(MainActivity.this,""+data,Toast.LENGTH_SHORT).show();
                    // Comprobar datos
                    // //Log.e("@@@@@","onClick: "+data);
                    data = data.replaceAll("×", "*");
                    data = data.replaceAll("%", "/100");
                    data = data.replaceAll("÷", "/");

                    org.mozilla.javascript.Context rhino = org.mozilla.javascript.Context.enter();
                    rhino.setOptimizationLevel(-1);

                    String resultadoFinal = "";

                    Scriptable scriptable = rhino.initStandardObjects();
                    resultadoFinal = rhino.evaluateString(scriptable, data, "Javascript", 1, null).toString();

                    tv_resultado.setText(resultadoFinal);
                    decimal = false;
                }catch (Exception e){
                    tv_resultado.setText("Formato Invalido");
                }
            }
        });

    }
}