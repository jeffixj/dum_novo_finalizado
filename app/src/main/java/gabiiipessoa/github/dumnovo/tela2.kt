package gabiiipessoa.github.dumnovo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Locale

class tela2 : AppCompatActivity() {
    private lateinit var buttonCalculate: Button
    private lateinit var editTextLastMenstruation: EditText
    private lateinit var textViewResult: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela2) // Define o layout da atividade como "activity_tela2.xml"
        buttonCalculate = findViewById(R.id.buttonCalculate) // Obtém a referência para o botão de calcular do layout
        editTextLastMenstruation = findViewById(R.id.editTextLastMenstruation) // Obtém a referência para o campo de texto da última menstruação do layout
        textViewResult = findViewById(R.id.textViewResult)// Obtém a referência para o campo de texto do resultado do layout



        // Define um listener de clique para o botão de calcular
        buttonCalculate.setOnClickListener {
            calculateExpectedDueDate()  // Chama a função para calcular a data provável do parto


        }
    }
    private fun calculateExpectedDueDate() {
        val lastMenstruation = editTextLastMenstruation.text.toString()  // Obtém a data da última menstruação do campo de texto

        // Converter a data de String para um objeto Date
        val dateFormat = SimpleDateFormat("dd/MM/yyyy", Locale.getDefault())
        val lastMenstruationDate = dateFormat.parse(lastMenstruation)

        // Adicionar 7 dias e 9 meses à data da última menstruação
        val calendar = Calendar.getInstance()
        calendar.time = lastMenstruationDate
        calendar.add(Calendar.DAY_OF_YEAR, 7)
        calendar.add(Calendar.MONTH, 9)

        // Formatar a data do parto e exibi-la no TextView
        val dueDate = dateFormat.format(calendar.time)
        textViewResult.text = "Data provável do parto: $dueDate"
    }
}


