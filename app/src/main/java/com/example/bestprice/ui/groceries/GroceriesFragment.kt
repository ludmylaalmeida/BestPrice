package com.example.bestprice.ui.groceries

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.example.bestprice.R

class GroceriesFragment : Fragment() {

    private lateinit var groceriesViewModel: GroceriesViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        groceriesViewModel =
                ViewModelProviders.of(this).get(GroceriesViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_groceries, container, false)


//        fab.setOnClickListener {
//            // Respond to FAB click
//        }

        return root
    }


}