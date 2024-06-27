//package id.co.tetanggakita
//
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import android.widget.ImageView
//import android.widget.TextView
//import androidx.recyclerview.widget.RecyclerView
//import com.bumptech.glide.Glide
//import com.bumptech.glide.load.resource.bitmap.CircleCrop
//import com.bumptech.glide.request.RequestOptions
//import id.co.tetanggakita.model.InformasiUmumItem
//
//class InformasiUmumAdapter(private val items: MutableList<InformasiUmumItem>) :
//    RecyclerView.Adapter<InformasiUmumAdapter.InformasiUmumViewHolder>() {
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): InformasiUmumViewHolder {
//        val view = LayoutInflater.from(parent.context).inflate(R.layout.informasi_umum_item, parent, false)
//        return InformasiUmumViewHolder(view)
//    }
//
//    fun setItems(newItems: List<InformasiUmumItem>) {
//        items.clear()
//        items.addAll(newItems)
//        notifyDataSetChanged()
//    }
//
//    override fun getItemCount(): Int = items.size
//
//    override fun onBindViewHolder(holder: InformasiUmumViewHolder, position: Int) {
//        val item = items[position]
//
//        Glide.with(holder.itemView.context)
//            .load(item.imageUrl)
//            .apply(RequestOptions().override(80, 80).placeholder(R.drawable.avatar))
//            .transform(CircleCrop())
//            .into(holder.imageView)
//        holder.titleTextView.text = item.title
//        holder.descTextView.text = item.desc
//    }
//
//    class InformasiUmumViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
//        val titleTextView: TextView = itemView.findViewById(R.id.informasi_umum_item_title)
//        val descTextView: TextView = itemView.findViewById(R.id.informasi_umum_item_desc)
//        val imageView: ImageView = itemView.findViewById(R.id.avatar_image)
//    }
//}
