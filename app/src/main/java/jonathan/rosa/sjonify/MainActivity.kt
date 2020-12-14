package jonathan.rosa.sjonify

import android.media.MediaPlayer
import android.os.Bundle
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity()  {

    val autor = arrayOf<String>(
            "Maluma",
            "Bad bunny",
            "Anuel AA",
            "Bad Bunny",
            "Justin Quiles",
            "Mike Morato",
            "Funzo & Baby Loud",
            "Funzo & Baby Loud",
            "Camela & Juan Magan",
            "Don Omar",
            "Cyclo, Piter-G, Zarcort",
            "Kidd Keo",
            "Kidd Keo",
            "C. Tangana",
            "Aitana")
    val descripcion = arrayOf<String>(
            "Felices los 4",
            "La santa",
            "Antes y despues",
            "Amorfoda",
            "Jaque Mate",
            "Esto es un pary",
            "Na de amor",
            "Que mas dara",
            "Cuando zarpa el amor",
            "El señor de la noce",
            "Desde tu adios",
            "Back to the Future I",
            "Back to the Future II",
            "Demasiada mujer",
            "Vas a quedarte"
    )

    val imagenes = arrayOf<Int>(
            R.drawable.mal,
            R.drawable.badb,
            R.drawable.anuelaa,
            R.drawable.badb,
            R.drawable.keo,
            R.drawable.mike,
            R.drawable.fnzo,
            R.drawable.fnzo,
            R.drawable.cmla,
            R.drawable.omar,
            R.drawable.kronozomber,
            R.drawable.keo,
            R.drawable.tangana,
            R.drawable.aitan
    )
    val musica = arrayOf(
            R.raw.feliceslos,
            R.raw.lasanta,
            R.raw.ayd,
            R.raw.amorfoda,
            R.raw.jm,
            R.raw.estoesunpary,
            R.raw.nadeamor,
            R.raw.quemasdara,
            R.raw.czeamor,
            R.raw.delanoche,
            R.raw.desdetuadios,
            R.raw.bttf1,
            R.raw.bttf,
            R.raw.dmujer,
            R.raw.vasaquedarte)
    var pres : Int =0
    var presB : Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myListAdapter = MyListAdapter(this, autor, descripcion, imagenes)

        val listView = findViewById<ListView>(R.id.listaCanciones)
        listView.adapter = myListAdapter

        var sonido = MediaPlayer()
        listView.setOnItemClickListener() { adapterView, view, position, id ->
            //val itemAtPos = adapterView.getItemAtPosition(position)
            //val itemIdAtPos = adapterView.getItemIdAtPosition(position)
            //Toast.makeText(this, "Click on item at $itemAtPos its item id $itemIdAtPos", Toast.LENGTH_LONG).show()
            buttonStop.setOnClickListener(){
                sonido.stop();
            }
            buttonPause.setOnClickListener(){
                sonido.pause()
            }
            buttonPlay.setOnClickListener(){
                sonido.start()
            }

            buttonNext.setOnClickListener(){

                if (position > 14){
                    sonido.stop()
                }
                if(position <14){
                    pres++
                    sonido.stop()
                    sonido = MediaPlayer.create(this,musica[position+pres])
                    sonido.start()
                }

            }

            buttonBefore.setOnClickListener(){

                if (position <= 0){
                    sonido.stop()
                }
                if(position >0){
                    presB++
                    sonido.stop()
                    sonido = MediaPlayer.create(this,musica[position-presB])
                    sonido.start()
                }

            }




            //if(sonido!=null) {
                sonido.release()
                sonido = MediaPlayer()

           // }
            val cancion = musica[position]
            sonido = MediaPlayer.create(this,cancion)
            sonido.setVolume(1f,0.5f)
            sonido.start()







        }






    }

}