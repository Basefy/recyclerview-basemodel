package com.tunc.recyclerview.view_holder

import android.annotation.SuppressLint
import android.view.ViewGroup
import com.tunc.recyclerview.R
import com.tunc.recyclerview.base.BaseModel
import com.tunc.recyclerview.base.BaseViewHolder
import com.tunc.recyclerview.model.MainInterface
import com.tunc.recyclerview.model.UserModel
import kotlinx.android.synthetic.main.cell_user_item.view.*


class UserViewHolder(parent: ViewGroup, private val mainInterface: MainInterface) :
    BaseViewHolder<BaseModel, UserModel>(parent, LAYOUT_ID) {
    @SuppressLint("SetTextI18n")
    override fun bind(item: UserModel) {
        itemView.cell_user_item_textview.text = item.name + " " + item.surname
        itemView.cell_user_item_remove.setOnClickListener {
            mainInterface.remove(adapterPosition)
        }
    }


    companion object {
        const val LAYOUT_ID = R.layout.cell_user_item
    }
}