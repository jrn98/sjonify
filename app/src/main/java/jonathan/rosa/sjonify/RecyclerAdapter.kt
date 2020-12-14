package jonathan.rosa.sjonify

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import jonathan.rosa.sjonify.models.AlbumItem


class RecyclerAdapter: RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {
    var albumItem: MutableList<AlbumItem> = ArrayList()
    lateinit var context: Context

    fun RecyclerAdapter(albumItem: MutableList<AlbumItem>,context: Context){
        this.albumItem = albumItem
        this.context = context
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = albumItem.get(position)
        holder.bind(item,context)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return ViewHolder(layoutInflater.inflate(R.layout.elementos,parent,false))
    }

    override fun getItemCount(): Int {
        return albumItem.size
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view){
        val albumItem1 = view.findViewById<TextView>(R.id.titulo)//pagina 18
        val portadaCancion = view.findViewById<ImageView>(R.id.portada)
        val tituloCancion = view.findViewById<TextView>(R.id.descripcion)

        fun bind(albumItem: AlbumItem,context: Context){
           albumItem1.text= albumItem.name!!
            portadaCancion.setImageResource(albumItem.icons!!)
            itemView.setOnClickListener ({
                Toast.makeText(context, albumItem.name, Toast.LENGTH_SHORT).show()
            })
        }


    }

}