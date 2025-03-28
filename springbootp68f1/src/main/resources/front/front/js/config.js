
var projectName = '“漫画之家”系统';
/**
 * 轮播图配置
 */
var swiper = {
	// 设定轮播容器宽度，支持像素和百分比
	width: '100%',
	height: '400px',
	// hover（悬停显示）
	// always（始终显示）
	// none（始终不显示）
	arrow: 'none',
	// default（左右切换）
	// updown（上下切换）
	// fade（渐隐渐显切换）
	anim: 'default',
	// 自动切换的时间间隔
	// 默认3000
	interval: 2000,
	// 指示器位置
	// inside（容器内部）
	// outside（容器外部）
	// none（不显示）
	indicator: 'outside'
}

/**
 * 个人中心菜单
 */
var centerMenu = [{
	name: '个人中心',
	url: '../' + localStorage.getItem('userTable') + '/center.html'
}, 
{
	name: '我的发布',
	url: '../forum/list-my.html'
},

{
	name: '我的订单',
	url: '../shop-order/list.html'
},

{
	name: '我的地址',
	url: '../shop-address/list.html'
},

{
        name: '我的收藏',
        url: '../storeup/list.html'
}
]


var indexNav = [

{
	name: '漫画',
	url: './pages/manhua/list.html'
}, 
{
	name: '同人插画',
	url: './pages/tongrenchahua/list.html'
}, 
{
	name: '漫画活动',
	url: './pages/manhuahuodong/list.html'
}, 
{
	name: '商品',
	url: './pages/shangpin/list.html'
}, 

{
	name: '漫友交流论坛',
	url: './pages/forum/list.html'
}, 
{
	name: '留言板',
	url: './pages/messages/list.html'
}
]

var adminurl =  "http://localhost:8080/springbootp68f1/admin/dist/index.html";

var cartFlag = false

var chatFlag = false


chatFlag = true
cartFlag = true


