/**
 *
 * @Describe  数据服务层
 * @Time  2018-04-10
 * @Author  zpw
 *
 */
var req = require('./require.js')


/**
 * 
 * @Des 首页轮播图
 * @Param  null
 * 
 */
export const getMainClassData = () => { return req.POST("/other/mainClassList", { params: {} }) };

/**
 * 
 * @Des 主菜单
 * @Param  null
 * 
 */
export const getRandomLinkData = () => { return req.POST("/other/randomLink", { params: {} }) };

/**
 * 
 * @Des 省钱
 * @Param  null
 * 
 */
export const getSomeMoneyListData = () => { return req.POST("/other/discountActiveList", { params: {} }) };


let collectionListsData = [{
  "id": "aas",
  "price": 118.50,
  "url": "https://image.suning.cn/uimg/b2c/newcatentries/0070096882-000000000861233699_1_200x200.jpg?from=mobile&20",
  "title": "冬季加厚男士外套棉服上衣冬装潮流商务款男潮 【连帽】KW252灰色 4XL"
},
{
  "id": "asdw",
  "price": 128.50,
  "url": "https://image.suning.cn/uimg/b2c/newcatentries/0070124976-000000000776626264_1_400x400.jpg?v=&from=mobile&20",
  "title": "冬季加厚男士外套棉服上衣冬装潮流商务款男潮 【连帽】KW252灰色 4XL"
},
{
  "id": "cqw",
  "price": 118.50,
  "url": "https://image.suning.cn/uimg/b2c/newcatentries/0000000000-000000000139268980_1_400x400.jpg?v=00011&from=mobile&20",
  "title": "冬季加厚男士外套棉服上衣冬装潮流商务款男潮 【连帽】KW252灰色 4XL"
}, {
  "id": "daq",
  "price": 128.50,
  "url": "https://image.suning.cn/uimg/b2c/newcatentries/0070064422-000000000141939726_1_200x200.jpg?from=mobile&20",
  "title": "冬季加厚男士外套棉服上衣冬装潮流商务款男潮 【连帽】KW252灰色 4XL"
}]

/**
 * 
 * @Des 获取收藏列表
 * @Param  null
 * 
 */
export const getCollectionListData = () => { return collectionListsData };

/**
 * 
 * @Des 获取支付方式列表
 * @Param  null
 * 
 */
let payTypeData = [{ "id": "123", "url": "http://m.youmias.com/static/images/common/ccb.png", "payType": "建设银行", "payDec": "储蓄卡(0000)" }, { "id":"456", "url": "http://m.youmias.com/static/images/common/wx.png", "payType": "微信支付", "payDec": "仅安装微信6.0.2 及以上版本客户端使用" }]

export const getPayTypeListData = () => { return payTypeData };

/**
 * 
 * @Des 获取产品分类列表
 * @Param  null
 * 
 */
let productMenuData = [{
  
  "id": "123b455e665542222ff",
  "name": "热门推荐"
}, {
  "id": "b123455e665542222ff",
  "name": "上装"
}, {
  "id": "155b455e665542222ff",
  "name": "下装"
}, {
  "id": "bsw223b455e665542222ff",
  "name": "食品"
}, {
  "id": "132b455e665542222ff",
  "name": "通讯"
}];
let goodsListData = {
"firstSeachType":[{ "url": "https://image2.suning.cn/uimg/cms/img/150910940960738634.jpg", "name": "时尚羽绒" }, { "url": "https://image2.suning.cn/uimg/cms/img/150910940960738634.jpg", "name": "时尚羽绒" }, { "url": "https://image2.suning.cn/uimg/cms/img/150910940960738634.jpg", "name": "时尚羽绒" }, { "url": "https://image2.suning.cn/uimg/cms/img/150910940960738634.jpg", "name": "时尚羽绒" }, { "url": "https://image2.suning.cn/uimg/cms/img/150910940960738634.jpg", "name": "时尚羽绒" }, { "url": "https://image2.suning.cn/uimg/cms/img/150910940960738634.jpg", "name": "时尚羽绒" }, { "url": "https://image2.suning.cn/uimg/cms/img/150910940960738634.jpg", "name": "时尚羽绒" }, { "url": "https://image2.suning.cn/uimg/cms/img/150910940960738634.jpg", "name": "时尚羽绒" }, { "url": "https://image2.suning.cn/uimg/cms/img/150910940960738634.jpg", "name": "时尚羽绒" }],
"secSeachType":[{ "url": "https://image2.suning.cn/uimg/cms/img/149422610196382768.jpg", "name": "风衣" }, { "url": "https://image2.suning.cn/uimg/cms/img/149422610196382768.jpg", "name": "风衣" }, { "url": "https://image2.suning.cn/uimg/cms/img/149422610196382768.jpg", "name": "风衣" }, { "url": "https://image2.suning.cn/uimg/cms/img/149422610196382768.jpg", "name": "风衣" }, { "url": "https://image2.suning.cn/uimg/cms/img/149422610196382768.jpg", "name": "风衣" }, { "url": "https://image2.suning.cn/uimg/cms/img/149422610196382768.jpg", "name": "风衣" }, { "url": "https://image2.suning.cn/uimg/cms/img/149422610196382768.jpg", "name": "风衣" }, { "url": "https://image2.suning.cn/uimg/cms/img/149422610196382768.jpg", "name": "风衣" }, { "url": "https://image2.suning.cn/uimg/cms/img/149422610196382768.jpg", "name": "风衣" }],
"threeSeachType":[{ "url": "https://image2.suning.cn/uimg/cms/img/149422579489249959.jpg", "name": "休闲裤" }, { "url": "https://image2.suning.cn/uimg/cms/img/149422579489249959.jpg", "name": "休闲裤" }, { "url": "https://image2.suning.cn/uimg/cms/img/149422579489249959.jpg", "name": "休闲裤" }, { "url": "https://image2.suning.cn/uimg/cms/img/149422579489249959.jpg", "name": "休闲裤" }, { "url": "https://image2.suning.cn/uimg/cms/img/149422579489249959.jpg", "name": "休闲裤" }, { "url": "https://image2.suning.cn/uimg/cms/img/149422579489249959.jpg", "name": "休闲裤" }, { "url": "https://image2.suning.cn/uimg/cms/img/149422579489249959.jpg", "name": "休闲裤" }, { "url": "https://image2.suning.cn/uimg/cms/img/149422579489249959.jpg", "name": "休闲裤" }, { "url": "https://image2.suning.cn/uimg/cms/img/149422579489249959.jpg", "name": "休闲裤" }]
}

