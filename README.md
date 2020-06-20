一、使用nacos实现服务的注册与发现

使用nacos（在已创建好springboot项目且可以正常运行前提下）

1、先下载nacos（地址：https://github.com/alibaba/nacos/releases）

2、解压

3、进入bin目录运行startup.cmd

4、在项目中添加依赖

	<dependency>
            <groupId>com.alibaba.cloud</groupId>
            <artifactId>spring-cloud-alibaba-dependencies</artifactId>
            <version>2.2.0.RELEASE</version>
            <type>pom</type>
            <scope>import</scope>
        </dependency>
        <dependency>
            <groupId>com.alibaba.cloud</groupId>
            <artifactId>spring-cloud-starter-alibaba-nacos-discovery</artifactId>
            <version>2.2.0.RELEASE</version>
        </dependency>
        
5、参考pdlcloud或stu_manage_lgm项目中的application.yml文件，在自己项目中创建并配置；启动你的服务

6、浏览器输入 127.0.0.1:8848/nacos 进入服务管理界面，在服务列表中即可看到你的服务

二、使用gateway网关

1、进入geteway项目的application.yml 添加下面这段：

                               - id: （随便取个名字）
                                 uri: lb://（你的模块名）
                                 predicates:
                                   - Path=/lgm/**（里面的lgm是项目访问路径里的http://127.0.0.1:8888/lgm/allstu）