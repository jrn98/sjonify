package jonathan.rosa.sjonify.models

import jonathan.rosa.sjonify.R

class AlbumItem {

    var icons:Int?=0
    var name:String?=null

    constructor(icons: Int?, name: String?) {
        this.icons = icons
        this.name = name
    }

     fun getLista():MutableList<AlbumItem>{
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


}