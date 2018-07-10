package vn.thn.groupbase.tctn.views.fragment

import android.support.v4.app.FragmentTransaction
import vn.thn.groupbase.tctn.R

/**
 * Created by truonghieunghia on 7/6/18.
 */
class NotificationFragment: FragmentBase() {
    override fun layoutContent(): Int {
        return R.layout.fragment_notification
    }

    override fun firstInit() {

    }

    override fun initView() {

    }

    override fun getTitle(): String? {
        return "Thông báo"
    }
    override fun fragmentName(): String? {
        return "NotificationFragment"
    }
    override fun isShowButtonBack():Boolean {
        return false
    }
    override fun setAnimationCustom(animationCustom: FragmentTransaction) {

    }
}