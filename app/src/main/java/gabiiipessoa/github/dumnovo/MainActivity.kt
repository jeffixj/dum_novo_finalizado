package gabiiipessoa.github.dumnovo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private lateinit var btlogin: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btlogin = findViewById(R.id.btLogin)

        btlogin.setOnClickListener {
            val intent = Intent (this, tela2::class.java)
            startActivity(intent)
        }

    }
}