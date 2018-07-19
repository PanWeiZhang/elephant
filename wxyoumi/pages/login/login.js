/*** login.js  ***/
Page({

  /**
   * 页面的初始数据
   */
  data: {
    accoutLogin: true,
    phoneLogin: false,
    loginActiveAccount : true,
    loginActivePhone : false

  },

  //切换登陆
  accLogin: function () {
    let that = this;
    that.setData({
      accoutLogin: true,
      phoneLogin:  false,
      loginActiveAccount: true,
      loginActivePhone: false
    });
  },
  phoneLogin: function () {
    let that = this;
    that.setData({
      accoutLogin: false,
      phoneLogin: true,
      loginActiveAccount: false,
      loginActivePhone: true
    });
  },

  onLoad: function (options) {
  
  },
  
})