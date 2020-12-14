package jonathan.rosa.sjonify

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.MediaController
import android.widget.Toast
import android.widget.VideoView

class videoView : AppCompatActivity() {

    //declarar una variabe de tipo VideoView
    var simpleVideoView: VideoView? = null

    //declara una variable de tipo MediaController
    var mediaControls: MediaController? = null



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_video_view)

        //localizamos el video en el layout
        simpleVideoView = findViewById<View>(R.id.videoView) as VideoView

        if (mediaControls == null){
            mediaControls = MediaController(this)
            mediaControls!!.setAnchorView(this.simpleVideoView)
        }

        simpleVideoView!!.setMediaController(mediaControls)
        simpleVideoView!!.setVideoURI(Uri.parse("android.resource://"+packageName+"/"+R.raw.video))

        //focos sobre el video
        simpleVideoView!!.requestFocus()

        //comenzar ejecucion del video
        simpleVideoView!!.start()

        //mostrar mensaje cuando el video se haya completado
        simpleVideoView!!.setOnCompletionListener {
            Toast.makeText(applicationContext,"Video completed",Toast.LENGTH_LONG).show()
            false
        }

    }
}