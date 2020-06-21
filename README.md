端口：
      
      lgm:10000
      
      pdl:11000
      
      yfq:12000
      
      zgr:9094
      
      zsw:9999
  
如何运行：

    1、首先开启nacos--startup.cmd(不先运行服务无法注册)
    
    2、启动gateway项目和stu_manage_lgm(这个不运行会没样式)
    
    3、启动你想运行的项目
    
    4、在浏览器输入127.0.0.1:8888/pdl/all 即可
    
 ![Image text](https://github.com/001026ab/term/blob/master/img-example/example.PNG)

一、使用nacos实现服务的注册与发现

使用nacos（在已创建好springboot项目且可以正常运行前提下）

    1、先下载nacos（地址：https://github.com/alibaba/nacos/releases）
    
    2、解压
    
    3、进入bin目录运行startup.cmd
    
    4、在项目中添加依赖

	    <dependency>
            <groupId>com.alibaba.cloud</groupId>
            <artifactId>spring-cloud-starter-alibaba-nacos-discovery</artifactId>
            <version>2.2.0.RELEASE</version>
        </dependency>
        <dependency>
            <groupId>com.alibaba.cloud</groupId>
            <artifactId>spring-cloud-starter-alibaba-nacos-config</artifactId>
            <version>2.2.0.RELEASE</version>
        </dependency>
        
    5、参考pdlcloud或stu_manage_lgm项目中的application.yml文件，在自己项目中创建并配置；启动你的服务
    
    6、浏览器输入 127.0.0.1:8848/nacos 进入服务管理界面，在服务列表中即可看到你的服务

二、使用spring cloud gateway网关

    1、进入geteway项目的application.yml 添加下面这段：

                               - id: （随便取个名字）
                                 uri: lb://（你的模块名）
                                 predicates:
                                   - Path=/pdl/**（里面的pdl是项目访问路径里的http://127.0.0.1:8888/pdl/all）
