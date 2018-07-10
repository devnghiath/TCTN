package vn.thn.groupbase.tctn.views.fragment

import android.support.v4.app.FragmentTransaction
import vn.thn.groupbase.tctn.R

/**
 * Created by truonghieunghia on 7/10/18.
 */
class RegisterFragment : FragmentBase() {
    override fun getTitle(): String? {
        return "Đăng ký"
    }

    override fun layoutContent(): Int {
        return R.layout.fragment_register
    }

    override fun firstInit() {

    }

    override fun initView() {

    }

    override fun fragmentName(): String? {
        return "RegisterFragment"
    }

    override fun isShowButtonBack(): Boolean {
        return false
    }
    override fun setAnimationCustom(animationCustom: FragmentTransaction) {

    }
}