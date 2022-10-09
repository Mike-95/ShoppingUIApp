package mikepopup.com.shoppingappui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import mikepopup.com.shoppingappui.databinding.WomenCategoryListItemBinding
import mikepopup.com.shoppingappui.model.CategoryData


class ItemAdapter(private val context: Context, private val dataset: List<CategoryData>) :
    RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {


    inner class ItemViewHolder(val binding: WomenCategoryListItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val binding =
            WomenCategoryListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ItemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.binding.tvCollectionName.text = context.resources.getString(item.StringResourceId)
        holder.binding.ivCollectionImage.setImageResource(item.imageResourceId)
    }

    override fun getItemCount() = dataset.size


}