package br.fernando.agendadecontatos.model

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy.REPLACE
import androidx.room.Query

@Dao
interface ContactDao {

    @Insert(onConflict = REPLACE)
    suspend fun addContact(contact: Contact): Long

    @Query("SELECT * FROM contact WHERE id = :id")
    suspend fun getContact(id: Int): Contact

    @Query("SELECT * FROM contact")
    suspend fun getAllContact(): List<Contact>

    @Query("DELETE FROM contact WHERE id LIKE :id")
    suspend fun deleteContact(id: Int)
}