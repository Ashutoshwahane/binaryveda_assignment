package xyz.cybernerd404.binaryveda.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import xyz.cybernerd404.binaryveda.databinding.PhotoItemLayoutBinding
import xyz.cybernerd404.binaryveda.model.Image


class PhotoAdapter() : RecyclerView.Adapter<PhotoAdapter.ViewHolder>() {
    private var list: List<Image> = arrayListOf()

    fun setList(response: List<Image>) {
        this.list = response
        notifyDataSetChanged()


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            PhotoItemLayoutBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.photo.setImageResource(list[position].id)
    }


    class ViewHolder(val binding: PhotoItemLayoutBinding) :
        RecyclerView.ViewHolder(binding.root)

}