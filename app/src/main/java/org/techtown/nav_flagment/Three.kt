package org.techtown.nav_flagment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.navigation.findNavController

class Three : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        var view3 =  inflater.inflate(R.layout.fragment_three, container, false)

        view3.findViewById<Button>(R.id.btn1).setOnClickListener {

            Toast.makeText(activity,"1로갑니다",Toast.LENGTH_SHORT).show()

            it.findNavController().navigate(R.id.action_three_to_frist)
        }

        view3.findViewById<Button>(R.id.btn2).setOnClickListener {
            Toast.makeText(activity,"2로갑니다",Toast.LENGTH_SHORT).show()

            it.findNavController().navigate(R.id.action_three_to_frist)

        }
        return view3!!
    }

}