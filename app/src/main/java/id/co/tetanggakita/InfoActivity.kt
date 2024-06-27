package id.co.tetanggakita

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import id.co.tetanggakita.databinding.ActivityInfoBinding

class InfoActivity : AppCompatActivity() {

    private lateinit var binding: ActivityInfoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityInfoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnBagikan.setOnClickListener {
            val report = Report(
                image = null, // Handle image selection separately
                category = binding.spCategory.selectedItem.toString(),
                subject = binding.etSubject.text.toString(),
                description = binding.etDescription.text.toString()
            )
            MainActivity.addReport(report)
            finish()
        }
    }
}
