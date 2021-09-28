package org.techtown.nav_flagment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.navigation.findNavController


class Second : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        var view2 = inflater.inflate(R.layout.fragment_second, container, false)

        view2.findViewById<Button>(R.id.btn1).setOnClickListener{
            //action_second_to_frist
            Toast.makeText(activity,"1번째로간다!",Toast.LENGTH_SHORT).show()

            it.findNavController().navigate(R.id.action_second_to_frist)
        }

        view2.findViewById<Button>(R.id.btn3).setOnClickListener {

            Toast.makeText(activity,"3번째로간다",Toast.LENGTH_SHORT).show()

            it.findNavController().navigate(R.id.action_second_to_three)
        }


        return view2
    }

}