package jonathan.rosa.sjonify

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main_dialog_fragment.*

class MainActivityDialogFragment : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_dialog_fragment)

        dialogo.setOnClickListener{
            var dialog=DialogFragment()


            dialog.show(supportFragmentManager,"customDialog")

        }
    }
}