package cr.ac.ucr.ecci.demokotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        //Mapeo UI
        val btnLogin = findViewById<Button>(R.id.btnLogin);
        val UsernameInput = findViewById<EditText>(R.id.UsernameInput);
        val PasswordInput = findViewById<EditText>(R.id.PasswordInput);

        btnLogin.setOnClickListener {

            if (UsernameInput.text.trim().isNotEmpty() || PasswordInput.text.trim().isNotEmpty()) {
                if(UsernameInput.text.toString() == "admin" || PasswordInput.text.toString() == "admin"){
                    val intent = Intent(this, MainActivity::class.java);
                    startActivity(intent);
                } else {
                    Toast.makeText(this,"Credenciales incorrectas",Toast.LENGTH_LONG).show();
                }
            } else {
                Toast.makeText(this,"Debe digitar sus credenciales",Toast.LENGTH_LONG).show();
            }
        }
    }
}