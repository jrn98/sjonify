package jonathan.rosa.sjonify

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.view.View
import android.widget.*
import jonathan.rosa.sjonify.adapters.AlbumAdapter
import jonathan.rosa.sjonify.models.AlbumItem

class principal : AppCompatActivity(),AdapterView.OnItemClickListener {
    private var arrayList:ArrayList<AlbumItem>?=null
    private var gridView:GridView?=null
    private var albumAdapter:AlbumAdapter?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_principal)

        gridView=findViewById(R.id.my_grid_view_list)
        arrayList= ArrayList()
        arrayList=setDataList()
        albumAdapter=AlbumAdapter(applicationContext,arrayList!!)
        gridView?.adapter=albumAdapter

        gridView?.onItemClickListener = this


    }


    private fun setDataList():ArrayList<AlbumItem>{
        var arrayList:ArrayList<AlbumItem> = ArrayList()
        arrayList.add(AlbumItem(R.drawable.mal,"Maluma"))
        arrayList.add(AlbumItem(R.drawable.badb,"BadBunny"))
        arrayList.add(AlbumItem(R.drawable.anuelaa,"Anuel AA"))
        arrayList.add(AlbumItem(R.drawable.badb,"BadBunny"))
        arrayList.add(AlbumItem(R.drawable.jquiles,"Justin Quiles"))
        arrayList.add(AlbumItem(R.drawable.mike,"Mike Morato"))
        arrayList.add(AlbumItem(R.drawable.fnzo,"Funzo & Baby Loud"))
        arrayList.add(AlbumItem(R.drawable.fnzo,"Funzo & Baby Loud"))
        arrayList.add(AlbumItem(R.drawable.cmla,"Camela"))
        arrayList.add(AlbumItem(R.drawable.omar,"Don Omar"))
        arrayList.add(AlbumItem(R.drawable.kronozomber,"Ciclo & Pitter G, Zarcort"))
        arrayList.add(AlbumItem(R.drawable.keo,"Kidd Keo"))
        arrayList.add(AlbumItem(R.drawable.keo,"Kidd Keo"))
        arrayList.add(AlbumItem(R.drawable.tangana,"C.Tangana"))
        arrayList.add(AlbumItem(R.drawable.aitan,"Ahitana"))

        return arrayList


    }

    override fun onItemClick(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
        var item:AlbumItem=arrayList!!.get(position)
        Toast.makeText(applicationContext,item.name,Toast.LENGTH_LONG).show()
        val editText=findViewById<TextView>(R.id.tituloAlbum)
        val mensaje=editText.text.toString()

        val intent=Intent(this,MainActivity::class.java).apply {
            putExtra(EXTRA_MESSAGE,mensaje)

        }
        startActivity(intent)
    }

    /* override fun onItemClick(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
         var item:AlbumItem=arrayList!!.get(position)
         Toast.makeText(applicationContext,item.name,Toast.LENGTH_LONG).show()
         val editText=findViewById<TextView>(R.id.tituloAlbum)
         val mensaje=editText.text.toString()

         val intent=Intent(this,MainActivity::class.java).apply {
             putExtra(EXTRA_MESSAGE,mensaje)
             startActivity(intent)
         }

         //startActivity(intent)
     }*/

}