# SpringBoot多模块

## 1、生成父子模块
用module的方式

分别创建core、application、web模块

其中web模块用于整合其他模块并启动应用

## 2、父项目设置
pom.xml添加

```java
<packaging>pom</packaging>
    <modules>
        <module>core</module>
        <module>application1</module>
    </modules>
```

## 3、子项目设置
pom.xml修改

dependency只依赖core

parent只依赖父模块

```java
<parent>
    <groupId>com</groupId>
    <artifactId>springboot-test</artifactId>
    <version>0.0.1-SNAPSHOT</version>
    <relativePath>../pom.xml</relativePath>
</parent>

<dependencies>
    <dependency>
        <groupId>com</groupId>
        <artifactId>core</artifactId>
        <version>0.0.1-SNAPSHOT</version>
    </dependency>
</dependencies>
```

## 4、配置文件设置
由于主要靠web模块跑程序

所以其他模块的启动文件和资源文件可以删除

resources文件夹里面的，和Application启动类

## 5、web模块设置

除了之前的设置，web模块的pom里面要正常依赖springboot以及其他所有子模块
