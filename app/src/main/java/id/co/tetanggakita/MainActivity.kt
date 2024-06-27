package id.co.tetanggakita

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView


class MainActivity : AppCompatActivity() {

    companion object {
        private val reports = mutableListOf<Report>()

        fun addReport(report: Report) {
            reports.add(report)
        }

        fun getReports(): List<Report> = reports
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottom_navigation)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, HomeFragment())
                .commit()
        }

        bottomNavigationView.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.navigation_home -> {
                    loadFragment(HomeFragment())
                    true
                }
                R.id.navigation_alert -> {
                    // Add profile fragment if necessary
                    true
                }
                R.id.navigation_notifications -> {
                    loadFragment(NotificationFragment())
                    true
                }
                else -> false
            }
        }
    }


    private fun loadFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .commit()
    }

    fun onButton1Clicked(view: View) {
        val intent = Intent(this, WargaActivity::class.java)
        startActivity(intent)
    }

    fun onButton2Clicked(view: View) {
        val intent = Intent(this, LaporanActivity::class.java)
        startActivity(intent)
    }

    fun onButton3Clicked(view: View) {
        val shareIntent = Intent().apply {
            action = Intent.ACTION_SEND
            putExtra(Intent.EXTRA_TEXT, "Bagikan informasi penting di sini!")
            type = "text/plain"
        }
        startActivity(Intent.createChooser(shareIntent, "Bagikan informasi melalui"))
    }
    fun onButton4Clicked(view: View) {
        // Implement action for button 4 click here
    }

    fun onButton5Clicked(view: View) {
        val intent = Intent(this, FaqActivity::class.java)
        startActivity(intent)
    }
    fun onButton6Clicked(view: View) {
        val phoneNumber = "085710454356"
        val intent = Intent(Intent.ACTION_DIAL)
        intent.data = Uri.parse("tel:$phoneNumber")
        startActivity(intent)
    }
}
