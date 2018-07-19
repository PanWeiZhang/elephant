import tools from '../../utils/util.js'
Page({

  /**
   * 页面的初始数据
   */
  data: {
    xieyi:false,
    code:"",
    phone:"",
    pwd:""
  },
  toggleXieYi:function(){
    let that = this;
    that.setData({
        xieyi : !that.data.xieyi
    });
  },
  getCode:function(){
    let that = this;
    that.setData({
      code: tools.mathRand(6)
    });
    tools.alertOK("获取验证码成功");
  },
  phoneInput:function(e){
    this.setData({
      phone: e.detail.value
    })
  }, 
  codeInput:function(e) {
    this.setData({
      code: e.detail.value
    })
  }, 
  pwdInput: function (e) {
    this.setData({
      pwd: e.detail.value
    })
  }, 
  registerUser:function(){
    let ph = this.data.phone
    let co = this.data.code
    let pwd = this.data.pwd
    let xieyi = this.data.xieyi
    if(xieyi){
      if (tools.check(ph, 0) && co != "" && pwd != "") {
        tools.alertOK("成功");
      } else {
        tools.alertError("填写错误,请重新填写");
      }
    }else{
      tools.alertError("未勾选柚咪协议");
    }
  },
  loginYm:function(){
    wx.navigateTo({
      url: '../login/login',
    })
  },

  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {
  
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