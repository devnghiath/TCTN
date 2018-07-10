package vn.thn.groupbase.tctn.views.activity

import android.support.design.widget.BottomNavigationView
import vn.thn.groupbase.lib.views.activity.GBActivityCommon
import vn.thn.groupbase.tctn.R

/**
 * Created by truonghieunghia on 6/27/18.
 */
abstract class ActivityBase : GBActivityCommon() {
    override fun layoutCommon(): Int {
        return R.layout.activity_base
    }

    override fun initCommon() {
        findViewById<BottomNavigationView>(R.id.bottom_navi)

    }
    override fun contentId(): Int {
        return R.id.content
    }
}