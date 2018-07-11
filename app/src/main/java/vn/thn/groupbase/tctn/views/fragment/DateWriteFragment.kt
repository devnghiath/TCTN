package vn.thn.groupbase.tctn.views.fragment

import vn.thn.groupbase.tctn.R

/**
 * Created by truonghieunghia on 7/11/18.
 */
class DateWriteFragment : FragmentBase() {
    override fun getTitle(): String? {
        return "Lịch ghi nước";
    }

    override fun layoutContent(): Int {
        return R.layout.fragment_date_write
    }

    override fun firstInit() {

    }

    override fun initView() {

    }

    override fun fragmentName(): String? {
        return "DateWriteFragment"
    }
}