import getData from '../../utils/service'
import tools from '../../utils/util.js'
Page({

  /**
   * 页面的初始数据
   */
  data: {
    payTypeList:[]
  },
  selectPayType:function(e){
    let that = this
    let curId = e.currentTarget.id
    let payTypeListData = this.data.payTypeList;
    for (var i = 0; i < payTypeListData.length; i++) {
      if (payTypeListData[i].id == curId) {
        payTypeListData[i].checked = true;
      }else {
        payTypeListData[i].checked = false;
      }
    }
    that.setData({
      payTypeList: payTypeListData
    })
  },
  pay:function(){
    tools.alertOK("支付成功");
  },

  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {
    let that = this;
    that.setData({
      payTypeList: getData.getPayTypeListData(),
    });
    that.data.payTypeList[0].checked = true;  //默认选中第一个
    that.setData({
      payTypeList: this.data.payTypeList,
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