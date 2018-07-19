const formatTime = date => {
  const year = date.getFullYear()
  const month = date.getMonth() + 1
  const day = date.getDate()
  const hour = date.getHours()
  const minute = date.getMinutes()
  const second = date.getSeconds()

  return [year, month, day].map(formatNumber).join('/') + ' ' + [hour, minute, second].map(formatNumber).join(':')
}

const formatNumber = n => {
  n = n.toString()
  return n[1] ? n : '0' + n
}

/**
 *
 *生成n位随机整数
 *@author zpw
 *
 */
const mathRand = (m) => {
  let num = "";
  for (let i = 0; i < m; i++) {
    num += Math.floor(Math.random() * 10);
  }
  return num;
};

/**
 *
 *常用正则验证
 *@author zpw
 *@param str,type[0:手机号：1:邮箱；2: 柚咪昵称；3：柚咪密码，4：身份证号，5：QQ号，6：微信号，7：是否包含中文，8：是否只包含正整数]
 *
 */
const check = (str, type) => {
  if (type == "0") {
    if (!(/^1(3|4|5|7|8)\d{9}$/.test(str))) {  //表示以1开头，第二位可能是3/4/5/7/8等的任意一个，在加上后面的\d表示数字[0-9]的9位，总共加起来11位结束
      return false;
    } else {
      return true;
    }
  } else if (type == "1") {
    if (!(/^([A-Za-z0-9_\-\.])+\@([A-Za-z0-9_\-\.])+\.([A-Za-z]{2,4})$/.test(str))) {  //email地址
      return false;
    } else {
      return true;
    }
  } else if (type == "2") {
    if (!(/^[a-zA-Z0-9_-]{4,16}$/.test(str))) { // 4到16位（字母，数字，下划线，减号）
      return false;
    } else {
      return true;
    }
  } else if (type == "3") {
    if (!(/^(?![0-9]+$)(?![a-zA-Z]+$)[0-9A-Za-z]{6,10}$/.test(str))) { // 6~10位由数字和26个英文字母混合而成的密码
      return false;
    } else {
      return true;
    }
  } else if (type == "4") {
    if (!(/^[1-9]\d{5}(18|19|([23]\d))\d{2}((0[1-9])|(10|11|12))(([0-2][1-9])|10|20|30|31)\d{3}[0-9Xx]$/.test(str))) { // 身份证号
      return false;
    } else {
      return true;
    }
  } else if (type == "5") {
    if (!(/^[1-9][0-9]{4,10}$/.test(str))) {  // QQ号
      return false;
    } else {
      return true;
    }
  } else if (type == "6") {
    if (!(/^[a-zA-Z]([-_a-zA-Z0-9]{5,19})+$/.test(str))) { //微信号
      return false;
    } else {
      return true;
    }
  } else if (type == "7") {
    if (!(/[\u4E00-\u9FA5]/.test(str))) { //是否包含中文
      return false;
    } else {
      return true;
    }
  } else if (type == "8") {
    if (!(/^\+?[1-9]\d*$/.test(str))) { //是否只包含正整数
      return false;
    } else {
      return true;
    }
  }
}

const alertOK = (msg) => {
    wx.showToast({
      title: msg,
      icon: 'none',
      duration: 2000
    }) 
  }

const alertError = (msg) => {
  wx.showToast({
    title: msg,
    icon: 'none',
    duration: 2000
  })
}

/**
 *
 * @Dec 在数组中查找所有出现的x，并返回一个包含匹配索引的数组
 * @Author zpw
 * @Param a：传入的数组，x: 查找的字符串
 * 
 **/
const findEle = (a, x) => {
  let results = [],
    len = a.length,
    pos = 0;
  while (pos < len) {
    pos = a.indexOf(x, pos);
    if (pos === -1) {//未找到就退出循环完成搜索
      break;
    }
    results.push(pos);//找到就存储索引
    pos += 1;//并从下个位置开始搜索
  }
  return results;
};

module.exports = {
  formatTime: formatTime,
  mathRand: mathRand,
  check: check,
  alertOK: alertOK,
  alertError: alertError,
  findEle: findEle,
}

