package jonathan.rosa.sjonify

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.view.View
import android.webkit.WebView
import android.widget.*
import jonathan.rosa.sjonify.adapters.AlbumAdapter
import jonathan.rosa.sjonify.models.AlbumItem
import kotlinx.android.synthetic.main.activity_principal.*
import kotlinx.android.synthetic.main.activity_web_view_page.*

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

        repro.setOnClickListener(){
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }

        video.setOnClickListener(){
            val intent = Intent(this,videoView::class.java)
            startActivity(intent)
        }

        web.setOnClickListener(){
            val intent = Intent(this,WebViewPage::class.java)
            startActivity(intent)
        }

        recycler.setOnClickListener(){
            val intent = Intent(this,MyRecyclerView::class.java)
            startActivity(intent)
        }



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