# ShoppingMall🛒
---
![](https://img.shields.io/badge/members-Arcueidteam-green?style=plastic&logo=appveyor) ![](https://img.shields.io/badge/version-2.0-orange?style=flat&logo=appveyor) ![](https://img.shields.io/badge/frameworks-ssm-blue)

`1. 重构数据库是使其满足更符合实际逻辑,添加角色权限和关联表，部分字段添加索引`

`在mall.sql的基础上删除了部分table，用其他sql文件中的表作替换,以下是详细说明👇`

`在resource/databases目录下，依次运行`

`alloc.sql → mall.sql → authority.sql → product.sql`
### <font color=red>权限相关表</font>
|表名|说明|类别|优先级|
|:---:|:--------------:|:---------------:|:---:|
|admin|管理员表|实体数据表|必要|
|role|角色表|实体数据表|必要|
|admin_role|管理员角色中间表|关系表|必要|
|permission|权限表|实体数据表|必要|
|role_permission|角色权限中间表|关系表|必要|
|login_log|管理员登录日志表|实体数据表|必要|
### <font color=blue>商品相关表</font>
|表名|说明|类别|优先级|索引字段|
|:---:|:--------------:|:---------------:|:---:|:---:|
|picture|图片表|实体数据表|必要|无|
|brand|品牌表|实体数据表|必要|name|
|category|类别表|实体数据表|必要|name|
|attribute|属性表|实体数据表|必要|无|
|attribute_template|属性模版表|实体数据表|中|name|
|spu|SPU（Standard Product Unit）表/商品表|实体数据表|非常重要|无|
|spu_detail|SPU详情表|实体数据表|中|无|
|sku|SKU（Stock Keeping Unit）表/库存表|实体数据表|非常重要|无|
|sku_specification|SKU规格参数表（存储各SKU的属性与值，即规格参数）|实体数据表|非常重要|无|
|album|相册表|关联表|低|中|
### mall表保留的数据表
|表名|说明|类别|优先级|索引字段|
|:---:|:--------------:|:---------------:|:---:|:---:|
|user|用户表|实体数据表|必要|无|
|delivery|收货地址表|实体数据表|必要|无|
|shop_cart|购物车表|实体数据表|必要|无|
|orders|订单表|实体数据表|必要|无|

### 事务相关表
|表名|说明|类别|
|:---:|:--------------:|:---------------:|
|alloc|事务表|暂不用考虑|

### <font color=orange>项目分工</font>
|负责模块|负责人员|
|:---:|:--------------:|
|xyc|前端商城首页+详情页|
|dsl|前端用户注册+登录页面|
|yjj|订单相关后端业务逻辑|
|pjl|管理员轮播图相关逻辑|
|xr|管理员商品管理相关逻辑|
|pjt|用户上传资源和购物车逻辑|

`所有表的时间均自动生成，无需手动设置:
  gmt_create 创建日期自动生成，且不进行认为修改
  gmt_modified 修改日期，默认值是创建日期，当update是自动更新当前时间`

`2. 更新v2的后端项目结构,采用Spring+SpringMVC+Mybatis的结构，仍使用SpringBoot Initializer ,sql使用xml配置,并以war打包方式部署tomcat启动`

`3. 前端Vue-cli配置各个页面的路由`

`4. 添加了测试包和测试依赖`
### 注意 commit 到本地后，在push到远程仓库前！必须先pull拉取代码与别人保持同步。否则你的push可能会覆盖别人的代码
### 如果 你pull 下来的代码与别人产生冲突 选择merge 手动解决冲突。如果你不清楚如何解决冲突请向组长请求帮助
--
- 统一创建项目工程文件，无需再单独创建直接 pull 拉取。。
- application.properties不要做修改。后序统一配置数据库JDBC和dirPath 和 xml的spring bean配置
- 提交代码前一定先测试功能，能正常运行 不报错了再提交 
- 测试代码可以 test目录下下进行。test 已加入gitignore
- 不要修改gitignore。被忽略的文件会成黄色
- 注意提交的文件不要包含lib依赖包和target文件夹等。会很大很卡。提交前**检查**这些文件是否为黄色(被忽略)
- 规范提交信息格式为 : XXX成员 - 完成了哪些(文件)的功能/做了哪些(文件)的改动 
- 来取下来代码后。首先查看每个readme,spring刷新maven 加载依赖 ，mall是一个 vue-cli (查看readme) npm install 
- database 文件夹里是 mall.sql 数据库文件


