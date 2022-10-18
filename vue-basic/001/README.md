1：vue-cli脚手架初始化项目
    node + webpack

    node_modules：项目依赖
    public：静态资源，用webpack进行打包时，会打包到dist里面
    src源代码：
        assets：放静态资源（一般放多个组件共用的静态资源）。打包时会被当做一个模块放入JS里面
        components：非路由组件（全局组件）
        App.vue：唯一的根组件
        main.js：程序的入口文件
    babel.conig.js：配置文件
    package.json：项目的信息
    package.lock.json：缓存性的文件

2：其他配置
    2.1：运行自动打开浏览器（npm run serve）
        package.json：
            "scripts": {
                "serve": "vue-cli-service serve --open --host=localhost",
                "build": "vue-cli-service build",
                "lint": "vue-cli-service lint"
            }
    2.2：eslint校验功能关闭
        vue.config.js：
            //关闭eslint
            lintOnSave: false

3：路由组件
    vue-router：前端所谓路由（KV对）
    路由组件：home路由组件，search路由组件（只有中间变化），login路由，register路由
    非路由组件：头部、底部

4：使用组件的步骤（非路由组件）
    创建或定义
    引入（App.vue）
    注册
    使用

5：路由组件的搭建
    vue-router：
    home、search、login、register
    cnpm install --save vue-router@3
    路由组件一般放在pages/views文件夹
    配置的路由一般放在router文件夹
    index,js：配置路由
    main.js：引入路由
    App.vue：展示路由出口