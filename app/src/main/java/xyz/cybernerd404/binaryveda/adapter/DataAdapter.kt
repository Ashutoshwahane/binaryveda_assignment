package xyz.cybernerd404.binaryveda.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import xyz.cybernerd404.binaryveda.databinding.DataItemLayoutBinding
import xyz.cybernerd404.binaryveda.databinding.PhotoItemLayoutBinding
import xyz.cybernerd404.binaryveda.model.Demo


class DataAdapter() : RecyclerView.Adapter<DataAdapter.ViewHolder>() {
    private var list: List<Demo> = arrayListOf()

    fun setList(response: List<Demo>) {
        this.list = response
        notifyDataSetChanged()


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            DataItemLayoutBinding.inflate(
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
        holder.binding.logoIV.setImageResource(list[position].iconId)
    }


    class ViewHolder(val binding: DataItemLayoutBinding) :
        RecyclerView.ViewHolder(binding.root)

}