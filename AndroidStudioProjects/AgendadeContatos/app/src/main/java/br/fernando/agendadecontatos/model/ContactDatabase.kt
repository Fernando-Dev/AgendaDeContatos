package br.fernando.agendadecontatos.model

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Contact::class], version = 1)
abstract class ContactDatabase : RoomDatabase() {

    companion object {
        private const val DATABASE_NAME = "contact.db"

        private var instance: ContactDatabase? = null

        private fun create(context: Context): ContactDatabase = Room.databaseBuilder(
            context, ContactDatabase::class.java,
            DATABASE_NAME
        ).fallbackToDestructiveMigration()
            .build()

        fun getInstance(context: Context): ContactDatabase =
            (instance ?: create(context)).also {
                instance = it
            }
    }

    abstract fun contactDao(): ContactDao
}