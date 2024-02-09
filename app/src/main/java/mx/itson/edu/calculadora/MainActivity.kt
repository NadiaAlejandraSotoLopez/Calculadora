package mx.itson.edu.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var numero1: Int = 0
    var numero2: Int = 0
    var operacion: Char = ' '
    var res: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Resultado se mostrarán en TextView
        val num1: TextView = findViewById(R.id.TVOperacion)
        val num2: TextView = findViewById(R.id.TVResultado)
        val resultado: Button = findViewById(R.id.btnResultado)
        val borrar: Button = findViewById(R.id.btnBorrar)


        resultado.setOnClickListener() {
            numero2 = num2.text.toString().toInt()

            when (operacion) {
                '+' -> res = numero1 + numero2
                '-' -> res = numero1 - numero2
                '*' -> res = numero1 * numero2
                '/' -> res = numero1 / numero2
            }

            num1.setText(res.toString())
           // num2.setText("")
            num2.setHint("")


        }
        borrar.setOnClickListener() {
            num1.setText("")
            num2.setText("")

            numero1 = 0
            numero2 = 0
            res = 0
            operacion = ' '
        }
    }
    fun clickOperacion(view: View) {
        val txtOperacion: TextView = findViewById(R.id.TVOperacion)
        val txtResultado: TextView = findViewById(R.id.TVResultado)
        when(view.id){
            R.id.btnSum -> {
                txtOperacion.setText(txtResultado.text.toString() + " + ")
                operacion = '+'
            }
            R.id.btnRes -> {
            txtOperacion.setText(txtResultado.text.toString() + " - ")
            operacion = '-'
            }
            R.id.btnDiv -> {
            txtOperacion.setText(txtResultado.text.toString() + " / ")
            operacion = '/'
            }
            R.id.btnMult -> {
            txtOperacion.setText(txtResultado.text.toString() + " * ")
            operacion = '*'
            }
        }

        numero1 = txtResultado.text.toString().toInt()
        txtResultado.setText("")
        txtResultado.setHint("0")
     }
        fun onClickListener(view: View) {
            val txtResult: TextView = findViewById(R.id.TVResultado)
            val numero: String = txtResult.text.toString()

            when (view.id) {
                R.id.btn0 -> txtResult.setText(numero + "0")
                R.id.btn1 -> txtResult.setText(numero + "1")
                R.id.btn2 -> txtResult.setText(numero + "2")
                R.id.btn3 -> txtResult.setText(numero + "3")
                R.id.btn4 -> txtResult.setText(numero + "4")
                R.id.btn5 -> txtResult.setText(numero + "5")
                R.id.btn6 -> txtResult.setText(numero + "6")
                R.id.btn7 -> txtResult.setText(numero + "7")
                R.id.btn8 -> txtResult.setText(numero + "8")
                R.id.btn9 -> txtResult.setText(numero + "9")
            }
        }
}




