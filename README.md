# eureka-server-customer
消费者 基于ribbon负载均衡
## 安装要求
* git 2.21.0
* maven 3.6.1
* JDK 1.8

## 快速开始
*  启动服务注册中心 参考  https://github.com/Jacwo/eureka-server
* ``git clone https://github.com/Jacwo/eureka-server.git `` 
*  启动注册中心
* ``cd  eureka-server`` 
* ``mvn spring-boot:run`` 
*  启动服务提供者即生产者 代码 git clone https://github.com/Jacwo/eureka-server-provider.git
* ``mvn package``
* ``cd eureka-server-provider``
*  启动节点1
* ``java -jar target/eureka-server-provider-0.0.1-SNAPSHOT.jar ``
*  启动节点2
* ``java -jar target/eureka-server-provider-0.0.1-SNAPSHOT.jar --spring.profiles.active=p1``
*  启动消费者
* ``git clone https://github.com/Jacwo/eureka-server-customer.git``
* ``cd eureka-server-customer``
* ``mvn spring-boot:run ``

## 测试

* 打开浏览器输入 http://localhost:8888/customer 多次刷新查看命中生产者情况






