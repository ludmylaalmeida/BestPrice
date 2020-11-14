package com.example.bestprice.ui.groceries

import android.content.res.ColorStateList
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.content.res.AppCompatResources.getColorStateList
import androidx.core.content.ContextCompat
import androidx.core.content.ContextCompat.getColor
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.bestprice.R
import kotlinx.android.synthetic.main.fragment_groceries.*

class GroceriesFragment : Fragment() {

    private lateinit var groceriesViewModel: DashboardViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        groceriesViewModel =
                ViewModelProviders.of(this).get(DashboardViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_groceries, container, false)
//        val textView: TextView = root.findViewById(R.id.text_dashboard)
//        groceriesViewModel.text.observe(viewLifecycleOwner, Observer {
//            textView.text = it
//        })

        // Chip
        chip.setChipBackgroundColorResource(R.color.colorPrimary);
        chipGroup.setOnCheckedChangeListener { group, checkedId ->
            // Responds to child chip checked/unchecked
        }


        return root
    }
}