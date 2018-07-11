package vn.thn.groupbase.tctn.views.fragment

import android.support.v4.app.FragmentTransaction
import android.view.View
import android.widget.TextView
import vn.thn.groupbase.lib.views.fragment.GBCommonFragment
import vn.thn.groupbase.tctn.R

/**
 * Created by truonghieunghia on 6/27/18.
 */
abstract class FragmentBase : GBCommonFragment() {
    private var txtTitle: TextView? = null

    override fun layoutCommon(): Int {
        return R.layout.fragment_base
    }

    override fun initViewCommon() {
        txtTitle = findViewById<TextView>(R.id.txt_title)
        if (txtTitle != null) {
            txtTitle!!.text = getTitle()
        }
        findViewById<View>(R.id.btn_back)!!.setOnClickListener {
            onBack()
        }
        hideBackButton(isShowButtonBack())
    }

   open fun hideBackButton(isShow: Boolean){
        if (isShow){
            findViewById<View>(R.id.btn_back)!!.visibility = View.VISIBLE
        } else{
            findViewById<View>(R.id.btn_back)!!.visibility = View.GONE
        }
    }
    override fun viewCommonID(): Int {
        return R.id.fragment_view
    }

    override fun contentId(): Int {
        return 0;
    }
    open fun isShowButtonBack():Boolean {
        return true
    }
    override fun setAnimationCustom(animationCustom: FragmentTransaction) {
        animationCustom.setCustomAnimations(R.anim.fragment_slide_right_enter,
                R.anim.fragment_slide_left_exit,
                R.anim.fragment_slide_left_enter,
                R.anim.fragment_slide_right_exit)
    }

    abstract fun getTitle(): String?

}