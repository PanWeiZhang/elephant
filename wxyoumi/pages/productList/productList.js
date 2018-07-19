import getData from '../../utils/service'
import tools from '../../utils/util.js'
Page({

  /**
   * 页面的初始数据
   */
  data: {
    optionList:[],
    prductListData:[],
    delCollListData:[],
    proNames: ["茵曼（INMAN）", " 洛诗琳（LUXLEAD）", "百图（betu）", "搜韩女廊"],
    proPrices: ["21-41", " 41-106", "106-245"],
    proSizes: ["150", "160", "165", "170", "175", "180"],
    proTypes: ["粘胶纤维", "羊毛", "牛仔"],
    orderClassArr: ["", "optionOrderAsc", "optionOrderDesc"],  //排序的动态样式数组
    dyIndexs: [], //排序 【0:不排序 1:升序  2:降序】
    namesIsIndex: -1, //分类名称active元素
    pricesIsIndex: -1, //分类价格active元素
    sizesIsIndex: -1, //分类尺寸active元素
    typesIsIndex: -1, //分类材质active元素
    moreOption: false, //是否展开分类模块
    toggleMask: false,  //是否开启遮罩,
  },
  toggleOrder(e) {
    let that = this;
    let cidx = e.currentTarget.dataset.index;
    let ci = that.data.dyIndexs[cidx];
    if (ci == 1) {
      that.data.dyIndexs[cidx] = 2;
      that.setData({
        dyIndexs: that.data.dyIndexs
      })
    } else {
      that.data.dyIndexs[cidx] = 1;
      that.setData({
        dyIndexs: that.data.dyIndexs
      })
    }
  },
  toggleCollection: function (event) {
    let that = this;
    let curId = event.currentTarget.id;
    let curIndex = tools.findEle(that.data.prductListData, curId);
    let index = that.data.prductListData.indexOf(curId);
    for (var i = 0; i < that.data.prductListData.length; i++) {
      if (event.currentTarget.id == that.data.prductListData[i].id) {
        if (this.data.prductListData[i].checked == true) {
          that.data.prductListData[i].checked = false;
          var newCollList = that.data.prductListData; //重定义prductListData，实时更新
          that.setData({
            prductListData: newCollList
          })
        } else {
          that.data.prductListData[i].checked = true;
          var newCollList = that.data.prductListData; //重定义prductListData，实时更新
          that.setData({
            prductListData: newCollList
          })
        }
      }
    }
  },
  openMoreOption(){
    let that = this;
     that.setData({
       moreOption: true, //是否展开分类模块
       toggleMask: true,  //是否开启遮罩,
     });
  },
  closeMoreOption(){
    let that = this;
    that.setData({
      moreOption: false, //是否展开分类模块
      toggleMask: false,  //是否开启遮罩,
    });
  },
  toggleNameActive(e) {
    let idx = e.currentTarget.dataset.index;
    this.setData({
      namesIsIndex: idx
    });
  },
  togglePriceActive(e) {
    let idx = e.currentTarget.dataset.index;
    this.setData({
      pricesIsIndex: idx
    });
  },
  toggleSizeActive(e) {
    let idx = e.currentTarget.dataset.index;
    this.setData({
      sizesIsIndex: idx
    });
  },
  toggleTypeActive(e) {
    let idx = e.currentTarget.dataset.index;
    this.setData({
      typesIsIndex: idx
    });
  },
  resetOption() {
    this.setData({
      namesIsIndex: -1,
      pricesIsIndex: -1,
      sizesIsIndex: -1,
      typesIsIndex: -1,
    });
  },
  toProductBuy:function(){
    wx.navigateTo({
      url: '../productBuy/productBuy',
    })
  },

  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {
    let that = this;
    that.setData({
      prductListData: getData.getPrductData(),
    }); 
    that.setData({
      optionList: getData.getOptionList(),
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