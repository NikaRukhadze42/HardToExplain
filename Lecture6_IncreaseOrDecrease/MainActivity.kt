package com.example.lecture6_increaseordecrease

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       init()
    }

                                             // Pirveli


//    private fun init()
//    {
//        decreaseButton.setOnClickListener (object : View.OnClickListener{
//            override fun onClick(v: View?) {
//                var tmp = numberView.text.toString().toInt()
//       if (tmp != 0)
//       {
//           tmp--
//           numberView.text = tmp.toString()
//       }
//       else return
//            }
//        })
//        increaseButton.setOnClickListener (object : View.OnClickListener{
//            override fun onClick(v: View?) {
//                var tmp = numberView.text.toString().toInt()
//                if (tmp != 9)
//                {
//                    tmp++
//                    numberView.text = tmp.toString()
//                }
//                else return
//            }
//        })
//    }

                                             // Meore



//    private fun init()
//{
//    decreaseButton.setOnClickListener{
//        var tmp = numberView.text.toString().toInt()
//        if (tmp != 0)
//        {
//            tmp--
//            numberView.text = tmp.toString()
//        }
//        else return@setOnClickListener
//
//    }
//
//    increaseButton.setOnClickListener{
//        var tmp = numberView.text.toString().toInt()
//        if (tmp != 9) // 10-mde tqvit 10 is chatvlit rom iyos ubralod 10s chavwerdi :D
//        {
//            tmp++
//            numberView.text = tmp.toString()
//        }
//        else return@setOnClickListener
//    }
//}

                                           // Mesame
      // am konkretuli programis gasashvebad unda gavuwerot es interfeisi >> View.OnClickListener MainActivity shi


//    private fun decrease()
//{
//    var tmp = numberView.text.toString().toInt()
//        if (tmp != 0)
//        {
//            tmp--
//            numberView.text = tmp.toString()
//        }
//        else return
//}
//
//    private fun increase()
//    {
//        var tmp = numberView.text.toString().toInt()
//        if (tmp != 9)
//        {
//            tmp++
//            numberView.text = tmp.toString()
//        }
//        else return
//    }
//
//    private fun init()
//    {
//        decreaseButton.setOnClickListener(this)
//        increaseButton.setOnClickListener(this)
//    }
//
//    override fun onClick(p0: View?) {
//        when(p0!!.id)
//        {
//            R.id.decreaseButton ->
//            {
//                decrease()
//            }
//            R.id.increaseButton ->
//            {
//                increase()
//            }
//        }
//    }
}
