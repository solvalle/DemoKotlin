package cr.ac.ucr.ecci.demokotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.room.Room
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch


// entity - table
// dao - queries
// database

class MainActivity : AppCompatActivity() {
    private lateinit var database: myDatabase
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Llamado al objeto de la DB
        database = Room.databaseBuilder(
            applicationContext, myDatabase::class.java, "To_Do"
        ).build()
        add.setOnClickListener {
            val intent = Intent(this, CreateCard::class.java)
            startActivity(intent)
        }

        //Se borran todas las tareas
        deleteAll2.setOnClickListener {
            DataObject.deleteAll()
            GlobalScope.launch {
                database.dao().deleteAll()
            }
            setRecycler()
        }

        //Se llama el login
        deleteAll.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java);
            startActivity(intent);
        }
        setRecycler()

    }

    //Layout del recyclerView
    fun setRecycler() {
        recycler_view.adapter = Adapter(DataObject.getAllData())
        recycler_view.layoutManager = LinearLayoutManager(this)
    }
}

/*
        buttonMain.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java);
            startActivity(intent);
        }
 */