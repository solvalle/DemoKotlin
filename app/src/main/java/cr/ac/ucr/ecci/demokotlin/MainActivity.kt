package cr.ac.ucr.ecci.demokotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonMain = findViewById<Button>(R.id.buttonMain);

        buttonMain.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java);
            startActivity(intent);
        }

    }
}