import getData from '../../utils/service'
import tools from '../../utils/util.js'
Page({

  /**
   * 页面的初始数据
   */
  data: {
    recommendListData: [],
    shoppingCarList: [], //选中记录
    isCollection: false, //感兴趣中是否加入购物车
    auxAllProduct: false, //是否全选
    isEdit: false, //编辑购物车商品
    isClosePrice: true, //是否显示商品价格
    buyNum:0,
    editText:"编辑",
    delsProduct:[],
  },
  toggleCollection(event) {
    let that = this;
    let curId = event.currentTarget.id;
    let curIndex = tools.findEle(that.data.delsProduct, curId);
    let selectPStotal = 0;
    let total = that.data.shoppingCarList.length;
    for (var i = 0; i < that.data.shoppingCarList.length; i++) {
      if (event.currentTarget.id == that.data.shoppingCarList[i].id) {
        if (that.data.shoppingCarList[i].checked == true) {
          that.data.shoppingCarList[i].checked = false;
          that.data.delsProduct.splice(curIndex, 1)
          var newCollList = that.data.shoppingCarList; //重定义shoppingCarList，使购物车的样式实时更新
          that.setData({
            shoppingCarList: newCollList
          })
        } else {
          that.data.shoppingCarList[i].checked = true;
          that.data.delsProduct.push(curId);
          var newCollList = that.data.shoppingCarList; //重定义shoppingCarList，使购物车的样式实时更新
          that.setData({
            shoppingCarList: newCollList
          })
        }
      }
    }
    this.data.shoppingCarList.forEach(item => {
       if(item.checked){
         selectPStotal++
       }
    });
    if (selectPStotal == total){
      that.setData({
        auxAllProduct: true
      })
    }else{
      that.setData({
        auxAllProduct: false
      })
    }
  },
  toggleColl(event) {
    let that = this;
    let curId = event.currentTarget.id;
    for (var i = 0; i < that.data.recommendListData.length; i++) {
      if (event.currentTarget.id == that.data.recommendListData[i].id) {
        if (this.data.recommendListData[i].checked == true) {
          that.data.recommendListData[i].checked = false;
          var newCollList = that.data.recommendListData; //重定义recommendListData，使购物车的样式实时更新
          that.setData({
            recommendListData: newCollList
          })
          tools.alertOK("取消成功");
        } else {
          that.data.recommendListData[i].checked = true;
          var newCollList = that.data.recommendListData; //重定义trecommendListData，使购物车的样式实时更新
          that.setData({
            recommendListData: newCollList
          })
          tools.alertOK("加入购物车成功");
        }
      }
    }
  },
  allActive(event) {
    let that = this;
    that.setData({
      auxAllProduct: !this.data.auxAllProduct
    });
    let curId = event.currentTarget.id;
    if (this.data.auxAllProduct) {
      that.data.shoppingCarList.forEach(item => {
        item.checked = true;
      });
      var newCollList = that.data.shoppingCarList;
      that.setData({
        shoppingCarList: newCollList,
      });
    } else {
      that.data.shoppingCarList.forEach(item => {
        item.checked = false;
      });
      var newCollList = that.data.shoppingCarList;
      that.setData({
        shoppingCarList: newCollList,
      });
    }
  },
  minuNum(event) {
    let that = this;
    let idx = event.currentTarget.dataset.index
    let goods = that.data.shoppingCarList[idx].buyNumber;
    if (goods < 2) {
      return false;
    } else {
      that.data.shoppingCarList[idx].buyNumber--
      let newScl = that.data.shoppingCarList
      that.setData({
        shoppingCarList: newScl
      })
    }
  },
  addNum(event) {
    let that = this;
    let idx = event.currentTarget.dataset.index
    let goods = that.data.shoppingCarList[idx].buyNumber;
    if (goods > 998) {
      return false;
    } else {
      that.data.shoppingCarList[idx].buyNumber++
      let newScl = that.data.shoppingCarList
      that.setData({
        shoppingCarList: newScl
      })
    }
  },
  editProduct:function(){
    let that = this;
    let isOpenEditPro = that.data.isEdit;
    if (isOpenEditPro){
      console.log(123);
      that.setData({
        isEdit: false,
        isClosePrice: true,
        editText:"编辑",
      })
    }else{
      that.setData({
        isEdit: true,
        isClosePrice: false,
        editText: "完成",
      })
    }
  },
  delCarPro() {
    let that = this;
    that.data.shoppingCarList.filter(item => {
      that.data.delsProduct.indexOf(item.id) === -1
    })
    let newScl = that.data.shoppingCarList
    that.setData({
      shoppingCarList: newScl,
    })
  },
  toProductList() {
    wx.navigateTo({
      url: '../productList/productList',
    })
  },
  toOrder() {
    wx.navigateTo({
      url: '../order/order',
    })
  },
  toPay: function () {
    wx.navigateTo({
      url: '../payment/payment',
    })
  },
  toProductBuy:function(){
    wx.navigateTo({
      url: '../collection/collection',
      // url: '../productBuy/productBuy',
    })
  },
  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {
    let that = this;
    that.setData({
        recommendListData: getData.getRecommendList(),
    }); 
    that.setData({
        shoppingCarList: getData.getShoppingCarList(),
        buyNum: getData.getShoppingCarList().length,
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