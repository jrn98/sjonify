package jonathan.rosa.sjonify

import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.*
import android.widget.SearchView
import kotlinx.android.synthetic.main.activity_web_view_page.*
import java.util.*

class WebViewPage : AppCompatActivity() {
    private val BASE_URL="https://www.spotify.com/es/"
    private val SEARCH_PATH="/search?q="
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_view_page)

        //refresh
        swipe.setOnRefreshListener {
            webView.reload()

        }

        //search
       /* searchView.setOnQueryTextListener(object :SearchView.OnQueryTextListener){
            override fun onQueryTextSubmit(query:String?):Boolean{

            }
            override fun onQueryTextChange(newText:String?):Boolean{

            }
        }*/



        val setting:WebSettings = webView.settings
        setting.javaScriptEnabled=true

        webView.webChromeClient=object : WebChromeClient(){

        }
        webView.webViewClient=object :WebViewClient(){
            override fun shouldOverrideUrlLoading(view: WebView?, request: WebResourceRequest?): Boolean {
                return false
            }

            override fun onPageStarted(view: WebView?, url: String?, favicon: Bitmap?) {
                super.onPageStarted(view, url, favicon)

                swipe.isRefreshing=true
            }

            override fun onPageFinished(view: WebView?, url: String?) {
                super.onPageFinished(view, url)

                swipe.isRefreshing=false
            }

        }

        webView.loadUrl(BASE_URL)







    }



    override fun onBackPressed() {
        if (webView.canGoBack()){
            webView.goBack()
        }else{
            super.onBackPressed()
        }
    }

}