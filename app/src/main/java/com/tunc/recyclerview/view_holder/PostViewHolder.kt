package com.tunc.recyclerview.view_holder

import android.annotation.SuppressLint
import android.view.ViewGroup
import com.tunc.recyclerview.R
import com.tunc.recyclerview.base.BaseModel
import com.tunc.recyclerview.base.BaseViewHolder
import com.tunc.recyclerview.model.MainInterface
import com.tunc.recyclerview.model.PostModel
import kotlinx.android.synthetic.main.cell_post_item.view.*

class PostViewHolder(parent: ViewGroup, private val mainInterface: MainInterface) :
    BaseViewHolder<BaseModel, PostModel>(parent, LAYOUT_ID) {
    @SuppressLint("SetTextI18n")
    override fun bind(item: PostModel) {
        itemView.cell_post_item_textview.text = item.postId + " " + item.body

        itemView.cell_post_item_remove.setOnClickListener {
            mainInterface.remove(adapterPosition)
        }
    }

    companion object {
        const val LAYOUT_ID = R.layout.cell_post_item
    }
}