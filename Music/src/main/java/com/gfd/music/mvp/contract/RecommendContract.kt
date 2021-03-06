package com.gfd.music.mvp.contract

import com.gfd.common.mvp.presenter.BasePresenter
import com.gfd.common.mvp.view.BaseView
import com.gfd.music.entity.BannerData
import com.gfd.music.entity.SongData

/**
 * @Author : 郭富东
 * @Date ：2018/8/10 - 10:53
 * @Email：878749089@qq.com
 * @descriptio：
 */
interface RecommendContract{
    interface View :BaseView{
        fun showBanner(bannerData : List<BannerData>)
        fun showSongList(songDatas: List<SongData>)
    }

    interface Presenter:BasePresenter{
        fun getBanner()
        fun getSongList()
    }
}