package br.fernando.agendadecontatos.model

import android.content.Context
import androidx.annotation.WorkerThread
import androidx.lifecycle.LiveData

class ContactRepository(contactDao: ContactDao) {

   /* companion object {
        private lateinit var contactDao: ContactDao
    }*/

    init {
        val contactDb = ContactDatabase.getInstance(context)
        contactDao = contactDb.contactDao()
    }

    @WorkerThread
    suspend fun addNewContact(contact: Contact) {
        contactDao.addContact(contact)
    }

    @WorkerThread
    suspend fun getContactForId(id: Int): Contact {
        return contactDao.getContact(id)
    }

    @WorkerThread
    suspend fun getAllContacts(): List<Contact> {
        return contactDao.getAllContact()
    }

    @WorkerThread
    suspend fun deleteContact(id: Int) {
        contactDao.deleteContact(id)
    }

}