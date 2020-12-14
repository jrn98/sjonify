package jonathan.rosa.sjonify

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import kotlinx.android.synthetic.main.activity_menu_principal.*

class menuPrincipal : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_principal)
        val opt = findViewById<LinearLayout>(R.id.opciones)
        opt.setOnClickListener(){

        }

    }

}