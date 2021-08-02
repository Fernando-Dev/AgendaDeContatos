package br.fernando.agendadecontatos.model

import android.graphics.Bitmap
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "contact")
data class Contact(

    /*@ColumnInfo(name = "foto_perfil")
    @SerializedName("foto_perfil")
    val fotoPerfil: Bitmap,*/

    @ColumnInfo(name = "nome")
    @SerializedName("nome")
    val nome: String,

    @ColumnInfo(name = "telefone")
    @SerializedName("telefone")
    val telefone: String,

    @ColumnInfo(name = "data_nascimento")
    @SerializedName("data_nascimento")
    val dataNascimento: String,

    @ColumnInfo(name = "cep")
    @SerializedName("cep")
    val cep: String,

    @ColumnInfo(name = "rua")
    @SerializedName("rua")
    val rua: String,

    @ColumnInfo(name = "numero_casa")
    @SerializedName("numero_casa")
    val numeroCasa: Int,

    @ColumnInfo(name = "cidade")
    @SerializedName("cidade")
    val cidade: String,

    @ColumnInfo(name = "bairro")
    @SerializedName("bairro")
    val bairro: String,

    @ColumnInfo(name = "estado")
    @SerializedName("estado")
    val estado: String,
) {
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0
}


