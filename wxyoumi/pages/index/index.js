//index.js
var app = getApp();
import getData from '../../utils/service'
Page({
  data: {
    imgUrls: [],
    indicatorDots: true, //是否显示面板指示点
    autoplay: true, //是否自动播放
    interval: 3000, //自动切换时间间隔
    duration: 500,  //滑动动画时长
    mainImgUrls: [],
    sMoneryList: [],
    hotProductList: [],
    },
    toLogin: function () {
      wx.navigateTo({
        url: '../login/login'
      })
    },
    toProductAllList:function(){
        wx.navigateTo({
          url: '../productAllList/productAllList'
        })
    }, 
    toProductList:function() {
      wx.navigateTo({
        url: '../productList/productList'
      })
    }, 
    onLoad : function(res){
        var that = this;
        //轮播图
        getData.getRandomLinkData().then(res => {
          that.setData({
            imgUrls: res.data.data
          })
        });
        //主菜单
        getData.getMainClassData().then(res => {
          that.setData({
            mainImgUrls: res.data.data
          })
        });
        //省钱
        getData.getSomeMoneyListData().then(res => {
          that.setData({
            sMoneryList: res.data.data
          })
        });
    }
})
