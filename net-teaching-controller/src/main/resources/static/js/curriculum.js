layui.use('element', function(){
  var element = layui.element; //导航的hover效果、二级菜单等功能，需要依赖element模块
  
  //监听导航点击
  element.on('nav(demo)', function(elem){
    //console.log(elem)
    layer.msg(elem.text());
  });
});

layui.use('laypage', function(){
var laypage = layui.laypage;

  //执行一个laypage实例
  laypage.render({
   elem: 'page' //注意，这里的 test1 是 ID，不用加 # 号
   ,count: 50 //数据总数，从服务端得到
  });
});

