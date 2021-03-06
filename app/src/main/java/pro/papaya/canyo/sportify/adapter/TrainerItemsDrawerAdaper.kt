package pro.papaya.canyo.sportify.adapter

import android.content.Context
import android.view.View
import android.view.ViewGroup
import pro.papaya.canyo.myapplication.R
import pro.papaya.canyo.sportify.view.DrawerItem
import pro.papaya.canyo.sportify.view.DrawerProfile

class TrainerItemsDrawerAdaper(context: Context, dataSet: ArrayList<String>)
  : BaseDrawerAdapter(context, dataSet) {

  override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
    return when (getLayoutId(position)) {
      R.layout.item_drawer -> {
        DrawerItem(context, dataSet[position]).itemView
      }
      else -> {
        DrawerProfile(context, "Finn Martens").drawerProfile
      }
    }
  }
}