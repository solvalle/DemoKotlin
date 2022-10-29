package cr.ac.ucr.ecci.demokotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val btnLogin = findViewById<Button>(R.id.btnLogin);
        val UsernameInput = findViewById<EditText>(R.id.UsernameInput);
        val PasswordInput = findViewById<EditText>(R.id.PasswordInput);

        btnLogin.setOnClickListener {

            if (UsernameInput.text.trim().isNotEmpty() || PasswordInput.text.trim().isNotEmpty()) {
                Toast.makeText(this,"Input recibido",Toast.LENGTH_LONG).show();
            } else {
                Toast.makeText(this,"Debe digitar sus credenciales",Toast.LENGTH_LONG).show();
            }
        }
    }
}