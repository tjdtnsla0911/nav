package org.techtown.nav_flagment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.navigation.findNavController


class Frist : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        //얘가 첫번째 플래그먼트이다
        var view = inflater.inflate(R.layout.fragment_frist, container, false)

        view.findViewById<Button>(R.id.btn1).setOnClickListener{
            //여기선 액티비티인가?
            Toast.makeText(activity,"첫번째꺼누름(아무일없다)",Toast.LENGTH_SHORT).show()

        }
        
        view.findViewById<Button>(R.id.btn2).setOnClickListener{
            
            Toast.makeText(activity,"2번째꺼누름",Toast.LENGTH_SHORT).show()
            //이걸로 아까 화살표 움직이게함
            it.findNavController().navigate(R.id.action_frist_to_second)
        }

        view.findViewById<Button>(R.id.btn3).setOnClickListener{
            Toast.makeText(activity,"3번째꺼누름",Toast.LENGTH_SHORT).show()

            it.findNavController().navigate(R.id.action_frist_to_three)
        }


        
        
        return view

    }

}