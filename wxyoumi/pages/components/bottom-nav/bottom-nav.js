
import tools from '../../../utils/util.js'
Component({

  properties: {
    
  },

  data:{
    mainNavList: [
      "https://st.360buyimg.com/m/images/index/a-home.png",
      "https://st.360buyimg.com/m/images/index/n-catergry.png",
      "https://st.360buyimg.com/m/images/index/n-find.png",
      "https://st.360buyimg.com/m/images/index/n-cart.png",
      "https://st.360buyimg.com/m/images/index/n-me.png"
    ],
  },

  methods: {
    onLoad: function () {
      
    },
    toLink: function (e) {
      let idx = e.currentTarget.dataset.index
      if(idx == 0){
        wx.navigateTo({
          url: '../index/index'
        })
      } else if (idx == 1){ 
        wx.navigateTo({
          url: '../productAllList/productAllList'
        })
      } else if (idx == 2){ 
        tools.alertError("暂未开放");
      } else if (idx == 3){ 
        wx.navigateTo({
          url: '../shoppingCar/shoppingCar'
        })
      } else if (idx == 4){
        wx.navigateTo({
          url: '../my/my'
        })
      } else{
        wx.navigateTo({
          url: '../index/index'
        })
      }
      
    }, 
  }

})