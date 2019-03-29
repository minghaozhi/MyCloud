 MyCloud
 =====
springcloud练手



项目说明
该项目是一个springcloud脚手架，主要包括如下模块

|服务名|模块说明|
|----|----|----        |
|mycloud-admin|微服务的后台管理|
|mycloud-bean|存放微服务数据库持久层的实体类的mapper|
|mycloud-common|微服务的公共组件|
|mycloud-getway|微服务网管，主要是进行授权认证|
|mycloud-oauth2|微服务统一授权认证中心（服务端）|
|mycloud-transaction|lcn分布式事务服务端|

|服务名 | 父级依赖 | 模块说明|
|----|----|----        |
|thoth|无|为微服务提供统一的pom管理，以及通用组件|  
|thoth-registry-server|无|注册中心,Eureka|  
|thoth-config-server| 无|微服务统一配置中心|  
|thoth-robot-ms|无|springcloud中的一个微服务,其中包含一个简单的增删改查demo|  
|thoth-ai-ms|无|机器人聊天微服务，内部目前只实现了图灵机器人的调用| 
|thoth-docs|无|相关文档，技术规范以及编码规范| 
