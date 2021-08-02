package br.fernando.agendadecontatos.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import br.fernando.agendadecontatos.R
import kotlinx.android.synthetic.main.fragment_form.*
import kotlinx.android.synthetic.main.fragment_list.*

/**
 * A simple [Fragment] subclass.
 */
class ListFragment : Fragment() {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        list_float_button.setOnClickListener {
            goToForm()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_list, container, false)
    }

    private fun goToDetails(id: Long) {
        val action = ListFragmentDirections.actionGoToDetails(id)
        Navigation.findNavController(list_recyclerView).navigate(action)
    }

    private fun goToForm() {
        val action = ListFragmentDirections.actionGoToForm()
        Navigation.findNavController(list_float_button).navigate(action)
    }

}
