Component({

  properties: {
    
  },
  data:{
     hotKeyWord:"",
  },
  methods: {
    onLoad: function () {
      
    },
    toProductList: function () {
      //this.triggerEvent('keywordVal', this.data.hotKeyWord) //keywordVal自定义名称事件，父组件中使用
      let val = this.data.hotKeyWord;
      wx.navigateTo({
        url: '../productList/productList?keyword=' + val
      });
    },
    keyword:function(e){
      this.setData({
        hotKeyWord: e.detail.value
      })
    },
  }

})