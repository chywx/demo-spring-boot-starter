## demo-spring-boot-starter
自定义starter

##使用方式

#### 1.引入pom配置
```$xslt
<!--自定义starter-->
<dependency>
    <groupId>com.ocean</groupId>
    <artifactId>demo-spring-boot-starter</artifactId>
    <version>1.0-SNAPSHOT</version>
</dependency>
```

#### 2.配置
`application`添加
```$xslt
# 开启
demo.service.enable=true
demo.service.prefix=hello
demo.service.suffix=world
``` 

#### 3.使用
```$xslt
@Autowired
DemoService demoService;

@RequestMapping("test1")
public String test1(){
    String welcome = demoService.say("welcome");
    return welcome;
}
```