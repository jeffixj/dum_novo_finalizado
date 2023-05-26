package gabiiipessoa.github.dumnovo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
//Classe principal da atividade
class MainActivity : AppCompatActivity() {
    private lateinit var btlogin: Button
    //Função chamada quando a atividade é criada

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) // Define o layout da atividade como "activity_main.xml"
        btlogin = findViewById(R.id.btLogin) // Obtém a referência para o botão de login do layout

        // Define um listener de clique para o botão de login
        btlogin.setOnClickListener {
            val intent = Intent (this, tela2::class.java) // Cria um novo intent para iniciar a atividade "tela2"
            startActivity(intent) // Inicia a atividade "tela2"
        }

    }
}