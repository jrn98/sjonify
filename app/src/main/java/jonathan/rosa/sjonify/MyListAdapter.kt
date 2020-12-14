package jonathan.rosa.sjonify

import android.app.Activity
import android.media.MediaPlayer
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class MyListAdapter(private val context: Activity, private val title: Array<String>,
                    private val description: Array<String>, private val imgid: Array<Int>)
    : ArrayAdapter<String>(context, R.layout.elementos, title) {

    override fun getView(position: Int, view: View?, parent: ViewGroup): View {
        val inflater = context.layoutInflater
        val rowView = inflater.inflate(R.layout.elementos, null, true)

        val titleText = rowView.findViewById(R.id.titulo) as TextView
        val imageView = rowView.findViewById(R.id.portada) as ImageView
        val subtitleText = rowView.findViewById(R.id.descripcion) as TextView



        titleText.text = title[position]
        imageView.setImageResource(imgid[position])
        subtitleText.text = description[position]

        return rowView
    }




}