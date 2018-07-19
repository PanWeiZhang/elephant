var API_URL = 'https://www.youmias.com'

var requestHandler = {
  params: {},
  success: function (res) {
    // success
  },
  fail: function () {
    // fail
  },
}

//GET请求
function GET(url,requestHandler) {
    var promiseGet = new Promise(function (resolve, reject) {
      var params = requestHandler.params;
      wx.request({
        url: API_URL + url,
        data: params,
        method: "GET",
        header: {
          'content-type': 'application/json'
        },
        success: resolve,
        fail: reject,
      })
    });
    return promiseGet;
}
//POST请求
function POST(url,requestHandler) {
  var promisePost = new Promise(function (resolve, reject) {
    var params = requestHandler.params;
    wx.request({
      url: API_URL + url,
      data: params,
      method: "POST",
      header: {
        'content-type': 'application/json'
      },
      success: resolve,
      fail: reject,
    })
  });
  return promisePost;
    
}


module.exports = {
  GET: GET,
  POST: POST
}
