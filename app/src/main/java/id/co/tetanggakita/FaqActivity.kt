package id.co.tetanggakita

import android.content.ActivityNotFoundException
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class FaqActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_faq)

        val openPdfButton = findViewById<Button>(R.id.button_open_pdf)
        openPdfButton.setOnClickListener {
            val pdfUrl = "https://drive.google.com/file/d/1k5D2epnmWmW6WOU8F4bxqgq7X5-g2YuS/view?usp=sharing"
            openPdfFromUrl(pdfUrl)
        }
    }

    private fun openPdfFromUrl(url: String) {
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
        startActivity(browserIntent)
    }
}
