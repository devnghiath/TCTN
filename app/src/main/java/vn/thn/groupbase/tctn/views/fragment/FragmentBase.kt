package vn.thn.groupbase.tctn.views.fragment

import android.support.v4.app.FragmentTransaction
import vn.thn.groupbase.lib.views.fragment.GBCommonFragment
import vn.thn.groupbase.tctn.R

/**
 * Created by truonghieunghia on 6/27/18.
 */
abstract class FragmentBase: GBCommonFragment() {
    override fun layoutCommon(): Int {
        return R.layout.fragment_base
    }

    override fun viewCommonID(): Int {
        return R.id.content
    }

    override fun contentId(): Int {
        return 0;
    }

    override fun setAnimationCustom(animationCustom: FragmentTransaction) {
        animationCustom.setCustomAnimations(R.anim.fragment_slide_right_enter,
                R.anim.fragment_slide_left_exit,
                R.anim.fragment_slide_left_enter,
                R.anim.fragment_slide_right_exit)
    }
}