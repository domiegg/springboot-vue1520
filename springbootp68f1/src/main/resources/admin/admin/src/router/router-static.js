import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import discussshangpin from '@/views/modules/discussshangpin/list'
    import shangpin from '@/views/modules/shangpin/list'
    import discusstongrenchahua from '@/views/modules/discusstongrenchahua/list'
    import yuegaogonggao from '@/views/modules/yuegaogonggao/list'
    import discussmanhua from '@/views/modules/discussmanhua/list'
    import manhuahuodong from '@/views/modules/manhuahuodong/list'
    import storeup from '@/views/modules/storeup/list'
    import manhua from '@/views/modules/manhua/list'
    import forum from '@/views/modules/forum/list'
    import tongrenchahua from '@/views/modules/tongrenchahua/list'
    import yonghu from '@/views/modules/yonghu/list'
    import yuegao from '@/views/modules/yuegao/list'
    import chat from '@/views/modules/chat/list'
    import messages from '@/views/modules/messages/list'
    import orders from '@/views/modules/orders/list'
    import discussmanhuahuodong from '@/views/modules/discussmanhuahuodong/list'
    import config from '@/views/modules/config/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/discussshangpin',
        name: '商品评论',
        component: discussshangpin
      }
      ,{
	path: '/shangpin',
        name: '商品',
        component: shangpin
      }
      ,{
	path: '/discusstongrenchahua',
        name: '同人插画评论',
        component: discusstongrenchahua
      }
      ,{
	path: '/yuegaogonggao',
        name: '约稿公告',
        component: yuegaogonggao
      }
      ,{
	path: '/discussmanhua',
        name: '漫画评论',
        component: discussmanhua
      }
      ,{
	path: '/manhuahuodong',
        name: '漫画活动',
        component: manhuahuodong
      }
      ,{
	path: '/storeup',
        name: '我的收藏管理',
        component: storeup
      }
      ,{
	path: '/manhua',
        name: '漫画',
        component: manhua
      }
      ,{
	path: '/forum',
        name: '漫友交流论坛',
        component: forum
      }
      ,{
	path: '/tongrenchahua',
        name: '同人插画',
        component: tongrenchahua
      }
      ,{
	path: '/yonghu',
        name: '用户',
        component: yonghu
      }
      ,{
	path: '/yuegao',
        name: '约稿',
        component: yuegao
      }
      ,{
	path: '/chat',
        name: '在线客服',
        component: chat
      }
      ,{
	path: '/messages',
        name: '留言板管理',
        component: messages
      }
      ,{
        path: '/orders/:status',
        name: '订单管理',
        component: orders
      }
      ,{
	path: '/discussmanhuahuodong',
        name: '漫画活动评论',
        component: discussmanhuahuodong
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