export const getProductMenuData = () => { return productMenuData };
export const getGoodsListData = () => { return goodsListData };


/**
 * 
 * @Des 获取购买页产品展示列表
 * @Param  null
 * 
 */
let lunboData = [{ "id": "321", "url": "http://m.youmias.com/static/images/productBuy/lunbo.png" }, { "id": "123", "url": "http://m.youmias.com/static/images/productBuy/lunbo2.jpg" }, { "id": "232", "url": "http://m.youmias.com/static/images/productBuy/lunbo3.jpg" }]

let citys = ["河北", "上海", "重庆", " 北京", "河北", "上海", "重庆", " 北京", "河北", "上海", "重庆", " 北京", "河北", "上海", "重庆", " 北京"]
let proColor = ["黑色", "白色"]
let proSize = ["M", "L", "XL", "XXL", "XXXL"]

export const getLunboData = () => { return lunboData };
export const getCitys = () => { return citys };
export const getProColor = () => { return proColor };
export const getProSize = () => { return proSize };

/**
 * 
 * @Des 获取评论列表
 * @Param  null
 * 
 */
let commentTotalData = [{ "createTime": "2017-03-12", "commentDec": "买家服务态度超好，谢谢！宝贝不错。我会再光临的，好评" }, { "createTime": "2017-03-12", "commentDec": "买家服务态度超好，谢谢！宝贝不错。我会再光临的，好评" },
{ "createTime": "2017-03-12", "commentDec": "买家服务态度超好，谢谢！宝贝不错。我会再光临的，好评" }, { "createTime": "2017-03-12", "commentDec": "谢谢！我会再光临的，好评" },
{ "createTime": "2017-03-12", "commentDec": "谢谢！我会再光临的，好评" }, { "createTime": "2017-03-12", "commentDec": "谢谢！我会再光临的，好评" }, { "createTime": "2017-03-12", "commentDec": "谢谢！我会再光临的，好评" }]

export const getCommentData = () => { return commentTotalData };

/**
 * 
 * @Des 获取产品列表
 * @Param  null
 * 
 */
let prductData = [{ "id": "abc", "url": "http://m.youmias.com/static/images/productList/productList_01.jpg", "price": "234.21", "productDec": "LUXLEAD洛诗琳2017年秋冬装新款女装100%纯羊毛双面毛呢大衣女时尚复古外套 灰绿色 M" }, { "id": "qtr", "url": "http://m.youmias.com/static/images/productList/productList_01.jpg", "price": "234.21", "productDec": "LUXLEAD洛诗琳2017年秋冬装新款女装100%纯羊毛双面毛呢大衣女时尚复古外套 灰绿色 M" },
  { "id": "afb", "url": "http://m.youmias.com/static/images/productList/productList_3.jpg", "price": "234.21", "productDec": "LUXLEAD洛诗琳2017年秋冬装新款女装100%纯羊毛双面毛呢大衣女时尚复古外套 灰绿色 M" }, { "id": "ytr", "url": "http://m.youmias.com/static/images/productList/productList_5.jpg", "price": "234.21", "productDec": "LUXLEAD洛诗琳2017年秋冬装新款女装100%纯羊毛双面毛呢大衣女时尚复古外套 灰绿色 M" },
  { "id": "are", "url": "http://m.youmias.com/static/images/productList/productList_4.jpg", "price": "234.21", "productDec": "LUXLEAD洛诗琳2017年秋冬装新款女装100%纯羊毛双面毛呢大衣女时尚复古外套 灰绿色 M" }, { "id": "mnb", "url": "http://m.youmias.com/static/images/productList/productList_2.jpg", "price": "234.21", "productDec": "LUXLEAD洛诗琳2017年秋冬装新款女装100%纯羊毛双面毛呢大衣女时尚复古外套 灰绿色 M" }]

