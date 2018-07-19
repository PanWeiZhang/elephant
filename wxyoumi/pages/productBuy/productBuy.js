import getData from '../../utils/service'
import tools from '../../utils/util.js'
Page({

  /**
   * 页面的初始数据
   */
  data: {
      lunboData:[],
      indicatorDots: true, //是否显示面板指示点
      autoplay: true, //是否自动播放
      interval: 3000, //自动切换时间间隔
      duration: 500,  //滑动动画时长
      citys:[],
      proColor: [],
      proSize: [],
      showdow: false, //遮罩
      buyParamGroup: false, //是否显示购买选择项模块
      openAdressOption: false,  //是否显示地址选择模块
      colorCheckindex:0,
      sizeCheckindex:0,
      goodsNum:1,
      addressActive:0,
  },
  toggleBuyModel:function(){
    this.setData({
      buyParamGroup: true,
      showdow: true
    });
  },
  closeBuyAlert:function(){
    this.setData({
      buyParamGroup: false,
      showdow: false
    });
  },
  openAddressSelcet:function(){
    this.setData({
      openAdressOption: true,
      showdow: true
    });
  },
  closeAdress: function () {
    this.setData({
      openAdressOption: false,
      showdow: false
    });
  },
  toggleColor:function(e){
    let that = this;
    that.setData({
      colorCheckindex: e.currentTarget.dataset.index
    });
  },
  toggleSize: function (e) {
    let that = this;
    that.setData({
      sizeCheckindex: e.currentTarget.dataset.index
    });
  }, 
  toogleAddress: function(e) {
    let that = this;
    that.setData({
      addressActive: e.currentTarget.dataset.index
    });
  }, 
  minusCarNum:function(){
    let that = this;
    if (that.data.goodsNum < 2) {
      tools.alertError("数量最少为1");
    }else{
      that.data.goodsNum--
      that.setData({
        goodsNum: that.data.goodsNum
      });
    }
  },
  addCarNum: function () {
    let that = this;
    if (that.data.goodsNum > 998 ) {
      tools.alertError("数量最大为999");
    } else {
      that.data.goodsNum++
      that.setData({
        goodsNum: that.data.goodsNum
      });
    }
  },
  toBuy:function(){
    wx.navigateTo({
      url: '../order/order',
    })
  }, 
  addToShopCar:function() {
    wx.navigateTo({
      url: '../shoppingCar/shoppingCar',
    })
  }, 
  toAllcomment:function(){
    wx.navigateTo({
      url: '../productBuyComment/productBuyComment',
    })
  },
  toCar:function(){
    wx.navigateTo({
      url: '../shoppingCar/shoppingCar',
    })
  },
  toCollection:function(){
    wx.navigateTo({
      url: '../collection/collection',
    })
  }, 
  toCarList:function() {
    wx.navigateTo({
      url: '../shoppingCar/shoppingCar',
    })
  }, 
  toOrder:function() {
    wx.navigateTo({
      url: '../order/order',
    })
  }, 

  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {
    let that = this;
    that.setData({
      lunboData: getData.getLunboData(),
    });
    that.setData({
      citys: getData.getCitys(),
    });
    that.setData({
      proColor: getData.getProColor(),
    });
    that.setData({
      proSize: getData.getProSize(),
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