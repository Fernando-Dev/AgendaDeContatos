package br.fernando.agendadecontatos.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import br.fernando.agendadecontatos.R
import br.fernando.agendadecontatos.model.Contact
import kotlinx.android.synthetic.main.fragment_list.view.*
import kotlinx.android.synthetic.main.item_contact.view.*

class ContactListAdapter(var contacts: ArrayList<Contact>, val actions: ListAction) :
    RecyclerView.Adapter<ContactListAdapter.ContactViewHolder>() {

    fun updateContacts(newContacts: List<Contact>) {
        contacts.clear()
        contacts.addAll(newContacts)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ) = ContactViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.item_contact, parent, false)
    )

    override fun onBindViewHolder(holder: ContactListAdapter.ContactViewHolder, position: Int) {
        holder.bind(contacts[position])
    }


    override fun getItemCount(): Int = contacts.size

    inner class ContactViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val layout = view.item_contact_card_view
        private val contactNome = view.item_txt_contact
//        /private val imageContact = view.item_img_contact

        fun bind(contact: Contact) {
//           imageContact
            contactNome.text = contact.nome

            layout.setOnClickListener {
                actions.onClick(contact.id)
            }
        }
    }
}