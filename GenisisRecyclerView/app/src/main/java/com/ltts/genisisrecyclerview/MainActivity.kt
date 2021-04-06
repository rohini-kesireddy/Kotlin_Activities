package com.ltts.genisisrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var myrv=findViewById<RecyclerView>(R.id.myrecyclerview)
        myrv.layoutManager=LinearLayoutManager(this,RecyclerView.VERTICAL,false)
        var myDataList=ArrayList<UsersData>()
        myDataList.add(UsersData("rohini","rohini@gmail.com","424654762"))
         myDataList.add(UsersData("rohini","rohini@gmail.com","424654762"))
         myDataList.add(UsersData("rohini","rohini@gmail.com","424654762"))
         myDataList.add(UsersData("rohini","rohini@gmail.com","424654762"))
         myDataList.add(UsersData("rohini","rohini@gmail.com","424654762"))
         myDataList.add(UsersData("rohini","rohini@gmail.com","424654762"))
    
        myrv.adapter=MyAdapter(myDataList)

    }

}
