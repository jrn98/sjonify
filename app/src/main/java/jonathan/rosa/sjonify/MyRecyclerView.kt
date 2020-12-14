package jonathan.rosa.sjonify

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import jonathan.rosa.sjonify.models.AlbumItem

class MyRecyclerView : AppCompatActivity() {
    lateinit var mRecyclerView : RecyclerView
    val mAdapter : RecyclerAdapter = RecyclerAdapter()
    private fun getLista():ArrayList<AlbumItem>{
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

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_recycler_view)
        setUpRecyclerView()
    }

    fun setUpRecyclerView(){
        mRecyclerView = findViewById(R.id.my_grid_view_list)
        mRecyclerView.setHasFixedSize(true)
        mRecyclerView.layoutManager = LinearLayoutManager(this)

        mAdapter.RecyclerAdapter(getLista(),this)
        mRecyclerView.adapter = mAdapter
    }
    fun onclick(){
        setContentView(R.layout.activity_video_view)

    }
}