let optionList = [{ "id": "f12uuelsfff1", "name": "价格" }, { "id": "ff1o3fsas3", "name": "销量" }, { "id": "uu7wwh1hs", "name": "折扣" }]


export const getPrductData = () => { return prductData };
export const getOptionList = () => { return optionList };

/**
 * 
 * @Des 获取热门搜索关键词列表
 * @Param  null
 * 
 */
export const getSeachData = () => { return req.POST("/other/seachList", { params: {} }) };

/**
 * 
 * @Des 获取设置模块列表
 * @Param  null
 * 
 */
let settingInfo = [{ "name": "修改个人资料", "id": "1" }, { "name": "修改登录密码", "id": "2" }, { "name": "绑定手机号码", "id": "3" }, { "name": "收货地址管理", "id": "4" }, { "name": "实名认证", "id": "5" }]

export const getSettingInfo = () => { return settingInfo };


/**
 * 
 * @Des 获取设置模块列表
 * @Param  null
 * 
 */
let userInfo = [{ "address": "北X大XXX经X开XX五XX字XXXX楼XXX", "name": "张盼伟", "phone": "15600117320" }, { "address": "北X大XXX经X开XX五XX字XXXX楼XXX", "name": "张盼伟", "phone": "18132062885" }]

export const getUserInfo = () => { return userInfo };

/**
 * 
 * @Des 获取购物车列表
 * @Param  null
 * 
 */
let recommendListData = [{ "id": "eew", "name": "冬季加厚男士外套棉服上衣冬装潮流商务款男潮 【连帽】KW252灰色 4XL", "price": "128.5", "url": "http://m.youmias.com/static/images/shoppingCar/3.jpg" }, { "id": "wqd", "name": "冬季加厚男士外套棉服上衣冬装潮流商务款男潮 【连帽】KW252灰色 4XL", "price": "128.5", "url": "http://m.youmias.com/static/images/shoppingCar/6.jpg" }, { "id": "htf", "name": "冬季加厚男士外套棉服上衣冬装潮流商务款男潮 【连帽】KW252灰色 4XL", "price": "128.5", "url": "http://m.youmias.com/static/images/shoppingCar/4.jpg" }, { "id": "hgf", "name": "冬季加厚男士外套棉服上衣冬装潮流商务款男潮 【连帽】KW252灰色 4XL", "price": "128.5", "url": "http://m.youmias.com/static/images/shoppingCar/5.jpg"}]

  let shoppingCarList =  [{ "id": "abds", "buyNumber": 3, "name": "冬季加厚男士外套棉服上衣冬装潮流商务款男潮 【连帽】KW252灰色 4XL", "price": "128.5", "url": "http://m.youmias.com/static/images/shoppingCar/3.jpg", "goodsParam": "尺码： M 颜色： 黑色" }, { "id": "cdsae", "buyNumber": 2, "name": "冬季加厚男士外套棉服上衣冬装潮流商务款男潮 【连帽】KW252灰色 4XL", "goodsParam": "尺码： M 颜色： 黑色", "price": "128.5", "url": "http://m.youmias.com/static/images/shoppingCar/6.jpg" }]


export const getRecommendList = () => { return recommendListData };
export const getShoppingCarList = () => { return shoppingCarList };

module.exports = {
  indexInterface: "首页接口",
  getMainClassData: getMainClassData,
  getRandomLinkData: getRandomLinkData,
  getSomeMoneyListData: getSomeMoneyListData,
  collectionInterface: "收藏页接口",
  getCollectionListData: getCollectionListData,
  collectionInterface: "支付接口",
  getPayTypeListData: getPayTypeListData,
  productAllListInterface: "产品分类页接口",
  getProductMenuData: getProductMenuData,
  getGoodsListData: getGoodsListData,
  productBuyInterface: "购买页接口",
  getLunboData: getLunboData,
  getCitys: getCitys,
  getProColor: getProColor,
  getProSize: getProSize,
  productAllListInterface: "评论页接口",
  getCommentData: getCommentData,
  productAllListInterface: "产品列表页接口",
  getPrductData: getPrductData,
  getOptionList: getOptionList,
  seachInterface: "搜索页接口",
  getSeachData: getSeachData,
  settingInterface: "设置页接口",
  getSettingInfo: getSettingInfo,
  settingAddressInterface: "地址管理页接口",
  getUserInfo: getUserInfo,
  settingAddressInterface: "购物车页接口",
  getRecommendList: getRecommendList,
  getShoppingCarList: getShoppingCarList,
}

