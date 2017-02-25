#仿 “ONE一个” APP<br>

***

##项目简介<br>

* “One” APP是仿照“ONE一个”文艺APP制作而成，实现了首页、阅读、音乐和电影四个版块内容的展现以及侧滑等功能。展现的内容由 [APi](https://github.com/mashell/ONE-API) 提供，图标等图片由“ONE一个”APP解压而来。<br>

##运行截图展示 <br>

* 启动页面：<br>
  ![启动页面](http://i1.piimg.com/575659/a6f12fa6174b862d.png)<br>
* 运行截图：<br>
  ![运行截图](http://i1.piimg.com/575659/5931ca1d8bc88dd4.gif)<br>

##使用到的技术：
* Fragment动态加载
* 一个Fragment中嵌套多个Fragment并使用ViewPager实现左右滑动
* DrawerLayout实现侧滑功能
* NavigationView实现侧滑menu菜单
* 自定义Toolbar，实现点击导航栏图片侧滑、搜索页面跳转以及自定义标题改变
* recyclerview的多重布局
* Fragment和Activity之间的跳转
* Okhttp3的网络请求
* GSON解析
* Glide加载网络图片
* 延时传输数据
* CardView布局

##收获<br>

* 重温了Fragment知识点，对Fragment动态加载有了更深的了解，熟悉其中方法的使用，比第一遍照着书上敲出来效果要好很多；学习了如何在一个Fragment中嵌套多个Fragment以及Fragment和ViewPager的结合使用；
* Recyclerview的重温，因为之前是跟着书上的模板敲出来的，有的部分没有完全理解，这次使用也发现和解决了以前存在的一些问题；同时也警醒自己，学习知识不仅仅是知道敲出来，而是要理解，知道为什么是这样写，基础要打牢，也需要时不时的常温习加深理解；
* 了解了DrawerLayout、NavigationView和Toolbar的结合使用，仿照Google的滑动菜单页面基本实现了侧滑功能；中间虽然踩了一些坑但是通过看博客和网络搜索成功地解决了问题；
* CardView布局的学习和使用，使得界面UI看上去更有立体感；初步接触Glide，学习使用Glide加载网络图片；Okhttp3网络请求的使用，重温和运用了之前学习的网络请求部分的知识；
* 这次最大的问题是Gson解析，在开始浪费了不少时间，虽然看懂了书上Gson解析的使用，但是在实际
使用过程中如何使用那些方法等理解的不是那么透彻，导致拉低了项目的进度；Gson解析的学习还很浅，确实需要加强；
* 写的过程中也碰到了一些bug，像因为加载数据耗时，需要使用延时，否则会导致传入的值是空值；包的分类；夜间模式的实现遇到了一些bug会导致Fragment内容的重叠等等；
* 经历这次一个完整项目的开发，收获确实很多不能够一一列举：代码需要多敲，多理解，多运用。




