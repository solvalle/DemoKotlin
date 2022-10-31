package cr.ac.ucr.ecci.demokotlin

import androidx.room.Entity
import androidx.room.PrimaryKey

//Elementos de la tabla To_Do

@Entity(tableName = "To_Do")
data class Entity(
    @PrimaryKey(autoGenerate = true)
    var id:Int,
    var title:String,
    var priority:String
)