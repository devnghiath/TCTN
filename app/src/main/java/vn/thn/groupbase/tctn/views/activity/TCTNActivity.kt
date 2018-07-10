package vn.thn.groupbase.tctn.views.activity

import vn.thn.groupbase.tctn.views.fragment.NotificationFragment

class TCTNActivity : ActivityBase() {
    override fun init() {
        viewManager.addView(NotificationFragment::class)
    }
}
