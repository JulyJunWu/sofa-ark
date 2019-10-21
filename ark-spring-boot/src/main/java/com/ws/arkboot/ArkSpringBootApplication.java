package com.ws.arkboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *  使用前先将 依赖 和 plugin install在本地仓库
 *  若类隔离不生效,将父类pom文件的所有模块注释,重新启动!
 *
 *  所有的真相都在
 *  	com.alipay.sofa.ark.container.service.classloader.BizClassLoader#loadClassInternal(java.lang.String, boolean)
 *
 *  涉及知识点 : spi
 *  	线程上下文类加载器
 *  	自定义类加载器
 *  	主要的一些类加载器:
 *  		ContainerClassLoader(ark最顶级的)
 *  		BizClassLoader
 *  		PluginClassLoader(一个插件便代表一个,多少个ark plugin就有多少个此类加载器,注意:虽然类是一样,但是每次都是new 新的实例,命名空间完全不一样)
 *  		还有一些委托自带类加载器
 *			等等
 */
@SpringBootApplication
public class ArkSpringBootApplication {

	public static void main(String[] args) {
		System.out.println("大家好");
		SpringApplication.run(ArkSpringBootApplication.class, args);
		System.out.println("我也好");
	}

}
