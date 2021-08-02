package br.fernando.agendadecontatos.ui

import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.NavHostFragment.findNavController


import br.fernando.agendadecontatos.R



class SplashFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Handler().postDelayed({
            context?.let {
                findNavController(this).navigate(R.id.action_splashFragment_to_listFragment)
            }
        },2500)

        return inflater.inflate(R.layout.fragment_splash, container, false)
    }

}