var menu = [{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-skin","buttons":["新增","查看","修改","删除"],"menu":"用户","menuJump":"列表","tableName":"yonghu"}],"menu":"用户管理"},{"child":[{"appFrontIcon":"cuIcon-pay","buttons":["新增","查看","修改","删除","查看评论","审核"],"menu":"漫画","menuJump":"列表","tableName":"manhua"}],"menu":"漫画管理"},{"child":[{"appFrontIcon":"cuIcon-cardboard","buttons":["新增","查看","修改","删除","查看评论","审核"],"menu":"同人插画","menuJump":"列表","tableName":"tongrenchahua"}],"menu":"同人插画管理"},{"child":[{"appFrontIcon":"cuIcon-goodsnew","buttons":["新增","查看","修改","删除","查看评论","审核"],"menu":"漫画活动","menuJump":"列表","tableName":"manhuahuodong"}],"menu":"漫画活动管理"},{"child":[{"appFrontIcon":"cuIcon-circle","buttons":["新增","查看","修改","删除","查看评论","审核"],"menu":"商品","menuJump":"列表","tableName":"shangpin"}],"menu":"商品管理"},{"child":[{"appFrontIcon":"cuIcon-medal","buttons":["新增","查看","修改","删除"],"menu":"约稿","menuJump":"列表","tableName":"yuegao"}],"menu":"约稿管理"},{"child":[{"appFrontIcon":"cuIcon-clothes","buttons":["新增","查看","修改","删除","审核"],"menu":"约稿公告","menuJump":"列表","tableName":"yuegaogonggao"}],"menu":"约稿公告管理"},{"child":[{"appFrontIcon":"cuIcon-news","buttons":["查看","修改","回复","删除"],"menu":"留言板管理","tableName":"messages"}],"menu":"留言板管理"},{"child":[{"appFrontIcon":"cuIcon-group","buttons":["新增","查看","修改","删除"],"menu":"漫友交流论坛","tableName":"forum"}],"menu":"漫友交流论坛"},{"child":[{"appFrontIcon":"cuIcon-favor","buttons":["新增","查看","修改","删除"],"menu":"我的收藏管理","tableName":"storeup"}],"menu":"我的收藏管理"},{"child":[{"appFrontIcon":"cuIcon-wenzi","buttons":["新增","查看","修改","删除"],"menu":"轮播图管理","tableName":"config"},{"appFrontIcon":"cuIcon-service","buttons":["新增","查看","修改","删除"],"menu":"在线客服","tableName":"chat"}],"menu":"系统管理"},{"child":[{"appFrontIcon":"cuIcon-pay","buttons":["查看","删除"],"menu":"已完成订单","tableName":"orders/已完成"},{"appFrontIcon":"cuIcon-shop","buttons":["查看","删除"],"menu":"已发货订单","tableName":"orders/已发货"},{"appFrontIcon":"cuIcon-vipcard","buttons":["查看","删除"],"menu":"未支付订单","tableName":"orders/未支付"},{"appFrontIcon":"cuIcon-goods","buttons":["查看","删除"],"menu":"已取消订单","tableName":"orders/已取消"},{"appFrontIcon":"cuIcon-addressbook","buttons":["查看","删除","发货"],"menu":"已支付订单","tableName":"orders/已支付"},{"appFrontIcon":"cuIcon-list","buttons":["查看","删除"],"menu":"已退款订单","tableName":"orders/已退款"}],"menu":"订单管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-vip","buttons":["查看","查看评论"],"menu":"漫画列表","menuJump":"列表","tableName":"manhua"}],"menu":"漫画模块"},{"child":[{"appFrontIcon":"cuIcon-paint","buttons":["查看","查看评论"],"menu":"同人插画列表","menuJump":"列表","tableName":"tongrenchahua"}],"menu":"同人插画模块"},{"child":[{"appFrontIcon":"cuIcon-copy","buttons":["查看","查看评论"],"menu":"漫画活动列表","menuJump":"列表","tableName":"manhuahuodong"}],"menu":"漫画活动模块"},{"child":[{"appFrontIcon":"cuIcon-brand","buttons":["查看","查看评论"],"menu":"商品列表","menuJump":"列表","tableName":"shangpin"}],"menu":"商品模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-pay","buttons":["查看","查看评论","新增","修改","删除"],"menu":"漫画","menuJump":"列表","tableName":"manhua"}],"menu":"漫画管理"},{"child":[{"appFrontIcon":"cuIcon-cardboard","buttons":["查看","新增","查看评论","修改","删除"],"menu":"同人插画","menuJump":"列表","tableName":"tongrenchahua"}],"menu":"同人插画管理"},{"child":[{"appFrontIcon":"cuIcon-goodsnew","buttons":["查看","查看评论","新增","修改","删除"],"menu":"漫画活动","menuJump":"列表","tableName":"manhuahuodong"}],"menu":"漫画活动管理"},{"child":[{"appFrontIcon":"cuIcon-circle","buttons":["查看评论","查看","新增","修改","删除"],"menu":"商品","menuJump":"列表","tableName":"shangpin"}],"menu":"商品管理"},{"child":[{"appFrontIcon":"cuIcon-medal","buttons":["查看","审核"],"menu":"约稿","menuJump":"列表","tableName":"yuegao"}],"menu":"约稿管理"},{"child":[{"appFrontIcon":"cuIcon-clothes","buttons":["查看","申请","新增"],"menu":"约稿公告","menuJump":"列表","tableName":"yuegaogonggao"}],"menu":"约稿公告管理"},{"child":[{"appFrontIcon":"cuIcon-group","buttons":["查看"],"menu":"漫友交流论坛","tableName":"forum"}],"menu":"漫友交流论坛"},{"child":[{"appFrontIcon":"cuIcon-favor","buttons":["新增","查看","修改","删除"],"menu":"我的收藏管理","tableName":"storeup"}],"menu":"我的收藏管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-vip","buttons":["查看","查看评论"],"menu":"漫画列表","menuJump":"列表","tableName":"manhua"}],"menu":"漫画模块"},{"child":[{"appFrontIcon":"cuIcon-paint","buttons":["查看","查看评论"],"menu":"同人插画列表","menuJump":"列表","tableName":"tongrenchahua"}],"menu":"同人插画模块"},{"child":[{"appFrontIcon":"cuIcon-copy","buttons":["查看","查看评论"],"menu":"漫画活动列表","menuJump":"列表","tableName":"manhuahuodong"}],"menu":"漫画活动模块"},{"child":[{"appFrontIcon":"cuIcon-brand","buttons":["查看","查看评论"],"menu":"商品列表","menuJump":"列表","tableName":"shangpin"}],"menu":"商品模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"用户","tableName":"yonghu"}]


var isAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].backMenu.length;j++){
                for(let k=0;k<menus[i].backMenu[j].child.length;k++){
                    if(tableName==menus[i].backMenu[j].child[k].tableName){
                        let buttons = menus[i].backMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}

var isFrontAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].frontMenu.length;j++){
                for(let k=0;k<menus[i].frontMenu[j].child.length;k++){
                    if(tableName==menus[i].frontMenu[j].child[k].tableName){
                        let buttons = menus[i].frontMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}
