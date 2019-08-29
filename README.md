# SpringCloud
**SpringCloud微服务实现**

## 涉及模块
 + Eureka：注册中心，主要负责每个服务的注册和发现
 + Feign：远程服务调用的组件，主要负责与其他服务建立连接，构造请求，然后发起请求来调用其他服务来获取数据
 + Ribbon：负责就是负载均衡。Ribbon 会定期去从Eureka 注册中心拉取注册中心，缓存到本地，每次发起远程调用的时候，Ribbon 就会从 Eureka 注册表拉取下来的数据中挑选一个机器让 Feign 来发起远程调用
 + Zuul：网关，就是负责网络的路由的。每个请求都经过这个网关，我们还可以做统一鉴权等。 （我们这么多的微服务，如果一个服务一个IP，使用方都需要进行调用的话，是不是得知道每一个服务的IP地址才行呢？那得记住多少才行呀，多不好管理。如果有一个统一的地址，然后根据不同的请求路径来跟我进行转发多少是不，比如 /user/* 是转发到用户服务 ，/product/* 是转向到商品服务等等。我使用的时候，只需要访问同一个IP ，只是路径不一样，就行了）
 + Hystrix：隔离、熔断以及降级。在微服务的相互调用过程中，可能会出现被调用服务错误或者超时的情况，从而导致整个系统崩溃不可用，也就是我们常说的服务雪崩问题，Hystrix 的存在就是为了解决这种问题的
 + Zipkin：调用链分析、链路追踪。（在微服务架构下，一个http请求从发出到响应，中间可能经过了N多服务的调用，或者N多逻辑操作，如何监控某个服务，或者某个逻辑操作的执行情况，对分析耗时操作，性能瓶颈具有很大价值，zipkin帮助我们实现了这一监控功能）
 + Boot-Admin：服务监控 用来管理和监视您的Spring Boot应用程序

## 启动顺序
 首先启动SpringCloud-Eureka-Server 注册中心
 然后依次启动 SpringCloud-Zuul-server-网关、SpringCloud-Feign-server-调用、SpringCloud-Ribbon-server-负载均衡、SpringCloud-Config-server-配置中心服务端、SpringCloud-Config-Client-配置中心客户端、SpringCloud-Service-Email/QRcode-邮件服务、二维码生成服务
 最后启动Boot-Admin-服务监控、SpringCloud-Zipkin-链路追踪服务
 
## 组件调用逻辑
后续添加调用图

