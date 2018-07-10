package vn.thn.groupbase.tctn.views.activity

import android.support.design.widget.BottomNavigationView
import android.support.v4.content.ContextCompat
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import vn.thn.groupbase.lib.views.activity.GBActivityCommon
import vn.thn.groupbase.tctn.R
import vn.thn.groupbase.tctn.views.fragment.MyFragment
import vn.thn.groupbase.tctn.views.fragment.NotificationFragment
import vn.thn.groupbase.tctn.views.fragment.RegisterFragment
import vn.thn.groupbase.tctn.views.fragment.SearchFragment

/**
 * Created by truonghieunghia on 6/27/18.
 */
abstract class ActivityBase : GBActivityCommon() {
    var tabIndex = 0
    override fun layoutCommon(): Int {
        return R.layout.activity_base
    }

    override fun initCommon() {
        findViewById<View>(R.id.button_info).setOnClickListener {
            tabIndex = 0
            updateStateButtonBar()
            viewManager.pushViewToRoot(NotificationFragment::class)
        }
        findViewById<View>(R.id.button_search).setOnClickListener {
            tabIndex = 1
            updateStateButtonBar()
            viewManager.pushViewToRoot(SearchFragment::class)
        }
        findViewById<View>(R.id.button_register).setOnClickListener {
            tabIndex = 2
            updateStateButtonBar()
            viewManager.pushViewToRoot(RegisterFragment::class)
        }
        findViewById<View>(R.id.button_me).setOnClickListener {
            tabIndex = 3
            updateStateButtonBar()
            viewManager.pushViewToRoot(MyFragment::class)
        }
        updateStateButtonBar()
    }

    override fun contentId(): Int {
        return R.id.content
    }

    private fun updateStateButtonBar() {
        findViewById<TextView>(R.id.button_info_text).setTextColor(if (tabIndex == 0) ContextCompat.getColor(this, R.color.txt_black) else ContextCompat.getColor(this, R.color.stroke_color))
        findViewById<ImageView>(R.id.button_info_icon).setImageResource(if (tabIndex == 0) R.drawable.ico_noti else R.drawable.ico_noti_un)

        findViewById<TextView>(R.id.button_search_text).setTextColor(if (tabIndex == 1) ContextCompat.getColor(this, R.color.txt_black) else ContextCompat.getColor(this, R.color.stroke_color))
        findViewById<ImageView>(R.id.button_search_icon).setImageResource(if (tabIndex == 1) R.drawable.ico_search else R.drawable.ico_search_un)

        findViewById<TextView>(R.id.button_register_text).setTextColor(if (tabIndex == 2) ContextCompat.getColor(this, R.color.txt_black) else ContextCompat.getColor(this, R.color.stroke_color))
        findViewById<ImageView>(R.id.button_register_icon).setImageResource(if (tabIndex == 2) R.drawable.ico_add else R.drawable.ico_add_un)

        findViewById<TextView>(R.id.button_me_text).setTextColor(if (tabIndex == 3) ContextCompat.getColor(this, R.color.txt_black) else ContextCompat.getColor(this, R.color.stroke_color))
        findViewById<ImageView>(R.id.button_me_icon).setImageResource(if (tabIndex == 3) R.drawable.ico_user else R.drawable.ico_user_un)
    }
}