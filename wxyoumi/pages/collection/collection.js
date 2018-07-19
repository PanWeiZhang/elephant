import getData from '../../utils/service'
import tools from '../../utils/util.js'
Page({

  /**
   * 页面的初始数据
   */
  data: {
    editModel:false, //是否开启编辑模式
    hideSelect:true, //是否显示编辑按钮
    allSelect: false, //全选控制
    collectionListData: [], //收藏列表
    delCollListData:[], //删除列表
    collectionNum: 0, //收藏统计
  },
  editProduct:function(){
     let that = this;
     that.setData({
       editModel: (!that.data.editModel),
       hideSelect: (!that.data.hideSelect)
     });
  },
  toggleSelect:function(event){
    let that = this;
    let curId = event.currentTarget.id;
    let curIndex = tools.findEle(that.data.delCollListData, curId);
    let index = that.data.collectionListData.indexOf(curId);
    for (var i = 0; i < that.data.collectionListData.length;i++){
      if (event.currentTarget.id == that.data.collectionListData[i].id){
          if (this.data.collectionListData[i].checked == true) {
            that.data.collectionListData[i].checked = false;
            var newCollList = that.data.collectionListData; //重定义collectionListData，使购物车的样式实时更新
            that.setData({
              collectionListData: newCollList
            })
            that.data.delCollListData.splice(curIndex, 1);
          }else{
            that.data.collectionListData[i].checked = true;
            var newCollList = that.data.collectionListData; //重定义collectionListData，使购物车的样式实时更新
            that.setData({
              collectionListData: newCollList
            })
            that.data.delCollListData.push(event.currentTarget.id);
          }
      }
    }
  },
  selectAll: function (){
     let that = this;
     that.setData({
       checked: !that.data.checked,
       allSelect: !that.data.allSelect,
     })
     if (that.data.checked) {
       for (var i = 0; i < that.data.collectionListData.length; i++) {
         if (that.data.collectionListData[i].checked !== true) {
           that.data.collectionListData[i].checked = true;
           var newCollList = that.data.collectionListData;
           that.setData({
             collectionListData: newCollList
           })
           that.data.delCollListData.push(that.data.collectionListData[i].id);
         }
       }
     }else {
       for (var i = 0; i < that.data.collectionListData.length; i++) {
         if (that.data.collectionListData[i].checked == true) {
           that.data.collectionListData[i].checked = false;
           var newCollList = that.data.collectionListData;
           that.setData({
             collectionListData: newCollList
           })
         }
       }
       that.setData({
         delCollListData: []
       })
     }
  },
  delsProduct:function(event){
    let that = this;
    that.data.collectionListData = that.data.collectionListData.filter(item => that.data.delCollListData.indexOf(item.id) === -1)
    that.setData({
      collectionListData: that.data.collectionListData
    })
  },
  addToCar:function(){
    tools.alertOK("添加到购物车成功");
  },
  toProductList:function(){
    wx.navigateTo({
      url: '../productList/productList'
    })
  },

  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {
    let that = this;
    that.setData({
      collectionListData: getData.getCollectionListData(),
      collectionNum: getData.getCollectionListData().length
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