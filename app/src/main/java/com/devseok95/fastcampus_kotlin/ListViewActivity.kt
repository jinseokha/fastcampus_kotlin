package com.devseok95.fastcampus_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_list_view.*
import kotlin.jvm.internal.InlineMarker

class ListViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view)

        val carList = ArrayList<CarForList>()
        for (i in 0 until 50) {
            carList.add(CarForList("" + i + " 번째 자동차", "" + i + "순위 엔진"))
        }

        val adapter = ListViewAdapater(carList, LayoutInflater.from(this@ListViewActivity))
        listView.adapter = adapter
        listView.setOnItemClickListener { parent, view, position, id ->
            val carName = (adapter.getItem(position) as CarForList).name
            val carEngine = (adapter.getItem(position) as CarForList).engine

            Toast.makeText(this@ListViewActivity, carName + " " + carEngine, Toast.LENGTH_SHORT)
                .show()
        }
    }
}

class ViewHolder {
    var carName: TextView? = null
    var carEngine: TextView? = null
}

class ListViewAdapater(val carForList: ArrayList<CarForList>, val layoutInflater: LayoutInflater) : BaseAdapter() {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view: View
        val holder: ViewHolder

        if (convertView == null) {
            view = layoutInflater.inflate(R.layout.item_view, null)
            holder = ViewHolder()

            holder.carName = view.findViewById(R.id.car_name)
            holder.carEngine = view.findViewById(R.id.car_engine)

            view.tag = holder
        } else {
            holder = convertView.tag as ViewHolder
            view = convertView
        }
        holder.carName?.setText(carForList.get(position).name)
        holder.carEngine?.setText(carForList.get(position).engine)

        return view
    }

    override fun getItem(p0: Int): Any {
        // 그리고자 하는 아이템 리스트의 하나 (포지션에 해당하는)
        return carForList.get(p0)
    }

    override fun getItemId(p0: Int): Long {
        // 해당 포지션에 위치해 있는 아이템뷰의 아이디 설정
        return p0.toLong()

    }

    override fun getCount(): Int {
         // 그리고자 하는 아이템 리스트의 전체 갯수

        return carForList.size
    }
}