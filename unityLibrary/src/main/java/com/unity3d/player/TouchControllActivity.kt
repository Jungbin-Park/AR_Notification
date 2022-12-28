package com.unity3d.player

import android.app.Activity
import android.content.Context
import android.view.LayoutInflater
import android.widget.FrameLayout
import android.widget.Toast

class TouchControllActivity :UnityPlayerActivity() {
    fun Subfun(mContext: Context,activity_sub_id:Int,send_et_id:Int){
        //Toast.makeText(mContext,"서브토스트",Toast.LENGTH_LONG).show()

        val inflater = mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val ll = inflater.inflate(activity_sub_id,null) as FrameLayout
        val paramll = FrameLayout.LayoutParams(FrameLayout.LayoutParams.MATCH_PARENT, FrameLayout.LayoutParams.MATCH_PARENT)
        (mContext as Activity).addContentView(ll,paramll)

    }
}