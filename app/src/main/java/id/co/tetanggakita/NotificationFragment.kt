package id.co.tetanggakita

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import id.co.tetanggakita.model.NotificationItem

class NotificationFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_notification, container, false)
        displayNotificationHistory(view)
        return view
    }

    private fun displayNotificationHistory(view: View) {
        val sharedPreferences =
            requireContext().getSharedPreferences("NotificationHistory", Context.MODE_PRIVATE)
        val notifications = mutableListOf<NotificationItem>()
        val entries = sharedPreferences.all
        for ((_, value) in entries) {
            val notificationData = value.toString().split("|")
            if (notificationData.size == 3) {
                val title = notificationData[0]
                val content = notificationData[1]
                val timestamp = notificationData[2].toLong()
                notifications.add(NotificationItem(title, content, timestamp))
            }
        }
        notifications.sortByDescending { it.timestamp }
        val recyclerView: RecyclerView = view.findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(context)
        recyclerView.adapter = NotificationHistoryAdapter(notifications)
    }
}
