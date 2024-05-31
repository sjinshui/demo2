# 使用说明

## 快速开始
应用的启动类`com.alipay.demo.DemoApplication`位于`bootstrap`模块的`src/main/java`目录下，本地开发时直接运行该类的`main`方法即可启动应用

应用的集成测试基类`com.alipay.demo.AbstractTestBase`位于`bootstrap`或`test`模块的`src/test/java`目录下，继承该类的单元测试类可以集成SOFABoot应用启动

应用采用 [半关闭模块化](https://yuque.antfin-inc.com/middleware/sofaboot/modular#%E5%8D%8A%E5%85%B3%E9%97%AD%E6%A8%A1%E5%9D%97%E5%8C%96) 模式，应用内各模块之间没有上下文隔离，不需要手动添加 MANIFEST.MF 文件

## SOFABoot 用户文档
你可以通过下述文档了解到 SOFABoot 的使用细节
+ SOFABoot 应用开发: [主站版SOFABoot应用开发概述](https://yuque.antfin-inc.com/middleware/sofaboot/db7fgl)
+ SOFABoot 版本: [主站版SOFABoot发布报告](https://yuque.antfin-inc.com/middleware/sofaboot/releasenote)
+ SOFABoot 技术支持: [主站版SOFABoot常见问题](https://yuque.antfin-inc.com/middleware/sofaboot/faq)

## 组件使用示例
下面是各个组件的使用示例代码,您可以找到它们,使用这些示例代码前请阅读类上的注释说明
* SOFA RPC 示例代码:
    + `RpcSampleController`: SOFA RPC 服务调用演示接口
* DRM 示例代码:
    + `DrmSampleController`: DRM 配置推送演示接口
    + `DrmSampleConfig`: DRM 配置注册示例代码
* AntScheduler 示例代码:
    + `SimpleServerlessTaskSample`: AntScheduler 简单任务示例代码
    + `ComplexServerlessTaskSample`: AntScheduler 三层分发任务示例代码
* Mobilegw 示例代码:
    + `MobilegwSampleService`: Mobilegw服务注册示例代码
* MsgBroker 示例代码:
    + `MsgBrokerConsumer`: MsgBroker 接收消息示例代码
    + `MsgBrokerProduct`: MsgBroker 发送消息示例代码
    + `MsgBrokerSampleController`: MsgBroker 发送/接收消息演示接口
* SOFAMQ 示例代码:
    + `SofaMQSampleController`: SofaMQ 发送/接收消息演示接口
    + `SofaMQSample`: SofaMQ 发送/接收消息示例代码

## 组件用户文档
下面是各个组件件的用户文档,您可以查看详细的使用说明、工作原理:

* [SOFA RPC 用户文档](https://yuque.antfin-inc.com/middleware/sofa-rpc)
* [DRM 用户文档](https://yuque.antfin-inc.com/middleware/drm)
* [AntScheduler 用户文档](https://yuque.antfin-inc.com/middleware/antscheduler)
* [Guardian 用户文档](https://yuque.antfin-inc.com/middleware/guardian)
* [Mobilegw 用户文档](https://yuque.antfin.com/mobilegw/devops)
* [MsgBroker 用户文档](https://yuque.antfin-inc.com/middleware/msgbroker)
* [SOFAMQ 用户文档](https://yuque.antfin-inc.com/middleware/sofamq/user_processes)
* [Tracer 用户文档](https://yuque.antfin-inc.com/middleware/tracer)

## 组件门户网站
下面是各个组件的门户网站,您可以进行问题咨询/意见反馈:

* [SOFA RPC 服务治理平台](https://sofa.alipay.com/app/GLOBAL_APP/serviceGovernance/overview?tenant=MAIN_SITE)
* [DRM 控制台](https://sofa.alipay.com/app/GLOBAL_APP/drm/overview?tenant=MAIN_SITE)
* [AntScheduler 控制台](https://sofa.alipay.com/app/GLOBAL_APP/antscheduler/overview?tenant=MAIN_SITE)
* [Guardian 控制台](https://sofa.alipay.com/app/GLOBAL_APP/serviceGovernance/serviceLimiting?tenant=MAIN_SITE)
* [MsgBroker 控制台](https://sofa.alipay.com/app/GLOBAL_APP/msgBroker/overview?tenant=MAIN_SITE)
* [SOFAMQ 控制台](https://sofa.alipay.com/app/GLOBAL_APP/mq/overview?tenant=MAIN_SITE)
* [Tracer 产品门户](https://sofa.alipay.com/product/tracer)

