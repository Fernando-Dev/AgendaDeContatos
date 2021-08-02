package br.fernando.agendadecontatos.ui.viewmodel


import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import br.fernando.agendadecontatos.model.Contact

import br.fernando.agendadecontatos.model.ContactRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class ListViewModel(private val repository: ContactRepository) : ViewModel() {

    private val coroutinesScope = CoroutineScope(Dispatchers.IO)

    val contacts = MutableLiveData<List<Contact>>()

    fun getContacts() = coroutinesScope.launch {
        repository.getAllContacts()
    }

}