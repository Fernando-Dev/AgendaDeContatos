package br.fernando.agendadecontatos

import android.app.Application
import br.fernando.agendadecontatos.model.ContactDatabase
import br.fernando.agendadecontatos.model.ContactRepository

class ContactApplication : Application() {

    val database by lazy{ContactDatabase.getInstance(this)}

    val repository by lazy { ContactRepository(database.contactDao()) }
}