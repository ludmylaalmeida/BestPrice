package com.example.bestprice.ui.zipcode

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import com.example.bestprice.R
import com.example.bestprice.ui.home.HomeFragment


class ZipCodeFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val root = inflater.inflate(R.layout.fragment_zip_code, container, false)

        val zipCodeButton = root.findViewById(R.id.zipCodeButton) as Button
        zipCodeButton.setOnClickListener {
            val fragment: Fragment = HomeFragment()
            val fragmentManager = (activity as FragmentActivity).supportFragmentManager
            val transaction = (activity as FragmentActivity).supportFragmentManager.beginTransaction()
            transaction.replace(R.id.home_fragment, fragment)
            transaction.addToBackStack(null)
            transaction.commit()
        }

        return root
    }

}