package jonathan.rosa.sjonify.adapters

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import jonathan.rosa.sjonify.R
import jonathan.rosa.sjonify.models.AlbumItem

class AlbumAdapter(var context: Context,var arrayList: ArrayList<AlbumItem>):BaseAdapter(){
    override fun getCount(): Int {
        return arrayList.size; //devuelve el tamaño del arraylist
    }

    override fun getItem(position: Int): Any {
        return arrayList.get(position)//devuelve el elemento de una posicion dada del array
    }

    override fun getItemId(position: Int): Long {
       return position.toLong() //devuelve el id de la posicion del elemento
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var view:View=View.inflate(context, R.layout.album,null)
        var icons:ImageView=view.findViewById(R.id.icono)
        var name:TextView=view.findViewById(R.id.tituloAlbum)

        var listItem:AlbumItem=arrayList.get(position)
        icons.setImageResource(listItem.icons!!)
        name.text=listItem.name
        return view
    }

}