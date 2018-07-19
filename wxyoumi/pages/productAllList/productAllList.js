import getData from '../../utils/service'
import tools from '../../utils/util.js'
Page({

  /**
   * 页面的初始数据
   */
  data: {
      mainMenuList : [],
      goodsList:null
  },
  selectType:function(e){
    let that = this
    let curId = e.currentTarget.id
    let mainMenuListData = this.data.mainMenuList;
    for (var i = 0; i < mainMenuListData.length; i++) {
      if (mainMenuListData[i].id == curId) {
        mainMenuListData[i].checked = true;
      } else {
        mainMenuListData[i].checked = false;
      }
    }
    that.setData({
      mainMenuList: mainMenuListData
    })
  },
  toProductList:function(){
    wx.navigateTo({
      url: '../productList/productList',
    })
  },

  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {
    let that = this;
    that.setData({
      mainMenuList: getData.getProductMenuData(),
    });
    that.data.mainMenuList[0].checked = true;  //默认选中第一个
    that.setData({
      mainMenuList: that.data.mainMenuList
    });
    that.setData({
      goodsList: getData.getGoodsListData(),
    });
  },

  /**
   * 生命周期函数--监听页面初次渲染完成
   */
  onReady: function () {
  
  },

  /**
   * 生命周期函数--监听页面显示
   */
  onShow: function () {
  
  },

  /**
   * 生命周期函数--监听页面隐藏
   */
  onHide: function () {
  
  },

  /**
   * 生命周期函数--监听页面卸载
   */
  onUnload: function () {
  
  },

  /**
   * 页面相关事件处理函数--监听用户下拉动作
   */
  onPullDownRefresh: function () {
  
  },

  /**
   * 页面上拉触底事件的处理函数
   */
  onReachBottom: function () {
  
  },

  /**
   * 用户点击右上角分享
   */
  onShareAppMessage: function () {
  
  }
})